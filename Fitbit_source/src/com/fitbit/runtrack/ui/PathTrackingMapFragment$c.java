// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import com.fitbit.maps.FitbitMapOptions;

// Referenced classes of package com.fitbit.runtrack.ui:
//            PathTrackingMapFragment

public static class 
{

    private FitbitMapOptions a;
    private boolean b;
    private boolean c;

    public  a()
    {
        c = true;
        return this;
    }

    public c a(FitbitMapOptions fitbitmapoptions)
    {
        a = fitbitmapoptions;
        return this;
    }

    public a b()
    {
        b = true;
        return this;
    }

    public PathTrackingMapFragment c()
    {
        PathTrackingMapFragment pathtrackingmapfragment = new PathTrackingMapFragment();
        Bundle bundle = new Bundle();
        if (a == null)
        {
            a = PathTrackingMapFragment.a();
        }
        bundle.putParcelable("map-options", a);
        bundle.putBoolean("my-location-enabled", b);
        bundle.putBoolean("allow-unlock", c);
        pathtrackingmapfragment.setArguments(bundle);
        return pathtrackingmapfragment;
    }

    public ()
    {
    }
}
