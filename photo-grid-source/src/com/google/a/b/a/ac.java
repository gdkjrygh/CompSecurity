// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

final class ac extends am
{

    ac()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        a1 = a1.h();
        if (a1.length() != 1)
        {
            throw new ag((new StringBuilder("Expecting character, got: ")).append(a1).toString());
        } else
        {
            return Character.valueOf(a1.charAt(0));
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (Character)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        f1.b(((String) (obj)));
    }
}
