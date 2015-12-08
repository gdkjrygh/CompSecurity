// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.util.Base64;
import com.soundcloud.android.crypto.CipherWrapper;
import com.soundcloud.android.crypto.EncryptionException;
import com.soundcloud.java.strings.Charsets;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class GcmDecryptor
{

    private static final String INITIALIZATION_VECTOR = "1111111111ABCDEF1111111111ABCDEF";
    private static final String KEY_DATA = "MDEyMzQ1Njc4OUFCQ0RFRjAxMjM0NTY3ODlBQkNERUY=";
    private static final byte iv[] = hexStringToByteArray("1111111111ABCDEF1111111111ABCDEF");
    private static final byte key[] = hexStringToByteArray(new String(Base64.decode("MDEyMzQ1Njc4OUFCQ0RFRjAxMjM0NTY3ODlBQkNERUY=", 0)));
    private final CipherWrapper cipherWrapper;
    final IvParameterSpec ivParam;
    final SecretKeySpec skeySpec;

    public GcmDecryptor(CipherWrapper cipherwrapper)
    {
        ivParam = new IvParameterSpec(iv);
        skeySpec = new SecretKeySpec(key, "AES");
        cipherWrapper = cipherwrapper;
    }

    private static byte[] hexStringToByteArray(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public String decrypt(String s)
        throws EncryptionException, UnsupportedEncodingException
    {
        cipherWrapper.init("AES/CBC/PKCS7Padding", 2, ivParam, skeySpec);
        return new String(cipherWrapper.finish(Base64.decode(s, 0)), Charsets.UTF_8.name());
    }

}
