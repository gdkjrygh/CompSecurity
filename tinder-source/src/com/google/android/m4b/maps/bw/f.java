// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import java.lang.ref.SoftReference;

public final class f
{

    private static final Object a = new Object();
    private static final Object b = new Object();
    private static final ThreadLocal c = new ThreadLocal() {

        protected final Object initialValue()
        {
            return f.c();
        }

    };
    private static final ThreadLocal d = new ThreadLocal();

    public static void a()
    {
        c.set(a);
    }

    public static void a(byte abyte0[])
    {
        if (c.get() != a)
        {
            return;
        } else
        {
            d.set(new SoftReference(abyte0));
            return;
        }
    }

    public static byte[] a(int i)
    {
        if (c.get() != a)
        {
            return null;
        }
        SoftReference softreference = (SoftReference)d.get();
        if (softreference != null)
        {
            byte abyte0[] = (byte[])softreference.get();
            if (abyte0 != null && abyte0.length >= i)
            {
                d.remove();
                return abyte0;
            }
        }
        return null;
    }

    public static void b()
    {
        c.remove();
        d.remove();
    }

    static Object c()
    {
        return b;
    }

}
