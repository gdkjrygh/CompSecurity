// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.ExpandableListView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements android.widget.ew.OnChildClickListener
{

    final PowerActivity a;

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        if (PowerActivity.a(a) != null && !f.a())
        {
            PowerActivity.a(a, view);
            com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, j);
            PowerActivity.a(a, i);
            b.c(11309);
            a.showDialog(1);
        }
        return true;
    }

    er(PowerActivity poweractivity)
    {
        a = poweractivity;
        super();
    }
}
