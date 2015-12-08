// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.ui.lomo.BasePaginatedAdapter;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.Iterator;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class KidsUtils
{
    public static class OnSwitchToKidsClickListener
        implements android.view.View.OnClickListener
    {

        private final Activity activity;
        private final com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName entryName;

        public void onClick(View view)
        {
            activity.startActivity(KidsUtils.createSwitchToKidsIntent(activity, entryName));
        }

        public OnSwitchToKidsClickListener(Activity activity1, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
        {
            activity = activity1;
            entryName = uiviewcommandname;
        }
    }


    private static final float LIST_VIEW_FRICTION_SCALE_FACTOR = 7.5F;
    public static final int MAX_NUM_CW_VIDEOS = 3;
    public static final int NUM_LOMOS_TO_FETCH_PER_BATCH = 20;
    public static final int NUM_VIDEOS_PER_BATCH = 5;
    private static final String TAG = "KidsUtils";

    public KidsUtils()
    {
    }

    private static boolean accountHasKidsProfile(NetflixActivity netflixactivity)
    {
        if (netflixactivity == null)
        {
            Log.w("KidsUtils", "Null activity - can't get profiles");
        } else
        {
            if (netflixactivity.getServiceManager() == null)
            {
                Log.w("KidsUtils", "Null service man - can't get profiles");
                return false;
            }
            if (netflixactivity.getServiceManager().getAllProfiles() == null)
            {
                Log.w("KidsUtils", "Null profiles list - can't get profiles");
                return false;
            }
            netflixactivity = netflixactivity.getServiceManager().getAllProfiles().iterator();
            while (netflixactivity.hasNext()) 
            {
                if (((UserProfile)netflixactivity.next()).isKidsProfile())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void addListViewSpacerIfNoHeaders(StickyListHeadersListView stickylistheaderslistview)
    {
        if (stickylistheaderslistview.getHeaderViewsCount() == 0)
        {
            View view = new View(stickylistheaderslistview.getContext());
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, stickylistheaderslistview.getResources().getDimensionPixelSize(0x7f0a0080)));
            stickylistheaderslistview.addHeaderView(view);
        }
    }

    public static int computeCharacterViewSize(NetflixActivity netflixactivity, boolean flag)
    {
        return BasePaginatedAdapter.computeViewPagerWidth(netflixactivity, flag) / 2;
    }

    public static int computeHorizontalRowHeight(NetflixActivity netflixactivity, boolean flag)
    {
        return (int)((float)BasePaginatedAdapter.computeViewPagerWidth(netflixactivity, flag) * 0.5625F);
    }

    public static int computeRowHeight(NetflixActivity netflixactivity, boolean flag)
    {
        int k = BasePaginatedAdapter.computeViewPagerWidth(netflixactivity, flag);
        int i = k;
        netflixactivity = netflixactivity.getServiceManager();
        if (netflixactivity == null)
        {
            Log.w("KidsUtils", "Null service manager in computeRowHeight()");
            return i;
        }
        int j = i;
        if (netflixactivity.getConfiguration().getKidsOnPhoneConfiguration().getLolomoImageType() == com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType.HORIZONTAL)
        {
            j = (int)((float)i * 0.5625F);
        }
        if (Log.isLoggable("KidsUtils", 2))
        {
            Log.v("KidsUtils", (new StringBuilder()).append("Computed row height as: ").append(j).append(", from width of: ").append(k).toString());
        }
        return j;
    }

    public static int computeSkidmarkCharacterViewSize(NetflixActivity netflixactivity)
    {
        Resources resources = netflixactivity.getResources();
        int i = (DeviceUtils.getScreenWidthInPixels(netflixactivity) - resources.getDimensionPixelSize(0x7f0a007e)) / 2;
        int j = resources.getDimensionPixelSize(0x7f0a007e);
        return resources.getDimensionPixelSize(0x7f0a007f) + (i - j);
    }

    public static int computeSkidmarkRowHeight(NetflixActivity netflixactivity, int i, int j, int k, int l, boolean flag)
    {
label0:
        {
            k = (DeviceUtils.getScreenWidthInPixels(netflixactivity) - i - k) + j + l;
            i = k;
            netflixactivity = netflixactivity.getServiceManager();
            if (netflixactivity == null)
            {
                Log.w("KidsUtils", "Null service manager in computeRowHeight()");
                return i;
            }
            if (!flag)
            {
                j = i;
                if (netflixactivity.getConfiguration().getKidsOnPhoneConfiguration().getLolomoImageType() != com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType.HORIZONTAL)
                {
                    break label0;
                }
            }
            j = (int)((float)i * 0.5625F);
        }
        if (Log.isLoggable("KidsUtils", 2))
        {
            Log.v("KidsUtils", (new StringBuilder()).append("Computed row height (with margins) as: ").append(j).append(", from width of: ").append(k).toString());
        }
        return j;
    }

    public static void configureListViewForKids(NetflixActivity netflixactivity, ListView listview)
    {
        if (netflixactivity.isForKids())
        {
            listview.setDivider(null);
            listview.setFriction(ViewConfiguration.getScrollFriction() * 7.5F);
        }
    }

    public static void configureListViewForKids(NetflixActivity netflixactivity, StickyListHeadersListView stickylistheaderslistview)
    {
        if (netflixactivity.isForKids())
        {
            stickylistheaderslistview.setDivider(null);
        }
        configureListViewForKids(netflixactivity, stickylistheaderslistview.getWrappedList());
    }

    public static Intent createExitKidsIntent(Activity activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
    {
        return ProfileSelectionActivity.createSwitchFromKidsIntent(activity, uiviewcommandname);
    }

    public static MenuItem createKidsMenuItem(NetflixActivity netflixactivity, Menu menu)
    {
        menu = menu.add(0, 0x7f07003a, 0, 0x7f0c0063);
        updateKidsMenuItem(netflixactivity, menu);
        return menu;
    }

    private static Intent createSwitchToKidsIntent(Activity activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
    {
        return ProfileSelectionActivity.createSwitchToKidsIntent(activity, uiviewcommandname);
    }

    public static boolean isKidsProfile(UserProfile userprofile)
    {
        return userprofile != null && userprofile.isKidsProfile();
    }

    public static boolean isKidsWithUpDownScrolling(NetflixActivity netflixactivity)
    {
        return netflixactivity.isForKids() && netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().getScrollBehavior() == com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ScrollBehavior.UP_DOWN;
    }

    public static boolean isKoPExperience(com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, UserProfile userprofile)
    {
        return isKidsProfile(userprofile) && isUserInKopExperience(configurationagentinterface);
    }

    public static boolean isUserInKopExperience(com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        return configurationagentinterface != null && configurationagentinterface.getKidsOnPhoneConfiguration() != null && configurationagentinterface.getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled();
    }

    public static boolean shouldShowBackNavigationAffordance(NetflixActivity netflixactivity)
    {
        return netflixactivity.isForKids() && netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().getActionBarNavType() == com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ActionBarNavType.BACK;
    }

    public static boolean shouldShowHorizontalImages(NetflixActivity netflixactivity)
    {
        return netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().getLolomoImageType() == com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType.HORIZONTAL;
    }

    private static boolean shouldShowKidsEntryInActionBar(NetflixActivity netflixactivity)
    {
        return accountHasKidsProfile(netflixactivity) && netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().shouldShowKidsEntryInActionBar();
    }

    public static boolean shouldShowKidsEntryInGenreLomo(NetflixActivity netflixactivity)
    {
        return accountHasKidsProfile(netflixactivity) && netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().shouldShowKidsEntryInGenreLomo();
    }

    public static boolean shouldShowKidsEntryInMenu(NetflixActivity netflixactivity)
    {
        return accountHasKidsProfile(netflixactivity) && netflixactivity.getServiceManager().getConfiguration().getKidsOnPhoneConfiguration().shouldShowKidsEntryInMenu();
    }

    public static boolean shouldShowKidsExperience(NetflixActivity netflixactivity)
    {
        if (netflixactivity == null)
        {
            Log.w("KidsUtils", "Activity is null - should not happen");
            return false;
        }
        if (netflixactivity.isForKids())
        {
            Log.v("KidsUtils", "Should show kids experience because we're in a kids activity");
            return true;
        }
        Object obj = netflixactivity.getServiceManager();
        boolean flag;
        if (obj != null && ((ServiceManager) (obj)).getCurrentProfile() != null && ((ServiceManager) (obj)).getCurrentProfile().isKidsProfile() && ((ServiceManager) (obj)).getConfiguration() != null && ((ServiceManager) (obj)).getConfiguration().getKidsOnPhoneConfiguration() != null && ((ServiceManager) (obj)).getConfiguration().getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Log.isLoggable("KidsUtils", 2))
        {
            if (obj == null)
            {
                netflixactivity = "null service";
            } else
            if (((ServiceManager) (obj)).getCurrentProfile() == null)
            {
                netflixactivity = "null profile";
            } else
            {
                netflixactivity = Boolean.valueOf(((ServiceManager) (obj)).getCurrentProfile().isKidsProfile());
            }
            if (((ServiceManager) (obj)).getConfiguration() == null)
            {
                obj = "null config";
            } else
            {
                obj = Boolean.valueOf(((ServiceManager) (obj)).getConfiguration().getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled());
            }
            Log.v("KidsUtils", String.format("Should show kids experience - isKidsProfile: %s, KoP enabled: %s, rtn: %s", new Object[] {
                netflixactivity, obj, Boolean.valueOf(flag)
            }));
        }
        return flag;
    }

    public static void updateKidsMenuItem(NetflixActivity netflixactivity, MenuItem menuitem)
    {
        if (menuitem == null)
        {
            return;
        }
        if (netflixactivity.getServiceManager().isReady() && shouldShowKidsEntryInActionBar(netflixactivity))
        {
            menuitem.setVisible(true).setEnabled(true);
            if (netflixactivity.isForKids())
            {
                menuitem.setTitle(0x7f0c0068).setIcon(0x7f0200be).setIntent(createExitKidsIntent(netflixactivity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.actionBarKidsExit)).setShowAsAction(2);
                return;
            } else
            {
                menuitem.setTitle(0x7f0c0054).setIcon(0x7f0200dd).setIntent(createSwitchToKidsIntent(netflixactivity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.actionBarKidsEntry)).setShowAsAction(2);
                return;
            }
        } else
        {
            menuitem.setVisible(false).setEnabled(false);
            return;
        }
    }

}
