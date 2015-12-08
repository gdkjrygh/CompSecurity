// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

final class aw extends am
{

    aw()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        if (a1.f() == e.f)
        {
            return Boolean.valueOf(Boolean.parseBoolean(a1.h()));
        } else
        {
            return Boolean.valueOf(a1.i());
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (Boolean)obj;
        if (obj == null)
        {
            f1.f();
            return;
        } else
        {
            f1.a(((Boolean) (obj)).booleanValue());
            return;
        }
    }
}
