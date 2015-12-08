// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.digby.mm.android.library.geofence.impl:
//            GetGeoFencesTask

class this._cls0 extends BroadcastReceiver
{

    final GetGeoFencesTask this$0;

    public void onReceive(Context context, Intent intent)
    {
        GetGeoFencesTask.access$102(GetGeoFencesTask.this, intent.getBooleanExtra("Success", true));
        GetGeoFencesTask.access$002(GetGeoFencesTask.this, true);
    }

    ()
    {
        this$0 = GetGeoFencesTask.this;
        super();
    }
}
