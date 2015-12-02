// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.r;

import com.facebook.common.w.q;
import com.facebook.prefs.shared.d;
import com.facebook.zero.a.c;

public class a
    implements javax.inject.a
{

    private final d a;
    private final javax.inject.a b;

    public a(d d1, javax.inject.a a1)
    {
        a = d1;
        b = a1;
    }

    public q a()
    {
        if (!((Boolean)b.b()).booleanValue())
        {
            return q.NO;
        }
        String s = a.a(c.e, "unknown");
        if (s.equals("disabled"))
        {
            return q.NO;
        }
        if (s.equals("enabled"))
        {
            return q.YES;
        } else
        {
            return q.UNSET;
        }
    }

    public Object b()
    {
        return a();
    }
}
