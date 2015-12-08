// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class aw extends af
{

    aw()
    {
    }

    public Boolean a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        if (a1.f() == c.f)
        {
            return Boolean.valueOf(Boolean.parseBoolean(a1.h()));
        } else
        {
            return Boolean.valueOf(a1.i());
        }
    }

    public void a(d d1, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            d1.f();
            return;
        } else
        {
            d1.a(boolean1.booleanValue());
            return;
        }
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
