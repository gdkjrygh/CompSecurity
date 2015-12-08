// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.Log;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class CryptoUtils
{

    public static final int AES128_BLOCK_SIZE = 16;
    public static final int DES_BLOCK_SIZE = 8;
    private static final int DIGITS_POWER[] = {
        1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100
    };
    private static final String HEX = "0123456789ABCDEF";
    private static final String HMAC_SHA_1 = "HmacSHA1";
    private static final String HMAC_SHA_1_ALT = "HMAC-SHA-1";
    private static final String SHA_256 = "SHA-256";
    private static final String TAG = "nf_crypto";
    private static final int doubleDigits[] = {
        0, 2, 4, 6, 8, 1, 3, 5, 7, 9
    };

    private CryptoUtils()
    {
    }

    private static void appendHex(StringBuilder stringbuilder, byte byte0)
    {
        stringbuilder.append("0123456789ABCDEF".charAt(byte0 >> 4 & 0xf)).append("0123456789ABCDEF".charAt(byte0 & 0xf));
    }

    public static int calcChecksum(long l, int i)
    {
        boolean flag = true;
        int k = 0;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int j1 = (int)(l % 10L);
            l /= 10L;
            int i1 = j1;
            if (i != 0)
            {
                i1 = doubleDigits[j1];
            }
            k += i1;
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j--;
        }
        j = k % 10;
        i = j;
        if (j > 0)
        {
            i = 10 - j;
        }
        return i;
    }

    public static String decrypt(String s, String s1)
        throws Exception
    {
        Log.d("nf_crypto", (new StringBuilder()).append("Encrypted text ").append(s1).toString());
        if (s1 == null)
        {
            Log.e("nf_crypto", "Encrypted is null");
            return null;
        }
        try
        {
            s = init(s, false);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        Log.e("nf_crypto", "decrypt: ciper is null!");
        return null;
        s = new String(s.doFinal(toByte(s1)), "UTF-8");
        return s;
    }

    public static String encrypt(String s, String s1)
        throws Exception
    {
        s = init(s, true);
        if (s == null)
        {
            Log.e("nf_crypto", "encrypt: ciper is null!");
            return null;
        }
        if (s1 == null)
        {
            Log.e("nf_crypto", "encrypt: cleartext is null!");
            return null;
        }
        try
        {
            s1 = s1.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return null;
        }
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.e("nf_crypto", "encrypt: utf8 is null!");
        s = s.doFinal(s1);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        Log.e("nf_crypto", "encrypt: enc is null!");
        s = toHex(s);
        return s;
    }

    public static String fromHex(String s)
    {
        return new String(toByte(s));
    }

    public static String generateOTP(String s, long l, long l1, int i, boolean flag, int j)
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        s = getSecretBytes(s, l);
        byte abyte0[];
        int k;
        if (flag)
        {
            k = i + 1;
        } else
        {
            k = i;
        }
        abyte0 = new byte[8];
        for (int i1 = abyte0.length - 1; i1 >= 0; i1--)
        {
            abyte0[i1] = (byte)(int)(255L & l1);
            l1 >>= 8;
        }

        s = hmac_sha1(s, abyte0);
        int k1 = s[s.length - 1] & 0xf;
        int j1 = k1;
        if (j >= 0)
        {
            j1 = k1;
            if (j < s.length - 4)
            {
                j1 = j;
            }
        }
        j1 = ((s[j1] & 0x7f) << 24 | (s[j1 + 1] & 0xff) << 16 | (s[j1 + 2] & 0xff) << 8 | s[j1 + 3] & 0xff) % DIGITS_POWER[i];
        j = j1;
        if (flag)
        {
            j = j1 * 10 + calcChecksum(j1, i);
        }
        for (s = Integer.toString(j); s.length() < k; s = (new StringBuilder()).append("0").append(s).toString()) { }
        return s;
    }

    private static byte[] getSecretBytes(String s, long l)
    {
        byte abyte0[] = new byte[s.length() / 2 + 4];
        s = (new BigInteger(s, 16)).toByteArray();
        System.arraycopy(s, 0, abyte0, 0, s.length);
        for (int i = 0; i < 4; i++)
        {
            abyte0[s.length + i] = (byte)(int)(l >> (3 - i) * 8 & 255L);
        }

        return abyte0;
    }

    public static String hashSHA256(String s, String s1)
        throws NoSuchAlgorithmException
    {
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
        messagedigest.update(or(s, s1));
        return toHex(messagedigest.digest());
    }

    public static byte[] hmac_sha1(byte abyte0[], byte abyte1[])
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        String s = "HmacSHA1";
        Mac mac;
        try
        {
            mac = Mac.getInstance("HmacSHA1");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = "HMAC-SHA-1";
            mac = Mac.getInstance("HMAC-SHA-1");
        }
        mac.init(new SecretKeySpec(abyte0, s));
        return mac.doFinal(abyte1);
    }

    private static Cipher init(String s, boolean flag)
    {
        byte abyte0[] = new byte[8];
        abyte0;
        abyte0[0] = -87;
        abyte0[1] = -101;
        abyte0[2] = -56;
        abyte0[3] = 50;
        abyte0[4] = 86;
        abyte0[5] = 52;
        abyte0[6] = -29;
        abyte0[7] = 3;
        Object obj = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        PBEParameterSpec pbeparameterspec = null;
        String s1 = pbeparameterspec;
        String s2 = obj;
        String s3 = obj1;
        String s4 = obj2;
        String s5 = obj3;
        String s6 = obj4;
        SecretKey secretkey;
        try
        {
            s = new PBEKeySpec(s.toCharArray(), abyte0, 19);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: InvalidAlgorithmParameterException").append(s).toString());
            return s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: InvalidKeySpecException").append(s).toString());
            return s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: NoSuchPaddingException").append(s).toString());
            return s3;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: NoSuchAlgorithmException").append(s).toString());
            return s4;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: InvalidKeyException").append(s).toString());
            return s5;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_crypto", (new StringBuilder()).append("EXCEPTION: ").append(s).toString());
            return s6;
        }
        s1 = pbeparameterspec;
        s2 = obj;
        s3 = obj1;
        s4 = obj2;
        s5 = obj3;
        s6 = obj4;
        secretkey = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(s);
        s1 = pbeparameterspec;
        s2 = obj;
        s3 = obj1;
        s4 = obj2;
        s5 = obj3;
        s6 = obj4;
        s = Cipher.getInstance(secretkey.getAlgorithm());
        s1 = s;
        s2 = s;
        s3 = s;
        s4 = s;
        s5 = s;
        s6 = s;
        pbeparameterspec = new PBEParameterSpec(abyte0, 19);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        s1 = s;
        s2 = s;
        s3 = s;
        s4 = s;
        s5 = s;
        s6 = s;
        s.init(1, secretkey, pbeparameterspec);
        return s;
        s1 = s;
        s2 = s;
        s3 = s;
        s4 = s;
        s5 = s;
        s6 = s;
        s.init(2, secretkey, pbeparameterspec);
        return s;
    }

    private static byte[] or(String s, String s1)
    {
        int j;
        if (s.length() >= s1.length())
        {
            s = s.getBytes();
            byte abyte0[] = s1.getBytes();
            s1 = s;
            s = abyte0;
        } else
        {
            s1 = s1.getBytes();
            s = s.getBytes();
        }
        j = Math.min(s1.length, s.length);
        for (int i = 0; i < j; i++)
        {
            s1[i] = (byte)(s1[i] | s[i]);
        }

        return s1;
    }

    public static byte[] padPerPKCS5Padding(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Input array is null!");
        }
        Log.d("nf_crypto", (new StringBuilder()).append("Array size: ").append(abyte0.length).toString());
        Log.d("nf_crypto", (new StringBuilder()).append("Block size: ").append(i).toString());
        byte byte0 = (byte)(i - abyte0.length % i);
        Log.d("nf_crypto", (new StringBuilder()).append("Padding: ").append(byte0).toString());
        byte abyte1[] = new byte[abyte0.length + byte0];
        for (i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = abyte0[i];
        }

        for (i = 0; i < byte0; i++)
        {
            abyte1[abyte0.length + i] = byte0;
        }

        return abyte1;
    }

    public static byte[] toByte(String s)
    {
        int j = s.length() / 2;
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte0[i] = Integer.valueOf(s.substring(i * 2, i * 2 + 2), 16).byteValue();
        }

        return abyte0;
    }

    public static String toHex(String s)
    {
        return toHex(s.getBytes());
    }

    public static String toHex(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            appendHex(stringbuilder, abyte0[i]);
        }

        return stringbuilder.toString();
    }

    public static byte[] unpadPerPKCS5Padding(byte abyte0[], int i)
    {
        if (abyte0 == null || abyte0.length < 1)
        {
            throw new IllegalArgumentException("Input array is null or 0!");
        }
        i = abyte0[abyte0.length - 1];
        if (Log.isLoggable("nf_crypto", 3))
        {
            Log.d("nf_crypto", (new StringBuilder()).append("Remove last ").append(i).append(" array elements").toString());
        }
        byte abyte1[] = new byte[abyte0.length - i];
        for (i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = abyte0[i];
        }

        return abyte1;
    }

}
