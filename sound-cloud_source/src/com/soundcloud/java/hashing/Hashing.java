// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.hashing;

import com.soundcloud.java.strings.Charsets;
import com.soundcloud.java.strings.Strings;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Hashing
{

    private Hashing()
    {
    }

    public static String md5(String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes(Charsets.UTF_8));
            s = Strings.toHexString(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }
}
