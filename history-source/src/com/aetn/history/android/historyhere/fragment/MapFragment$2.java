// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements OnMapReadyCallback
{

    final MapFragment this$0;

    public void onMapReady(GoogleMap googlemap)
    {
        MapFragment.access$102(MapFragment.this, googlemap);
        initMap();
    }

    A()
    {
        this$0 = MapFragment.this;
        super();
    }
}
