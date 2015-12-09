// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

final class ax extends al
{

    ax()
    {
    }

    public final Object a(a a1)
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

    public final void a(d d1, Object obj)
    {
        obj = (Boolean)obj;
        if (obj == null)
        {
            d1.f();
            return;
        } else
        {
            d1.a(((Boolean) (obj)).booleanValue());
            return;
        }
    }
}
