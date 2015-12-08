// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.POIDetail;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class val.poi
    implements Runnable
{

    final MapFragment this$0;
    final POIDetail val$poi;

    public void run()
    {
        setSelectedMarkerByPoi(val$poi);
        MapFragment.access$2600(MapFragment.this, val$poi);
    }

    ()
    {
        this$0 = final_mapfragment;
        val$poi = POIDetail.this;
        super();
    }
}
