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
    implements android.widget.oupClickListener
{

    final ProcessClearActivity a;

    public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
    {
        if (ProcessClearActivity.a(a) != null)
        {
            if (i == 0 && ProcessClearActivity.a(a).b(0))
            {
                return false;
            }
            if (!f.a())
            {
                ProcessClearActivity.a(a, view);
                ProcessClearActivity.a(a, i);
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, 0x80000000);
                b.c(11020);
                a.showDialog(1);
            }
        }
        return true;
    }

    (ProcessClearActivity processclearactivity)
    {
        a = processclearactivity;
        super();
    }
}
