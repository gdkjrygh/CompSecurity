// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.reflex.Container;
import com.facebook.reflex.view.b.r;
import com.facebook.reflex.view.c.f;
import com.facebook.reflex.view.c.o;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.reflex.view:
//            n, h, i

class m
    implements f
{

    final h a;
    private final Runnable b;

    private m(h h1)
    {
        a = h1;
        super();
        b = new n(this);
    }

    m(h h1, i i)
    {
        this(h1);
    }

    public int a()
    {
        return ViewConfiguration.get(a.getContext()).getScaledMaximumFlingVelocity();
    }

    public void a(r r1)
    {
        boolean flag;
        if (r1.f().getParent() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Trying to add a row to the ListView that already has a parent");
        h.a(a, r1.f(), a.getChildCount(), r1.f().getLayoutParams());
        h.j(a).a(r1.getBackingWidget());
        h.a(a).a(r1);
    }

    public void b()
    {
        a.post(b);
    }

    public void b(r r1)
    {
        boolean flag;
        if (r1.f().getParent() == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Trying to detach a ListView row that is not contained by the ListView");
        h.a(a, r1.f());
        h.a(a).b(r1);
    }

    public void c(r r1)
    {
        boolean flag;
        if (r1.f().getParent() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Trying to add a row to the ListView that already has a parent");
        h.b(a, r1.f(), a.getChildCount(), r1.f().getLayoutParams());
        h.a(a).a(r1);
    }

    public void d(r r1)
    {
        boolean flag;
        if (r1.f().getParent() == null || r1.f().getParent() == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Trying to remove a ListView row that is neither detached, nor contained by the ListView");
        if (r1.f().getParent() != null) goto _L2; else goto _L1
_L1:
        h.a(a, r1.f(), false);
_L4:
        h.j(a).c(r1.getBackingWidget());
        h.a(a).b(r1);
        return;
_L2:
        if (r1.f().getParent() == a)
        {
            a.removeViewInLayout(r1.f());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
