// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.os.Handler;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class val.poi
    implements Runnable
{

    final MapFragment this$0;
    final LatLng val$ll;
    final POIDetail val$poi;

    public void run()
    {
        MapFragment.access$100(MapFragment.this).animateCamera(CameraUpdateFactory.newLatLngZoom(val$ll, 17F));
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment._cls18 this$1;

            public void run()
            {
                MapFragment.access$2700(this$0);
                setSelectedMarkerByPoi(poi);
                MapFragment.access$2600(this$0, poi);
            }

            
            {
                this$1 = MapFragment._cls18.this;
                super();
            }
        }, 2000L);
    }

    _cls1.this._cls1()
    {
        this$0 = final_mapfragment;
        val$ll = latlng;
        val$poi = POIDetail.this;
        super();
    }
}
