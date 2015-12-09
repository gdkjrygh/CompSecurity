// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.os.Bundle;
import android.util.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsCharacterLomoDetailAdapter, KidsLomoDetailAdapter

public class KidsLomoDetailFrag extends LoLoMoFrag
{

    private static final String EXTRA_LOMO_PARCELABLE = "lomo_parcelable";
    private static final String TAG = "KidsLomoDetailFrag";
    private boolean firstLoadCompleted;
    private LoMo lomo;

    public KidsLomoDetailFrag()
    {
    }

    public static KidsLomoDetailFrag create(LoMo lomo1)
    {
        KidsLomoDetailFrag kidslomodetailfrag = new KidsLomoDetailFrag();
        Bundle bundle = new Bundle();
        bundle.putParcelable("lomo_parcelable", lomo1);
        kidslomodetailfrag.setArguments(bundle);
        return kidslomodetailfrag;
    }

    protected com.netflix.mediaclient.ui.lolomo.LoLoMoFrag.ILoLoMoAdapter createAdapter()
    {
        KidsUtils.addListViewSpacerIfNoHeaders(listView);
        if (lomo.getType() == LoMoType.CHARACTERS)
        {
            return new KidsCharacterLomoDetailAdapter(this, lomo);
        } else
        {
            return new KidsLomoDetailAdapter(this, lomo);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        lomo = (LoMo)getArguments().getParcelable("lomo_parcelable");
    }

    public void onDataLoadSuccess()
    {
        if (!firstLoadCompleted)
        {
            firstLoadCompleted = true;
            Log.v("KidsLomoDetailFrag", (new StringBuilder()).append("Auto-scrolling list to 'More' offset, count: ").append(listView.getCount()).toString());
            listView.setSelection(6);
        }
    }
}
