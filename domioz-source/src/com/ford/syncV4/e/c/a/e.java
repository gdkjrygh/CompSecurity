// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;

import java.util.EnumSet;
import java.util.Iterator;

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e f[];
    String e;

    private e(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static e a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/e/c/a/e).iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            if (e1.toString().equals(s))
            {
                return e1;
            }
        }

        return null;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/ford/syncV4/e/c/a/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new e("HMI_FULL", 0, "FULL");
        b = new e("HMI_LIMITED", 1, "LIMITED");
        c = new e("HMI_BACKGROUND", 2, "BACKGROUND");
        d = new e("HMI_NONE", 3, "NONE");
        f = (new e[] {
            a, b, c, d
        });
    }
}
