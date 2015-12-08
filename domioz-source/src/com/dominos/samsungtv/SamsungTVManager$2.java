// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import com.dominos.android.sdk.common.LogUtil;
import com.samsung.multiscreen.a.a;
import com.samsung.multiscreen.device.Device;
import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.device.g;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungTVManager

class OpenAppListener
    implements f
{

    final SamsungTVManager this$0;
    final OpenAppListener val$callback;
    final Device val$device;
    final String val$orderId;
    final String val$phone;

    public void onError(g g1)
    {
        LogUtil.d("SamsungTV", g1.b(), new Object[0]);
        if (g1.a() == SamsungTVManager.access$200(SamsungTVManager.this))
        {
            val$callback.onAppNotFound();
        }
    }

    public void onResult(a a1)
    {
        LogUtil.d("SamsungTV", "Loaded Application: DominosTracker", new Object[0]);
        SamsungTVManager.access$000(SamsungTVManager.this, a1);
        SamsungTVManager.access$100(SamsungTVManager.this, val$device, a1, val$phone, val$orderId, val$callback);
    }

    public volatile void onResult(Object obj)
    {
        onResult((a)obj);
    }

    OpenAppListener()
    {
        this$0 = final_samsungtvmanager;
        val$device = device1;
        val$phone = s;
        val$orderId = s1;
        val$callback = OpenAppListener.this;
        super();
    }
}
