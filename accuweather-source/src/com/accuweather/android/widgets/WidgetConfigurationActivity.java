// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.accuweather.android.adapters.LiteTitleSpinnerAdapter;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.request.LocationAutoCompleteRequest;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.SimpleSearchView;
import com.accuweather.android.widgets.minutecast.AL_WidgetConfigurationActivity;
import com.comscore.analytics.comScore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            AL_WidgetConfigurationActivityFollowMe, LiteWidgetTermsAndConditionsActivity

public class WidgetConfigurationActivity extends FragmentActivity
    implements android.view.View.OnClickListener, com.accuweather.android.views.SimpleSearchView.ISearchViewListener, com.accuweather.android.utilities.Data.IWidgetWeatherDataListener, android.content.DialogInterface.OnClickListener
{

    public static final String DEBUG_TAG = "AL_WidgetConfigurationActivity";
    private static final String GPS = "-1";
    private ArrayAdapter mAdapter;
    protected int mAppWidgetId;
    private DialogFragment mDialog;
    private ListView mList;
    private List mLocCodes;
    private List mLocNames;
    private LocationRequester mLocationRequester;
    private LocationSearch mLocationSearch;
    private RelativeLayout mProgressBarLayout;
    private SimpleSearchView mSearchView;
    private Context mSelf;

    public WidgetConfigurationActivity()
    {
    }

    private DialogFragment buildDialog(final android.content.DialogInterface.OnClickListener listener)
    {
        listener = new DialogFragment() {

            final WidgetConfigurationActivity this$0;
            final android.content.DialogInterface.OnClickListener val$listener;

            public Dialog onCreateDialog(Bundle bundle)
            {
                bundle = new android.app.AlertDialog.Builder(WidgetConfigurationActivity.this);
                int i;
                if (UserPreferences.isMetric(WidgetConfigurationActivity.this))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                return bundle.setSingleChoiceItems(buildDialogItems(), i, listener).setPositiveButton(com.accuweather.android.R.string.OK, null).setTitle(com.accuweather.android.R.string.units).create();
            }

            
            {
                this$0 = WidgetConfigurationActivity.this;
                listener = onclicklistener;
                super();
            }
        };
        listener.setCancelable(false);
        listener.setRetainInstance(true);
        return listener;
    }

    private String[] buildDialogItems()
    {
        return (new String[] {
            getString(com.accuweather.android.R.string.Imperial), getString(com.accuweather.android.R.string.Metric)
        });
    }

    private boolean containsAutoCompleteRequest(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) instanceof LocationAutoCompleteRequest)
            {
                return true;
            }
        }

        return false;
    }

    private void finish(String s)
    {
        finish(s, new Intent("accuwx.intent.action.UPDATE_METRIC"));
    }

    private void finish(String s, Intent intent)
    {
        int i = getWidgetId();
        getWidgetIdMap().put(Integer.valueOf(i), s);
        saveWidgetData();
        s = new Intent();
        s.putExtra("appWidgetId", i);
        setResult(-1, s);
        if (intent != null)
        {
            sendBroadcast(intent);
        }
        Utilities.notifyResetGAWidgetAlarmService(this);
        super.finish();
    }

    private void handleQuickSetupCompleted()
    {
        Logger.i(this, "size of locations is %d", new Object[] {
            Integer.valueOf(getData().getLocations().size())
        });
        if (!(this instanceof AL_WidgetConfigurationActivityFollowMe) && getData().getLocations().size() < 1)
        {
            init();
            return;
        }
        if ((this instanceof AL_WidgetConfigurationActivityFollowMe) || (this instanceof AL_WidgetConfigurationActivity))
        {
            init();
            return;
        } else
        {
            finish(getData().getHomeLocation().getKey());
            return;
        }
    }

    private void handleSearchItemSelected(LocationSearchResult locationsearchresult)
    {
        locationsearchresult = locationsearchresult.toLocationModel();
        getData().addLocation(locationsearchresult);
        mSearchView.clearInput();
        Logger.i(this, "handleSearchItemSelected for %s, updateWeather", new Object[] {
            locationsearchresult.getLocKey()
        });
        logLocationAddedAnalytic();
        finish(locationsearchresult.getLocKey());
    }

    private boolean isQuickSetupCompleted()
    {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("quick_setup_completed", false);
    }

    private void logLocationAddedAnalytic()
    {
        ArrayList arraylist = getData().getLocations();
        int i;
        if (arraylist != null)
        {
            i = arraylist.size();
        } else
        {
            i = 0;
        }
        AccuAnalytics.logUiEvent(this, "Location added with new location count", i);
    }

    private void showUnitDialog(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        Logger.i(this);
        if (mDialog == null)
        {
            mDialog = buildDialog(onclicklistener);
        }
        if (!mDialog.isVisible())
        {
            mDialog.show(getSupportFragmentManager(), "UnitsDialog");
        }
    }

    protected Bundle buildExtras()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_resizable", true);
        return bundle;
    }

    protected LiteTitleSpinnerAdapter buildTitleSpinnerAdapter(LocationSearch locationsearch, boolean flag)
    {
        int i = com.accuweather.android.R.layout.spinner_dropdown_item;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new LiteTitleSpinnerAdapter(this, i, Utilities.buildHtmlifiedLocationFullNames(this, locationsearch, flag));
    }

    public int describeContents()
    {
        return 0;
    }

    protected final Data getData()
    {
        return Data.getInstance(this);
    }

    public int getWidgetId()
    {
        return getIntent().getIntExtra("appWidgetId", 0);
    }

    public HashMap getWidgetIdMap()
    {
        return getData().getResizableWidgetIdMap();
    }

    protected Class getWidgetTermsAndConditionsActivity()
    {
        return com/accuweather/android/widgets/LiteWidgetTermsAndConditionsActivity;
    }

    public void init()
    {
        Logger.i(this);
        Bundle bundle = getIntent().getExtras();
        getData().registerWeatherDataListener(this);
        if (bundle != null)
        {
            mAppWidgetId = bundle.getInt("appWidgetId", 0);
            Logger.i(this, "mAppWidgetId is %s", new Object[] {
                Integer.toString(mAppWidgetId)
            });
        }
        setContentView(com.accuweather.android.R.layout.widget_search_view);
        if (!Utilities.shouldShowGpsButton(this))
        {
            ((TextView)findViewById(com.accuweather.android.R.id.or_use)).setVisibility(8);
            ((Button)findViewById(com.accuweather.android.R.id.use_gps)).setVisibility(8);
            ((TextView)findViewById(com.accuweather.android.R.id.descrip_enable_loc)).setVisibility(8);
        }
        findViewById(com.accuweather.android.R.id.use_gps).setOnClickListener(this);
        mSearchView = (SimpleSearchView)findViewById(com.accuweather.android.R.id.search_view);
        mSearchView.setSearchViewListener(this);
        mProgressBarLayout = (RelativeLayout)findViewById(com.accuweather.android.R.id.progress_layout);
        mProgressBarLayout.setVisibility(8);
        mList = (ListView)findViewById(0x102000a);
        mList.setBackgroundColor(0xffffff);
        mLocNames = getData().getPrettyNames();
        mLocCodes = getData().getKeys();
        if (mLocNames != null && mLocNames.size() != 0)
        {
            mAdapter = new ArrayAdapter(this, com.accuweather.android.R.layout.custom_widget_list_item, mLocNames);
            mList.setAdapter(mAdapter);
            mList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final WidgetConfigurationActivity this$0;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    Logger.i("AL_WidgetConfigurationActivity", "onItemSelected() inside setOnItemSelectedListener");
                    Logger.i("AL_WidgetConfigurationActivity", (new StringBuilder()).append("position:  ").append(i).toString());
                    Logger.i("AL_WidgetConfigurationActivity", (new StringBuilder()).append("mLocCodes.get(position):  ").append((String)mLocCodes.get(i)).toString());
                    if (!getWidgetIdMap().containsValue(mLocCodes.get(i)))
                    {
                        Logger.i(this, "onListItemClicked updateWeather");
                        finish((String)mLocCodes.get(i));
                        return;
                    } else
                    {
                        (new android.app.AlertDialog.Builder(mSelf)).setTitle(com.accuweather.android.R.string.Notice).setMessage(com.accuweather.android.R.string.ThisLocationAlreadyWidgetAssigned_YouCannotCreateAnotherOne).setNeutralButton(com.accuweather.android.R.string.OK, null).create().show();
                        return;
                    }
                }

            
            {
                this$0 = WidgetConfigurationActivity.this;
                super();
            }
            });
        }
        Utilities.setTypeFace(findViewById(com.accuweather.android.R.id.use_gps).getRootView(), Data.getRobotoCondensed());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        Logger.i(this);
        if (i != 200) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        if (Utilities.isAndroidLite()) goto _L6; else goto _L5
