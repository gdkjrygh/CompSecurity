// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.util;

import android.net.Uri;
import com.kik.cards.web.bf;

public final class b
{

    private static final String a[] = {
        "kik.com", "clikthis.com", "betaclik.com", "clk.mx"
    };

    public static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        }
        s = Uri.parse(s);
        if (s == null || s.getHost() == null)
        {
            return false;
        }
        String s1 = s.getHost();
        int i = s1.indexOf('.');
        int l = s1.lastIndexOf('.');
        int k = 0;
        for (; i < l; i = s1.indexOf('.', k))
        {
            k = i + 1;
        }

        s = s1;
        if (k > 0)
        {
            s = s1.substring(k);
        }
        String as[] = a;
        k = as.length;
        for (int j = 0; j < k; j++)
        {
            if (as[j].equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            s = c(bf.c(s));
            s1 = c(bf.c(s1));
            if (s != null && s.equals(s1))
            {
                return true;
            }
        }
        return false;
    }

    public static String b(String s)
    {
        return bf.c(s);
    }

    public static String c(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        String s2;
        s2 = s.toLowerCase();
        if (s2.startsWith("card:"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        if (!s2.startsWith("cards:")) goto _L4; else goto _L3
_L3:
        return (new StringBuilder("http")).append(s.substring(4, s.length())).toString();
    }

    public static boolean d(String s)
    {
        if (s != null)
        {
            s = s.toLowerCase();
            if (s.startsWith("card:") || s.startsWith("cards:"))
            {
                return true;
            }
        }
        return false;
    }

    public static String e(String s)
    {
        return bf.d(s);
    }

}
