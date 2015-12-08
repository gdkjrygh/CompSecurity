// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.c;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.e;

public abstract class a extends b
{

    private l a;

    public a()
    {
    }

    public final int a(l l1)
    {
        if (l1 == a)
        {
            return b();
        } else
        {
            return 0;
        }
    }

    public final h b(l l1)
    {
        if (l1 == a)
        {
            return d();
        } else
        {
            return null;
        }
    }

    protected final void c(l l1)
    {
        a = l1;
    }

    protected abstract h d();

    protected final void d(l l1)
    {
        if (l1 == a)
        {
            a = null;
            return;
        } else
        {
            e.c(this, "Wrong sink disconnected");
            return;
        }
    }

    protected final void f()
    {
        if (a != null)
        {
            a.a(this);
        }
    }

    protected final void g()
    {
        if (a != null)
        {
            a.b(this);
        }
    }
}
