// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.chromium.content.browser:
//            BatteryStatusManager

class this._cls0 extends BroadcastReceiver
{

    final BatteryStatusManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        BatteryStatusManager.this.onReceive(intent);
    }

    _cls9()
    {
        this$0 = BatteryStatusManager.this;
        super();
    }
}
