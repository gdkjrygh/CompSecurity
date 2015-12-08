// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;

import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments.map:
//            GoogleMapFragment_, GoogleMapFragment

public class  extends d
{

    public GoogleMapFragment build()
    {
        GoogleMapFragment_ googlemapfragment_ = new GoogleMapFragment_();
        googlemapfragment_.setArguments(args);
        return googlemapfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mIsZoomAndGestures(boolean flag)
    {
        args.putBoolean("mIsZoomAndGestures", flag);
        return this;
    }

    public args mLatLng(LatLng latlng)
    {
        args.putParcelable("mLatLng", latlng);
        return this;
    }

    public ()
    {
    }
}
