// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.widget.ListView;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersFragment, ChipsGridAdapter

final class this._cls0
    implements GridChangedListener
{

    final SelectPlayersFragment this$0;

    public final void onChipAdded()
    {
        SelectPlayersFragment.access$500(SelectPlayersFragment.this).smoothScrollToPosition(SelectPlayersFragment.access$400(SelectPlayersFragment.this).getCount() - 1);
        UiUtils.sendAccessibilityEventWithText(mActivity, getResources().getString(0x7f100261), null);
    }

    public final void onChipRemoved()
    {
        UiUtils.sendAccessibilityEventWithText(mActivity, getResources().getString(0x7f100276), null);
    }

    GridChangedListener()
    {
        this$0 = SelectPlayersFragment.this;
        super();
    }
}
