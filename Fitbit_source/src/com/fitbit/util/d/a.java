// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.d;


public class com.fitbit.util.d.a
{
    public static interface a
    {

        public abstract void c();

        public abstract void d();
    }


    public static final String a = "AccumulativeState";
    private final a b;
    private int c;
    private String d;

    public com.fitbit.util.d.a(a a1)
    {
        d = "AccumulativeState";
        b = a1;
    }

    public void a()
    {
        com.fitbit.e.a.a(d, "AccumulativeState incremented: [%d++]", new Object[] {
            Integer.valueOf(c)
        });
        int i = c;
        c = i + 1;
        if (i == 0)
        {
            b.c();
        }
    }

    public void a(String s)
    {
        d = s;
    }

    public void b()
    {
        if (c != 0)
        {
            com.fitbit.e.a.a(d, "AccumulativeState decremented: [--%d]", new Object[] {
                Integer.valueOf(c)
            });
            int i = c - 1;
            c = i;
            if (i == 0)
            {
                b.d();
                return;
            }
        }
    }

    public void c()
    {
        if (c == 0)
        {
            return;
        } else
        {
            c = 0;
            com.fitbit.e.a.a(d, "AccumulativeState reseted: [%d]", new Object[] {
                Integer.valueOf(c)
            });
            b.d();
            return;
        }
    }
}
