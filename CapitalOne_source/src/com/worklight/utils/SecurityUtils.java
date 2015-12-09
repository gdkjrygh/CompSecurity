// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import android.content.Context;
import com.worklight.common.WLUtils;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.worklight.utils:
//            PaidSecurityUtils

public class SecurityUtils
{
    public static class PBKDF2
    {

        private static int ceil(int i, int j)
        {
            int l = i / j;
            int k = l;
            if (i % j != 0)
            {
                k = l + 1;
            }
            return k;
        }

        private static byte[] concat(byte abyte0[], byte abyte1[])
        {
            byte abyte2[] = new byte[abyte0.length + abyte1.length];
            System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
            System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
            return abyte2;
        }

        private static byte[] encodedInt(int i)
        {
            return (new byte[] {
                (byte)((0xff000000 & i) >>> 24), (byte)((0xff0000 & i) >>> 16), (byte)((0xff00 & i) >>> 8), (byte)(i & 0xff)
            });
        }

        private static byte[] f(Mac mac, byte abyte0[], int i, int j)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException
        {
            byte abyte2[] = new byte[mac.getMacLength()];
            byte abyte1[] = concat(abyte0, encodedInt(j));
            j = 1;
            abyte0 = abyte2;
            do
            {
                if (j > i)
                {
                    return abyte0;
                }
                abyte1 = mac.doFinal(abyte1);
                abyte0 = xor(abyte0, abyte1);
                j++;
            } while (true);
        }

        public static Key genKey(char ac[], byte abyte0[], int i, int j)
            throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException
        {
            Mac mac = Mac.getInstance("HMACSHA1");
            int i1 = mac.getMacLength();
            int j1 = ceil(j, i1);
            byte abyte1[] = new byte[j];
            mac.init(new SecretKeySpec((new String(ac)).getBytes(), "HmacSHA1"));
            int k = 1;
            do
            {
                if (k > j1)
                {
                    return new SecretKeySpec(abyte1, "AES");
                }
                ac = f(mac, abyte0, i, k);
                int l = i1;
                if (k == j1)
                {
                    l = j - (j1 - 1) * i1;
                }
                System.arraycopy(ac, 0, abyte1, (k - 1) * i1, l);
                k++;
            } while (true);
        }

        private static byte[] xor(byte abyte0[], byte abyte1[])
        {
            int i = 0;
            do
            {
                if (i >= abyte0.length)
                {
                    return abyte0;
                }
                abyte0[i] = (byte)((abyte0[i] ^ abyte1[i]) & 0xff);
                i++;
            } while (true);
        }

        public PBKDF2()
        {
        }
    }


    public static final String HASH_ALGORITH_MD5 = "MD5";
    public static final String HASH_ALGORITH_SHA1 = "SHA-1";

    public SecurityUtils()
    {
    }

    public static InputStream decryptData(InputStream inputstream, byte abyte0[])
        throws Exception
    {
        abyte0 = new SecretKeySpec(abyte0, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, abyte0);
        return new CipherInputStream(inputstream, cipher);
    }

    public static String hashData(String s, String s1)
    {
        s = hashData(s.getBytes(), s1);
        s1 = new StringBuilder();
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return s1.toString();
            }
            s1.append(Integer.toString((s[i] & 0xff) + 256, 16).substring(1));
            i++;
        } while (true);
    }

    public static byte[] hashData(byte abyte0[], String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance(s);
            messagedigest.reset();
            messagedigest.update(abyte0);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            WLUtils.error((new StringBuilder(String.valueOf(s))).append(" is not supported on this device").toString(), abyte0);
            return null;
        }
        return abyte0;
    }

    public static byte[] kpg(Context context, String as[])
    {
        try
        {
            context = PaidSecurityUtils.kpg(context, as);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new byte[0];
        }
        return context;
    }
}
