// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BasePaginatedAdapter, CwViewGroup

public class PaginatedCwAdapter extends BasePaginatedAdapter
{

    private static final String TAG = "PaginatedCwAdapter";
    private static final SparseArray numVideosPerPageTable;

    public PaginatedCwAdapter(Context context)
    {
        super(context);
    }

    public static int computeNumVideosToFetchPerBatch(NetflixActivity netflixactivity, int i)
    {
        if (netflixactivity.isForKids())
        {
            return 3;
        } else
        {
            int j = ((SparseIntArray)numVideosPerPageTable.get(2)).get(i);
            return Math.max(((SparseIntArray)numVideosPerPageTable.get(1)).get(i) * j, 4);
        }
    }

    protected int computeNumItemsPerPage(int i, int j)
    {
        return ((SparseIntArray)numVideosPerPageTable.get(i)).get(j);
    }

    protected int computeNumVideosToFetchPerBatch(Context context)
    {
        int i = DeviceUtils.getScreenSizeCategory(context);
        return computeNumVideosToFetchPerBatch(activity, i);
    }

    public int getRowHeightInPx()
    {
        int i = DeviceUtils.getBasicScreenOrientation(activity);
        int j = DeviceUtils.getScreenSizeCategory(activity);
        i = (int)((float)(computeViewPagerWidth(activity, true) / computeNumItemsPerPage(i, j)) * 0.5625F + 0.5F) + activity.getResources().getDimensionPixelOffset(0x7f0a005a);
        Log.v("PaginatedCwAdapter", (new StringBuilder()).append("Computed view height: ").append(i).toString());
        return i;
    }

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        CwViewGroup cwviewgroup = (CwViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/lomo/CwViewGroup);
        viewrecycler = cwviewgroup;
        if (cwviewgroup == null)
        {
            viewrecycler = new CwViewGroup(getActivity());
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }

    static 
    {
        numVideosPerPageTable = new SparseArray(2);
        SparseIntArray sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 1);
        sparseintarray.put(2, 1);
        sparseintarray.put(3, 2);
        sparseintarray.put(4, 2);
        numVideosPerPageTable.put(1, sparseintarray);
        sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 2);
        sparseintarray.put(2, 2);
        sparseintarray.put(3, 3);
        sparseintarray.put(4, 3);
        numVideosPerPageTable.put(2, sparseintarray);
    }
}
