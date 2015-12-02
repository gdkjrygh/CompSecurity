// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.ExpandableListView;
import com.nineoldandroids.a.b;
import com.nineoldandroids.b.a;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class d extends b
{

    final View a;
    final boolean b;
    final c c;
    final int d;
    final c e;

    public void b(com.nineoldandroids.a.a a1)
    {
        PowerActivity.m(e.e).setEnabled(true);
        if (e.e.isFinishing()) goto _L2; else goto _L1
_L1:
        a1 = a.getLayoutParams();
        com.nineoldandroids.b.a.a(a, 1.0F);
        com.nineoldandroids.b.a.d(a, 0.0F);
        a1.height = 0;
        a.setLayoutParams(a1);
        if (b)
        {
            com.qihoo.security.ui.opti.sysclear.b(e);
        }
        if (!c.c)
        {
            c(e);
        }
        if (c.c >= 3)
        {
            c(e);
        }
        if (d < 0) goto _L4; else goto _L3
_L3:
        com.qihoo.security.ui.opti.sysclear.d(e).remove(c);
        e.e(c);
_L6:
        e.tifyDataSetChanged();
        com.qihoo.security.ui.opti.sysclear.PowerActivity.a(e.e, false);
        e(e);
_L2:
        return;
_L4:
        if (e(e) != null && e(e).size() > 0)
        {
            e(e).remove(c);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ( , View view, boolean flag,  1, int i)
    {
        e = ;
        a = view;
        b = flag;
        c = 1;
        d = i;
        super();
    }
}
