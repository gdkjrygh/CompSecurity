// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;

import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            b, e

public abstract class l
{

    private b a;

    public l()
    {
    }

    public abstract void a();

    public abstract void a(b b1);

    protected boolean a(e e)
    {
        return true;
    }

    public abstract void b(b b1);

    protected void c(b b1)
    {
    }

    public final void d(b b1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("source", b1);
        Object obj = b1.a();
        boolean flag;
        if (obj != null && a(((e) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("source", "a supported audio type", flag);
        obj = a;
        a = b1;
        if (obj != null)
        {
            ((b) (obj)).d(this);
        }
        b1.c(this);
    }

    public final b h()
    {
        b b1 = a;
        a = null;
        if (b1 != null)
        {
            b1.d(this);
            c(b1);
            return b1;
        } else
        {
            return null;
        }
    }

    protected final b i()
    {
        return a;
    }
}
