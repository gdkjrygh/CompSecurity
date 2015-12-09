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
//            KidsCharacterViewGroup

public class KidsPaginatedCharacterAdapter extends PaginatedLoMoAdapter
{

    public KidsPaginatedCharacterAdapter(Context context)
    {
        super(context);
    }

    protected int computeNumItemsPerPage(int i, int j)
    {
        return 2;
    }

    public int getRowHeightInPx()
    {
        return KidsUtils.computeCharacterViewSize(activity, true);
    }

    protected View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo)
    {
        KidsCharacterViewGroup kidscharacterviewgroup = (KidsCharacterViewGroup)viewrecycler.pop(com/netflix/mediaclient/ui/kids/lolomo/KidsCharacterViewGroup);
        viewrecycler = kidscharacterviewgroup;
        if (kidscharacterviewgroup == null)
        {
            viewrecycler = new KidsCharacterViewGroup(getActivity(), true);
            viewrecycler.init(i);
        }
        viewrecycler.updateDataThenViews(list, i, j, getListViewPos(), basiclomo);
        return viewrecycler;
    }
}
