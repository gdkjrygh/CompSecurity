// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ba extends af
{

    ba()
    {
    }

    public Boolean a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return Boolean.valueOf(a1.h());
        }
    }

    public void a(d d1, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            boolean1 = "null";
        } else
        {
            boolean1 = boolean1.toString();
        }
        d1.b(boolean1);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Boolean)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
