// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BasePaginatedAdapter, LoMoViewGroup

public class PaginatedLoMoAdapter extends BasePaginatedAdapter
{

    public static final SparseArray numVideosPerPageTable;

    public PaginatedLoMoAdapter(Context context)
    {
        super(context);
    }

    public static int computeNumVideosToFetchPerBatch(NetflixActivity netflixactivity, int i)
    {
        if (netflixactivity.isForKids())
        {
            return 5;
        } else
        {
            int j = ((SparseIntArray)numVideosPerPageTable.get(2)).get(i);
            return ((SparseIntArray)numVideosPerPageTable.get(1)).get(i) * j;
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

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        LoMoViewGroup lomoviewgroup = (LoMoViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/lomo/LoMoViewGroup);
        viewrecycler = lomoviewgroup;
        if (lomoviewgroup == null)
        {
            viewrecycler = new LoMoViewGroup(getActivity());
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }

    static 
    {
        numVideosPerPageTable = new SparseArray(2);
        SparseIntArray sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 2);
        sparseintarray.put(2, 3);
        sparseintarray.put(3, 4);
        sparseintarray.put(4, 4);
        numVideosPerPageTable.put(1, sparseintarray);
        sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 3);
        sparseintarray.put(2, 4);
        sparseintarray.put(3, 5);
        sparseintarray.put(4, 6);
        numVideosPerPageTable.put(2, sparseintarray);
    }
}
