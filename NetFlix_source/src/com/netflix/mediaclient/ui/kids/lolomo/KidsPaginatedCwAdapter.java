// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lomo.PaginatedCwAdapter;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsCwViewGroup

public class KidsPaginatedCwAdapter extends PaginatedCwAdapter
{

    public KidsPaginatedCwAdapter(Context context)
    {
        super(context);
    }

    protected int computeNumItemsPerPage(int i, int j)
    {
        return 1;
    }

    public int getCount()
    {
        return Math.min(super.getCount(), 3);
    }

    public int getRowHeightInPx()
    {
        return KidsUtils.computeHorizontalRowHeight(activity, true);
    }

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        KidsCwViewGroup kidscwviewgroup = (KidsCwViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/kids/lolomo/KidsCwViewGroup);
        viewrecycler = kidscwviewgroup;
        if (kidscwviewgroup == null)
        {
            viewrecycler = new KidsCwViewGroup(getActivity(), true);
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }
}
