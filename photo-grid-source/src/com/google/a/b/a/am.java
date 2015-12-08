// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.util.UUID;

final class am extends com.google.a.am
{

    am()
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
            return UUID.fromString(a1.h());
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (UUID)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((UUID) (obj)).toString();
        }
        f1.b(((String) (obj)));
    }
}
