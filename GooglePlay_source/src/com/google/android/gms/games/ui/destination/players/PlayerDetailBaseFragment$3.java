// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailBaseFragment, PlayerDetailProfileBannerAdapter

final class this._cls0 extends android.support.v7.widget.erver
{

    final PlayerDetailBaseFragment this$0;

    public final void onChanged()
    {
        mBannerAdapter.onBindViewHolder(PlayerDetailBaseFragment.access$1000(PlayerDetailBaseFragment.this), 0);
    }

    public final void onItemRangeChanged(int i, int j)
    {
        onChanged();
    }

    public final void onItemRangeInserted(int i, int j)
    {
        PlayerDetailBaseFragment.access$1000(PlayerDetailBaseFragment.this).itemView.setVisibility(0);
        onChanged();
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        PlayerDetailBaseFragment.access$1000(PlayerDetailBaseFragment.this).itemView.setVisibility(8);
    }

    apter.ProfileBannerViewHolder()
    {
        this$0 = PlayerDetailBaseFragment.this;
        super();
    }
}
