// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import java.util.List;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            DownloadGeoFencesEvent

class this._cls0
    implements IGeoFenceListReceiver
{

    final DownloadGeoFencesEvent this$0;

    public void onReceive(List list)
    {
        if (list.size() == 0)
        {
            DigbyController.getInstance(getContext()).getSharedPrefsManager().getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.ates.NEVER);
        }
    }

    s()
    {
        this$0 = DownloadGeoFencesEvent.this;
        super();
    }
}
