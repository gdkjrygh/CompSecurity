// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.im;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            am

public static final class a
{

    private final Object a;
    private final im b;
    private Object c;

    static a a(String s, float f)
    {
        return a(s, f, f);
    }

    static a a(String s, float f, float f1)
    {
        return new <init>(im.a(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static <init> a(String s, int i)
    {
        return a(s, i, i);
    }

    static a a(String s, int i, int j)
    {
        return new <init>(im.a(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> a(String s, long l)
    {
        return a(s, l, l);
    }

    static a a(String s, long l, long l1)
    {
        return new <init>(im.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> a(String s, String s1)
    {
        return a(s, s1, s1);
    }

    static a a(String s, String s1, String s2)
    {
        return new <init>(im.a(s, s2), s1);
    }

    static <init> a(String s, boolean flag)
    {
        return a(s, flag, flag);
    }

    static a a(String s, boolean flag, boolean flag1)
    {
        return new <init>(im.a(s, flag1), Boolean.valueOf(flag));
    }

    public Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (g.a && im.b())
        {
            return b.d();
        } else
        {
            return a;
        }
    }

    private (im im1, Object obj)
    {
        z.a(im1);
        b = im1;
        a = obj;
    }
}
