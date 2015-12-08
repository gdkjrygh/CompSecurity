// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import java.util.UUID;

final class an extends al
{

    an()
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
            return UUID.fromString(a1.h());
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (UUID)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((UUID) (obj)).toString();
        }
        d1.b(((String) (obj)));
    }
}
