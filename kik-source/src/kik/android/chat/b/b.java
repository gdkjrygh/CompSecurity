// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import kik.android.util.cq;

public final class b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        public static int[] a()
        {
            return (int[])c.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    private final String a;
    private final int b;
    private final int c;
    private final com.kik.n.a.k.a.a d;
    private final String e;
    private int f;

    protected b(com.kik.n.a.k.a.a a1, String s, d.a a2, int i)
    {
        this(a1, s, a2, i, "");
    }

    protected b(com.kik.n.a.k.a.a a1, String s, d.a a2, int i, String s1)
    {
        f = 0xff000000;
        a = s;
        b = i;
        if (a2 != null)
        {
            c = a2.w;
            s = s1;
            if (cq.c(s1))
            {
                s = a2.x;
            }
        } else
        {
            c = -1;
            s = s1;
        }
        d = a1;
        e = s;
    }

    public final String a()
    {
        return a;
    }

    public final int b()
    {
        return f;
    }

    public final int c()
    {
        return c;
    }

    public final com.kik.n.a.k.a.a d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final b f()
    {
        f = -1;
        return this;
    }
}
