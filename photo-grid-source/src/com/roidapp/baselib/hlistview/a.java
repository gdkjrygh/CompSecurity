// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView, k

final class a
    implements Runnable
{

    final View a;
    final k b;
    final AbsHListView c;

    a(AbsHListView abshlistview, View view, k k1)
    {
        c = abshlistview;
        a = view;
        b = k1;
        super();
    }

    public final void run()
    {
        c.F = -1;
        a.setPressed(false);
        c.setPressed(false);
        if (!c.aj)
        {
            b.run();
        }
    }
}
