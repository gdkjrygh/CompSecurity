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

class this._cls0
    implements Runnable
{

    final UALocationManager this$0;

    public void run()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
        intentfilter.addAction(Analytics.ACTION_APP_BACKGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        UAirship.getApplicationContext().registerReceiver(new BroadcastReceiver() {

            final UALocationManager._cls3 this$1;

            public void onReceive(Context context, Intent intent)
            {
                Logger.info("App state changed");
                UALocationManager.access$200(this$0);
            }

            
            {
                this$1 = UALocationManager._cls3.this;
                super();
            }
        }, intentfilter);
        UALocationManager.access$200(UALocationManager.this);
    }

    _cls1.this._cls1()
    {
        this$0 = UALocationManager.this;
        super();
    }
}
