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

public class Md5Crypt
{

    static final String APR1_PREFIX = "$apr1$";
    private static final int BLOCKSIZE = 16;
    static final String MD5_PREFIX = "$1$";
    private static final int ROUNDS = 1000;

    public Md5Crypt()
    {
    }

    public static String apr1Crypt(String s)
    {
        return apr1Crypt(s.getBytes(Charsets.UTF_8));
    }

    public static String apr1Crypt(String s, String s1)
    {
        return apr1Crypt(s.getBytes(Charsets.UTF_8), s1);
    }

    public static String apr1Crypt(byte abyte0[])
    {
        return apr1Crypt(abyte0, (new StringBuilder()).append("$apr1$").append(B64.getRandomSalt(8)).toString());
    }

    public static String apr1Crypt(byte abyte0[], String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (!s.startsWith("$apr1$"))
            {
                s1 = (new StringBuilder()).append("$apr1$").append(s).toString();
            }
        }
        return md5Crypt(abyte0, s1, "$apr1$");
    }

    public static String md5Crypt(byte abyte0[])
    {
        return md5Crypt(abyte0, (new StringBuilder()).append("$1$").append(B64.getRandomSalt(8)).toString());
    }

    public static String md5Crypt(byte abyte0[], String s)
    {
        return md5Crypt(abyte0, s, "$1$");
    }

    public static String md5Crypt(byte abyte0[], String s, String s1)
    {
        int j = abyte0.length;
        Object obj;
        byte abyte1[];
        MessageDigest messagedigest;
        byte abyte2[];
        int i;
        if (s == null)
        {
            s = B64.getRandomSalt(8);
        } else
        {
            obj = Pattern.compile((new StringBuilder()).append("^").append(s1.replace("$", "\\$")).append("([\\.\\/a-zA-Z0-9]{1,8}).*").toString()).matcher(s);
            if (obj == null || !((Matcher) (obj)).find())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid salt value: ").append(s).toString());
            }
            s = ((Matcher) (obj)).group(1);
        }
        abyte1 = s.getBytes(Charsets.UTF_8);
        messagedigest = DigestUtils.getMd5Digest();
        messagedigest.update(abyte0);
        messagedigest.update(s1.getBytes(Charsets.UTF_8));
        messagedigest.update(abyte1);
        obj = DigestUtils.getMd5Digest();
        ((MessageDigest) (obj)).update(abyte0);
        ((MessageDigest) (obj)).update(abyte1);
        ((MessageDigest) (obj)).update(abyte0);
        abyte2 = ((MessageDigest) (obj)).digest();
        i = j;
        while (i > 0) 
        {
            int k;
            if (i > 16)
            {
                k = 16;
            } else
            {
                k = i;
            }
            messagedigest.update(abyte2, 0, k);
            i -= 16;
        }
        Arrays.fill(abyte2, (byte)0);
        while (j > 0) 
        {
            if ((j & 1) == 1)
            {
                messagedigest.update(abyte2[0]);
            } else
            {
                messagedigest.update(abyte0[0]);
            }
            j >>= 1;
        }
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append(s1).append(s).append("$").toString());
        s = messagedigest.digest();
        i = 0;
        s1 = ((String) (obj));
        while (i < 1000) 
        {
            s1 = DigestUtils.getMd5Digest();
            if ((i & 1) != 0)
            {
                s1.update(abyte0);
            } else
            {
                s1.update(s, 0, 16);
            }
            if (i % 3 != 0)
            {
                s1.update(abyte1);
            }
            if (i % 7 != 0)
            {
                s1.update(abyte0);
            }
            if ((i & 1) != 0)
            {
                s1.update(s, 0, 16);
            } else
            {
                s1.update(abyte0);
            }
            s = s1.digest();
            i++;
        }
        B64.b64from24bit(s[0], s[6], s[12], 4, stringbuilder);
        B64.b64from24bit(s[1], s[7], s[13], 4, stringbuilder);
        B64.b64from24bit(s[2], s[8], s[14], 4, stringbuilder);
        B64.b64from24bit(s[3], s[9], s[15], 4, stringbuilder);
        B64.b64from24bit(s[4], s[10], s[5], 4, stringbuilder);
        B64.b64from24bit((byte)0, (byte)0, s[11], 2, stringbuilder);
        messagedigest.reset();
        s1.reset();
        Arrays.fill(abyte0, (byte)0);
        Arrays.fill(abyte1, (byte)0);
        Arrays.fill(s, (byte)0);
        return stringbuilder.toString();
    }
}
