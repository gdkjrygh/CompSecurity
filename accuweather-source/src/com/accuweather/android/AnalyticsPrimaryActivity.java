// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.fragments.DailyFragment;
import com.accuweather.android.fragments.HourlyFragment;
import com.accuweather.android.fragments.LocationFragment;
import com.accuweather.android.fragments.MapsImageFragment;
import com.accuweather.android.fragments.NewsListFragment;
import com.accuweather.android.fragments.NowFragment;
import com.accuweather.android.fragments.VideoListFragment;
import com.accuweather.android.minutecast.MinuteCastFlipperFragment;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PushUtils;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.MenuItem;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            AbsPrimaryActivity

public abstract class AnalyticsPrimaryActivity extends AbsPrimaryActivity
{

    private boolean mIsActionBarSelectionChangingProgrammatically;

    public AnalyticsPrimaryActivity()
    {
        mIsActionBarSelectionChangingProgrammatically = false;
    }

    private int getLocationCount()
    {
        java.util.ArrayList arraylist = getData().getLocations();
        if (arraylist != null)
        {
            return arraylist.size();
        } else
        {
            return 0;
        }
    }

    private void logLocationAddedAnalytic(String s)
    {
        AccuAnalytics.logUiEvent(this, "Location added with new location count", getLocationCount());
    }

