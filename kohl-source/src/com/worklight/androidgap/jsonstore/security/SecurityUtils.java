// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.security;

import com.worklight.nativeandroid.common.WLUtils;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

// Referenced classes of package com.worklight.androidgap.jsonstore.security:
//            FipsWrapper

public class SecurityUtils
{

    private static final int BYTES_TO_BITS = 8;
    private static final int KEY_SIZE_AES256 = 32;
    protected static final int PBKDF2_ITERATIONS = 10000;

    private SecurityUtils()
    {
    }

    public static byte[] decode(String s, String s1, String s2)
        throws Exception
    {
        s = FipsWrapper.decryptAES(s, s2, WLUtils.hexStringToByteArray(s1));
        if (s == null || s.length() == 0)
        {
            throw new BadPaddingException("Decryption failed");
        } else
        {
            return s.getBytes();
        }
    }

    public static String encodeBytesAsHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (abyte0 != null)
        {
            int j = abyte0.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append(String.format("%02X", new Object[] {
                    Byte.valueOf(abyte0[i])
                }));
            }

        }
        return stringbuilder.toString();
    }

    public static String encodeKeyAsHexString(SecretKey secretkey)
    {
        return encodeBytesAsHexString(secretkey.getEncoded());
    }

    public static byte[] encrypt(String s, String s1, String s2)
        throws Exception
    {
        return FipsWrapper.encryptAES(s, s2, s1);
    }

    public static byte[] generateIV(int i)
    {
        byte abyte0[] = new byte[i];
        (new SecureRandom()).nextBytes(abyte0);
        return abyte0;
    }

    public static SecretKey generateKey(String s, String s1)
        throws Exception
    {
        return generateKey(s, s1, 10000, 32);
    }

    public static SecretKey generateKey(String s, String s1, int i, int j)
        throws Exception
    {
        SecretKeyFactory secretkeyfactory;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            secretkeyfactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8bit");
        } else
        {
            secretkeyfactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        }
        return secretkeyfactory.generateSecret(new PBEKeySpec(s.toCharArray(), s1.getBytes("UTF-8"), i, j * 8));
    }

    public static byte[] generateLocalKey(int i)
    {
        byte abyte0[] = new byte[i];
        (new SecureRandom()).nextBytes(abyte0);
        return abyte0;
    }
}
