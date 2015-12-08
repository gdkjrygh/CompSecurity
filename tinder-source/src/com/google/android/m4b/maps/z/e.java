// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.Arrays;

public final class e
{

    private final long a = 0L;
    private final long b = 0L;
    private final long c = 0L;
    private final long d = 0L;
    private final long e = 0L;
    private final long f = 0L;

    public e()
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (0L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        if (0L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        if (0L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        if (0L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        if (0L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        if (0L >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j.a(flag);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (a == ((e) (obj)).a)
            {
                flag = flag1;
                if (b == ((e) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((e) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((e) (obj)).d)
                        {
                            flag = flag1;
                            if (e == ((e) (obj)).e)
                            {
                                flag = flag1;
                                if (f == ((e) (obj)).f)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(a), Long.valueOf(b), Long.valueOf(c), Long.valueOf(d), Long.valueOf(e), Long.valueOf(f)
        });
    }

    public final String toString()
    {
        return h.a(this).a("hitCount", a).a("missCount", b).a("loadSuccessCount", c).a("loadExceptionCount", d).a("totalLoadTime", e).a("evictionCount", f).toString();
    }
}
