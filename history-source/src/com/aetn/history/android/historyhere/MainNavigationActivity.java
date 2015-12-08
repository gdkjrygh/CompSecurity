// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import com.aetn.history.android.historyhere.dialogs.GenericDialogFragment;
import com.aetn.history.android.historyhere.dialogs.InitLocationServicesOrSearchDialog;
import com.aetn.history.android.historyhere.dialogs.InitialLocationServicesDialog;
import com.aetn.history.android.historyhere.dialogs.NoInternetOnStartDialogFragment;
import com.aetn.history.android.historyhere.dialogs.NoResultsDialogFragment;
import com.aetn.history.android.historyhere.dialogs.RateMeDialogFragment;
import com.aetn.history.android.historyhere.dialogs.UpdateDialogFragment;
import com.aetn.history.android.historyhere.fragment.ListOverlayDetailFragment;
import com.aetn.history.android.historyhere.fragment.ListViewFragment;
import com.aetn.history.android.historyhere.fragment.MapFragment;
import com.aetn.history.android.historyhere.fragment.MapOverlayDetailFragment;
import com.aetn.history.android.historyhere.fragment.MapOverlayFragment;
import com.aetn.history.android.historyhere.fragment.MenuFragment;
import com.aetn.history.android.historyhere.fragment.TourDetailFragment;
import com.aetn.history.android.historyhere.fragment.TourHomeListViewFragment;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.InitializationManager;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.view.MoreActivity;
import com.crittercism.app.Crittercism;
import com.localytics.android.LocalyticsAmpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

