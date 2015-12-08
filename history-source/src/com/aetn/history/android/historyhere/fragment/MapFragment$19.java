// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.POIDetail;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class val.id
    implements Runnable
{

    final MapFragment this$0;
    final String val$id;

    public void run()
    {
        POIDetail poidetail1 = (POIDetail)MapFragment.access$2900(MapFragment.this).get(0);
        POIDetail poidetail = poidetail1;
        if (val$id != null)
        {
            Iterator iterator = MapFragment.access$2900(MapFragment.this).iterator();
            do
            {
                poidetail = poidetail1;
                if (!iterator.hasNext())
                {
                    break;
                }
                poidetail = (POIDetail)iterator.next();
            } while (!poidetail.getId().equalsIgnoreCase(val$id));
        }
        setSelectedToursMarkerByPoi(poidetail, false);
        MapFragment.access$2600(MapFragment.this, poidetail);
    }

    ()
    {
        this$0 = final_mapfragment;
        val$id = String.this;
        super();
    }
}
