// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.AddToCirclesHelper;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            EditCirclesForPlayerAction, AppContentFragment

final class edCallback extends edCallback
{

    final EditCirclesForPlayerAction this$0;
    final int val$mode;

    public final void onPlayerLoadFailed()
    {
        EditCirclesForPlayerAction.access$300(EditCirclesForPlayerAction.this, EditCirclesForPlayerAction.access$200(EditCirclesForPlayerAction.this));
        notifyFinished();
    }

    public final void onPlayerLoaded(Player player)
    {
        boolean flag = true;
        if (val$mode != 3) goto _L2; else goto _L1
_L1:
        if (EditCirclesForPlayerAction.access$000(EditCirclesForPlayerAction.this))
        {
            EditCirclesForPlayerAction.access$100(EditCirclesForPlayerAction.this).onPlayerUnfollowClicked(mFragment.getGoogleApiClient(), player);
            flag = false;
        }
_L4:
        if (flag)
        {
            EditCirclesForPlayerAction.access$300(EditCirclesForPlayerAction.this, EditCirclesForPlayerAction.access$200(EditCirclesForPlayerAction.this));
            notifyFinished();
        }
        return;
_L2:
        if (val$mode == 1)
        {
            EditCirclesForPlayerAction.access$100(EditCirclesForPlayerAction.this).onPlayerFollowClicked(mFragment, mFragment.getGoogleApiClient(), mFragment.getLogId("CIRCLES_ACTION_SOURCE"), player);
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    edCallback()
    {
        this$0 = final_editcirclesforplayeraction;
        val$mode = I.this;
        super();
    }
}
