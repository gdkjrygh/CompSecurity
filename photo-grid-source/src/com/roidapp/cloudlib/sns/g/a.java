// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.g;

import com.roidapp.cloudlib.sns.b.g;

// Referenced classes of package com.roidapp.cloudlib.sns.g:
//            d

public final class a extends d
{

    boolean a;
    g b;
    int c;
    int d;
    com.roidapp.cloudlib.sns.b.a.a e;

    public a()
    {
        c = 0x80000000;
        d = 0x80000000;
        e = null;
    }

    public static int a(a a1, int i)
    {
        int j = i;
        if (a1 != null)
        {
            j = com.roidapp.cloudlib.sns.g.d.a(a1.c, i);
        }
        return j;
    }

    public static com.roidapp.cloudlib.sns.b.a.a a(a a1, com.roidapp.cloudlib.sns.b.a.a a2)
    {
        if (a1 != null)
        {
            com.roidapp.cloudlib.sns.b.a.a a3 = a1.e;
            a1 = a3;
            if (a3 == null)
            {
                a1 = a2;
            }
            return (com.roidapp.cloudlib.sns.b.a.a)a1;
        } else
        {
            return a2;
        }
    }

    public static g a(a a1, g g1)
    {
        if (a1 != null)
        {
            g g2 = a1.b;
            a1 = g2;
            if (g2 == null)
            {
                a1 = g1;
            }
            return (g)a1;
        } else
        {
            return g1;
        }
    }

    public static boolean a(a a1)
    {
        return a1 != null && a1.a;
    }

    public static int b(a a1, int i)
    {
        int j = i;
        if (a1 != null)
        {
            j = com.roidapp.cloudlib.sns.g.d.a(a1.d, i);
        }
        return j;
    }
}
