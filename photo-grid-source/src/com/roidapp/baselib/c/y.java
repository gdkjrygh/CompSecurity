// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.support.v7.widget.al;
import android.support.v7.widget.bi;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.baselib.c:
//            z, aa, ab

public final class y extends al
{

    private final al a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public y(al al1)
    {
        a = al1;
        a.a(new z(this));
    }

    public final int a()
    {
        return b.size() + a.a() + c.size();
    }

    public final int a(int i)
    {
        if (i < b.size())
        {
            return i - 1000;
        }
        if (i < b.size() + a.a())
        {
            return a.a(i - b.size());
        } else
        {
            return i - 2000 - b.size() - a.a();
        }
    }

    public final bi a(ViewGroup viewgroup, int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i >= -1000 && i < b.size() - 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = Math.abs(i + 1000);
            return new aa(this, (View)b.get(i));
        }
        if (i >= -2000 && i < c.size() - 2000)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = Math.abs(i + 2000);
            return new ab(this, (View)c.get(i));
        } else
        {
            return a.a(viewgroup, i);
        }
    }

    public final void a(bi bi, int i)
    {
        if (i >= b.size() && i < b.size() + a.a())
        {
            a.a(bi, i - b.size());
        }
    }

    public final void a(View view)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("You can't have a null header!");
        } else
        {
            b.add(view);
            return;
        }
    }

    public final void b(View view)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("You can't have a null footer!");
        } else
        {
            c.add(view);
            return;
        }
    }

    public final al d()
    {
        return a;
    }

    public final void e()
    {
        b.clear();
    }

    public final void f()
    {
        c.clear();
    }

    public final int g()
    {
        return b.size();
    }

    public final int h()
    {
        return c.size();
    }
}
