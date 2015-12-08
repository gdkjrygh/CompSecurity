// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.thetransitapp.droid.controller.RouteViewController;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen

class this._cls0
    implements com.thetransitapp.droid.widget.orButtonClickListener
{

    final RoutesScreen this$0;

    public void onErrorButtonClick()
    {
        RoutesScreen.access$3(RoutesScreen.this).refresh(getLastLocation(), true, true);
    }

    eViewController()
    {
        this$0 = RoutesScreen.this;
        super();
    }
}
