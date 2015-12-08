// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.res.Resources;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;
import com.netflix.mediaclient.util.MathUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLomoDetailAdapter, KidsCharacterViewGroup

public class KidsCharacterLomoDetailAdapter extends KidsLomoDetailAdapter
{

    public KidsCharacterLomoDetailAdapter(LoLoMoFrag lolomofrag, BasicLoMo basiclomo)
    {
        super(lolomofrag, basiclomo);
    }

    protected VideoViewGroup createVideoViewGroup()
    {
        KidsCharacterViewGroup kidscharacterviewgroup = new KidsCharacterViewGroup(activity, false);
        kidscharacterviewgroup.init(2);
        kidscharacterviewgroup.setPadding(activity.getResources().getDimensionPixelSize(0x7f0a007e), 0, 0, 0);
        kidscharacterviewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeSkidmarkCharacterViewSize(activity)));
        return kidscharacterviewgroup;
    }

    public int getCount()
    {
        return MathUtils.ceiling(super.getCount(), 2);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public List getItem(int i)
    {
        return videoData.subList(i * 2, i * 2 + 2);
    }

    protected int getNumItemsPerPage()
    {
        return 2;
    }

    protected boolean shouldReportPresentationTracking()
    {
        return false;
    }
}
