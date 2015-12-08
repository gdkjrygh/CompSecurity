// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            p, AbsHListView

final class e extends p
    implements Runnable
{

    final AbsHListView a;

    private e(AbsHListView abshlistview)
    {
        a = abshlistview;
        super(abshlistview, (byte)0);
    }

    e(AbsHListView abshlistview, byte byte0)
    {
        this(abshlistview);
    }

    public final void run()
    {
label0:
        {
            int i = a.A;
            View view = a.getChildAt(i - a.V);
            if (view != null)
            {
                int j = a.A;
                long l = a.j.getItemId(a.A);
                boolean flag;
                if (b() && !a.aj)
                {
                    flag = a.b(view, j, l);
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                a.F = -1;
                a.setPressed(false);
                view.setPressed(false);
            }
            return;
        }
        a.F = 2;
    }
}
