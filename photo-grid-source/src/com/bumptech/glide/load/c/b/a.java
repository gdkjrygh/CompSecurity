// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c.b;

import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.f;
import com.bumptech.glide.load.c.e;
import com.bumptech.glide.load.c.p;
import com.bumptech.glide.load.c.s;

public final class a
    implements s
{

    private final p a;

    public a()
    {
        this(null);
    }

    public a(p p1)
    {
        a = p1;
    }

    public final c a(Object obj, int i, int j)
    {
        e e1 = (e)obj;
        obj = e1;
        if (a != null)
        {
            obj = (e)a.a(e1);
            if (obj == null)
            {
                a.a(e1, e1);
                obj = e1;
            }
        }
        return new f(((e) (obj)));
    }
}
