// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            RowAdapterCallbacks, LoMoViewPagerAdapter, LoMoViewPager

class this._cls0
    implements RowAdapterCallbacks
{

    final LoMoViewPagerAdapter this$0;

    public NetflixActivity getActivity()
    {
        return LoMoViewPagerAdapter.access$500(LoMoViewPagerAdapter.this);
    }

    public void notifyParentOfDataSetChange()
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", "Notified parent of data set change");
        }
        notifyDataSetChanged();
        LoMoViewPagerAdapter.access$400(LoMoViewPagerAdapter.this).notifyDataSetChanged();
        if (LoMoViewPagerAdapter.access$400(LoMoViewPagerAdapter.this).getCurrentItem() == 0)
        {
            if (Log.isLoggable("LoMoViewPagerAdapter", 2))
            {
                Log.v("LoMoViewPagerAdapter", "Data loaded for page 0 - saving state");
            }
            LoMoViewPagerAdapter.access$400(LoMoViewPagerAdapter.this).saveStateAndTrack(0);
        }
    }

    public void notifyParentOfError()
    {
        if (LoMoViewPagerAdapter.access$000(LoMoViewPagerAdapter.this) != pe.ERROR)
        {
            LoMoViewPagerAdapter.access$102(LoMoViewPagerAdapter.this, LoMoViewPagerAdapter.access$000(LoMoViewPagerAdapter.this));
        }
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("Pre-error state: ").append(LoMoViewPagerAdapter.access$100(LoMoViewPagerAdapter.this)).toString());
        }
        LoMoViewPagerAdapter.access$200(LoMoViewPagerAdapter.this, pe.ERROR);
        notifyDataSetChanged();
        LoMoViewPagerAdapter.access$300(LoMoViewPagerAdapter.this);
    }

    y()
    {
        this$0 = LoMoViewPagerAdapter.this;
        super();
    }
}
