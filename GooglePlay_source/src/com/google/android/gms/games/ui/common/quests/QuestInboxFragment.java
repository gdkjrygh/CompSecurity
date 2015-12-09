// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.os.Bundle;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestFragment

public final class QuestInboxFragment extends QuestFragment
{

    private HeaderItemRecyclerAdapter mHeaderAdapter;
    private UpsellCardAdapter mUpsellCardAdapter;

    public QuestInboxFragment()
    {
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mHeaderAdapter.setTitle(0x7f100189);
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(0x7f0b0092, 0x7f100197), 12, null);
        setEmptyViewElements(0x7f020157, 0x7f10013f, 0);
        setAdapter((new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder()).addAdapter(mHeaderAdapter).addAdapter(mUpsellCardAdapter).addAdapter(mQuestAdapter).build());
    }

    public final void onDetach()
    {
        super.onDetach();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("QuestInboxFragment", "Tearing down without finishing creation");
        }
    }

    protected final void setUpsellCardVisible(boolean flag)
    {
        super.setUpsellCardVisible(flag);
        HeaderItemRecyclerAdapter headeritemrecycleradapter = mHeaderAdapter;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        headeritemrecycleradapter.setVisible(flag1);
        mUpsellCardAdapter.setVisible(flag);
    }
}
