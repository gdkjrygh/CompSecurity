// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import com.facebook.analytics.cb;
import com.facebook.debug.b.a;
import com.google.common.base.Objects;

class f extends cb
{

    private final String b;

    public f(String s, String s1, String s2, double d, long l, 
            String s3)
    {
        super("perf");
        a(l);
        a.a(s);
        e(s);
        a.a(s1);
        h(s1);
        a.a(s2);
        b("marker", s2);
        if (d != 0.0D)
        {
            a("value", d);
        }
        if (s3 != null)
        {
            b("scenario", s3);
        }
        b = s2;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, j(), b
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("perf:").append(j()).append(":").append(b).toString();
    }
}
