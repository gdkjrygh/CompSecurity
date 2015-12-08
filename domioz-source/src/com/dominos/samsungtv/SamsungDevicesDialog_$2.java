// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.samsung.multiscreen.device.Device;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungDevicesDialog_

class this._cls0
    implements android.widget.istener
{

    final SamsungDevicesDialog_ this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        onDeviceListItemClick((Device)adapterview.getAdapter().getItem(i));
    }

    ()
    {
        this$0 = SamsungDevicesDialog_.this;
        super();
    }
}
