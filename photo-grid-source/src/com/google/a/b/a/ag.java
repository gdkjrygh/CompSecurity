// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

final class ag extends am
{

    ag()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        } else
        {
            return new StringBuilder(a1.h());
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (StringBuilder)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((StringBuilder) (obj)).toString();
        }
        f1.b(((String) (obj)));
    }
}
