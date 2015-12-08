// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ds;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            r

public static final class a
{

    private final Object a;
    private final ds b;
    private Object c;

    static a a(String s, int i)
    {
        return new <init>(ds.a(s, Integer.valueOf(i)), Integer.valueOf(i));
    }

    static <init> a(String s, long l)
    {
        return new <init>(ds.a(s, Long.valueOf(l)), Long.valueOf(l));
    }

    static <init> a(String s, String s1, String s2)
    {
        return new <init>(ds.a(s, s2), s1);
    }

    static <init> a(String s, boolean flag)
    {
        return new <init>(ds.a(s, flag), Boolean.valueOf(flag));
    }

    public final Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (f.a && ds.b())
        {
            return b.e();
        } else
        {
            return a;
        }
    }

    private (ds ds1, Object obj)
    {
        u.a(ds1);
        b = ds1;
        a = obj;
    }
}
