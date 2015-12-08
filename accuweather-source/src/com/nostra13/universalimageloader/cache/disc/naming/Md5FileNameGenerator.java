// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc.naming;

import com.nostra13.universalimageloader.utils.L;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.nostra13.universalimageloader.cache.disc.naming:
//            FileNameGenerator

public class Md5FileNameGenerator
    implements FileNameGenerator
{

    private static final String HASH_ALGORITHM = "MD5";
    private static final int RADIX = 36;

    public Md5FileNameGenerator()
    {
    }

    private byte[] getMD5(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            L.e(abyte0);
            return null;
        }
        return abyte0;
    }

    public String generate(String s)
    {
        return (new BigInteger(getMD5(s.getBytes()))).abs().toString(36);
    }
}
