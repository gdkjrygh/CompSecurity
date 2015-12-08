// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BasePaginatedAdapter, BillboardView, BillboardViewGroup

public class PaginatedBillboardAdapter extends BasePaginatedAdapter
{

    private static final String TAG = "PaginatedBillboardAdapter";

    public PaginatedBillboardAdapter(Context context)
    {
        super(context);
    }

    protected int computeNumItemsPerPage(int i, int j)
    {
        return 1;
    }

    protected int computeNumVideosToFetchPerBatch(Context context)
    {
        return 20;
    }

    public int getRowHeightInPx()
    {
        int i;
        if (BillboardView.shouldShowArtworkOnly(activity))
        {
            i = (int)((float)computeViewPagerWidth(activity, false) * 0.5625F);
        } else
        {
            int j = computeViewPagerWidth(activity, false);
            if (DeviceUtils.isLandscape(activity))
            {
                i = 3;
            } else
            {
                i = 2;
            }
            i = j / i;
        }
        Log.v("PaginatedBillboardAdapter", (new StringBuilder()).append("Computed view height: ").append(i).toString());
        return i;
    }

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        BillboardViewGroup billboardviewgroup = (BillboardViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/lomo/BillboardViewGroup);
        viewrecycler = billboardviewgroup;
        if (billboardviewgroup == null)
        {
            viewrecycler = new BillboardViewGroup(getActivity());
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }
}
