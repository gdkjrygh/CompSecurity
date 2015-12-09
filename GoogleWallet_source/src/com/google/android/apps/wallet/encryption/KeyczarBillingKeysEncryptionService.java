// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.keys.PublicKeysManager;
import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import org.keyczar.DefaultKeyType;
import org.keyczar.Encrypter;
import org.keyczar.SignedSessionEncrypter;
import org.keyczar.Signer;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Base64Coder;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            EncryptionService, JsonLiteralKeyczarReader

public class KeyczarBillingKeysEncryptionService
    implements EncryptionService
{
    static final class KeyczarEncryptionSession
        implements EncryptionService.EncryptionSession
    {

        private final SignedSessionEncrypter sessionEncrypter;
        private final String sessionMaterial;

        private String encrypt(String s)
        {
            Preconditions.checkNotNull(s);
            try
            {
                s = Base64Coder.encodeWebSafe(sessionEncrypter.encrypt(s.getBytes(Charsets.UTF_8)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw Throwables.propagate(s);
            }
            return s;
        }

        private String getSessionMaterial()
        {
            return sessionMaterial;
        }

        public final volatile Object encrypt(Object obj)
        {
            return encrypt((String)obj);
        }

        public final volatile Object getSessionMaterial()
        {
            return getSessionMaterial();
        }

        KeyczarEncryptionSession(SignedSessionEncrypter signedsessionencrypter)
            throws KeyczarException
        {
            sessionEncrypter = signedsessionencrypter;
            sessionMaterial = signedsessionencrypter.newSession();
        }
    }


    private int keyHash;
    private final PublicKeysManager publicKeysManager;
    private Encrypter rsaEncrypter;
    private Signer signer;

    KeyczarBillingKeysEncryptionService(PublicKeysManager publickeysmanager)
    {
        publicKeysManager = publickeysmanager;
    }

    private void createEncrypterAndSigner(String s, String s1, int i)
        throws KeyczarException
    {
        s = new JsonLiteralKeyczarReader(KeyPurpose.ENCRYPT, DefaultKeyType.RSA_PUB, s);
        s1 = new JsonLiteralKeyczarReader(KeyPurpose.SIGN_AND_VERIFY, DefaultKeyType.DSA_PRIV, s1);
        rsaEncrypter = new Encrypter(s);
        signer = new Signer(s1);
        keyHash = i;
    }

    private boolean encrypterOrSignerNull()
    {
        return rsaEncrypter == null || signer == null;
    }

    private void maybeLoadAsymmetricKeys()
        throws KeyczarException
    {
        String s = publicKeysManager.getBillingRsaPublicKey();
        String s1 = publicKeysManager.getBillingDsaPrivateKey();
        int i = Objects.hashCode(new Object[] {
            s, s1
        });
        if (Strings.isNullOrEmpty(s))
        {
            throw new RuntimeException("intentionally uncaught exception to help debug issue 6371092");
        }
        if (encrypterOrSignerNull() || i != keyHash)
        {
            createEncrypterAndSigner(s, s1, i);
        }
    }

    private SignedSessionEncrypter newSessionEncrypter()
    {
        return new SignedSessionEncrypter(rsaEncrypter, signer);
    }

    public final EncryptionService.EncryptionSession newSession()
    {
        this;
        JVM INSTR monitorenter ;
        KeyczarEncryptionSession keyczarencryptionsession;
        maybeLoadAsymmetricKeys();
        keyczarencryptionsession = new KeyczarEncryptionSession(newSessionEncrypter());
        this;
        JVM INSTR monitorexit ;
        return keyczarencryptionsession;
        Object obj;
        obj;
        throw Throwables.propagate(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
