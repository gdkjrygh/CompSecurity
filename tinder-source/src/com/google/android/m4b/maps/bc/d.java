// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{

    private static final Pattern a = Pattern.compile("[0-9]+[A-Z]?");
    private final String b;
    private final String c;
    private final boolean d;

    public d(String s, String s1, boolean flag)
    {
        c = s;
        b = s1;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (b == null)
        {
            s = c;
        } else
        {
            s = b;
        }
        if (!a.matcher(s).matches()) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        d = flag;
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof d)
            {
                if (!c.equals(((d) (obj = (d)obj)).c) || (b != null || ((d) (obj)).b != null) && !b.equals(((d) (obj)).b) || d != ((d) (obj)).d)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        char c1;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (d)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (c1 + (i + 31) * 31) * 31 + j;
    }

    public final String toString()
    {
        return c;
    }

}
