// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import com.facebook.debug.log.b;

public class d
{

    private static final Class a = com/facebook/orca/d/d;

    public d()
    {
    }

    public static long a(String s)
    {
        s = s.split("-");
        if (s.length != 3)
        {
            b.e(a, "Invalid fileName does not contain duration.");
            return -1L;
        }
        s = s[2];
        int i = s.lastIndexOf('.');
        if (i < 0)
        {
            b.e(a, "Invalid fileName does not contain duration.");
            return -1L;
        }
        s = s.substring(0, i);
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.e(a, "Invalid fileName does not contain duration.");
            return -1L;
        }
        return (long)i;
    }

}
