// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilitiesStorage

class this._cls0 extends BroadcastReceiver
{

    final DeviceCapabilitiesStorage this$0;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.intent.action.MEDIA_MOUNTED".equals(context))
        {
            DeviceCapabilitiesStorage.access$100(DeviceCapabilitiesStorage.this);
        }
        if ("android.intent.action.MEDIA_UNMOUNTED".equals(context) || "android.intent.action.MEDIA_REMOVED".equals(context) || "android.intent.action.MEDIA_BAD_REMOVAL".equals(context))
        {
            DeviceCapabilitiesStorage.access$200(DeviceCapabilitiesStorage.this);
        }
    }

    ()
    {
        this$0 = DeviceCapabilitiesStorage.this;
        super();
    }
}
