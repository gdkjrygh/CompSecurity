// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.thetransitapp.droid.service.NotificationTask;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen

class this._cls0
    implements com.thetransitapp.droid.widget.orButtonClickListener
{

    final RoutesScreen this$0;

    public void onErrorButtonClick()
    {
        new NotificationTask(getActivity(), getLastLocation());
    }

    ationTask()
    {
        this$0 = RoutesScreen.this;
        super();
    }
}
