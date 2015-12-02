// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.ExpandableListView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a
    implements android.widget.ildClickListener
{

    final ProcessClearActivity a;

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        if (ProcessClearActivity.a(a) != null && !f.a())
        {
            ProcessClearActivity.a(a, view);
            com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, j);
            ProcessClearActivity.a(a, i);
            b.c(11020);
            a.showDialog(1);
        }
        return true;
    }

    (ProcessClearActivity processclearactivity)
    {
        a = processclearactivity;
        super();
    }
}
