// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;


// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            b, d, l, e, 
//            h

public abstract class c extends b
{

    private final l a = new d(this);
    private boolean b;

    public c()
    {
    }

    public void a(b b1)
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a(this, flag, "Source was already connected to this pipe");
        b = true;
        a.d(b1);
    }

    protected abstract void a(b b1, l l1);

    protected abstract void b(b b1, l l1);

    protected boolean b(e e1)
    {
        return true;
    }

    protected abstract void d();

    public final b i()
    {
        b b1 = a.i();
        if (b1 != null)
        {
            boolean flag = b1.c();
            a.h();
            if (flag)
            {
                a.b(b1);
            }
            b = false;
            return b1;
        } else
        {
            return null;
        }
    }

    protected final b j()
    {
        return a.i();
    }

    protected final boolean k()
    {
        if (!b)
        {
            return true;
        }
        b b1 = a.i();
        if (b1 == null)
        {
            return false;
        } else
        {
            return b1.c();
        }
    }

    protected final int l()
    {
        b b1 = a.i();
        if (b1 == null)
        {
            return 0;
        } else
        {
            return b1.a(a);
        }
    }

    protected final h m()
    {
        b b1 = a.i();
        if (b1 == null)
        {
            return null;
        } else
        {
            return b1.b(a);
        }
    }

    protected final e n()
    {
        b b1 = a.i();
        if (b1 == null)
        {
            return e.k;
        } else
        {
            return b1.a();
        }
    }
}
