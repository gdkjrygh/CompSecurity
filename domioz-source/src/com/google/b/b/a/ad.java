// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.af;
import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

final class ad extends al
{

    ad()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        a1 = a1.h();
        if (a1.length() != 1)
        {
            throw new af((new StringBuilder("Expecting character, got: ")).append(a1).toString());
        } else
        {
            return Character.valueOf(a1.charAt(0));
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (Character)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        d1.b(((String) (obj)));
    }
}
