// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.widget.TextView;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListOverlayDetailFragment

class this._cls0
    implements android.support.v4.view.er
{

    final ListOverlayDetailFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        ListOverlayDetailFragment.access$400(ListOverlayDetailFragment.this).setText((new StringBuilder()).append(ListOverlayDetailFragment.access$200(ListOverlayDetailFragment.this).getCurrentItem() + 1).append(" of ").append(ListOverlayDetailFragment.access$300(ListOverlayDetailFragment.this).size()).toString());
        ListOverlayDetailFragment.access$500(ListOverlayDetailFragment.this);
    }

    ()
    {
        this$0 = ListOverlayDetailFragment.this;
        super();
    }
}
