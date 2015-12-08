// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lomo.PaginatedLoMoAdapter;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLoMoViewGroup

public class KidsPaginatedLoMoAdapter extends PaginatedLoMoAdapter
{

    public KidsPaginatedLoMoAdapter(Context context)
    {
        super(context);
    }

    protected int computeNumItemsPerPage(int i, int j)
    {
        return 1;
    }

    public int getRowHeightInPx()
    {
        return KidsUtils.computeRowHeight(activity, true);
    }

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        KidsLoMoViewGroup kidslomoviewgroup = (KidsLoMoViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/kids/lolomo/KidsLoMoViewGroup);
        viewrecycler = kidslomoviewgroup;
        if (kidslomoviewgroup == null)
        {
            viewrecycler = new KidsLoMoViewGroup(getActivity(), true);
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }
}
