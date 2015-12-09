// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.keys.PublicKeysManager;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import org.keyczar.DefaultKeyType;
import org.keyczar.Encrypter;
import org.keyczar.SessionCrypter;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            CryptorService, JsonLiteralKeyczarReader

public class KeyczarTorinoKeysEncryptionService
    implements CryptorService
{

    private final PublicKeysManager mPublicKeysManager;

    public KeyczarTorinoKeysEncryptionService(PublicKeysManager publickeysmanager)
    {
        mPublicKeysManager = publickeysmanager;
    }

    public final CryptorService.CryptorSession newSession()
    {
        Object obj = mPublicKeysManager.getTorinoRsaPublicKey();
        boolean flag;
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        obj = new JsonLiteralKeyczarReader(KeyPurpose.ENCRYPT, DefaultKeyType.RSA_PUB, ((String) (obj)));
        try
        {
            obj = new SessionCrypter(new Encrypter(((org.keyczar.interfaces.KeyczarReader) (obj))));
        }
        catch (KeyczarException keyczarexception)
        {
            throw Throwables.propagate(keyczarexception);
        }
        return new CryptorService.CryptorSession(((SessionCrypter) (obj)));
    }

    public final volatile EncryptionService.EncryptionSession newSession()
    {
        return newSession();
    }
}
