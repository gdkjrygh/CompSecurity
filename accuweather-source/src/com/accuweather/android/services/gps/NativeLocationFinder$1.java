// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services.gps:
//            NativeLocationFinder, ILocationListener

class this._cls0
    implements psTimerTaskListener
{

    final NativeLocationFinder this$0;

    public void onTimeout()
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), "in onTimeout().");
        }
        cancel();
        if (mLocationListener != null)
        {
            android.location.Location location = NativeLocationFinder.access$000(NativeLocationFinder.this);
            if (location != null)
            {
                mLocationListener.onLocationChanged(location);
            }
        }
    }

    psTimerTaskListener()
    {
        this$0 = NativeLocationFinder.this;
        super();
    }
}
