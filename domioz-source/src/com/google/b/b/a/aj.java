// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import java.net.URL;

final class aj extends al
{

    aj()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
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

    public final void a(d d1, Object obj)
    {
        obj = (URL)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URL) (obj)).toExternalForm();
        }
        d1.b(((String) (obj)));
    }
}
