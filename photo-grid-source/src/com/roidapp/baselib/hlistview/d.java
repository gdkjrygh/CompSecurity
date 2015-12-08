// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            p, AbsHListView

final class d extends p
    implements Runnable
{

    final AbsHListView a;

    private d(AbsHListView abshlistview)
    {
        a = abshlistview;
        super(abshlistview, (byte)0);
    }

    d(AbsHListView abshlistview, byte byte0)
    {
        this(abshlistview);
    }

    public final void run()
    {
        if (a.isPressed() && a.am >= 0)
        {
            int i = a.am;
            int j = a.V;
            View view = a.getChildAt(i - j);
            if (!a.aj)
            {
                boolean flag;
                if (b())
                {
                    flag = a.b(view, a.am, a.an);
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a.setPressed(false);
                    view.setPressed(false);
                }
            } else
            {
                a.setPressed(false);
                if (view != null)
                {
                    view.setPressed(false);
                    return;
                }
            }
        }
    }
}
