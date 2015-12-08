// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.ui.Searchable;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.destination.HelpContextProvider;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;

public final class ShopGamesActivity extends DestinationFragmentActivity
    implements HelpContextProvider
{
    public static final class ShopGamesFragment extends DestinationMultiContainerFragment
        implements Searchable
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
            return 39;
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
                int i = mParent.getIntent().getIntExtra("com.google.android.gms.games.TAB", 0);
                super.mViewPager.setCurrentItem(i);
            }
        }

        public final boolean onSearchRequested()
        {
            PowerUpUtils.launchGameSearch(mParent);
            return false;
        }

        static 
        {
            Bundle bundle = new Bundle();
            bundle.putInt("FRAGMENT_TAGS", 605);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("FRAGMENT_TAGS", 606);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("FRAGMENT_TAGS", 607);
            TAB_SPECS = (new TabSpec[] {
                new TabSpec(com/google/android/gms/games/ui/destination/games/GameExploreFragment$GameFeaturedFragment, 0x7f1000e3, bundle), new TabSpec(com/google/android/gms/games/ui/destination/games/GameExploreFragment$GamePopularFragment, 0x7f1000e7, bundle1), new TabSpec(com/google/android/gms/games/ui/destination/games/GameExploreFragment$GamePopularMultiplayerFragment, 0x7f1000e6, bundle2)
            });
            TAB_CONFIG = new TabConfig(TAB_SPECS);
        }

        public ShopGamesFragment()
        {
            super(TAB_CONFIG, 0x7f0400d7);
        }
    }


    public ShopGamesActivity()
    {
        super(0x7f040075, 0x7f120017);
    }

    public final String getHelpContext()
    {
        return "mobile_explore";
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559251: 
            PowerUpUtils.launchGameSearch(this);
            break;
        }
        return true;
    }
}
