// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.main.HomepageRecyclerFragment;
import com.google.android.gms.games.ui.destination.main.MainActivity;
import com.google.android.gms.games.ui.destination.main.PlayNowStreamFragment;
import com.google.android.gms.games.ui.destination.players.PlayerDetailMyProfileFragment;
import java.util.ArrayList;

public final class NavigationDrawerUtils
{

    private static com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem sAlternatePlusActionItem;
    private static int sCurrentIndex = 1;
    private static boolean sIsUserPlusEnabled = true;

    public static int getCurrentIndex()
    {
        return sCurrentIndex;
    }

    public static ArrayList getDrawerItems(Context context)
    {
        Resources resources = context.getResources();
        ArrayList arraylist = new ArrayList();
        arraylist.add(0, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.TopSpacerItem());
        arraylist.add(1, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f100104), 0x7f020101, 0x7f020102, true, false));
        arraylist.add(2, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f100108), 0x7f0200fd, 0x7f0200fe, true, false));
        arraylist.add(3, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f100105), 0x7f0200fb, 0x7f0200fc, true, true));
        arraylist.add(4, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f10010a), 0x7f0200ff, 0x7f020100, true, false));
        arraylist.add(5, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f10010c), 0x7f0200f9, 0x7f0200fa, true, false));
        Object obj1 = new com.google.android.gms.games.ui.destination.SideDrawerAdapter.DividerItem();
        com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem actionitem = new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f10010d), 0, 0, false, false);
        Object obj = new com.google.android.gms.games.ui.destination.SideDrawerAdapter.UpsellItem(resources.getString(0x7f10010b));
        Object obj2;
        if (sIsUserPlusEnabled)
        {
            obj2 = obj1;
        } else
        {
            obj2 = obj;
        }
        arraylist.add(6, obj2);
        if (sIsUserPlusEnabled)
        {
            obj1 = actionitem;
        }
        arraylist.add(7, obj1);
        if (!sIsUserPlusEnabled)
        {
            obj = actionitem;
        }
        sAlternatePlusActionItem = ((com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem) (obj));
        arraylist.add(8, new com.google.android.gms.games.ui.destination.SideDrawerAdapter.ActionItem(context, resources.getString(0x7f100103), 0, 0, false, false));
        return arraylist;
    }

    public static String getHelpContext()
    {
        switch (sCurrentIndex)
        {
        default:
            return "mobile_games_default";

        case 1: // '\001'
            return "mobile_play_now";

        case 2: // '\002'
            return "mobile_my_games";

        case 3: // '\003'
            return "mobile_inbox";

        case 4: // '\004'
            return "mobile_players";

        case 5: // '\005'
            return "mobile_explore";
        }
    }

    public static Fragment instantiateCurrentFragment()
    {
        switch (sCurrentIndex)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("getCurrentFragment: unexpected index: ")).append(sCurrentIndex).toString());

        case 1: // '\001'
            if (((Boolean)G.usePlayNowStream.get()).booleanValue())
            {
                return new PlayNowStreamFragment();
            } else
            {
                return new HomepageRecyclerFragment();
            }

        case 2: // '\002'
            return new com.google.android.gms.games.ui.destination.games.MyGamesListActivity.MyGamesListFragment();

        case 3: // '\003'
            return new com.google.android.gms.games.ui.destination.inbox.DestinationInboxActivity.DestinationInboxFragment();

        case 4: // '\004'
            return new com.google.android.gms.games.ui.destination.players.PlayerActivity.PlayerFragment();

        case 5: // '\005'
            return new com.google.android.gms.games.ui.destination.games.ShopGamesActivity.ShopGamesFragment();

        case 100: // 'd'
            return new PlayerDetailMyProfileFragment();
        }
    }

    public static void launchSearch(Context context)
    {
        switch (sCurrentIndex)
        {
        default:
            GamesLog.w("NavDrawerUtils", "No search handler for this drawer!");
            return;

        case 4: // '\004'
        case 100: // 'd'
            PowerUpUtils.launchPlayerSearch(context);
            return;

        case 5: // '\005'
            PowerUpUtils.launchGameSearch(context);
            break;
        }
    }

    public static boolean onBackPressed(DestinationFragmentActivity destinationfragmentactivity)
    {
        switch (sCurrentIndex)
        {
        default:
            onDrawerItemClicked(destinationfragmentactivity, 1, null);
            return true;

        case 1: // '\001'
            return false;
        }
    }

    public static void onDrawerItemClicked(DestinationFragmentActivity destinationfragmentactivity, int i, View view)
    {
        Asserts.checkNotNull(destinationfragmentactivity);
        if (!(destinationfragmentactivity instanceof MainActivity) || i != sCurrentIndex) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i;
        JVM INSTR lookupswitch 9: default 104
    //                   1: 218
    //                   2: 226
    //                   3: 234
    //                   4: 242
    //                   5: 250
    //                   6: 266
    //                   7: 280
    //                   8: 300
    //                   100: 258;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        int j = 0;
_L18:
        destinationfragmentactivity.logClickEvent(j, view);
        i;
        JVM INSTR lookupswitch 9: default 196
    //                   1: 308
    //                   2: 308
    //                   3: 308
    //                   4: 308
    //                   5: 308
    //                   6: 434
    //                   7: 423
    //                   8: 472
    //                   100: 308;
           goto _L13 _L14 _L14 _L14 _L14 _L14 _L15 _L16 _L17 _L14
_L13:
        GamesLog.w("NavDrawerUtils", (new StringBuilder("onDrawerItemClicked: unexpected item: ")).append(i).toString());
        return;
_L4:
        j = 700;
          goto _L18
_L5:
        j = 701;
          goto _L18
_L6:
        j = 702;
          goto _L18
_L7:
        j = 703;
          goto _L18
_L8:
        j = 704;
          goto _L18
_L12:
        j = 705;
          goto _L18
_L9:
        if (sIsUserPlusEnabled) goto _L3; else goto _L19
_L19:
        j = 708;
          goto _L18
_L10:
        if (sIsUserPlusEnabled)
        {
            j = 706;
        } else
        {
            j = 0;
        }
          goto _L18
_L11:
        j = 707;
          goto _L18
_L14:
        sCurrentIndex = i;
        view = new Intent(destinationfragmentactivity, com/google/android/gms/games/ui/destination/main/MainActivity);
        view.addFlags(0x20000000);
        view.addFlags(0x4000000);
        view.putExtra("com.google.android.gms.games.NAV_DRAWER_INDEX", sCurrentIndex);
        if (i != 100) goto _L21; else goto _L20
_L20:
        Object obj = destinationfragmentactivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected()) goto _L23; else goto _L22
