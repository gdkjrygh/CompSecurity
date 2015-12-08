// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.os.Bundle;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.location.LocationClient;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            LocationManager

class this._cls0
    implements com.google.android.gms.common.Client.ConnectionCallbacks
{

    final LocationManager this$0;

    public void onConnected(Bundle bundle)
    {
        try
        {
            if (LocationManager.access$200(LocationManager.this).isConnected())
            {
                LocationManager.access$200(LocationManager.this).removeLocationUpdates(LocationManager.access$300(LocationManager.this));
                LocationManager.access$200(LocationManager.this).disconnect();
                LocationManager.access$402(LocationManager.this, false);
                Logger.Debug("LocationManager - Reconnected and stopped monitoring", LocationManager.access$100(LocationManager.this));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.Error("Error in onConnected", bundle);
        }
    }

    public void onDisconnected()
    {
        Logger.Debug("LocationManager_onDisconnected~~", LocationManager.access$100(LocationManager.this));
    }

    tionCallbacks()
    {
        this$0 = LocationManager.this;
        super();
    }
}
