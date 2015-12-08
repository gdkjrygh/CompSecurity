// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.net.URL;

final class ai extends am
{

    ai()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
        } else
        {
            a1 = a1.h();
            if (!"null".equals(a1))
            {
                return new URL(a1);
            }
        }
        return null;
    }

    public final void a(f f1, Object obj)
    {
        obj = (URL)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URL) (obj)).toExternalForm();
        }
        f1.b(((String) (obj)));
    }
}
