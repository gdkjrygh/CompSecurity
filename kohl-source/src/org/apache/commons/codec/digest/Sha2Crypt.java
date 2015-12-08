// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.digest;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.Charsets;

// Referenced classes of package org.apache.commons.codec.digest:
//            B64, DigestUtils

public class Sha2Crypt
{

    private static final int ROUNDS_DEFAULT = 5000;
    private static final int ROUNDS_MAX = 0x3b9ac9ff;
    private static final int ROUNDS_MIN = 1000;
    private static final String ROUNDS_PREFIX = "rounds=";
    private static final Pattern SALT_PATTERN = Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");
    private static final int SHA256_BLOCKSIZE = 32;
    static final String SHA256_PREFIX = "$5$";
    private static final int SHA512_BLOCKSIZE = 64;
    static final String SHA512_PREFIX = "$6$";

    public Sha2Crypt()
    {
    }

    public static String sha256Crypt(byte abyte0[])
    {
        return sha256Crypt(abyte0, null);
    }

    public static String sha256Crypt(byte abyte0[], String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = (new StringBuilder()).append("$5$").append(B64.getRandomSalt(8)).toString();
        }
        return sha2Crypt(abyte0, s1, "$5$", 32, "SHA-256");
    }

    private static String sha2Crypt(byte abyte0[], String s, String s1, int i, String s2)
    {
        int l = abyte0.length;
        int j = 5000;
        boolean flag = false;
        if (s == null)
        {
            throw new IllegalArgumentException("Salt must not be null");
        }
        Object obj = SALT_PATTERN.matcher(s);
        if (obj == null || !((Matcher) (obj)).find())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid salt value: ").append(s).toString());
        }
        if (((Matcher) (obj)).group(3) != null)
        {
            j = Math.max(1000, Math.min(0x3b9ac9ff, Integer.parseInt(((Matcher) (obj)).group(3))));
            flag = true;
        }
        String s3 = ((Matcher) (obj)).group(4);
        byte abyte1[] = s3.getBytes(Charsets.UTF_8);
        int i1 = abyte1.length;
        obj = DigestUtils.getDigest(s2);
        ((MessageDigest) (obj)).update(abyte0);
        ((MessageDigest) (obj)).update(abyte1);
        s = DigestUtils.getDigest(s2);
        s.update(abyte0);
        s.update(abyte1);
        s.update(abyte0);
        s = s.digest();
        int k;
        for (k = abyte0.length; k > i; k -= i)
        {
            ((MessageDigest) (obj)).update(s, 0, i);
        }

        ((MessageDigest) (obj)).update(s, 0, k);
        k = abyte0.length;
        while (k > 0) 
        {
            if ((k & 1) != 0)
            {
                ((MessageDigest) (obj)).update(s, 0, i);
            } else
            {
                ((MessageDigest) (obj)).update(abyte0);
            }
            k >>= 1;
        }
        s = ((MessageDigest) (obj)).digest();
        MessageDigest messagedigest = DigestUtils.getDigest(s2);
        for (k = 1; k <= l; k++)
        {
            messagedigest.update(abyte0);
        }

        byte abyte3[] = messagedigest.digest();
        byte abyte2[] = new byte[l];
        for (k = 0; k < l - i; k += i)
        {
            System.arraycopy(abyte3, 0, abyte2, k, i);
        }

        System.arraycopy(abyte3, 0, abyte2, k, l - k);
        MessageDigest messagedigest1 = DigestUtils.getDigest(s2);
        for (k = 1; k <= (s[0] & 0xff) + 16; k++)
        {
            messagedigest1.update(abyte1);
        }

        byte abyte4[] = messagedigest1.digest();
        byte abyte5[] = new byte[i1];
        for (k = 0; k < i1 - i; k += i)
        {
            System.arraycopy(abyte4, 0, abyte5, k, i);
        }

        System.arraycopy(abyte4, 0, abyte5, k, i1 - k);
        k = 0;
        while (k <= j - 1) 
        {
            obj = DigestUtils.getDigest(s2);
            if ((k & 1) != 0)
            {
                ((MessageDigest) (obj)).update(abyte2, 0, l);
            } else
            {
                ((MessageDigest) (obj)).update(s, 0, i);
            }
            if (k % 3 != 0)
            {
                ((MessageDigest) (obj)).update(abyte5, 0, i1);
            }
            if (k % 7 != 0)
            {
                ((MessageDigest) (obj)).update(abyte2, 0, l);
            }
            if ((k & 1) != 0)
            {
                ((MessageDigest) (obj)).update(s, 0, i);
            } else
            {
                ((MessageDigest) (obj)).update(abyte2, 0, l);
            }
            s = ((MessageDigest) (obj)).digest();
            k++;
        }
        s1 = new StringBuilder(s1);
        if (flag)
        {
            s1.append("rounds=");
            s1.append(j);
            s1.append("$");
        }
        s1.append(s3);
        s1.append("$");
        if (i == 32)
        {
            B64.b64from24bit(s[0], s[10], s[20], 4, s1);
            B64.b64from24bit(s[21], s[1], s[11], 4, s1);
            B64.b64from24bit(s[12], s[22], s[2], 4, s1);
            B64.b64from24bit(s[3], s[13], s[23], 4, s1);
            B64.b64from24bit(s[24], s[4], s[14], 4, s1);
            B64.b64from24bit(s[15], s[25], s[5], 4, s1);
            B64.b64from24bit(s[6], s[16], s[26], 4, s1);
            B64.b64from24bit(s[27], s[7], s[17], 4, s1);
            B64.b64from24bit(s[18], s[28], s[8], 4, s1);
            B64.b64from24bit(s[9], s[19], s[29], 4, s1);
            B64.b64from24bit((byte)0, s[31], s[30], 3, s1);
        } else
        {
            B64.b64from24bit(s[0], s[21], s[42], 4, s1);
            B64.b64from24bit(s[22], s[43], s[1], 4, s1);
            B64.b64from24bit(s[44], s[2], s[23], 4, s1);
            B64.b64from24bit(s[3], s[24], s[45], 4, s1);
            B64.b64from24bit(s[25], s[46], s[4], 4, s1);
            B64.b64from24bit(s[47], s[5], s[26], 4, s1);
            B64.b64from24bit(s[6], s[27], s[48], 4, s1);
            B64.b64from24bit(s[28], s[49], s[7], 4, s1);
            B64.b64from24bit(s[50], s[8], s[29], 4, s1);
            B64.b64from24bit(s[9], s[30], s[51], 4, s1);
            B64.b64from24bit(s[31], s[52], s[10], 4, s1);
            B64.b64from24bit(s[53], s[11], s[32], 4, s1);
            B64.b64from24bit(s[12], s[33], s[54], 4, s1);
            B64.b64from24bit(s[34], s[55], s[13], 4, s1);
            B64.b64from24bit(s[56], s[14], s[35], 4, s1);
            B64.b64from24bit(s[15], s[36], s[57], 4, s1);
            B64.b64from24bit(s[37], s[58], s[16], 4, s1);
            B64.b64from24bit(s[59], s[17], s[38], 4, s1);
            B64.b64from24bit(s[18], s[39], s[60], 4, s1);
            B64.b64from24bit(s[40], s[61], s[19], 4, s1);
            B64.b64from24bit(s[62], s[20], s[41], 4, s1);
            B64.b64from24bit((byte)0, (byte)0, s[63], 2, s1);
        }
        Arrays.fill(abyte4, (byte)0);
        Arrays.fill(abyte2, (byte)0);
        Arrays.fill(abyte5, (byte)0);
        ((MessageDigest) (obj)).reset();
        messagedigest1.reset();
        Arrays.fill(abyte0, (byte)0);
        Arrays.fill(abyte1, (byte)0);
        return s1.toString();
    }

    public static String sha512Crypt(byte abyte0[])
    {
        return sha512Crypt(abyte0, null);
    }

    public static String sha512Crypt(byte abyte0[], String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = (new StringBuilder()).append("$6$").append(B64.getRandomSalt(8)).toString();
        }
        return sha2Crypt(abyte0, s1, "$6$", 64, "SHA-512");
    }

}
