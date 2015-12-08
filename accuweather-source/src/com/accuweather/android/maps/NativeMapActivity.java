// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.services.request.AsyncTaskCallback;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

// Referenced classes of package com.accuweather.android.maps:
//            AbsMapActivity, MapOverlayLayerManager, RetrieveOverlaysTask, MapOverlayMetadata, 
//            MapOverlayLayer

public class NativeMapActivity extends AbsMapActivity
    implements AsyncTaskCallback
{

    private static final int INITIAL_ZOOM_LEVEL = 7;
    private static final int PLAYBACK_FRAMERATE_MILLIS = 500;
    private Runnable mAnimationRunnable;
    private RetrieveOverlaysTask mRetrieveOverlaysTask;
    private MapOverlayLayerManager mapOverlayLayerManager;

    public NativeMapActivity()
    {
        mapOverlayLayerManager = new MapOverlayLayerManager(this);
        mAnimationRunnable = new Runnable() {

            final NativeMapActivity this$0;

            public void run()
            {
                mapOverlayLayerManager.animateMap();
                mPlayButton.postDelayed(mAnimationRunnable, 500L);
            }

            
            {
                this$0 = NativeMapActivity.this;
                super();
            }
        };
    }

    private void displayCanadaAttribution()
    {
        findViewById(com.accuweather.android.R.id.canada_branding).setVisibility(0);
    }

    private GoogleMap getMap()
    {
        SupportMapFragment supportmapfragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(com.accuweather.android.R.id.native_map);
        if (supportmapfragment != null)
        {
            return supportmapfragment.getMap();
        } else
        {
            return null;
        }
    }

    private boolean mapKeyIsShowing()
    {
        return PreferenceUtils.get(this, "map_key_showing", true);
    }

    private boolean notTabletAndOrientationIsPortrait()
    {
        return !Utilities.isScreenSizeLargeOrGreater(this) && !Utilities.isLandscape(this);
    }

    private void retrieveMapOverlays(GoogleMap googlemap)
    {
        if (mRetrieveOverlaysTask != null)
        {
            mRetrieveOverlaysTask.cancel(true);
        }
        mRetrieveOverlaysTask = new RetrieveOverlaysTask(googlemap, this, mapOverlayLayerManager, mWeatherDataModel.getGmtOffset());
        mRetrieveOverlaysTask.execute(new Void[0]);
    }

    protected void displayLayerExclusively(String s)
    {
        mapOverlayLayerManager.displayLayerExclusively(s);
    }

    protected void init()
    {
        super.init();
        findViewById(com.accuweather.android.R.id.native_map).setVisibility(0);
        mapOverlayLayerManager.clearOverlays();
        Object obj = new LatLng(0.0D, 0.0D);
        LatLng latlng = ((LatLng) (obj));
        if (mWeatherDataModel.getLatitude() != null)
        {
            latlng = ((LatLng) (obj));
            if (mWeatherDataModel.getLongitude() != null)
            {
                latlng = new LatLng(mWeatherDataModel.getLatitude().doubleValue(), mWeatherDataModel.getLongitude().doubleValue());
            }
        }
        obj = getMap();
        ((GoogleMap) (obj)).addMarker((new MarkerOptions()).position(latlng).title(mWeatherDataModel.getCityName()).icon(BitmapDescriptorFactory.fromResource(com.accuweather.android.R.drawable.map_marker)));
        ((GoogleMap) (obj)).moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 7F));
        setMapCompassPadding();
        mapOverlayLayerManager.initialize(mWeatherDataModel.getCountry());
        if (MapOverlayMetadata.CANRAD.getOverlayType().equals(getOverlayTypeToDisplay(mWeatherDataModel)))
        {
            displayCanadaAttribution();
        }
        retrieveMapOverlays(((GoogleMap) (obj)));
        startProgressBar();
    }

    public void onBackground()
    {
    }

    public void onBackgroundProcessingError(Exception exception)
    {
        onError(exception);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        setMapCompassPadding();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getSupportFragmentManager().findFragmentById(com.accuweather.android.R.id.native_map) == null)
        {
            bundle = SupportMapFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(com.accuweather.android.R.id.native_map, bundle).commit();
        }
    }

    public void onMapLoadComplete()
    {
        MapOverlayLayer mapoverlaylayer = mapOverlayLayerManager.getActiveLayer();
        if (mapoverlaylayer != null)
        {
            processMessage((new StringBuilder()).append("toggleTime").append(mapoverlaylayer.buildLatestTimestamp()).toString());
        }
        super.onMapLoadComplete();
    }

    public volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    public void onPostExecute(Void void1)
    {
        resetProgressBar();
        void1 = mapOverlayLayerManager.getActiveLayer();
        if (void1 == null)
        {
            mapOverlayLayerManager.showActiveLayer(getOverlayTypeToDisplay(mWeatherDataModel));
        } else
        {
            mapOverlayLayerManager.showActiveLayer(void1.getOverlayType());
        }
        onMapLoadComplete();
    }

    protected void playOverlayAnimation()
    {
        mPlayButton.postDelayed(mAnimationRunnable, 500L);
        setPauseIcon();
    }

    protected void setMapCompassPadding()
    {
        GoogleMap googlemap;
label0:
        {
            float f;
label1:
            {
                googlemap = getMap();
                if (googlemap != null)
                {
                    f = getResources().getDisplayMetrics().density;
                    if (!notTabletAndOrientationIsPortrait())
                    {
                        break label0;
                    }
                    if (!mapKeyIsShowing())
                    {
                        break label1;
                    }
                    googlemap.setPadding(0, (int)(146F * f + 0.5F), 0, 0);
                }
                return;
            }
            googlemap.setPadding(0, (int)(58F * f + 0.5F), 0, 0);
            return;
        }
        googlemap.setPadding(0, 0, 0, 0);
    }

    protected void setRadarAsActiveLayer()
    {
        super.setRadarAsActiveLayer();
        mapOverlayLayerManager.animateMapForCurrentFrame();
    }

    protected void setSatelliteAsActiveLayer()
    {
        super.setSatelliteAsActiveLayer();
        mapOverlayLayerManager.animateMapForCurrentFrame();
    }

    protected void stopOverlayAnimation()
    {
        mPlayButton.removeCallbacks(mAnimationRunnable);
        setPlayIcon();
    }

    protected void toggleMapKeyVisibility()
    {
        super.toggleMapKeyVisibility();
        setMapCompassPadding();
    }


}
