// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.google.android.gms.maps.meraChangeListener
{

    final MapFragment this$0;

    public void onCameraChange(CameraPosition cameraposition)
    {
label0:
        {
            Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("onCameraChange():lat:").append(cameraposition.target.latitude).append("|lng:").append(cameraposition.target.longitude).append("|zoom level:").append(cameraposition.zoom).toString());
            MapFragment.access$600(MapFragment.this);
            if (!MapFragment.access$700(MapFragment.this))
            {
                if (MapFragment.access$800(MapFragment.this))
                {
                    break label0;
                }
                MapFragment.access$702(MapFragment.this, true);
            }
            double d = Math.abs(cameraposition.target.latitude - MapFragment.access$900(MapFragment.this).getCurrentSearchLatitude());
            double d1 = Math.abs(cameraposition.target.longitude - MapFragment.access$900(MapFragment.this).getCurrentSearchLongitude());
            if ((d > MapFragment.access$1000(MapFragment.this) || d1 > MapFragment.access$1000(MapFragment.this)) && !MapFragment.access$1100(MapFragment.this).booleanValue() && !MapFragment.access$1200(MapFragment.this))
            {
                Utils.logger(MapFragment.access$000(MapFragment.this), "onCameraChange(): different lat/lng -  UPDATE");
                MapFragment.access$1400(MapFragment.this).removeCallbacks(MapFragment.access$1300(MapFragment.this));
                MapFragment.access$1400(MapFragment.this).postDelayed(MapFragment.access$1300(MapFragment.this), 1000L);
            }
            if (d > MapFragment.access$1000(MapFragment.this) || d1 > MapFragment.access$1000(MapFragment.this))
            {
                MapFragment.access$1202(MapFragment.this, false);
            }
            MapFragment.access$1500(MapFragment.this);
            return;
        }
        Toast.makeText(getActivity(), getActivity().getResources().getString(0x7f0d004d), 0).show();
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
