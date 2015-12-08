// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.model.POIDetail;
import java.util.Comparator;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements Comparator
{

    final MapFragment this$0;

    public int compare(POIDetail poidetail, POIDetail poidetail1)
    {
        return Math.round(poidetail.getDistance() - poidetail1.getDistance());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((POIDetail)obj, (POIDetail)obj1);
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
