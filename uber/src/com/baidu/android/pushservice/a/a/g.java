// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.a.a;

import android.net.Uri;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class g
{

    public static String a(String s)
    {
        a(s, "str");
        return a(s.getBytes());
    }

    public static String a(byte abyte0[])
    {
        a(abyte0, "data");
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        int i;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s = Integer.toHexString(abyte0[i] & 0xff);
        if (s.length() == 1)
        {
            stringbuilder.append("0");
        }
        stringbuilder.append(s);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
    }

    public static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.format("Argument '%s' cannot be null", new Object[] {
                s
            }));
        } else
        {
            return;
        }
    }

    public static boolean a(Uri uri)
    {
        if (uri != null)
        {
            uri = uri.getScheme();
            if (uri != null && (uri.equalsIgnoreCase("http") || uri.equalsIgnoreCase("https")))
            {
                return true;
            }
        }
        return false;
    }
}
