// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aw;

import com.google.android.m4b.maps.y.j;

public final class a
{

    public static String a(int i)
    {
        int k = i / 0xf4240;
        int l = Math.abs(i - k * 0xf4240);
        StringBuilder stringbuilder = new StringBuilder();
        if (i < 0 && k == 0)
        {
            stringbuilder.append("-");
        }
        stringbuilder.append(k);
        if (l > 0)
        {
            stringbuilder.append(".");
            stringbuilder.append(String.valueOf(l + 0xf4240).substring(1));
        }
        return stringbuilder.toString();
    }

    public static String a(String s)
    {
        if (s.length() >= 6)
        {
            return s;
        }
        for (s = new StringBuilder(s); s.length() < 6; s.append('0')) { }
        return s.toString();
    }

    public static String[] a(String s, char c)
    {
        int i1 = 0;
        String s1 = String.valueOf(c);
        j.a(s, "split target should not be null");
        int l1 = s.length();
        int i = s.indexOf(s1, 0);
        int l;
        int j1;
        for (l = 0; i != -1 && i < l1; l = j1)
        {
            j1 = l + 1;
            l = i;
            if (i >= 0)
            {
                l = i + s1.length();
            }
            i = s.indexOf(s1, l);
        }

        String as[] = new String[l + 1];
        for (int k = 0; k < l; k++)
        {
            int k1 = s.indexOf(s1, i1);
            as[k] = s.substring(i1, k1);
            i1 = s1.length() + k1;
        }

        as[l] = s.substring(i1);
        return as;
    }
}
