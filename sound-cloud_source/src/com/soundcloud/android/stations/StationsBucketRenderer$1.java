// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.view.View;
import com.soundcloud.android.Navigator;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsBucketRenderer

class val.type
    implements android.view.nsBucketRenderer._cls1
{

    final StationsBucketRenderer this$0;
    final int val$type;

    public void onClick(View view)
    {
        StationsBucketRenderer.access$000(StationsBucketRenderer.this).openViewAllStations(view.getContext(), val$type);
    }

    ()
    {
        this$0 = final_stationsbucketrenderer;
        val$type = I.this;
        super();
    }
}
