// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.widget.TextView;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayDetailFragment

class this._cls0
    implements android.support.v4.view.ner
{

    final MapOverlayDetailFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        MapOverlayDetailFragment.access$400(MapOverlayDetailFragment.this).setText((new StringBuilder()).append(MapOverlayDetailFragment.access$200(MapOverlayDetailFragment.this).getCurrentItem() + 1).append(" of ").append(MapOverlayDetailFragment.access$300(MapOverlayDetailFragment.this).size()).toString());
        MapOverlayDetailFragment.access$500(MapOverlayDetailFragment.this);
    }

    ()
    {
        this$0 = MapOverlayDetailFragment.this;
        super();
    }
}
