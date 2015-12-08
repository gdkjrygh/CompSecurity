// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager

class this._cls1 extends BroadcastReceiver
{

    final is._cls0 this$1;

    public void onReceive(Context context, Intent intent)
    {
        Logger.info("App state changed");
        UALocationManager.access$200(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/urbanairship/location/UALocationManager$3

/* anonymous class */
    class UALocationManager._cls3
        implements Runnable
    {

        final UALocationManager this$0;

        public void run()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
            intentfilter.addAction(Analytics.ACTION_APP_BACKGROUND);
            intentfilter.addCategory(UAirship.getPackageName());
            UAirship.getApplicationContext().registerReceiver(new UALocationManager._cls3._cls1(), intentfilter);
            UALocationManager.access$200(UALocationManager.this);
        }

            
            {
                this$0 = UALocationManager.this;
                super();
            }
    }

}
