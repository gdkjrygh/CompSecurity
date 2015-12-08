// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager

class this._cls0
    implements ServiceConnection
{

    final UALocationManager this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Logger.info("Location service connected.");
        UALocationManager.access$000(UALocationManager.this, ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Logger.info("Location service disconnected.");
        UALocationManager.access$100(UALocationManager.this);
    }

    ()
    {
        this$0 = UALocationManager.this;
        super();
    }
}
