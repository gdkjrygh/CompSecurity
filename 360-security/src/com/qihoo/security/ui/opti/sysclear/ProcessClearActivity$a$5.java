// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.ExpandableListView;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class d extends b
{

    final View a;
    final int b;
    final e c;
    final boolean d;
    final e e;

    public void b(a a1)
    {
        if (!e.e.isFinishing())
        {
            com.qihoo.security.ui.opti.sysclear.nishing(e, a, b, c, d);
            return;
        } else
        {
            ProcessClearActivity.m(e.e).setEnabled(true);
            return;
        }
    }

    ( , View view, int i,  1, boolean flag)
    {
        e = ;
        a = view;
        b = i;
        c = 1;
        d = flag;
        super();
    }
}
