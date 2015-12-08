// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.view.View;
import com.thetransitapp.droid.controller.ScheduleViewController;

// Referenced classes of package com.thetransitapp.droid:
//            SchedulesScreen

class this._cls0
    implements android.view.er
{

    final SchedulesScreen this$0;

    public void onClick(View view)
    {
        SchedulesScreen.access$0(SchedulesScreen.this).changeDirection();
    }

    eViewController()
    {
        this$0 = SchedulesScreen.this;
        super();
    }
}
