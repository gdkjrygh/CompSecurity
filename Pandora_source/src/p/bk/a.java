// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bk;

import p.bl.c;

public class a
{

    private static p.bl.a a[] = new p.bl.a[c.values().length];

    public static p.bl.a a(c c1)
    {
        return a[c1.ordinal()];
    }

    public static void a(p.bl.a a1)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a1;
        }

    }

    static 
    {
        a(p.bl.a.a);
    }
}
