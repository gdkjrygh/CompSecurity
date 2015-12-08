// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            CalendarListSel, CalendarList

class this._cls0
    implements android.widget.ClickListener
{

    final CalendarListSel this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Intent(CalendarListSel.this, com/QRBS/activity/CalendarList);
        adapterview.putExtra("CalendarID", ((com.scannerfire.utils.)list.get(i)).getId());
        startActivity(adapterview);
    }

    lSel()
    {
        this$0 = CalendarListSel.this;
        super();
    }
}
