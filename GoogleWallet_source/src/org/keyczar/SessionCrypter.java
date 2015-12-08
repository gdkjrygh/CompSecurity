// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import org.keyczar.exceptions.KeyczarException;
import org.keyczar.keyparams.AesKeyParameters;

// Referenced classes of package org.keyczar:
//            DefaultKeyType, AesKey, Crypter, ImportedKeyReader, 
//            Encrypter

public final class SessionCrypter
{

    private final byte sessionMaterial[];
    private final Crypter symmetricCrypter;

    public SessionCrypter(Encrypter encrypter)
        throws KeyczarException
    {
        AesKey aeskey = AesKey.generate((AesKeyParameters)DefaultKeyType.AES.applyDefaultParameters(null));
        symmetricCrypter = new Crypter(new ImportedKeyReader(aeskey));
        sessionMaterial = encrypter.encrypt(aeskey.getEncoded());
    }

    public final byte[] decrypt(byte abyte0[])
        throws KeyczarException
    {
        return symmetricCrypter.decrypt(abyte0);
    }

    public final byte[] encrypt(byte abyte0[])
        throws KeyczarException
    {
        return symmetricCrypter.encrypt(abyte0);
    }

    public final byte[] getSessionMaterial()
    {
        return sessionMaterial;
    }
}
