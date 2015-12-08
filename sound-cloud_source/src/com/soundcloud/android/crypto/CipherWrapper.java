// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.soundcloud.android.crypto:
//            EncryptionException, DeviceSecret

public class CipherWrapper
{

    private Cipher cipher;

    public CipherWrapper()
    {
    }

    private void ensureInitCalled()
    {
        if (cipher == null)
        {
            throw new IllegalStateException("Cipher must be initialized before usage, call init first!");
        } else
        {
            return;
        }
    }

    private Cipher getCipher(String s)
        throws NoSuchPaddingException, NoSuchAlgorithmException
    {
        if (cipher == null)
        {
            cipher = Cipher.getInstance(s);
        }
        return cipher;
    }

    public int finish(byte abyte0[], int i)
        throws EncryptionException
    {
        ensureInitCalled();
        try
        {
            i = cipher.doFinal(abyte0, i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new EncryptionException("Failed to call finish encryption", abyte0);
        }
        return i;
    }

    public byte[] finish(byte abyte0[])
        throws EncryptionException
    {
        ensureInitCalled();
        try
        {
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new EncryptionException("Failed to call finish decryption", abyte0);
        }
        return abyte0;
    }

    public int getOutputSize(int i)
    {
        ensureInitCalled();
        return cipher.getOutputSize(i);
    }

    public void init(String s, int i, DeviceSecret devicesecret, String s1)
        throws EncryptionException
    {
        init(s, i, new IvParameterSpec(devicesecret.getInitVector()), ((SecretKey) (new SecretKeySpec(devicesecret.getKey(), 0, devicesecret.getKey().length, s1))));
    }

    public void init(String s, int i, IvParameterSpec ivparameterspec, SecretKey secretkey)
        throws EncryptionException
    {
        getCipher(s).init(i, secretkey, ivparameterspec);
        return;
        s;
_L4:
        throw new EncryptionException("Failed to get cipher instance", s);
        s;
_L2:
        throw new EncryptionException("Failed to init cipher with given key and iv", s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int update(byte abyte0[], int i, int j, byte abyte1[])
        throws EncryptionException
    {
        ensureInitCalled();
        try
        {
            i = cipher.update(abyte0, i, j, abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new EncryptionException("Failed to call cipher.update", abyte0);
        }
        return i;
    }
}
