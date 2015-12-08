// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;


public class o
{
    public static interface a
    {

        public abstract void a(int i);

        public abstract void a(int i, int j);
    }


    public static int a = -1;
    private int b;
    private int c;
    private a d;

    public o()
    {
        b = a;
        c = a;
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        if (i != b)
        {
            c = b;
            b = i;
            if (d != null)
            {
                d.a(c, b);
            }
        } else
        if (d != null)
        {
            d.a(i);
            return;
        }
    }

    public void a(a a1)
    {
        d = a1;
    }

}
