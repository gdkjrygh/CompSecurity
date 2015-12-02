// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import com.google.common.a.hq;
import com.google.common.d.a.s;
import java.util.List;

// Referenced classes of package com.facebook.fbservice.service:
//            ac, OperationResult, g

class m
{

    private final ac a;
    private final long b;
    private long c;
    private long d;
    private s e;
    private OperationResult f;
    private List g;
    private g h;

    m(ac ac, long l)
    {
        g = hq.a();
        a = ac;
        b = l;
    }

    static long a(m m1, long l)
    {
        m1.c = l;
        return l;
    }

    static OperationResult a(m m1, OperationResult operationresult)
    {
        m1.f = operationresult;
        return operationresult;
    }

    static g a(m m1, g g1)
    {
        m1.h = g1;
        return g1;
    }

    static s a(m m1)
    {
        return m1.e;
    }

    static s a(m m1, s s)
    {
        m1.e = s;
        return s;
    }

    static List a(m m1, List list)
    {
        m1.g = list;
        return list;
    }

    static long b(m m1, long l)
    {
        m1.d = l;
        return l;
    }

    static g b(m m1)
    {
        return m1.h;
    }

    static long c(m m1)
    {
        return m1.d;
    }

    static ac d(m m1)
    {
        return m1.a;
    }

    static List e(m m1)
    {
        return m1.g;
    }

    static OperationResult f(m m1)
    {
        return m1.f;
    }
}
