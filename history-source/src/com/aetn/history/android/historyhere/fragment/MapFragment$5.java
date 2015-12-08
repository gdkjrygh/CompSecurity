// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.google.android.gms.maps.rkerClickListener
{

    final MapFragment this$0;

    public boolean onMarkerClick(Marker marker)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "the marker was clicked");
        marker = MapFragment.access$1600(MapFragment.this, marker.getTitle());
        ((MainNavigationActivity)getActivity()).showDetailPager(marker);
        setSelectedToursMarkerByPoi(marker, true);
        return true;
    }

    A()
    {
        this$0 = MapFragment.this;
        super();
    }
}
