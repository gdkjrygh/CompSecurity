// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

final class ai extends al
{

    ai()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return new StringBuffer(a1.h());
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (StringBuffer)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((StringBuffer) (obj)).toString();
        }
        d1.b(((String) (obj)));
    }
}
