// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.content.res.Configuration;
import com.pinterest.activity.search.adapter.GuidedSearchMyBoardAdapter;
import com.pinterest.base.Device;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedMyPinSearchFragment

class <init>
    implements com.pinterest.ui.grid.pterViewListener
{

    final GuidedMyPinSearchFragment this$0;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (configuration.orientation == 2 || configuration.orientation == 1)
        {
            _myBoardAdapter.updateColumnWidth((int)Device.dpToPixel(configuration.screenWidthDp), GuidedMyPinSearchFragment.access$100(GuidedMyPinSearchFragment.this).getAdapterView().getColumnCount());
            GuidedMyPinSearchFragment.access$200(GuidedMyPinSearchFragment.this).removeAllViewsInLayout();
        }
    }

    public void onLayout()
    {
    }

    public void onMeasure()
    {
    }

    private ()
    {
        this$0 = GuidedMyPinSearchFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
