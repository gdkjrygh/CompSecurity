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

class this._cls1
    implements Runnable
{

    final l.poi this$1;

    public void run()
    {
        MapFragment.access$2700(_fld0);
        setSelectedMarkerByPoi(poi);
        MapFragment.access$2600(_fld0, poi);
    }

    l.poi()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/MapFragment$18

/* anonymous class */
    class MapFragment._cls18
        implements Runnable
    {

        final MapFragment this$0;
        final LatLng val$ll;
        final POIDetail val$poi;

        public void run()
        {
            MapFragment.access$100(MapFragment.this).animateCamera(CameraUpdateFactory.newLatLngZoom(ll, 17F));
            (new Handler()).postDelayed(new MapFragment._cls18._cls1(), 2000L);
        }

            
            {
                this$0 = final_mapfragment;
                ll = latlng;
                poi = POIDetail.this;
                super();
            }
    }

}
