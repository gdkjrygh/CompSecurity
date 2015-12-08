// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.nativeImpl;

import android.location.LocationManager;

// Referenced classes of package com.worklight.location.internal.geo.nativeImpl:
//            AndroidLocationListener

class this._cls0
    implements Runnable
{

    final AndroidLocationListener this$0;

    public void run()
    {
        locationManager.removeUpdates(AndroidLocationListener.this);
    }

    ()
    {
        this$0 = AndroidLocationListener.this;
        super();
    }
}
