// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.accuweather.android.WeatherActivity;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.preferences.SettingsActivity;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.AdTrackingController;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.ImageBannerView;
import com.accuweather.android.views.MapsProgressBar;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.accuweather.android.maps:
//            MapListener, OverlayWebChromeClient, MapOverlayMetadata

public abstract class AbsMapActivity extends WeatherActivity
    implements MapListener
{

    private static boolean mIsKeyOn = false;
    private static boolean mIsPlaying = false;
    private static boolean mIsRadarOn = false;
    protected boolean mIsOverlayLayerExplicityChosen;
    private TextView mMapsTimestampTextView;
    private Menu mMenu;
    private MapsProgressBar mOverlayProgressBar;
    protected ImageButton mPlayButton;
    private ImageBannerView mRadarBannerView;
    private ImageBannerView mSatelliteBannerView;
    protected WeatherDataModel mWeatherDataModel;
    protected OverlayWebChromeClient mWebChromeClient;

    public AbsMapActivity()
    {
        mIsOverlayLayerExplicityChosen = false;
    }

    private void addPlaybackTouchListeners()
    {
        mPlayButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AbsMapActivity this$0;

            public void onClick(View view)
            {
                togglePlaybackAnimation();
            }

            
            {
                this$0 = AbsMapActivity.this;
                super();
            }
        });
        findViewById(com.accuweather.android.R.id.playback_layout).setOnTouchListener(new android.view.View.OnTouchListener() {

            final AbsMapActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getX() <= (float)(mPlayButton.getRight() + 10))
                {
                    mPlayButton.performClick();
                }
                return false;
            }

            
            {
                this$0 = AbsMapActivity.this;
                super();
            }
        });
    }

    private Spannable buildLeadingZeroTimestampSpannable(String s)
    {
        s = new SpannableStringBuilder((new StringBuilder()).append("0").append(s.substring(1)).toString());
        s.setSpan(new ForegroundColorSpan(Color.parseColor("#5C5C5C")), 0, 1, 0);
        return s;
    }

    private int getRadarKeyResourceId(String s)
    {
        boolean flag;
        if (s.equals("US") || s.equals("CA"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return com.accuweather.android.R.drawable.radar_key;
        } else
        {
            return com.accuweather.android.R.drawable.enhanced_radar_key;
        }
    }

    private int getSatelliteKeyResourceId(String s)
    {
        if ("US".equals(s))
        {
            return com.accuweather.android.R.drawable.us_satellite_key;
        } else
        {
            return com.accuweather.android.R.drawable.world_satellite_key;
        }
    }

    private void hideRadarKey()
    {
        findViewById(com.accuweather.android.R.id.radar_mapkey_info_view).setVisibility(8);
        mRadarBannerView.setVisibility(8);
    }

    private void hideWorldSatelliteKey()
    {
        findViewById(com.accuweather.android.R.id.satellite_mapkey_info_view).setVisibility(8);
        mSatelliteBannerView.setVisibility(8);
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
        actionbar.setTitle(getString(com.accuweather.android.R.string.Maps));
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
        actionbar.setIcon(com.accuweather.android.R.drawable.ic_actionbar_maps);
        setActionBarLocationNameSubtitle(actionbar);
    }

    private void initOverlaySettings()
    {
        if (!mIsOverlayLayerExplicityChosen)
        {
            mIsOverlayLayerExplicityChosen = true;
            if (shouldDisplayRadar())
            {
                setRadarAsActiveLayer();
            } else
            {
                setSatelliteAsActiveLayer();
            }
        } else
        if (mIsRadarOn)
        {
            setRadarAsActiveLayer();
        } else
        {
            setSatelliteAsActiveLayer();
        }
        mIsKeyOn = isOverlayKeyShowing();
    }

    private void initWebChromeClient()
    {
        mWebChromeClient = new OverlayWebChromeClient();
        mWebChromeClient.setActivity(this);
        mWebChromeClient.setMapListener(this);
        mWebChromeClient.setTwelveHourFormat(UserPreferences.isTwelveHourFormat(this));
    }

    private boolean isOverlayKeyShowing()
    {
        return PreferenceUtils.get(this, "map_key_showing", true);
    }

    private void logMenuItemSelectedAnalytics(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            AccuAnalytics.logUiEvent(this, "Home pressed");
        } else
        {
            if (menuitem.getItemId() == com.accuweather.android.R.id.map_key_on)
            {
                AccuAnalytics.logUiEvent(this, "Map key turned on");
                return;
            }
            if (menuitem.getItemId() == com.accuweather.android.R.id.map_key_off)
            {
                AccuAnalytics.logUiEvent(this, "Map key turned off");
                return;
            }
            if (menuitem.getItemId() == com.accuweather.android.R.id.satellite_overlay)
            {
                AccuAnalytics.logUiEvent(this, "Satellite selected");
                return;
            }
            if (menuitem.getItemId() == com.accuweather.android.R.id.radar_overlay)
            {
                AccuAnalytics.logUiEvent(this, "Radar selected");
                return;
            }
            if (menuitem.getItemId() == com.accuweather.android.R.id.refresh)
            {
                AccuAnalytics.logUiEvent(this, "Manual refresh");
                return;
            }
            if (menuitem.getItemId() == com.accuweather.android.R.id.settings)
            {
                AccuAnalytics.logUiEvent(this, "Settings");
                return;
            }
        }
    }

    private void mapKeyOff()
    {
        mMenu.setGroupVisible(com.accuweather.android.R.id.map_key_off_group, false);
        mIsKeyOn = false;
        saveMapKeyShowingPreference();
        toggleMapKeyVisibility();
    }

    private void mapKeyOn()
    {
        mMenu.setGroupVisible(com.accuweather.android.R.id.map_key_on_group, false);
        mIsKeyOn = true;
        saveMapKeyShowingPreference();
        toggleMapKeyVisibility();
    }

    private void prepareMenu()
    {
label0:
        {
            boolean flag1 = true;
            if (mMenu != null)
            {
                mMenu.setGroupVisible(com.accuweather.android.R.id.map_key_off_group, mIsKeyOn);
                Menu menu = mMenu;
                int i = com.accuweather.android.R.id.map_key_on_group;
                boolean flag;
                if (!mIsKeyOn)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menu.setGroupVisible(i, flag);
                if (!shouldDisplayRadar())
                {
                    break label0;
                }
                mMenu.setGroupVisible(com.accuweather.android.R.id.satellite_on_group, mIsRadarOn);
                menu = mMenu;
                i = com.accuweather.android.R.id.radar_on_group;
                if (!mIsRadarOn)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                menu.setGroupVisible(i, flag);
            }
            return;
        }
        mMenu.setGroupVisible(com.accuweather.android.R.id.satellite_on_group, false);
        mMenu.setGroupVisible(com.accuweather.android.R.id.radar_on_group, false);
    }

    private void radarOverlaySelected()
    {
        mMenu.setGroupVisible(com.accuweather.android.R.id.radar_on_group, false);
        setRadarAsActiveLayer();
        if (mIsKeyOn)
        {
            toggleMapKeyVisibility();
        }
    }

    private void refresh()
    {
        if (mIsPlaying)
        {
            togglePlaybackAnimation();
        }
        init();
    }

    private void resizeMapKey()
    {
        Object obj;
label0:
        {
            obj = findViewById(com.accuweather.android.R.id.outer_map_key_view);
            if (obj != null)
            {
                obj = ((View) (obj)).getLayoutParams();
                if (obj != null)
                {
                    int i = getResources().getConfiguration().orientation;
                    if (!Utilities.isScreenSizeLargeOrGreater(this) && i != 2)
                    {
                        break label0;
                    }
                    obj.width = (int)(320F * getResources().getDisplayMetrics().density);
                }
            }
            return;
        }
        obj.width = -1;
    }

    private void satelliteOverlaySelected()
    {
        mMenu.setGroupVisible(com.accuweather.android.R.id.satellite_on_group, false);
        setSatelliteAsActiveLayer();
        if (mIsKeyOn)
        {
            toggleMapKeyVisibility();
        }
    }

    private void saveMapKeyShowingPreference()
    {
        PreferenceUtils.save(this, "map_key_showing", mIsKeyOn);
    }

    private void setActionBarLocationNameSubtitle(ActionBar actionbar)
    {
        if (mWeatherDataModel != null)
        {
            LocationModel locationmodel = getData().getLocationFromKey(mWeatherDataModel.getLocationKey());
            if (locationmodel != null)
            {
                actionbar.setSubtitle(locationmodel.getAliasedName());
            }
        }
    }

    private boolean shouldDisplayRadar()
    {
        return MapOverlayMetadata.isRadarAvailable(mWeatherDataModel.getCountry());
    }

    private void showPlaybackView()
    {
        findViewById(com.accuweather.android.R.id.playback_layout).setVisibility(0);
    }

    private void showRadarKey()
    {
        findViewById(com.accuweather.android.R.id.radar_mapkey_info_view).setVisibility(0);
        mRadarBannerView.setVisibility(0);
    }

    private void showWorldSatelliteKey()
    {
        findViewById(com.accuweather.android.R.id.satellite_mapkey_info_view).setVisibility(0);
        mSatelliteBannerView.setVisibility(0);
    }

    private void togglePlaybackAnimation()
    {
        boolean flag;
        if (!mIsPlaying)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsPlaying = flag;
        if (mIsPlaying)
        {
            playOverlayAnimation();
            return;
        } else
        {
            stopOverlayAnimation();
            return;
        }
    }

    private void updateAds()
    {
        AdTrackingController adtrackingcontroller = new AdTrackingController();
        if (getData().getCurrentFollowMeLocation() == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        adtrackingcontroller.setWeatherDataModel(getData().getWeatherDataModelFromCode(getData().getCurrentFollowMeLocation().getLocKey()));
        adtrackingcontroller.setGpsWeather(true);
_L1:
        adtrackingcontroller.setSelectedPage(MainContentPage.Maps);
        adtrackingcontroller.setDetailsSection(true);
        updateAdParameters(adtrackingcontroller);
        requestNewAd();
        return;
        try
        {
            adtrackingcontroller.setWeatherDataModel(getData().getCurrentlyViewedWeatherDataModel());
            adtrackingcontroller.setGpsWeather(false);
        }
        catch (Exception exception)
        {
            return;
        }
          goto _L1
    }

    protected abstract void displayLayerExclusively(String s);

    protected final String getOverlayTypeToDisplay(WeatherDataModel weatherdatamodel)
    {
        if (mIsOverlayLayerExplicityChosen)
        {
            if (mIsRadarOn)
            {
                return MapOverlayMetadata.getRadarDisplayType(mWeatherDataModel.getCountry());
            } else
            {
                return MapOverlayMetadata.getSatelliteDisplayType(mWeatherDataModel.getCountry());
            }
        } else
        {
            return MapOverlayMetadata.getBestOverlayTypeForCountry(weatherdatamodel.getCountry());
        }
    }

    protected void init()
    {
        mWeatherDataModel = getData().getCurrentlyViewedWeatherDataModel();
        getData().init();
        initWebChromeClient();
        mMapsTimestampTextView = (TextView)findViewById(com.accuweather.android.R.id.maps_timestamp_tv);
        mMapsTimestampTextView.setTypeface(Data.getRobotoNormal());
        mPlayButton = (ImageButton)findViewById(com.accuweather.android.R.id.maps_play_button);
        addPlaybackTouchListeners();
        mSatelliteBannerView = (ImageBannerView)findViewById(com.accuweather.android.R.id.satellite_overlay_key_view);
        mSatelliteBannerView.setImage(getSatelliteKeyResourceId(mWeatherDataModel.getCountry()));
        mRadarBannerView = (ImageBannerView)findViewById(com.accuweather.android.R.id.radar_overlay_key_view);
        mRadarBannerView.setImage(getRadarKeyResourceId(mWeatherDataModel.getCountry()));
        mOverlayProgressBar = (MapsProgressBar)findViewById(com.accuweather.android.R.id.maps_progress);
        findViewById(com.accuweather.android.R.id.canada_branding).setVisibility(4);
        mIsPlaying = false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        resizeMapKey();
        updateAds();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.accuweather.android.R.layout.maps_fullscreen);
        resizeMapKey();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(com.accuweather.android.R.menu.mapdetails_overflow_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onFrameUpdate(String s, int i, int j)
    {
        String s1 = s;
        Object obj = s1;
        if (s.startsWith(" "))
        {
            obj = s1;
            if (s.length() > 1)
            {
                obj = buildLeadingZeroTimestampSpannable(s);
            }
        }
        mMapsTimestampTextView.setText(((CharSequence) (obj)));
        j = mOverlayProgressBar.getMaxProgressValue() / j;
        mOverlayProgressBar.setProgress(j * i);
    }

    public void onMapLoadComplete()
    {
        initOverlaySettings();
        showPlaybackView();
        toggleMapKeyVisibility();
        prepareMenu();
        updateAds();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        logMenuItemSelectedAnalytics(menuitem);
        if (menuitem.getItemId() != 0x102002c) goto _L2; else goto _L1
_L1:
        getData().clearTaskQueue();
        finish();
_L4:
        return super.onMenuItemSelected(i, menuitem);
_L2:
        if (menuitem.getItemId() == com.accuweather.android.R.id.map_key_on)
        {
            mapKeyOn();
        } else
        if (menuitem.getItemId() == com.accuweather.android.R.id.map_key_off)
        {
            mapKeyOff();
        } else
        if (menuitem.getItemId() == com.accuweather.android.R.id.satellite_overlay)
        {
            satelliteOverlaySelected();
        } else
        if (menuitem.getItemId() == com.accuweather.android.R.id.radar_overlay)
        {
            radarOverlaySelected();
        } else
        if (menuitem.getItemId() == com.accuweather.android.R.id.refresh)
        {
            refresh();
        } else
        if (menuitem.getItemId() == com.accuweather.android.R.id.settings)
        {
            startActivity(new Intent(this, com/accuweather/android/preferences/SettingsActivity));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onNoConnectionPositiveClick()
    {
        finish();
    }

    public void onOpacityChanged(int i)
    {
    }

    public void onPause()
    {
        super.onPause();
        stopOverlayAnimation();
        saveMapKeyShowingPreference();
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        mMenu = menu;
        if (!Utilities.shouldShowGpsButton(this))
        {
            mMenu.removeItem(com.accuweather.android.R.id.gps);
        }
        prepareMenu();
        return super.onPrepareOptionsMenu(menu);
    }

    public void onStart()
    {
        super.onStart();
        init();
        initActionBar();
    }

    protected void onWeatherTimeoutPositiveClick()
    {
        init();
    }

    protected abstract void playOverlayAnimation();

    public void processMessage(String s)
    {
        mWebChromeClient.processMessage(s);
    }

    protected final void setPauseIcon()
    {
        mPlayButton.setImageResource(com.accuweather.android.R.drawable.pause);
    }

    protected final void setPlayIcon()
    {
        mPlayButton.setImageResource(com.accuweather.android.R.drawable.play);
    }

    protected void setRadarAsActiveLayer()
    {
        mIsRadarOn = true;
        mRadarBannerView.setImage(getRadarKeyResourceId(mWeatherDataModel.getCountry()));
        displayLayerExclusively(MapOverlayMetadata.getRadarDisplayType(mWeatherDataModel.getCountry()));
    }

    protected void setSatelliteAsActiveLayer()
    {
        mIsRadarOn = false;
        mSatelliteBannerView.setImage(getSatelliteKeyResourceId(mWeatherDataModel.getCountry()));
        displayLayerExclusively(MapOverlayMetadata.getSatelliteDisplayType(mWeatherDataModel.getCountry()));
    }

    protected abstract void stopOverlayAnimation();

    protected void toggleMapKeyVisibility()
    {
        if (mIsKeyOn)
        {
            if (mIsRadarOn)
            {
                showRadarKey();
                hideWorldSatelliteKey();
                return;
            } else
            {
                showWorldSatelliteKey();
                hideRadarKey();
                return;
            }
        } else
        {
            hideRadarKey();
            hideWorldSatelliteKey();
            return;
        }
    }


}
