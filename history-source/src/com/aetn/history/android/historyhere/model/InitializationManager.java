// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PreferenceManager, Configuration, LocationManager

public class InitializationManager
{
    public static interface OnInitializationListener
    {

        public abstract void onFailedToGetLatestPlayServices();

        public abstract void onInitialization();

        public abstract void onNoNetworkConnection();
    }


    private static Context mContext;
    private static InitializationManager mInitializationManager;
    private final String TAG = "InitializationManager";
    private Boolean isInited;
    private boolean isIniting;
    private HistoryHereApplication mApp;
    private ArrayList mInitializationListeners;

    public InitializationManager(Context context)
    {
        isInited = Boolean.valueOf(false);
        isIniting = false;
        mContext = context;
        mApp = (HistoryHereApplication)context.getApplicationContext();
    }

    private void checkForLatestRecords()
    {
        Utils.logger("InitializationManager", "checkForLatestRecords()");
        PoiManager.getInstance(mContext).setLimitedDataLoadedListener(new PoiManager.LimitedDataLoadedListener() {

            final InitializationManager this$0;

            public void onDataLoaded(ArrayList arraylist)
            {
                Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded()");
                if (arraylist.size() > 0)
                {
                    Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded(): we have data so update it");
                    updateLimitedData(arraylist);
                    return;
                } else
                {
                    Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded(): we have NO NEW data so load tours");
                    loadAllTours();
                    return;
                }
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
        String s1 = PreferenceManager.getLimitedDatabaseUpdateDate(mContext);
        String s = s1;
        if (s1.isEmpty())
        {
            s = "2015-01-22";
        }
        PoiManager.getInstance(mContext).loadLimitedListFromDataDump(mContext, s);
    }

    public static InitializationManager getInstance(Context context)
    {
        if (mInitializationManager == null)
        {
            mInitializationManager = new InitializationManager(context);
        }
        return mInitializationManager;
    }

    private void hasFinishedInitialization()
    {
        Utils.logger("InitializationManager", "hasFinishedInitialization(): has successfully gone through all the steps so we can fire off inited");
        isInited = Boolean.valueOf(true);
        isIniting = false;
        notifyListenersOnInitialization();
    }

    private void initDataBaseLoad()
    {
        Date date1 = Utils.getDateFromString(HistoryHereApplication.getConfiguration().poiDatabaseRefreshDate);
        Utils.logger("InitializationManager", (new StringBuilder()).append("loadConfig(): dbRefreshDateFromConfig: ").append(date1).toString());
        Date date;
        if (!PreferenceManager.getFullDatabaseRefreshDate(mContext).isEmpty())
        {
            Utils.logger("InitializationManager", (new StringBuilder()).append("loadConfig(): NOT EMPTY! - PreferenceManager.getFullDatabaseRefreshDate(mContext): ").append(PreferenceManager.getFullDatabaseRefreshDate(mContext)).toString());
            date = Utils.getDateFromISO8601String(PreferenceManager.getFullDatabaseRefreshDate(mContext));
        } else
        {
            Utils.logger("InitializationManager", "loadConfig(): Config.INITIAL_DB_DATE: 2015-01-22");
            date = Utils.getDateFromString("2015-01-22");
        }
        if (date1.after(date))
        {
            Utils.logger("InitializationManager", (new StringBuilder()).append("loadConfig(): LOAD FROM NEW DATADUMP: ").append(date1).toString());
            loadDataFromDataDump();
            return;
        }
        Utils.logger("InitializationManager", (new StringBuilder()).append("loadConfig(): LOAD FROM LOCAL COPY: ").append(date).toString());
        if (!PreferenceManager.hasHadFirstRun(mContext))
        {
            Utils.logger("InitializationManager", "loadConfig(): DB NOT loaded yet - so do the initial load");
            loadDataFromDisk();
            return;
        } else
        {
            Utils.logger("InitializationManager", "loadConfig(): DB already loaded - so load all tours");
            checkForLatestRecords();
            return;
        }
    }

    private void loadAllTours()
    {
        Utils.logger("InitializationManager", "loadAllTours()");
        PoiManager.getInstance(mContext).setOnAllToursDataLoadedListener(new PoiManager.AllToursDataLoadedListener() {

            final InitializationManager this$0;

            public void onDataLoadFailed()
            {
                Utils.logger("InitializationManager", "loadAllTours: onDataLoadFailed");
                hasFinishedInitialization();
            }

            public void onDataLoaded(ArrayList arraylist)
            {
                Utils.logger("InitializationManager", "loadAllTours.AllToursDataLoadedListener: onDataLoaded: successfully loaded the tours - we're inited!");
                hasFinishedInitialization();
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
        PoiManager.getInstance(mContext).loadAllToursList();
    }

    private void loadConfig()
    {
        Utils.logger("InitializationManager", "loadConfig()");
        mApp.loadConfig(new com.aetn.history.android.historyhere.HistoryHereApplication.OnConfigLoadedListener() {

            final InitializationManager this$0;

            public void onConfigLoaded()
            {
                Utils.logger("InitializationManager", "onConfigLoaded: successfully loaded the config");
                initDataBaseLoad();
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
    }

    private void loadDataFromDataDump()
    {
        Utils.logger("InitializationManager", "loadDataFromDataDump()");
        PoiManager.getInstance(mContext).setInitialDataLoadedListener(new PoiManager.InitialDataLoadedListener() {

            final InitializationManager this$0;

            public void onDataLoaded()
            {
                Utils.logger("InitializationManager", "loadDataFromDisk.onDataLoaded()");
                PreferenceManager.setFirstRun(InitializationManager.mContext);
                PreferenceManager.setFullDatabaseRefreshDate(InitializationManager.mContext, Utils.getDateAsISO8601String());
                PreferenceManager.setLimitedDatabaseUpdateDate(InitializationManager.mContext, Utils.getDateAsISO8601String());
                loadAllTours();
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
        PoiManager.getInstance(mContext).loadFullPoiListFromDataDump(mContext);
    }

    private void loadDataFromDisk()
    {
        Utils.logger("InitializationManager", "loadDataFromDisk()");
        PoiManager.getInstance(mContext).setInitialDataLoadedListener(new PoiManager.InitialDataLoadedListener() {

            final InitializationManager this$0;

            public void onDataLoaded()
            {
                Utils.logger("InitializationManager", "loadDataFromDisk.onDataLoaded()");
                PreferenceManager.setFirstRun(InitializationManager.mContext);
                PreferenceManager.setFullDatabaseRefreshDate(InitializationManager.mContext, Utils.getDateAsISO8601String());
                checkForLatestRecords();
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
        PoiManager.getInstance(mContext).loadFullPoiListFromAssets(mContext);
    }

    private void notifyListenersOnFailedPlayServices()
    {
        for (Iterator iterator = mInitializationListeners.iterator(); iterator.hasNext(); ((OnInitializationListener)iterator.next()).onFailedToGetLatestPlayServices()) { }
    }

    private void notifyListenersOnInitialization()
    {
        for (Iterator iterator = mInitializationListeners.iterator(); iterator.hasNext(); ((OnInitializationListener)iterator.next()).onInitialization()) { }
    }

    private void notifyListenersOnNoNetworkConnection()
    {
        for (Iterator iterator = mInitializationListeners.iterator(); iterator.hasNext(); ((OnInitializationListener)iterator.next()).onNoNetworkConnection()) { }
    }

    private void updateLimitedData(ArrayList arraylist)
    {
        Utils.logger("InitializationManager", (new StringBuilder()).append("loadLimitedData(): data:").append(arraylist.size()).toString());
        PoiManager.getInstance(mContext).setLimitedDataUpdatedListener(new PoiManager.LimitedDataUpdatedListener() {

            final InitializationManager this$0;

            public void onDataUpdated()
            {
                Utils.logger("InitializationManager", "loadLimitedData.onDataUpdated(): PHEW! we're done updating!!");
                PreferenceManager.setLimitedDatabaseUpdateDate(InitializationManager.mContext, Utils.getDateAsISO8601String());
                loadAllTours();
            }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
        });
        PoiManager.getInstance(mContext).updateLimitedListFromDataDump(arraylist);
    }

    public void init()
    {
        if (!ConnectionManager.isNetworkAvailable(mContext))
        {
            notifyListenersOnNoNetworkConnection();
            return;
        } else
        {
            Utils.logger("InitializationManager", "init()");
            isIniting = true;
            LocationManager.getInstance(mContext).setOnPlayServiceInstalledListener(new LocationManager.OnPlayServiceInstalledListener() {

                final InitializationManager this$0;

                public void onFailed()
                {
                    Utils.logger("InitializationManager", "init(): OnPlayServiceInstalledListener: onFailed");
                    notifyListenersOnFailedPlayServices();
                }

                public void onSuccess()
                {
                    Utils.logger("InitializationManager", "init(): OnPlayServiceInstalledListener: onSuccess");
                    loadConfig();
                }

            
            {
                this$0 = InitializationManager.this;
                super();
            }
            });
            LocationManager.getInstance(mContext).init();
            return;
        }
    }

    public boolean isInited()
    {
        return isInited.booleanValue();
    }

    public boolean isIniting()
    {
        return isIniting;
    }

    public void setOnInitializationListener(OnInitializationListener oninitializationlistener)
    {
        if (mInitializationListeners == null)
        {
            mInitializationListeners = new ArrayList();
        }
        mInitializationListeners.add(oninitializationlistener);
    }








}
