// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.accuweather.android.adapters.TitleSpinnerAdapter;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.request.LocationAutoCompleteRequest;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.SimpleSearchView;
import com.accuweather.android.views.TutorialProgressStrip;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            SetupActivity, LoadingScreenActivity

public class LocationActivity extends SetupActivity
    implements android.view.View.OnClickListener, com.accuweather.android.views.SimpleSearchView.ISearchViewListener
{

    private static final String ALPHABETIC_QUERY_REGEX = ".*\\d.*";
    private String mLocCodeFromBundle;
    private String mLocationAddedByUser;
    private LocationRequester mLocationRequester;
    private LocationSearch mLocationSearch;
    private MainContentPage mMainContentPageToLaunch;
    private SimpleSearchView mSearchView;
    private boolean mShouldAddADefaultLocation;

    public LocationActivity()
    {
        mLocCodeFromBundle = "";
        mMainContentPageToLaunch = MainContentPage.Now;
        mLocationAddedByUser = "";
    }

    private void completed(boolean flag)
    {
        Intent intent = (new Intent(this, com/accuweather/android/LoadingScreenActivity)).addFlags(0x4000000);
        if (!TextUtils.isEmpty(mLocCodeFromBundle))
        {
            intent.putExtra("location_code", mLocCodeFromBundle).putExtra("page_index_from_widget", mMainContentPageToLaunch);
        }
        if (flag)
        {
            intent.putExtra("is_gps", true);
        }
        startActivity(intent);
        finish();
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

    private void handleSearchItemSelected(LocationSearchResult locationsearchresult)
    {
        getData().addLocation(locationsearchresult.toLocationModel());
        mSearchView.clearInput();
        PreferenceUtils.save(this, "pref_open_at_launch", "1");
        if (mShouldAddADefaultLocation)
        {
            mShouldAddADefaultLocation = false;
            mLocationAddedByUser = locationsearchresult.getKey();
            Logger.i(this, (new StringBuilder()).append("Handle search item selected should add default ").append(mLocationAddedByUser).toString());
            loadDefaultLocation();
            return;
        }
        getData().setLocationExplicitlyAdded(true);
        Intent intent = new Intent(this, com/accuweather/android/LoadingScreenActivity);
        if (TextUtils.isEmpty(mLocationAddedByUser))
        {
            mLocationAddedByUser = locationsearchresult.getKey();
        }
        Logger.i(this, (new StringBuilder()).append("Handle search item selected shouldn't add default ").append(mLocationAddedByUser).toString());
        intent.putExtra("location_code", mLocationAddedByUser);
        startActivity(intent);
        finish();
    }

    private void init()
    {
        setContentView(R.layout.choose_location);
        TutorialProgressStrip tutorialprogressstrip = (TutorialProgressStrip)findViewById(R.id.tutorialProgressIndicator);
        if (tutorialprogressstrip != null)
        {
            tutorialprogressstrip.showNumberOfProgressStripCells(5);
            tutorialprogressstrip.setTutorialPageIndex(4);
        }
        ((TextView)findViewById(R.id.use_gps)).setText(R.string.MyCurrentLocation);
        findViewById(R.id.use_gps).setOnClickListener(this);
        mSearchView = (SimpleSearchView)findViewById(R.id.search_view);
        mSearchView.setSearchViewListener(this);
        Utilities.setTypeFace(findViewById(R.id.use_gps).getRootView(), Data.getRobotoCondensed());
        if (!Utilities.shouldShowGpsButton(this))
        {
            ((LinearLayout)findViewById(R.id.my_location_ll)).setVisibility(8);
        }
        if (Utilities.isLandscape(this) && !Utilities.isScreenSizeLargeOrGreater(this))
        {
            TextView textview = (TextView)findViewById(R.id.chooseLocationTextView);
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        }
        hideActionBar();
    }

    private void loadDefaultLocation()
    {
        mLocationRequester.performLocationKeySearch("");
    }

    private boolean shouldAddADefaultLocation()
    {
        boolean flag1 = PartnerCoding.isDefaultLocationPreload(this);
        boolean flag;
        if (!getData().hasDefaultLocationBeenAdded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag;
    }

    private boolean shouldMoveToNextScreen()
    {
        return getData().doV2LocationsExist() || Data.getInstance(this).hasLocation() || shouldAddADefaultLocation();
    }

    public int describeContents()
    {
        return 0;
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.use_gps)
        {
            PreferenceUtils.save(this, "pref_open_at_launch", "0");
            completed(true);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Logger.i(this);
        Data.getInstance(this).setCurrentFollowMeLocation(null);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("page_index_from_widget"))
            {
                mMainContentPageToLaunch = (MainContentPage)bundle.getSerializable("page_index_from_widget");
            }
            mLocCodeFromBundle = bundle.getString("location_code");
        }
        mShouldAddADefaultLocation = shouldAddADefaultLocation();
        if (mShouldAddADefaultLocation)
        {
            mLocCodeFromBundle = "";
        }
        mLocationRequester = new LocationRequester(this);
        if (shouldMoveToNextScreen())
        {
            Logger.i(this, "Moving to the next screen");
            completed(false);
            return;
        } else
        {
            Logger.i(this, "init");
            init();
            return;
        }
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (locationsearch == null)
        {
            return;
        }
        mLocationSearch = locationsearch;
        boolean flag1 = containsAutoCompleteRequest(list);
        int i = R.layout.spinner_dropdown_item;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list = new TitleSpinnerAdapter(this, i, Utilities.buildHtmlifiedLocationFullNames(this, locationsearch, flag));
        list.setTextColor(getResources().getColor(R.color.primary_text));
        mSearchView.setAdapter(list);
        if (flag1 || locationsearch.size() != 1)
        {
            mSearchView.showDropDown();
            return;
        } else
        {
            handleSearchItemSelected((LocationSearchResult)locationsearch.get(0));
            return;
        }
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
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
        if (mLocationSearch == null || mLocationSearch.size() <= i)
        {
            return;
        } else
        {
            mLocationRequester.performLocationKeySearch(((LocationSearchResult)mLocationSearch.get(i)).getKey());
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (!BackgroundImages.getInstance(this).isLoaded())
        {
            startDownloadService();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }
}
