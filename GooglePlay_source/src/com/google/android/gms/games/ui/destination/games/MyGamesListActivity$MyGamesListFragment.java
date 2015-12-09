// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            MyGamesListActivity

public static final class TAB_CONFIG extends DestinationMultiContainerFragment
{

    private static final TabConfig TAB_CONFIG;
    private static final TabSpec TAB_SPECS[];

    public final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        addDefaultParallaxBackgroundView$39fc0c(viewgroup);
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return true;
    }

    public final int getHeaderMode()
    {
        return 1;
    }

    public final int getHeaderShadowMode()
    {
        return 1;
    }

    protected final int getPlaylogElementType()
    {
        return 15;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle == null)
        {
            int i = mParent.getIntent().getIntExtra("com.google.android.gms.games.ui.extras.tab", 0);
            super.mViewPager.setCurrentItem(i);
        }
    }

    static 
    {
        Bundle bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 608);
        Bundle bundle1 = new Bundle();
        bundle1.putInt("FRAGMENT_TAGS", 609);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("FRAGMENT_TAGS", 610);
        TAB_SPECS = (new TabSpec[] {
            new TabSpec(com/google/android/gms/games/ui/destination/games/GameListMyGamesFragment$GameListMostRecentRecyclerFragment, 0x7f1000e5, bundle), new TabSpec(com/google/android/gms/games/ui/destination/games/GameListMyGamesFragment$GameListAllMyGamesRecyclerFragment, 0x7f1000e1, bundle1), new TabSpec(com/google/android/gms/games/ui/destination/games/GameListMyGamesFragment$GameListInstalledRecyclerFragment, 0x7f1000e4, bundle2)
        });
        TAB_CONFIG = new TabConfig(TAB_SPECS);
    }

    public dRecyclerFragment()
    {
        super(TAB_CONFIG, 0x7f0400d7);
    }
}
