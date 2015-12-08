// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.QRBS.activity:
//            CreateCalendar, CalendarListSel

class this._cls0
    implements android.view.ner
{

    final CreateCalendar this$0;

    public void onClick(View view)
    {
        view = new Intent(CreateCalendar.this, com/QRBS/activity/CalendarListSel);
        startActivity(view);
    }

    ()
    {
        this$0 = CreateCalendar.this;
        super();
    }
}
