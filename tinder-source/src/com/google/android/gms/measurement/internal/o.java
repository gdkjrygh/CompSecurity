// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;

final class o
{

    final String a;
    final String b;
    final long c;
    final long d;
    final long e;

    o(String s, String s1, long l, long l1, long l2)
    {
        boolean flag1 = true;
        super();
        u.a(s);
        u.a(s1);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag);
        if (l1 >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        u.b(flag);
        a = s;
        b = s1;
        c = l;
        d = l1;
        e = l2;
    }
}
