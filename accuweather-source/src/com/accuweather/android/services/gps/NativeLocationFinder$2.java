// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.location.Location;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services.gps:
//            NativeLocationFinder

class ngleUpdateListener extends ngleUpdateListener
{

    final NativeLocationFinder this$0;

    public void onLocationChanged(Location location)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), "In networkListener onLocationChanged().");
        }
        NativeLocationFinder.access$200(NativeLocationFinder.this, location);
    }

    ngleUpdateListener()
    {
        this$0 = NativeLocationFinder.this;
        super(NativeLocationFinder.this, null);
    }
}
