// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity

class this._cls0
    implements com.google.android.gms.common.Client.OnConnectionFailedListener
{

    final TransitActivity this$0;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Log.e(TransitActivity.access$3(), "LocationClient connection failed");
    }

    sult()
    {
        this$0 = TransitActivity.this;
        super();
    }
}