_L5:
        if (isQuickSetupCompleted())
        {
            handleQuickSetupCompleted();
        }
_L2:
        return;
_L6:
        init();
        return;
_L4:
        if (j == 0)
        {
            finish();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Logger.i("AL_WidgetConfigurationActivity", "onClick(DialogInterface dialog, int which)");
        getData().setMetric(String.valueOf(i));
    }

    public void onClick(View view)
    {
        Logger.i("AL_WidgetConfigurationActivity", "onClick(View v)");
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("pref_open_at_launch", null) == null)
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putString("pref_open_at_launch", "0").commit();
        }
        if (!getWidgetIdMap().containsValue("-1"))
        {
            AccuAnalytics.logUiEvent(this, "GPS button clicked");
            finish("-1");
            return;
        } else
        {
            (new android.app.AlertDialog.Builder(mSelf)).setTitle(com.accuweather.android.R.string.Notice).setMessage(com.accuweather.android.R.string.ThisLocationAlreadyWidgetAssigned_YouCannotCreateAnotherOne).setNeutralButton(com.accuweather.android.R.string.OK, null).create().show();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Logger.i(this, (new StringBuilder()).append("onCreate id is ").append(getWidgetId()).toString());
        mAppWidgetId = getWidgetId();
        if (mAppWidgetId == 0)
        {
            finish();
        }
        mLocationRequester = new LocationRequester(this);
        if (Utilities.isAndroidLite())
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("is_from_android_lite", true).commit();
            showUnitDialog(this);
        }
    }

    public void onError(Exception exception)
    {
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onHomeLocationChanged()
    {
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (locationsearch == null)
        {
            return;
        }
        mLocationSearch = locationsearch;
        boolean flag = containsAutoCompleteRequest(list);
        list = buildTitleSpinnerAdapter(locationsearch, flag);
        list.setTextColor(getResources().getColor(com.accuweather.android.R.color.primary_text));
        mSearchView.setAdapter(list);
        if (flag || locationsearch.size() != 1)
        {
            mSearchView.showDropDown();
            return;
        } else
        {
            Logger.i(this, "handleSearchItemSelected, onLocationSearchCompleted");
            handleSearchItemSelected((LocationSearchResult)locationsearch.get(0));
            return;
        }
    }

    public void onLocationSelected(LocationModel locationmodel, int i)
    {
        Logger.i("AL_WidgetConfigurationActivity", "onLocationSelected()");
        getData().addLocation(locationmodel);
        finish(locationmodel.getKey());
    }

    public void onPause()
    {
        super.onPause();
        Logger.i(this);
        getData().unregisterWeatherDataListener(this);
    }

    public void onQueryChanged(String s)
    {
        if (s.length() > 0 && !s.matches(".*\\d.*"))
        {
            mLocationRequester.performAutoCompleteLocationSearch(s);
        }
    }

    public void onSearch(String s)
    {
        mLocationRequester.performCitySearch(s);
    }

    public void onSearchItemSelected(int i, Object obj)
    {
        Logger.i(this);
        if (mLocationSearch == null || mLocationSearch.size() <= i)
        {
            return;
        }
        if (((LocationSearchResult)mLocationSearch.get(i)).getEnglishName() == null || TextUtils.isEmpty(((LocationSearchResult)mLocationSearch.get(i)).getEnglishName()))
        {
            mLocationRequester.performLocationKeySearch(((LocationSearchResult)mLocationSearch.get(i)).getKey());
            return;
        } else
        {
            Logger.i(this, "handleSearchItemSelected, onSearchItemSelected");
            handleSearchItemSelected((LocationSearchResult)mLocationSearch.get(i));
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        Logger.i(this);
        comScore.setAppContext(this);
        comScore.setCustomerC2("6005068");
        comScore.setPublisherSecret("c7d1f7f9920e55503ee3470a942d6341");
        Intent intent = new Intent(this, getWidgetTermsAndConditionsActivity());
        intent.putExtras(buildExtras());
        startActivityForResult(intent, 200);
        mSelf = this;
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        Logger.i(this, "onWeatherCallCompleted");
    }

    public void onWidgetLocationSearchCompleted(LocationSearch locationsearch)
    {
    }

    public void onWidgetWeatherCallCompleted(List list)
    {
    }

    protected void saveWidgetData()
    {
        getData().saveResizableWidgetDimensionsMap();
        getData().saveResizableWidgetIdMap();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }




}