public class MainNavigationActivity extends FragmentActivity
    implements com.aetn.history.android.historyhere.model.InitializationManager.OnInitializationListener
{
    class SearchTask extends AsyncTask
    {

        final MainNavigationActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient List doInBackground(String as[])
        {
            List list1 = null;
            int i = 0;
            List list = list1;
            Geocoder geocoder;
            int j;
            try
            {
                geocoder = new Geocoder(mContext);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Utils.logger(TAG, (new StringBuilder()).append("IOException: ").append(as).toString());
                as.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Utils.logger(TAG, (new StringBuilder()).append("SearchTask -- exception: ").append(as).toString());
                as.printStackTrace();
                return list;
            }
            list = list1;
            Utils.logger(TAG, (new StringBuilder()).append("the geocoder: ").append(geocoder).toString());
            list = list1;
            list1 = geocoder.getFromLocationName(as[0], 1);
            list = list1;
            Utils.logger(TAG, (new StringBuilder()).append("addressFromSearch: ").append(list1).toString());
            list = list1;
_L2:
            list1 = list;
            j = i;
            if (list != null)
            {
                break; /* Loop/switch isn't completed */
            }
            list1 = geocoder.getFromLocationName(as[0], 1);
            j = i + 1;
            list = list1;
            i = j;
            if (j != 10) goto _L2; else goto _L1
_L1:
            list = list1;
            Utils.logger(TAG, (new StringBuilder()).append("SearchTask -- the address is: ").append(as[0]).toString());
            list = list1;
            Utils.logger(TAG, (new StringBuilder()).append("SearchTask -- request #: ").append(j).toString());
            return list1;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            mApp.hideMessageBox();
            Utils.logger(TAG, "SearchTask:onPostExecute()");
            if (list == null || list.size() < 1)
            {
                Utils.logger(TAG, "error in search, try doGeoLookup: ");
                mApp.doGeoLookup(currentSearchString, mContext);
                list = new HashMap();
                list.put("lookup_type", "location_from_address");
                list.put("search_term", currentSearchString);
                tagLocalyticsEvent("GmapLimitedApi", list);
                return;
            }
            list = (Address)list.get(0);
            Utils.logger(TAG, (new StringBuilder()).append("SearchTask:onPostExecute: firstAddress: ").append(list).toString());
            double d = list.getLatitude();
            double d1 = list.getLongitude();
            boolean flag = false;
            list = list.getCountryCode();
            if (list == null)
            {
                flag = true;
            } else
            if (!list.equalsIgnoreCase("US"))
            {
                flag = true;
            }
            if (flag)
            {
                (new NoResultsDialogFragment()).show(getSupportFragmentManager(), "NoResultsDialogFragment");
                return;
            } else
            {
                list = new Location("searchResults");
                list.setLatitude(Double.valueOf(d).doubleValue());
                list.setLongitude(Double.valueOf(d1).doubleValue());
                showMap(list);
                return;
            }
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        SearchTask()
        {
            this$0 = MainNavigationActivity.this;
            super();
        }
    }


    private static final int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    private static final String DEEPLINK = "DEEPLINK";
    public static final int MAP_TYPE_FAVORITES = 2;
    public static final int MAP_TYPE_PLACES = 0;
    public static final int MAP_TYPE_TOUR = 1;
    public static final String TAG_BACK_STACK = "back_stack";
    public static final String TAG_MAP = "map";
    public static final String TAG_MAP_OVERLAY = "map_overlay";
    public static final String TAG_MENU = "menu";
    public static FragmentManager fragmentManager;
    private static int mMapType = 0;
    private final String TAG = getClass().getSimpleName();
    private String currentSearchString;
    private Uri deeplinkData;
    private ListViewFragment listFragment;
    private ListOverlayDetailFragment listOverlayDetailFragment;
    private LocalyticsAmpSession localyticsSession;
    private int mAnalyticsTourElapsedTime;
    private long mAnalyticsTourEndTime;
    private int mAnalyticsTourPoiSelectCount;
    private int mAnalyticsTourPoiViewedCount;
    private long mAnalyticsTourStartTime;
    private long mAnalyticsTourViewedLength;
    private String mAnalyticsTourViewedName;
    private HistoryHereApplication mApp;
    public boolean mAppInited;
    private Context mContext;
    public Location mCurrentLocation;
    private boolean mDeepLinkActive;
    private boolean mInitLocationTest;
    public boolean mListDetailActive;
    public boolean mMapDetailActive;
    public boolean mMapInited;
    private MapFragment mapFragment;
    private MapOverlayDetailFragment mapOverlayDetailFragment;
    private MapOverlayFragment mapOverlayFragment;
    private MenuFragment menuFragment;
    private TourDetailFragment tourDetailFragment;
    private TourHomeListViewFragment tourHomeListFragment;
    private HashMap updateData;

    public MainNavigationActivity()
    {
        mMapInited = false;
        mAppInited = false;
        mInitLocationTest = false;
        mDeepLinkActive = false;
        mMapDetailActive = false;
        mListDetailActive = false;
        mAnalyticsTourPoiSelectCount = 1;
        mAnalyticsTourPoiViewedCount = 0;
        mAnalyticsTourViewedLength = 0L;
        mAnalyticsTourViewedName = "";
        mAnalyticsTourStartTime = 0L;
        mAnalyticsTourEndTime = 0L;
        mAnalyticsTourElapsedTime = 0;
    }

    private void addFragments()
    {
        Utils.logger(TAG, "addFragments()");
        mapFragment = new MapFragment();
        listFragment = new ListViewFragment();
        tourHomeListFragment = new TourHomeListViewFragment();
        tourDetailFragment = new TourDetailFragment();
        mapOverlayFragment = new MapOverlayFragment();
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        fragmenttransaction.add(0x7f0a00a2, mapFragment, "map");
        fragmenttransaction.add(0x7f0a00a2, mapOverlayFragment, "map_overlay");
        fragmenttransaction.add(0x7f0a00a3, listFragment);
        fragmenttransaction.hide(listFragment);
        fragmenttransaction.hide(mapOverlayFragment);
        fragmenttransaction.commit();
    }

    private void addMenuFragment()
    {
        menuFragment = new MenuFragment();
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        fragmenttransaction.add(0x7f0a00a5, menuFragment, "menu");
        fragmenttransaction.commit();
    }

    private void clearBackstack()
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        for (int i = 0; i < fragmentmanager.getBackStackEntryCount(); i++)
        {
            fragmentmanager.popBackStack();
        }

    }

    public static int getMapType()
    {
        return mMapType;
    }

    private void initCrashReporting()
    {
        String s = HistoryHereApplication.getConfiguration().crittercisms.prod.key;
        Utils.logger(TAG, (new StringBuilder()).append("init crittercism: key:").append(s).toString());
        Crittercism.initialize(mApp, s);
    }

    private void initLocalytics()
    {
        Utils.logger(TAG, (new StringBuilder()).append("initLocalytics():key:").append(mApp.getLocalyticsKey()).toString());
        localyticsSession = new LocalyticsAmpSession(getApplicationContext(), mApp.getLocalyticsKey());
        localyticsSession.registerPush("639943061345");
        localyticsSession.open();
        localyticsSession.handlePushReceived(getIntent());
        localyticsSession.upload();
    }

    public static boolean isMapTypeFavorites()
    {
        return mMapType == 2;
    }

    public static boolean isMapTypePlaces()
    {
        return mMapType == 0;
    }

    public static boolean isMapTypeTours()
    {
        return mMapType == 1;
    }

    private void restartWithDeeplinkIntent(Intent intent)
    {
        Utils.logger(TAG, "restartWithDeeplinkIntent():called");
        Intent intent1 = new Intent(this, com/aetn/history/android/historyhere/MainNavigationActivity);
        intent1.setAction(intent.getAction());
        if (intent.getData() != null)
        {
            Utils.logger(TAG, "restartWithDeeplinkIntent(): intent.getData()!=null: call setData() on the intent");
            intent1.setData(intent.getData());
        }
        if (intent.hasExtra("DEEPLINK"))
        {
            Utils.logger(TAG, (new StringBuilder()).append("restartWithDeeplinkIntent(): intent.hasExtra(DEEPLINK): call putExtra() on the intent with: ").append(intent.getStringExtra("DEEPLINK")).toString());
            intent1.putExtra("DEEPLINK", intent.getStringExtra("DEEPLINK"));
        }
        intent = PendingIntent.getActivity(this, 0x1e240, intent1, 0x10000000);
        ((AlarmManager)getSystemService("alarm")).set(1, System.currentTimeMillis() + 10000L, intent);
        forceCloseApp();
    }

    public static void setMapType(int i)
    {
        mMapType = i;
        ((MapFragment)fragmentManager.findFragmentByTag("map")).setMapType();
        ((MapOverlayFragment)fragmentManager.findFragmentByTag("map_overlay")).setMapSettingsMenu();
    }

    public static void setMapTypePlaces()
    {
        setMapType(0);
    }

    public static void setMapTypeTours()
    {
        setMapType(1);
    }

    public void animateCloseListDetail()
    {
        getSupportFragmentManager().popBackStack();
        mListDetailActive = false;
    }

    public void animateCloseMapDetail()
    {
        mapOverlayFragment.animateCloseDetail();
    }

    public void animateOpenMapDetail()
    {
        mapOverlayFragment.animateInDetail();
    }

    public void checkForRateReminder()
    {
        if (PreferenceManager.getShouldShowRateReminder(this))
        {
            Date date = Utils.getDateFromString(PreferenceManager.getRateReminderDate(this));
            Utils.logger(TAG, (new StringBuilder()).append("checkForRateReminder():PreferenceManager.getRateReminderDate(this):").append(PreferenceManager.getRateReminderDate(this)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("checkForRateReminder():rateReminderDate:").append(date).toString());
            int i = (int)((date.getTime() - (new Date()).getTime()) / 0x5265c00L);
            Utils.logger(TAG, (new StringBuilder()).append("checkForRateReminder():the days are apart:").append(Math.abs(i)).toString());
            if (Math.abs(i) >= HistoryHereApplication.getConfiguration().rateAppPrompting.daysBetweenPrompts)
            {
                int j = PreferenceManager.getRateReminderCount(this);
                Utils.logger(TAG, (new StringBuilder()).append("checkForRateReminder():check rate reminder: rateCount:").append(j).toString());
                if (j >= HistoryHereApplication.getConfiguration().rateAppPrompting.POIViewCount)
                {
                    Utils.logger(TAG, "checkForRateReminder(): show Dialog: reset count");
                    (new RateMeDialogFragment()).show(getSupportFragmentManager(), "RateMeDialogFragment");
                    PreferenceManager.setRateReminderCount(this, 0);
                    PreferenceManager.setRateReminderDate(this, Utils.getTodaysDateString());
                    return;
                } else
                {
                    Utils.logger(TAG, "checkForRateReminder(): dont show Dialog: add count");
                    PreferenceManager.setRateReminderCount(this, j + 1);
                    return;
                }
            }
        }
    }

    public void doMapSearch(String s)
    {
        currentSearchString = s;
        if (!mApp.isOnline())
        {
            Utils.logger(TAG, "searchButtonOnClickListener -- NOT online: ");
            mApp.manageConnectionNotAvailable();
            return;
        } else
        {
            mApp.showMessageBox(mContext, getResources().getString(0x7f0d0066));
            Utils.logger(TAG, "searchButtonOnClickListener -- IS online: ");
            HashMap hashmap = new HashMap();
            hashmap.put("search_term", s);
            tagLocalyticsEvent("home:search", hashmap);
            (new SearchTask()).execute(new String[] {
                s
            });
            return;
        }
    }

    public void executeDeeplink(final String poiId)
    {
        poiId = poiId.substring(poiId.indexOf("//") + 2);
        Utils.logger(TAG, (new StringBuilder()).append("executeDeeplink(): Deeplink data--: uriPath: ").append(poiId).toString());
        poiId = poiId.split("/");
        for (int i = 0; i < poiId.length; i++)
        {
            Utils.logger(TAG, (new StringBuilder()).append("onCreate(): Deeplink data segment: ").append(poiId[i]).toString());
        }

        if (poiId.length != 1) goto _L2; else goto _L1
_L1:
        Utils.logger(TAG, "handleDeeplink(): Deeplink go to tour homepage ");
        showTourHomeList();
        if (menuFragment != null)
        {
            menuFragment.hasNotSelectedPlaces = true;
        }
_L4:
        return;
_L2:
        if (poiId.length != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Utils.logger(TAG, "handleDeeplink(): Deeplink go to tour detail view ");
        Object obj = null;
        String s = poiId[1];
        Iterator iterator = PoiManager.getInstance(mContext).getAllToursList().iterator();
        do
        {
            poiId = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            poiId = (POIDetail)iterator.next();
        } while (!poiId.getId().equalsIgnoreCase(s));
        if (poiId != null)
        {
            setMapType(1);
            showTourDetail(poiId);
            if (menuFragment != null)
            {
                menuFragment.hasNotSelectedPlaces = true;
                return;
            }
        } else
        {
            showTourHomeList();
            if (menuFragment != null)
            {
                menuFragment.hasNotSelectedPlaces = true;
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (poiId.length == 3)
        {
            if (poiId[1].equalsIgnoreCase("poi"))
            {
                Utils.logger(TAG, "handleDeeplink(): Deeplink go to map and highlight poi ");
                poiId = poiId[2];
                poiId = PoiManager.getInstance(this).getPoiById(poiId);
                if (poiId != null)
                {
                    Utils.logger(TAG, (new StringBuilder()).append("handleDeeplink(): Deeplink go to map and highlight poi: ").append(poiId.getTitle()).toString());
                    setMapType(0);
                    showMap();
                    getMapFragment().displayTargetedPOI(poiId);
                    if (menuFragment != null)
                    {
                        menuFragment.hasNotSelectedPlaces = true;
                        return;
                    }
                }
            } else
            {
                mDeepLinkActive = true;
                Utils.logger(TAG, "handleDeeplink(): Deeplink go to tour map and show poi ");
                Object obj1 = poiId[1];
                poiId = poiId[2];
                obj1 = PoiManager.getInstance(this).getTourItemFromToursListById(((String) (obj1)));
                if (obj1 != null)
                {
                    PoiManager.getInstance(this).setOnTourDetailLoadedListener(new com.aetn.history.android.historyhere.model.PoiManager.TourDetailLoadedListener() {

                        final MainNavigationActivity this$0;
                        final String val$poiId;

                        public void onTourDetailLoadFailed()
                        {
                            Utils.logger(TAG, "handleDeeplink(): Deeplink could not get detail for this item ");
                            mDeepLinkActive = false;
                        }

                        public void onTourDetailLoaded(POIDetail poidetail)
                        {
                            MainNavigationActivity.setMapType(1);
                            showTourInMap(poiId);
                            mDeepLinkActive = false;
                        }

            
            {
                this$0 = MainNavigationActivity.this;
                poiId = s;
                super();
            }
                    });
                    showTourDetail(((POIDetail) (obj1)));
                    if (menuFragment != null)
                    {
                        menuFragment.hasNotSelectedPlaces = true;
                        return;
                    }
                } else
                {
                    showTourHomeList();
                    if (menuFragment != null)
                    {
                        menuFragment.hasNotSelectedPlaces = true;
                        return;
                    }
                }
            }
        } else
        {
            Utils.logger(TAG, "handleDeeplink(): Deeplink -- no conditions were met ");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void forceCloseApp()
    {
        System.exit(0);
    }

    public MapFragment getMapFragment()
    {
        return mapFragment;
    }

    public MapOverlayFragment getMapOverlayFragment()
    {
        return mapOverlayFragment;
    }

    public void goToLocationSettings()
    {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public void handleDeeplink()
    {
        Utils.logger(TAG, "handleDeeplink(): ");
        final Intent intent = getIntent();
        showMenu();
        (new Handler()).postDelayed(new Runnable() {

            final MainNavigationActivity this$0;
            final Intent val$intent;

            public void run()
            {
                if (intent.getData() != null)
                {
                    Utils.logger(TAG, "handleDeeplink(): we have data from a standard deeplink: ");
                    executeDeeplink(intent.getData().toString());
                    return;
                }
                if (intent != null && intent.getExtras() != null && intent.hasExtra("DEEPLINK"))
                {
                    Utils.logger(TAG, "handleDeeplink():we have data from a notification deeplink: ");
                    executeDeeplink(intent.getStringExtra("DEEPLINK"));
                    return;
                } else
                {
                    Utils.logger(TAG, "handleDeeplink(): nothing to handle");
                    return;
                }
            }

            
            {
                this$0 = MainNavigationActivity.this;
                intent = intent1;
                super();
            }
        }, 1000L);
    }

    public boolean handleUpdateIfRequired()
    {
        int i = Integer.parseInt(HistoryHereApplication.getConfiguration().minimumVersion);
        int j = Integer.parseInt(HistoryHereApplication.getConfiguration().notificationVersion);
        boolean flag = HistoryHereApplication.getConfiguration().requiredToNotify;
        int l = Utils.getVersionCode(this);
        Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): thisVersionCode:").append(l).toString());
        Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): minVersionNumber:").append(i).toString());
        Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): notificationVersionNumber:").append(j).toString());
        Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): requiredToNotify:").append(flag).toString());
        if (!flag || l >= j)
        {
            Utils.logger(TAG, "handleUpdateIfRequired():not required to notify or we have a newer version - return false:");
            if (l >= j)
            {
                PreferenceManager.setUpdateReminderTF(this, true);
            }
        } else
        {
            if (l < i)
            {
                Utils.logger(TAG, "handleUpdateIfRequired(): we are older than the notification version- force update");
                UpdateDialogFragment updatedialogfragment = new UpdateDialogFragment();
                updatedialogfragment.requiredUpdate = true;
                updatedialogfragment.show(getSupportFragmentManager(), "UpdateDialogFragment");
                return false;
            }
            i = PreferenceManager.getUpdateReminderCount(this);
            Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): suggest update : PreferenceManager.getUpdateReminderTF(this): ").append(PreferenceManager.getUpdateReminderTF(this)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("handleUpdateIfRequired(): suggest update : PreferenceManager.getUpdateReminderCount(this): ").append(i).toString());
            int k = HistoryHereApplication.getConfiguration().daysBetweenUpdateReminder;
            if (PreferenceManager.getUpdateReminderTF(this))
            {
                if (i >= 1 && i < k)
                {
                    Utils.logger(TAG, "handleUpdateIfRequired(): user wants to be reminded but the count is not up - increment");
                    PreferenceManager.setUpdateReminderCount(this, i + 1);
                    return false;
                }
                if (i >= k || i == 0)
                {
                    PreferenceManager.incrementUpdateReminderCount(this);
                    Utils.logger(TAG, "handleUpdateIfRequired(): user wants to be reminded and the count is up ");
                    UpdateDialogFragment updatedialogfragment1 = new UpdateDialogFragment();
                    updatedialogfragment1.requiredUpdate = false;
                    updatedialogfragment1.show(getSupportFragmentManager(), "UpdateDialogFragment");
                    return false;
                }
            } else
            {
                Utils.logger(TAG, "handleUpdateIfRequired(): suggest update : doesnt want to be reminded: ");
                return false;
            }
        }
        return false;
    }

    public void hideDetailPager()
    {
        if (mapOverlayFragment.mIsDetailVisible && mapOverlayFragment != null)
        {
            mapOverlayFragment.animateHideDetailPager();
            ((MapFragment)fragmentManager.findFragmentByTag("map")).handleOnDetailHide();
        }
    }

    public void hideMapOverlay()
    {
        if (mapOverlayFragment != null)
        {
            mapOverlayFragment.hideDetailPager();
            mapOverlayFragment.hideMenu();
            mapOverlayFragment.hideSettingsMenu();
        }
    }

    public void hidePlacesList()
    {
        Utils.logger(TAG, "showPlacesList");
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        fragmenttransaction.hide(listFragment);
        fragmenttransaction.commit();
        if (isMapTypePlaces())
        {
            tagLocalyticsScreen("HH:Places:List");
        } else
        {
            if (isMapTypeTours())
            {
                tagLocalyticsScreen(Utils.getFormattedLocalyticsTag("HH:Tours:*:List", PoiManager.getInstance(this).getCurrentTourDetailPOI().getTitle()));
                return;
            }
            if (isMapTypeFavorites())
            {
                tagLocalyticsScreen("HH:Favorites:List");
                return;
            }
        }
    }

    public void initMapToUsersLocation(Location location)
    {
        showMap();
        getMapFragment().initToUsersLocation(location);
    }

    public void localyticsIncrementTourPoiSelectCount()
    {
        Utils.logger(TAG, "localyticsIncrementTourPoiSelectCount: ");
        mAnalyticsTourPoiSelectCount = mAnalyticsTourPoiSelectCount + 1;
    }

    public void localyticsIncrementTourPoiViewedCount()
    {
        Utils.logger(TAG, "localyticsIncrementTourPoiViewedCount: ");
        mAnalyticsTourPoiViewedCount = mAnalyticsTourPoiViewedCount + 1;
    }

    public void localyticsResetTourData()
    {
        mAnalyticsTourPoiSelectCount = 1;
        mAnalyticsTourPoiViewedCount = 0;
        mAnalyticsTourViewedLength = 0L;
        mAnalyticsTourViewedName = "";
        mAnalyticsTourStartTime = 0L;
        mAnalyticsTourEndTime = 0L;
        mAnalyticsTourElapsedTime = 0;
    }

    public void localyticsSetTourViewedName(String s)
    {
        Utils.logger(TAG, (new StringBuilder()).append("localyticsSetTourViewedName: ").append(s).toString());
        mAnalyticsTourViewedName = s;
        localyticsTagTourTimerStart();
    }

    public void localyticsTagTourTimerStart()
    {
        Utils.logger(TAG, "localyticsTagTourTimerStart: ");
        mAnalyticsTourStartTime = (new Date()).getTime();
    }

    public void localyticsTagTourTimerStop()
    {
        Utils.logger(TAG, "localyticsTagTourTimerStop: ");
        mAnalyticsTourEndTime = (new Date()).getTime();
        mAnalyticsTourElapsedTime = (int)(mAnalyticsTourEndTime - mAnalyticsTourStartTime) / 1000;
        Utils.logger(TAG, (new StringBuilder()).append("localyticsTagTourTimerStop: elapsed time:").append(mAnalyticsTourElapsedTime).toString());
    }

    public void localyticsTagTourViewedEvent()
    {
        localyticsTagTourTimerStop();
        Utils.logger(TAG, (new StringBuilder()).append("localyticsTagTourViewedEvent:mAnalyticsTourViewedName: ").append(mAnalyticsTourViewedName).toString());
        Utils.logger(TAG, (new StringBuilder()).append("localyticsTagTourViewedEvent: mAnalyticsTourPoiViewedCount:").append(mAnalyticsTourPoiViewedCount).toString());
        Utils.logger(TAG, (new StringBuilder()).append("localyticsTagTourViewedEvent: mAnalyticsTourPoiSelectCount:").append(mAnalyticsTourPoiSelectCount).toString());
        Utils.logger(TAG, (new StringBuilder()).append("localyticsTagTourViewedEvent: mAnalyticsTourElapsedTime:").append(mAnalyticsTourElapsedTime).toString());
        if (!mAnalyticsTourViewedName.isEmpty())
        {
            Utils.logger(TAG, "localyticsTagTourViewedEvent: there is data so send the event");
            HashMap hashmap = new HashMap();
            hashmap.put("Tour Name", mAnalyticsTourViewedName);
            hashmap.put("POI Views", String.valueOf(mAnalyticsTourPoiViewedCount));
            hashmap.put("POI Swipes", String.valueOf(mAnalyticsTourPoiSelectCount));
            hashmap.put("Time Spent", String.valueOf(mAnalyticsTourElapsedTime));
            tagLocalyticsEvent("Tour Stats", hashmap);
            localyticsResetTourData();
            return;
        } else
        {
            Utils.logger(TAG, "localyticsTagTourViewedEvent: there is no data so DO NOT send the event");
            return;
        }
    }

    public void manageDetailNotLoaded(String s)
    {
        Utils.logger(TAG, "manageDetailNotLoaded()");
        GenericDialogFragment genericdialogfragment = new GenericDialogFragment();
        genericdialogfragment.setTitleText(getResources().getString(0x7f0d0039), s);
        genericdialogfragment.show(getSupportFragmentManager(), "manageDetailNotLoaded");
    }

    public void onBackPressed()
    {
        int i = getSupportFragmentManager().getBackStackEntryCount();
        Utils.logger(TAG, (new StringBuilder()).append("onBackPressed:backStackEntryCount:").append(i).toString());
        if (i == 0)
        {
            Utils.logger(TAG, "onBackPressed: 0 so force close");
            forceCloseApp();
            return;
        }
        if (mMapDetailActive)
        {
            animateCloseMapDetail();
            mMapDetailActive = false;
            return;
        }
        if (mListDetailActive)
        {
            animateCloseListDetail();
            mListDetailActive = false;
            return;
        } else
        {
            Utils.logger(TAG, "onBackPressed: not 0 - so call super");
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Utils.logger(TAG, "onCreate():");
        super.onCreate(bundle);
        fragmentManager = getSupportFragmentManager();
        setContentView(0x7f03003c);
        mApp = (HistoryHereApplication)getApplication();
        mContext = this;
        bundle = getIntent();
        deeplinkData = bundle.getData();
        Utils.logger(TAG, (new StringBuilder()).append("onCreate(): intent: ").append(bundle).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onCreate(): intent.getAction(): ").append(bundle.getAction()).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onCreate(): intent.getExtras(): ").append(bundle.getExtras()).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onCreate():intent.hasExtra(DEEPLINK): ").append(bundle.hasExtra("DEEPLINK")).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onCreate(): intent.getData(): ").append(bundle.getData()).toString());
        setIntent(bundle);
        addMenuFragment();
        InitializationManager.getInstance(this).setOnInitializationListener(this);
        InitializationManager.getInstance(this).init();
    }

    public void onDestroy()
    {
        Utils.logger(TAG, "onDestroy()");
        mAppInited = false;
        LocationManager.getInstance(this).turnOffLocationServices();
        super.onDestroy();
    }

    public void onFailedToGetLatestPlayServices()
    {
        Utils.logger(TAG, "onFailedToGetLatestPlayServices(): failed to load the playservices");
        finish();
    }

    public void onInitialization()
    {
        Utils.logger(TAG, "onInitialization(): LOADED = go ahead");
        if (!mAppInited)
        {
            Utils.logger(TAG, "onInitialization(): not inited: go ahead");
            mAppInited = true;
            addFragments();
            menuFragment.init();
            initLocalytics();
            initCrashReporting();
            return;
        } else
        {
            Utils.logger(TAG, "onInitialization(): this fired twice so DO NOT go ahead");
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        Utils.logger(TAG, (new StringBuilder()).append("onNewIntent(): intent: ").append(intent).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onNewIntent(): intent.getAction(): ").append(intent.getAction()).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onNewIntent(): intent.getExtras(): ").append(intent.getExtras()).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onNewIntent():intent.hasExtra(DEEPLINK): ").append(intent.hasExtra("DEEPLINK")).toString());
        Utils.logger(TAG, (new StringBuilder()).append("onNewIntent(): intent.getData(): ").append(intent.getData()).toString());
        super.onNewIntent(intent);
        setIntent(intent);
        handleDeeplink();
    }

    public void onNoNetworkConnection()
    {
        Utils.logger(TAG, "onNoNetworkConnection(): close");
        (new NoInternetOnStartDialogFragment()).show(getSupportFragmentManager(), "NoInternetOnStartDialogFragment");
        (new Handler()).postDelayed(new Runnable() {

            final MainNavigationActivity this$0;

            public void run()
            {
                forceCloseApp();
            }

            
            {
                this$0 = MainNavigationActivity.this;
                super();
            }
        }, 5000L);
    }

    public void onPause()
    {
        Log.d(TAG, "onPause()");
        localyticsTagTourViewedEvent();
        if (localyticsSession != null)
        {
            localyticsSession.detach();
            localyticsSession.close();
            localyticsSession.upload();
        }
        super.onPause();
    }

    public void onResume()
    {
        Log.d(TAG, "onResume()");
        super.onResume();
        if (localyticsSession != null)
        {
            localyticsSession.open();
            localyticsSession.handlePushReceived(getIntent());
        }
        LocationManager.getInstance(this).turnOnLocationServices();
        if (isMapTypeTours())
        {
            localyticsSetTourViewedName(PoiManager.getInstance(mContext).getCurrentTourDetailPOI().getTitle());
        }
        if (mapOverlayFragment != null)
        {
            mapOverlayFragment.setMapSettingsMenu();
        }
    }

    protected void onStart()
    {
        Log.d(TAG, "onStart()");
        super.onStart();
    }

    protected void onStop()
    {
        Log.d(TAG, "onStop()");
        super.onStop();
    }

    public void removeTourFragment()
    {
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        if (tourDetailFragment.isAdded())
        {
            fragmenttransaction.remove(tourDetailFragment);
        }
        fragmenttransaction.addToBackStack("back_stack");
        fragmenttransaction.commit();
    }

    public void showDetailPager(POIDetail poidetail)
    {
        if (!mapOverlayFragment.mIsDetailVisible)
        {
            mapOverlayFragment.setTargetPoi(poidetail);
            mapOverlayFragment.showDetailPager();
            ((MapFragment)fragmentManager.findFragmentByTag("map")).handleOnDetailShow();
            return;
        } else
        {
            mapOverlayFragment.setPoiInList(poidetail);
            return;
        }
    }

    public void showFavorites()
    {
        setMapType(2);
        showMap();
    }

    public void showInitLocationServicesOrSearchDialog()
    {
        InitLocationServicesOrSearchDialog.newInstance(0x7f0d007f).show(getFragmentManager(), "dialog");
    }

    public void showInitialLocationServicesDialog()
    {
        InitialLocationServicesDialog.newInstance(0x7f0d0082).show(getFragmentManager(), "dialog");
    }

    public void showListDetail(POIDetail poidetail)
    {
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        listOverlayDetailFragment = ListOverlayDetailFragment.newInstance(poidetail);
        if (menuFragment.isVisible())
        {
            fragmenttransaction.hide(menuFragment);
        }
        fragmenttransaction.add(0x7f0a00a3, listOverlayDetailFragment);
        fragmenttransaction.addToBackStack("back_stack");
        fragmenttransaction.commit();
        checkForRateReminder();
        mListDetailActive = true;
    }

    public void showMap()
    {
        Object obj;
        getMapFragment().showUI();
        if (isMapTypePlaces() || isMapTypeFavorites())
        {
            getMapFragment().refreshPlacesMap();
        }
        obj = fragmentManager.beginTransaction();
        if (tourHomeListFragment.isAdded())
        {
            ((FragmentTransaction) (obj)).remove(tourHomeListFragment);
        }
        if (mapOverlayDetailFragment != null && mapOverlayDetailFragment.isAdded())
        {
            ((FragmentTransaction) (obj)).remove(mapOverlayDetailFragment);
        }
        if (listOverlayDetailFragment != null && listOverlayDetailFragment.isAdded())
        {
            ((FragmentTransaction) (obj)).remove(listOverlayDetailFragment);
        }
        if (menuFragment.isVisible())
        {
            ((FragmentTransaction) (obj)).hide(menuFragment);
        }
        if (tourDetailFragment.isAdded())
        {
            ((FragmentTransaction) (obj)).remove(tourDetailFragment);
        }
        if (mapOverlayFragment.isHidden())
        {
            ((FragmentTransaction) (obj)).show(mapOverlayFragment);
        }
        ((FragmentTransaction) (obj)).addToBackStack("back_stack");
        ((FragmentTransaction) (obj)).commit();
        mMapInited = true;
        mapOverlayFragment.setUI();
        hidePlacesList();
        obj = "";
        if (!isMapTypePlaces()) goto _L2; else goto _L1
_L1:
        obj = "HH:Places:Map";
_L4:
        tagLocalyticsScreen(((String) (obj)));
        return;
_L2:
        if (isMapTypeTours())
        {
            obj = Utils.getFormattedLocalyticsTag("HH:Tours:*:Map", PoiManager.getInstance(this).getCurrentTourDetailPOI().getTitle());
        } else
        if (isMapTypeFavorites())
        {
            obj = "HH:Favorites:Map";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void showMap(Location location)
    {
        showMap();
        getMapFragment().zoomToMapLocation(location);
    }

    public void showMap(POIDetail poidetail)
    {
        showMap();
        ((MapFragment)fragmentManager.findFragmentByTag("map")).displayPOI(poidetail);
    }

    public void showMapOverlay()
    {
        if (mapOverlayFragment != null)
        {
            mapOverlayFragment.showMenu();
            mapOverlayFragment.showSettingsMenu();
        }
    }

    public void showMapSearch()
    {
        setMapTypePlaces();
        showMap();
        getMapFragment().showSearch();
    }

    public void showMenu()
    {
        clearBackstack();
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        if (menuFragment.isHidden())
        {
            fragmenttransaction.show(menuFragment);
        }
        fragmenttransaction.commit();
        mapFragment.clearSelectedMarkerIcon();
        hideDetailPager();
        tagLocalyticsScreen("HH:Home");
    }

    public void showMore()
    {
        setMapTypePlaces();
        Intent intent = new Intent(this, com/aetn/history/android/historyhere/view/MoreActivity);
        intent.setFlags(0x10000000);
        intent.addFlags(0x10000);
        startActivity(intent);
    }

    public void showNotInUSDialog()
    {
        String s = getResources().getString(0x7f0d0045);
        GenericDialogFragment genericdialogfragment = new GenericDialogFragment();
        genericdialogfragment.setTitleText(null, s);
        genericdialogfragment.setOKBtnText(getResources().getString(0x7f0d0013));
        genericdialogfragment.show(getSupportFragmentManager(), "GenericDialogFragment");
    }

    public void showPlacesList()
    {
        Utils.logger(TAG, "showPlacesList");
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        fragmenttransaction.show(listFragment);
        listFragment.loadCurrentData();
        fragmenttransaction.commit();
        if (isMapTypePlaces())
        {
            tagLocalyticsScreen("HH:Places:List");
        } else
        {
            if (isMapTypeTours())
            {
                tagLocalyticsScreen(Utils.getFormattedLocalyticsTag("HH:Tours:*:List", PoiManager.getInstance(this).getCurrentTourDetailPOI().getTitle()));
                return;
            }
            if (isMapTypeFavorites())
            {
                tagLocalyticsScreen("HH:Favorites:List");
                return;
            }
        }
    }

    public void showSurpriseMePoi(POIDetail poidetail)
    {
        setMapTypePlaces();
        showMap();
        ((MapFragment)fragmentManager.findFragmentByTag("map")).showSurpriseMePoi(poidetail, true, true);
    }

    public void showTourDetail(POIDetail poidetail)
    {
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        if (menuFragment.isVisible())
        {
            fragmenttransaction.hide(menuFragment);
        }
        tourDetailFragment = TourDetailFragment.newInstance(poidetail);
        fragmenttransaction.replace(0x7f0a00a4, tourDetailFragment, "tourdetail");
        getMapFragment().hideUI();
        fragmenttransaction.addToBackStack("back_stack");
        fragmenttransaction.commit();
    }

    public void showTourHomeList()
    {
        setMapType(1);
        FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
        if (menuFragment.isVisible())
        {
            fragmenttransaction.hide(menuFragment);
        }
        if (!tourHomeListFragment.isAdded())
        {
            fragmenttransaction.add(0x7f0a00a3, tourHomeListFragment);
        }
        getMapFragment().hideUI();
        fragmenttransaction.addToBackStack("back_stack");
        fragmenttransaction.commit();
        tagLocalyticsScreen("HH:Tours:List");
    }

    public void showTourInMap(String s)
    {
        Utils.logger(TAG, "showTourInMap(id)");
        showMap();
        mMapInited = true;
        getMapFragment().showCurrentTourInMap(s);
        mapOverlayFragment.showTourHeader();
        localyticsSetTourViewedName(PoiManager.getInstance(mContext).getCurrentTourDetailPOI().getTitle());
    }

    public void tagLocalyticsEvent(String s, Map map)
    {
        if (map == null)
        {
            Utils.logger(TAG, (new StringBuilder()).append("tagLocalyticsEvent():").append(s).toString());
            localyticsSession.tagEvent(s);
            return;
        } else
        {
            Utils.logger(TAG, (new StringBuilder()).append("tagLocalyticsEvent():").append(s).append(" | extras: ").append(map).toString());
            localyticsSession.tagEvent(s, map);
            return;
        }
    }

    public void tagLocalyticsScreen(String s)
    {
        Utils.logger(TAG, (new StringBuilder()).append("tagLocalyticsScreen():").append(s).toString());
        localyticsSession.open();
        localyticsSession.tagScreen(s);
        localyticsSession.upload();
    }




/*
    static boolean access$102(MainNavigationActivity mainnavigationactivity, boolean flag)
    {
        mainnavigationactivity.mDeepLinkActive = flag;
        return flag;
    }

*/



}
