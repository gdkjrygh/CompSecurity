// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.fitbit.maps.FitbitMapFragment;
import com.fitbit.maps.h;
import com.fitbit.maps.v;

// Referenced classes of package com.fitbit.runtrack.ui:
//            PathTrackingMapFragment

class a
    implements Runnable
{

    final PathTrackingMapFragment a;

    public void run()
    {
        h h1 = PathTrackingMapFragment.a(a).b();
        if (h1 != null)
        {
            h1.d(a.getArguments().getBoolean("my-location-enabled"));
            h1.m().c(false);
            h1.c(false);
            h1.b(false);
            h1.a(false);
            return;
        } else
        {
            PathTrackingMapFragment.b(a).postDelayed(this, 100L);
            return;
        }
    }

    (PathTrackingMapFragment pathtrackingmapfragment)
    {
        a = pathtrackingmapfragment;
        super();
    }
}
