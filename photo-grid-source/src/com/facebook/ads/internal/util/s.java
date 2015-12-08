// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.security.MessageDigest;

public class s
{

    public static boolean a(String s1)
    {
        return s1 == null || s1.length() <= 0;
    }

    public static String b(String s1)
    {
        StringBuilder stringbuilder;
        int i;
        try
        {
            s1 = MessageDigest.getInstance("MD5").digest(s1.getBytes("utf-8"));
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i = 0;
        if (i >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(Integer.toString((s1[i] & 0xff) + 256, 16).substring(1));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_25;
_L1:
        s1 = stringbuilder.toString();
        return s1;
    }
}
