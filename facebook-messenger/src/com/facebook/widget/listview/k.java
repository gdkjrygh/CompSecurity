// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.view.View;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.widget.listview:
//            BetterListView

public class k
{

    private final BetterListView a;
    private int b;
    private int c;
    private int d;

    public k(BetterListView betterlistview)
    {
        Preconditions.checkNotNull(betterlistview);
        a = betterlistview;
        a();
    }

    public void a()
    {
        View view = a.getChildAt(0);
        if (view != null)
        {
            b = a.getFirstVisiblePosition();
            c = view.getHeight();
            d = -view.getTop();
            return;
        } else
        {
            b = 0;
            c = 0;
            d = 0;
            return;
        }
    }

    public void a(k k1)
    {
        boolean flag;
        if (k1.a == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        b = k1.b();
        c = k1.c();
        d = k1.d();
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }
}
