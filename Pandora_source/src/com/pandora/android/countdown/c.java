// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;


public class c
{
    public static interface a
    {

        public abstract String a(long l, long l1);
    }


    public final Object a;
    public final Object b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public int f;

    public c(Object obj, Object obj1, String s, boolean flag, boolean flag1)
    {
        f = -1;
        a = obj;
        b = obj1;
        c = s;
        d = flag;
        e = flag1;
    }

    public int a()
    {
        return f;
    }

    public void a(int i)
    {
        f = i;
    }
}
