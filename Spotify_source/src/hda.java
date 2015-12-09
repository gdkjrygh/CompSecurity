// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class hda
{

    public static String a(String s)
    {
        return new String(hcz.a(a(s.getBytes())));
    }

    public static byte[] a(byte abyte0[])
    {
        return b("MD5").digest(abyte0);
    }

    private static MessageDigest b(String s)
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage());
        }
        return s;
    }

    public static byte[] b(byte abyte0[])
    {
        return b("SHA").digest(abyte0);
    }
}