    private void updateAnalytics(int i)
    {
        if (i >= MainContentPage.values().length) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$accuweather$android$utilities$MainContentPage[];

            static 
            {
                $SwitchMap$com$accuweather$android$utilities$MainContentPage = new int[MainContentPage.values().length];
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Location.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Now.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Hourly.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.MinuteCast.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Forecast.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Maps.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.News.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Video.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.accuweather.android.utilities.MainContentPage[MainContentPage.values()[i].ordinal()];
        JVM INSTR tableswitch 1 8: default 68
    //                   1 86
    //                   2 95
    //                   3 104
    //                   4 113
    //                   5 122
    //                   6 131
    //                   7 140
    //                   8 149;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        String s = "Invalid position";
_L13:
        EasyTracker.getInstance().setContext(this);
        EasyTracker.getTracker().trackView(s);
_L2:
        return;
_L4:
        s = com/accuweather/android/fragments/LocationFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L5:
        s = com/accuweather/android/fragments/NowFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L6:
        s = com/accuweather/android/fragments/HourlyFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L7:
        s = com/accuweather/android/minutecast/MinuteCastFlipperFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L8:
        s = com/accuweather/android/fragments/DailyFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L9:
        s = com/accuweather/android/fragments/MapsImageFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L10:
        s = com/accuweather/android/fragments/NewsListFragment.getSimpleName();
        continue; /* Loop/switch isn't completed */
_L11:
        s = com/accuweather/android/fragments/VideoListFragment.getSimpleName();
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected void handleMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() != R.id.gps) goto _L2; else goto _L1
_L1:
        AccuAnalytics.logUiEvent(this, "GPS");
_L4:
        super.handleMenuItemSelected(i, menuitem);
        return;
_L2:
        if (menuitem.getItemId() == R.id.refresh)
        {
            AccuAnalytics.logUiEvent(this, "Refresh selected");
        } else
        if (menuitem.getItemId() == R.id.settings)
        {
            AccuAnalytics.logUiEvent(this, "Settings selected");
        } else
        if (menuitem.getItemId() == R.id.graphs_on)
        {
            AccuAnalytics.logUiEvent(this, "Graphs on selected");
        } else
        if (menuitem.getItemId() == R.id.graphs_off)
        {
            AccuAnalytics.logUiEvent(this, "Graphs off selected");
        } else
        if (menuitem.getItemId() == R.id.share)
        {
            AccuAnalytics.logUiEvent(this, "Share selected");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void mapAddLocationTilePressed()
    {
        AccuAnalytics.logUiEvent(this, "Map add location tile pressed");
        super.mapAddLocationTilePressed();
    }

    protected void mapExistingLocationTilePressed(String s)
    {
        AccuAnalytics.logUiEvent(this, "Map details launched");
        super.mapExistingLocationTilePressed(s);
    }

    public void onActionItemClicked(LocationModel locationmodel, ActionMode actionmode, MenuItem menuitem)
    {
        if (!menuitem.getTitle().equals(getString(R.string.HomeLocation))) goto _L2; else goto _L1
_L1:
        AccuAnalytics.logUiEvent(this, "Set new home location");
_L4:
        super.onActionItemClicked(locationmodel, actionmode, menuitem);
        return;
_L2:
        if (menuitem.getTitle().equals(getString(R.string.Delete)))
        {
            AccuAnalytics.logUiEvent(this, "Delete location");
        } else
        if (!menuitem.getTitle().equals(getString(R.string.Nickname)) && menuitem.getTitle().equals(getString(R.string.SaveLocation)))
        {
            AccuAnalytics.logUiEvent(this, "Save GPS location");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onForecastSelected(int i)
    {
        AccuAnalytics.logUiEvent(this, "Daily details launched", i);
        super.onForecastSelected(i);
    }

    protected void onHomePressedWhileNavigationDrawerClosed()
    {
        AccuAnalytics.logUiEvent(this, "Open Navigation Drawer");
        super.onHomePressedWhileNavigationDrawerClosed();
    }

    protected void onHomePressedWhileNavigationDrawerOpen()
    {
        AccuAnalytics.logUiEvent(this, "Close Navigation Drawer");
        super.onHomePressedWhileNavigationDrawerOpen();
    }

    public void onHourlySelected(int i)
    {
        AccuAnalytics.logUiEvent(this, "Hourly details launched", i);
        super.onHourlySelected(i);
    }

    protected void onLocationAdded(LocationSearchResult locationsearchresult)
    {
        super.onLocationAdded(locationsearchresult);
        logLocationAddedAnalytic(locationsearchresult.getKey());
    }

    public void onLocationSelected(LocationModel locationmodel, int i)
    {
        AccuAnalytics.logUiEvent(this, "Location selected from management page", i);
        super.onLocationSelected(locationmodel, i);
    }

    public void onMyLocationLongPressed()
    {
        super.onMyLocationLongPressed();
        AccuAnalytics.logUiEvent(this, "Location long pressed");
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        if (!mIsActionBarSelectionChangingProgrammatically)
        {
            AccuAnalytics.logUiEvent(this, "Action bar location selected", i);
        }
        mIsActionBarSelectionChangingProgrammatically = false;
        return super.onNavigationItemSelected(i, l);
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        super.onNegativeClick(genericalertdialogfragment);
        if (genericalertdialogfragment != null)
        {
            genericalertdialogfragment = genericalertdialogfragment.getClass().getSimpleName();
        } else
        {
            genericalertdialogfragment = "";
        }
        AccuAnalytics.logUiEvent(this, "Dialog negative click", genericalertdialogfragment);
    }

    public void onNewsItemSelected(int i)
    {
        AccuAnalytics.logUiEvent(this, "News details launched", i);
        super.onNewsItemSelected(i);
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        super.onPositiveClick(genericalertdialogfragment);
        if (genericalertdialogfragment != null)
        {
            genericalertdialogfragment = genericalertdialogfragment.getClass().getSimpleName();
        } else
        {
            genericalertdialogfragment = "";
        }
        AccuAnalytics.logUiEvent(this, "Dialog positive click", genericalertdialogfragment);
    }

    public void onResume()
    {
        if (PushUtils.isStartingFromPush(this))
        {
            AccuAnalytics.logStateEvent(this, "Starting app from push notification");
        } else
        {
            AccuAnalytics.logStateEvent(this, "Location count on app resume", getLocationCount());
            AccuAnalytics.logStateEvent(this, "Starting app normally");
        }
        super.onResume();
    }

    public void onSearch(String s)
    {
        AccuAnalytics.logUiEvent(this, "Search button clicked");
        super.onSearch(s);
    }

    public void onSpinnerHeaderGroupItemSelected(String s, int i)
    {
        if (s.equals(getString(R.string.ManageMyLocations)))
        {
            AccuAnalytics.logUiEvent(this, "Add location from Action Bar");
        }
        super.onSpinnerHeaderGroupItemSelected(s, i);
    }

    public void onSpinnerItemChanged(Object obj)
    {
        super.onSpinnerItemChanged(obj);
        if (obj != null)
        {
            obj = obj.toString();
        } else
        {
            obj = "";
        }
        AccuAnalytics.logUiEvent(this, "Spinner item selected", ((String) (obj)));
    }

    protected void onUniquePageSelected(int i)
    {
        super.onUniquePageSelected(i);
        updateAnalytics(i);
    }

    public void onVideoItemSelected(int i)
    {
        AccuAnalytics.logUiEvent(this, "Video details launched", i);
        super.onVideoItemSelected(i);
    }

    protected void showAlertWebview(String s)
    {
        AccuAnalytics.logUiEvent(this, "Show alert web view");
        super.showAlertWebview(s);
    }

    protected void updateActionBarSelectedIndex(int i)
    {
        mIsActionBarSelectionChangingProgrammatically = true;
        super.updateActionBarSelectedIndex(i);
    }
}
