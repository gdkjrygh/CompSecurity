// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class mvc extends dy
{

    private Object l;
    private boolean m;

    public mvc(Context context)
    {
        super(context);
    }

    private void s()
    {
        if (m)
        {
            boolean flag;
            if (!r())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m = flag;
        }
    }

    public final void a(Object obj)
    {
        if (!super.i)
        {
            l = obj;
            if (super.g)
            {
                super.a(obj);
                return;
            }
        }
    }

    protected final void f()
    {
        if (l != null)
        {
            a(l);
        }
        if (o() || l == null)
        {
            h();
        }
        if (!m)
        {
            m = q();
        }
    }

    protected final void j()
    {
        g();
    }

    protected final void l()
    {
        super.l();
        s();
    }

    protected final void n()
    {
        super.n();
        g();
        l = null;
        s();
    }

    public boolean q()
    {
        return false;
    }

    public boolean r()
    {
        return true;
    }
}
