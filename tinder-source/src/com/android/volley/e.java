// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class e
{

    private static final char a[] = "0123456789ABCDEF".toCharArray();

    public static String a(String s)
    {
        int i = 0;
        char ac[];
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        s = s.getBytes("UTF-8");
        messagedigest.update(s, 0, s.length);
        s = messagedigest.digest();
        ac = new char[s.length * 2];
        while (i < s.length) 
        {
            int j = s[i] & 0xff;
            try
            {
                ac[i * 2] = a[j >>> 4];
                ac[i * 2 + 1] = a[j & 0xf];
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            i++;
        }
        s = new String(ac);
        return s;
    }

}
