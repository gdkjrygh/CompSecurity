// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.ui.Searchable;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.destination.HelpContextProvider;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerFriendsPlayingFragment, PlayerYouMayKnowFragment

public final class PlayerActivity extends DestinationFragmentActivity
    implements HelpContextProvider
{
    public static final class PlayerFragment extends DestinationMultiContainerFragment
        implements Searchable
    {

        private static final SparseIntArray REQUEST_CODE_FRAGMENT_ARRAY;
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
            return 23;
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

        public final void onActivityResult(int i, int j, Intent intent)
        {
            int k = REQUEST_CODE_FRAGMENT_ARRAY.get(i, -1);
            if (k != -1)
            {
                mPagerAdapter.getFragmentAt(k).onActivityResult(i, j, intent);
                return;
            } else
            {
                super.onActivityResult(i, j, intent);
                return;
            }
        }

        public final void onResume()
        {
            super.onResume();
            getLogger().logBasicAction(3, PowerUpUtils.getExperimentIdsForLogging());
        }

        public final boolean onSearchRequested()
        {
            PowerUpUtils.launchPlayerSearch(mParent);
            return false;
        }

        static 
        {
            Object obj = new Bundle();
            ((Bundle) (obj)).putInt("FRAGMENT_TAGS", 614);
            Bundle bundle = new Bundle();
            bundle.putInt("FRAGMENT_TAGS", 615);
            TAB_SPECS = (new TabSpec[] {
                new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerFriendsPlayingFragment, 0x7f100138, ((Bundle) (obj))), new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerYouMayKnowFragment, 0x7f10013b, bundle)
            });
            TAB_CONFIG = new TabConfig(TAB_SPECS);
            obj = new SparseIntArray();
            REQUEST_CODE_FRAGMENT_ARRAY = ((SparseIntArray) (obj));
            ((SparseIntArray) (obj)).put(1, 1);
        }

        public PlayerFragment()
        {
            super(TAB_CONFIG, 0x7f0400d7);
        }
    }


    public PlayerActivity()
    {
        super(0x7f040071, 0x7f120016);
    }

    public final String getHelpContext()
    {
        return "mobile_players";
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559251: 
            PowerUpUtils.launchPlayerSearch(this);
            break;
        }
        return true;
    }

    public final boolean onSearchRequested()
    {
        PowerUpUtils.launchPlayerSearch(this);
        return false;
    }
}