_L22:
        obj = Games.Players.getCurrentPlayer(((GoogleApiClient) (obj)));
        if (obj == null)
        {
            GamesLog.w("NavDrawerUtils", "We don't have a current player, something went wrong. Let's do nothing.");
            return;
        }
        view.putExtra("com.google.android.gms.games.PLAYER", (Parcelable)((Player) (obj)).freeze());
_L21:
        destinationfragmentactivity.startActivity(view);
        destinationfragmentactivity.overridePendingTransition(0, 0);
        return;
_L23:
        GamesLog.w("NavDrawerUtils", "'My Profile' item: not connected; ignoring...");
        return;
_L16:
        if (sIsUserPlusEnabled)
        {
            destinationfragmentactivity.onShowSettings();
            return;
        }
          goto _L1
_L15:
        if (!sIsUserPlusEnabled)
        {
            if (((Boolean)G.useIconInNavDrawerUpsell.get()).booleanValue())
            {
                i = 1;
            } else
            {
                i = 2;
            }
            destinationfragmentactivity.launchPlusUpgradeFlow(1, Integer.valueOf(i));
            return;
        }
          goto _L1
_L17:
        destinationfragmentactivity.clearTitleFromActivity();
        destinationfragmentactivity.mLaunchHelpAndFeedback = true;
        return;
    }

    public static void resetFromIntent(Intent intent)
    {
        sCurrentIndex = intent.getIntExtra("com.google.android.gms.games.NAV_DRAWER_INDEX", 1);
    }

    public static boolean setUserPlusEnabled(boolean flag, ArrayList arraylist)
    {
        if (sIsUserPlusEnabled == flag)
        {
            return false;
        }
        com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem draweritem;
        com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem draweritem1;
        com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem draweritem2;
        com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem draweritem3;
        if (sIsUserPlusEnabled)
        {
            draweritem = (com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem)arraylist.get(6);
        } else
        {
            draweritem = (com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem)arraylist.get(7);
        }
        if (sIsUserPlusEnabled)
        {
            draweritem1 = (com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem)arraylist.get(7);
        } else
        {
            draweritem1 = sAlternatePlusActionItem;
        }
        if (sIsUserPlusEnabled)
        {
            draweritem2 = sAlternatePlusActionItem;
        } else
        {
            draweritem2 = (com.google.android.gms.games.ui.destination.SideDrawerAdapter.DrawerItem)arraylist.get(6);
        }
        sIsUserPlusEnabled = flag;
        if (sIsUserPlusEnabled)
        {
            draweritem3 = draweritem;
        } else
        {
            draweritem3 = draweritem2;
        }
        arraylist.set(6, draweritem3);
        if (sIsUserPlusEnabled)
        {
            draweritem = draweritem1;
        }
        arraylist.set(7, draweritem);
        if (!sIsUserPlusEnabled)
        {
            draweritem2 = draweritem1;
        }
        sAlternatePlusActionItem = draweritem2;
        return true;
    }

    public static void updateCurrentMenu(MainActivity mainactivity)
    {
        sCurrentIndex;
        JVM INSTR lookupswitch 6: default 60
    //                   1: 87
    //                   2: 102
    //                   3: 112
    //                   4: 124
    //                   5: 136
    //                   100: 148;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder("updateCurrentMenu: unexpected index: ")).append(sCurrentIndex).toString());
_L2:
        int i;
        i = 0x7f120013;
        mainactivity.mEnableActionBarProgressBar = true;
_L9:
        mainactivity.setOptionsMenuResId(i);
        return;
_L3:
        i = 0;
        mainactivity.mEnableActionBarProgressBar = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f120013;
        mainactivity.mEnableActionBarProgressBar = true;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f120016;
        mainactivity.mEnableActionBarProgressBar = false;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f120017;
        mainactivity.mEnableActionBarProgressBar = false;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f120015;
        mainactivity.mEnableActionBarProgressBar = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void updateCurrentTitle(MainActivity mainactivity)
    {
        int i = 0;
        sCurrentIndex;
        JVM INSTR lookupswitch 6: default 64
    //                   1: 91
    //                   2: 109
    //                   3: 116
    //                   4: 123
    //                   5: 130
    //                   100: 94;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_130;
_L7:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("updateCurrentTitle: unexpected index: ")).append(sCurrentIndex).toString());
_L2:
        i = 0x7f100104;
_L8:
        if (i > 0)
        {
            mainactivity.setTitle(i);
        } else
        {
            mainactivity.setTitle(null);
        }
        mainactivity.setSubtitle(null);
        return;
_L3:
        i = 0x7f1000fb;
          goto _L8
_L4:
        i = 0x7f1000e8;
          goto _L8
_L5:
        i = 0x7f100139;
          goto _L8
        i = 0x7f100146;
          goto _L8
    }

}
