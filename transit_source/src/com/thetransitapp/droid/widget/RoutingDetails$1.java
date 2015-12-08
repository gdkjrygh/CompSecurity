// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.os.Handler;

// Referenced classes of package com.thetransitapp.droid.widget:
//            RoutingDetails

class this._cls0
    implements Runnable
{

    final RoutingDetails this$0;

    public void run()
    {
        if (!isVisible())
        {
            return;
        } else
        {
            RoutingDetails.access$0(RoutingDetails.this);
            RoutingDetails.access$1(RoutingDetails.this).postDelayed(this, 20000L);
            return;
        }
    }

    ()
    {
        this$0 = RoutingDetails.this;
        super();
    }
}
