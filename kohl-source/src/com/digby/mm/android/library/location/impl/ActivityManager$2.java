// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.os.Bundle;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.location.ActivityRecognitionClient;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            ActivityManager

class this._cls0
    implements com.google.android.gms.common.Client.ConnectionCallbacks
{

    final ActivityManager this$0;

    public void onConnected(Bundle bundle)
    {
        try
        {
            if (ActivityManager.access$200(ActivityManager.this).isConnected())
            {
                ActivityManager.access$200(ActivityManager.this).removeActivityUpdates(ActivityManager.access$300(ActivityManager.this));
                ActivityManager.access$200(ActivityManager.this).disconnect();
                ActivityManager.access$402(ActivityManager.this, false);
                Logger.Debug("ActivityManager - Reconnected and stopped monitoring", ActivityManager.access$100(ActivityManager.this));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.Error("ActivityManager.Error in onConnected", bundle);
        }
    }

    public void onDisconnected()
    {
        Logger.Debug("ActivityManager_onDisconnected~~", ActivityManager.access$100(ActivityManager.this));
    }

    tionCallbacks()
    {
        this$0 = ActivityManager.this;
        super();
    }
}
