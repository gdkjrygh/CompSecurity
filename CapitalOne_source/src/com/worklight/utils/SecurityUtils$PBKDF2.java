// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.worklight.utils:
//            SecurityUtils

public static class n
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

    public n()
    {
    }
}
