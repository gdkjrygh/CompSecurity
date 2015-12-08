// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

class this._cls0
    implements Runnable
{

    final MapOverlayFragment this$0;

    public void run()
    {
        MapOverlayFragment.access$600(MapOverlayFragment.this).mMapDetailActive = false;
        MapOverlayFragment.access$1300(MapOverlayFragment.this, MapOverlayFragment.access$400(MapOverlayFragment.this).getCurrentItem());
        MapOverlayFragment.access$1502(MapOverlayFragment.this, false);
    }

    I()
    {
        this$0 = MapOverlayFragment.this;
        super();
    }
}
