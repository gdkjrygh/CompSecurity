// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.concurrent.atomic.AtomicReference;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.keyparams.AesKeyParameters;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            DefaultKeyType, AesKey, SessionMaterial, Encrypter, 
//            Crypter, ImportedKeyReader, Signer

public final class SignedSessionEncrypter
{

    private final Encrypter encrypter;
    private final AtomicReference session = new AtomicReference();
    private final Signer signer;

    public SignedSessionEncrypter(Encrypter encrypter1, Signer signer1)
    {
        encrypter = encrypter1;
        signer = signer1;
    }

    private static String buildNonce()
    {
        byte abyte0[] = new byte[16];
        Util.rand(abyte0);
        return Base64Coder.encodeWebSafe(abyte0);
    }

    private static AesKey buildSessionKey(AesKeyParameters aeskeyparameters)
        throws KeyczarException
    {
        if (!DefaultKeyType.AES.isAcceptableSize(aeskeyparameters.getKeySize()))
        {
            throw new KeyczarException("Unsupported key size requested for session");
        } else
        {
            return AesKey.generate(aeskeyparameters);
        }
    }

    private String newSession(AesKeyParameters aeskeyparameters)
        throws KeyczarException
    {
        aeskeyparameters = new SessionMaterial(buildSessionKey(aeskeyparameters), buildNonce());
        session.set(aeskeyparameters);
        return encrypter.encrypt(aeskeyparameters.toString());
    }

    public final byte[] encrypt(byte abyte0[])
        throws KeyczarException
    {
        if (session.get() == null)
        {
            throw new KeyczarException("Session not initialized.");
        } else
        {
            SessionMaterial sessionmaterial = (SessionMaterial)session.get();
            abyte0 = (new Crypter(new ImportedKeyReader(sessionmaterial.getKey()))).encrypt(abyte0);
            return signer.attachedSign(abyte0, Base64Coder.decodeWebSafe(sessionmaterial.getNonce()));
        }
    }

    public final String newSession()
        throws KeyczarException
    {
        return newSession((AesKeyParameters)DefaultKeyType.AES.applyDefaultParameters(null));
    }
}
