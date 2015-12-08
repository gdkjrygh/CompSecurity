// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.digest;

import org.apache.commons.codec.Charsets;

// Referenced classes of package org.apache.commons.codec.digest:
//            Sha2Crypt, Md5Crypt, UnixCrypt

public class Crypt
{

    public Crypt()
    {
    }

    public static String crypt(String s)
    {
        return crypt(s, null);
    }

    public static String crypt(String s, String s1)
    {
        return crypt(s.getBytes(Charsets.UTF_8), s1);
    }

    public static String crypt(byte abyte0[])
    {
        return crypt(abyte0, null);
    }

    public static String crypt(byte abyte0[], String s)
    {
        if (s == null)
        {
            return Sha2Crypt.sha512Crypt(abyte0);
        }
        if (s.startsWith("$6$"))
        {
            return Sha2Crypt.sha512Crypt(abyte0, s);
        }
        if (s.startsWith("$5$"))
        {
            return Sha2Crypt.sha256Crypt(abyte0, s);
        }
        if (s.startsWith("$1$"))
        {
            return Md5Crypt.md5Crypt(abyte0, s);
        } else
        {
            return UnixCrypt.crypt(abyte0, s);
        }
    }
}
