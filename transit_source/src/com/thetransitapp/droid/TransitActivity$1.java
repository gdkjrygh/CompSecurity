// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.os.Bundle;
import com.google.android.gms.location.LocationClient;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity, RoutesScreen

class this._cls0
    implements com.google.android.gms.common.Client.ConnectionCallbacks
{

    final TransitActivity this$0;

    public void onConnected(Bundle bundle)
    {
        TransitActivity.access$0(TransitActivity.this).requestLocationUpdates(TransitActivity.access$1(TransitActivity.this), TransitActivity.this);
        if (getLastLocation() == null && TransitActivity.access$2(TransitActivity.this).isVisible())
        {
            showLocationServiceError();
        }
    }

    public void onDisconnected()
    {
    }

    ient()
    {
        this$0 = TransitActivity.this;
        super();
    }
}
