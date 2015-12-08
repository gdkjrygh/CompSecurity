// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements Runnable
{

    final MapFragment this$0;

    public void run()
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "mapUpdateRunnable: run - now refresh the map");
        refreshPlacesMap();
    }

    A()
    {
        this$0 = MapFragment.this;
        super();
    }
}
