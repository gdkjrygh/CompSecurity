// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.skype.Message;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.widget.SymbolView;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.location:
//            FineLocationSource, LocationUtil

public class ReceivedLocationActivity extends SkypeActivity
    implements com.google.android.gms.maps.c.a
{

    public static final String IS_FROM_ME = "isFromMe";
    private static final int REQUEST_CHECK_SETTINGS = 1;
    private static final String STATE_MAP_ADDR_VISIBLE = "stateAddressVisible";
    private static final String STATE_MAP_LAT = "stateMapLat";
    private static final String STATE_MAP_LNG = "stateMapLng";
    private static final String STATE_MAP_ZOOM = "stateMapZoom";
    private static final String STATE_ZOOM_VIEW = "stateZoomView";
    private static final int ZOOM_LEVEL = 17;
    private static final int ZOOM_OUT_PADDING = 50;
    private static final Logger log = Logger.getLogger("ReceivedLocationActivity");
    ActionBarCustomizer actionBarCustomizer;
    private ViewGroup addressView;
    private b googleMap;
    private boolean initialZoomViewState;
    private boolean isOnLocationReceived;
    private boolean isZoomViewClicked;
    private FineLocationSource locationSource;
    private LocationUtil locationUtil;
    ObjectIdMap map;
    Navigation navigation;
    private LatLng receivedLatLng;
    private com.skype.Message.GetLocation_Result receivedLocation;
    private a savedCamera;
    private Animation slideDownAnimation;
    private Animation slideInAnimation;
    private SymbolView toggleZoomView;

    public ReceivedLocationActivity()
    {
    }

    private void displayResolution()
    {
        Status status = locationSource.getLocationSettingsStatus();
        if (status == null)
        {
            return;
        }
        try
        {
            status.a(this);
            return;
        }
        catch (android.content.IntentSender.SendIntentException sendintentexception)
        {
            log.warning((new StringBuilder("Cannot display location settings resolver: ")).append(sendintentexception.getMessage()).toString());
        }
    }

    private String getContactNameFromIntent()
    {
        int i = getIntent().getIntExtra("com.skype.objId", -1);
        if (i == -1)
        {
            return null;
        } else
        {
            return ((Message)map.a(i, com/skype/Message)).getAuthorDisplaynameProp();
        }
    }

    private com.skype.Message.GetLocation_Result getLocationFromIntent()
    {
        int i = getIntent().getIntExtra("com.skype.objId", -1);
        com.skype.Message.GetLocation_Result getlocation_result;
        if (i == -1)
        {
            getlocation_result = null;
        } else
        {
            com.skype.Message.GetLocation_Result getlocation_result1 = ((Message)map.a(i, com/skype/Message)).getLocation();
            getlocation_result = getlocation_result1;
            if (!getlocation_result1.m_return)
            {
                return null;
            }
        }
        return getlocation_result;
    }

    private boolean isFromMe()
    {
        return getIntent().getBooleanExtra("isFromMe", false);
    }

    private boolean isResolutionRequired()
    {
        Status status = locationSource.getLocationSettingsStatus();
        return googleMap.e() == null && status != null && status.e() == 6;
    }

    private void onZoomViewClick()
    {
        if (!toggleZoomView.isSelected())
        {
            zoomOut();
            return;
        } else
        {
            zoomOnReceivedLocation();
            return;
        }
    }

    private void setActionBartitle()
    {
        lifecycleSupport.addListener(actionBarCustomizer);
        String s = getContactNameFromIntent();
        if (TextUtils.isEmpty(s))
        {
            actionBarCustomizer.setTitleWithRecents(getResources().getString(0x7f080359));
        } else
        {
            s = String.format(getResources().getString(0x7f080357), new Object[] {
                s
            });
            actionBarCustomizer.setTitleWithRecents(s);
        }
        getSupportActionBar().b(true);
    }

    private void setAddressView()
    {
        ((TextView)findViewById(0x7f1004de)).setText(locationUtil.getAddressString(receivedLocation, 2));
        addressView = (ViewGroup)findViewById(0x7f1004dd);
        addressView.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceivedLocationActivity this$0;

            public final void onClick(View view)
            {
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
    }

    private void setAnimations()
    {
        slideInAnimation = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040006);
        slideInAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final ReceivedLocationActivity this$0;

            public final void onAnimationEnd(Animation animation)
            {
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
                addressView.setVisibility(0);
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040008);
        slideDownAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final ReceivedLocationActivity this$0;

            public final void onAnimationEnd(Animation animation)
            {
                addressView.setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
    }

    private void setDirectionView()
    {
        SymbolView symbolview = (SymbolView)findViewById(0x7f1004df);
        symbolview.setScaleX(-1F);
        symbolview.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceivedLocationActivity this$0;

            public final void onClick(View view)
            {
                navigation.openDirectionInExternalApp((float)receivedLatLng.a, (float)receivedLatLng.b);
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
    }

    private void setUpMap()
    {
        locationSource = new FineLocationSource(this);
        locationSource.activate(this);
        googleMap.a(locationSource);
        googleMap.d();
        googleMap.f().a();
        int i = getResources().getDimensionPixelSize(0x7f0c01d5);
        android.graphics.Bitmap bitmap = locationUtil.getReceivedMarker(this, i, isFromMe());
        googleMap.a((new MarkerOptions()).a(receivedLatLng).a(BitmapDescriptorFactory.fromBitmap(bitmap)));
        googleMap.a(new com.google.android.gms.maps.b.d() {

            final ReceivedLocationActivity this$0;

            public final boolean onMarkerClick(com.google.android.gms.maps.model.b b1)
            {
                zoomOnReceivedLocation();
                return true;
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
        isOnLocationReceived = true;
        if (savedCamera != null)
        {
            googleMap.a(savedCamera);
        } else
        {
            googleMap.a(CameraUpdateFactory.newLatLngZoom(receivedLatLng, 17F));
        }
        googleMap.a(new com.google.android.gms.maps.b.c() {

            final ReceivedLocationActivity this$0;

            public final void onMapClick(LatLng latlng)
            {
                addressView.setVisibility(8);
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
        googleMap.a(new com.google.android.gms.maps.b.b() {

            final ReceivedLocationActivity this$0;

            public final void onCameraChange(CameraPosition cameraposition)
            {
                if (!isOnLocationReceived) goto _L2; else goto _L1
_L1:
                if (addressView.getVisibility() == 8)
                {
                    addressView.startAnimation(slideInAnimation);
                }
_L4:
                isOnLocationReceived = false;
                return;
_L2:
                if (addressView.getVisibility() == 0)
                {
                    addressView.startAnimation(slideDownAnimation);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
    }

    private void setUpMapIfNeeded()
    {
        if (googleMap == null)
        {
            googleMap = ((SupportMapFragment)getSupportFragmentManager().a(0x7f1004dc)).getMap();
            setAnimations();
            setDirectionView();
            setZoomView();
            setAddressView();
            if (googleMap != null)
            {
                setUpMap();
            }
        }
    }

    private void setZoomView()
    {
        toggleZoomView = (SymbolView)findViewById(0x7f1004e0);
        updateZoomSymbolView(initialZoomViewState);
        toggleZoomView.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceivedLocationActivity this$0;

            public final void onClick(View view)
            {
                if (isResolutionRequired())
                {
                    displayResolution();
                    isZoomViewClicked = true;
                    return;
                } else
                {
                    onZoomViewClick();
                    return;
                }
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
    }

    private void updateZoomSymbolView(boolean flag)
    {
        if (flag)
        {
            toggleZoomView.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bM);
        } else
        {
            toggleZoomView.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bL);
        }
        toggleZoomView.setSelected(flag);
    }

    private void zoomOnReceivedLocation()
    {
        CameraPosition cameraposition = (new com.google.android.gms.maps.model.CameraPosition.a()).a(receivedLatLng).a(17F).a();
        googleMap.a(CameraUpdateFactory.newCameraPosition(cameraposition), new com.google.android.gms.maps.b.a() {

            final ReceivedLocationActivity this$0;

            public final void onCancel()
            {
            }

            public final void onFinish()
            {
                isOnLocationReceived = true;
            }

            
            {
                this$0 = ReceivedLocationActivity.this;
                super();
            }
        });
        updateZoomSymbolView(false);
    }

    private void zoomOut()
    {
        Object obj = getResources();
        Object obj1 = googleMap.e();
        if (obj1 != null)
        {
            obj1 = new LatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude());
            LocationUtil locationutil = locationUtil;
            LatLng latlng = receivedLatLng;
            obj = ((Resources) (obj)).getDisplayMetrics();
            obj = locationutil.getCameraUpdateWithLocations(new LatLng[] {
                latlng, obj1
            }, ((android.util.DisplayMetrics) (obj)), 50);
            googleMap.b(((a) (obj)));
            updateZoomSymbolView(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        getComponent().inject(this);
        super.onCreate(bundle);
        setContentView(0x7f0300ed);
        receivedLocation = getLocationFromIntent();
        if (receivedLocation == null)
        {
            log.warning("started without location message");
            finish();
            return;
        }
        setActionBartitle();
        if (bundle != null)
        {
            double d = bundle.getDouble("stateMapLat", -1D);
            double d1 = bundle.getDouble("stateMapLng", -1D);
            float f = bundle.getFloat("stateMapZoom", -1F);
            if (d != -1D && d1 != -1D && f != -1F)
            {
                savedCamera = CameraUpdateFactory.newLatLngZoom(new LatLng(d, d1), f);
            }
            isOnLocationReceived = bundle.getBoolean("stateAddressVisible", false);
            initialZoomViewState = bundle.getBoolean("stateZoomView", false);
        }
        locationUtil = new LocationUtil();
        receivedLatLng = new LatLng((float)receivedLocation.m_latitude / 1000000F, (float)receivedLocation.m_longitude / 1000000F);
        setUpMapIfNeeded();
    }

    public void onLocationChanged(Location location)
    {
        if (isZoomViewClicked)
        {
            onZoomViewClick();
            isZoomViewClicked = false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    protected void onPause()
    {
        locationSource.deactivate();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putDouble("stateMapLat", googleMap.b().a.a);
        bundle.putDouble("stateMapLng", googleMap.b().a.b);
        bundle.putFloat("stateMapZoom", googleMap.b().b);
        boolean flag;
        if (addressView.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("stateAddressVisible", flag);
        bundle.putBoolean("stateZoomView", toggleZoomView.isSelected());
        super.onSaveInstanceState(bundle);
    }





/*
    static boolean access$202(ReceivedLocationActivity receivedlocationactivity, boolean flag)
    {
        receivedlocationactivity.isZoomViewClicked = flag;
        return flag;
    }

*/





/*
    static boolean access$502(ReceivedLocationActivity receivedlocationactivity, boolean flag)
    {
        receivedlocationactivity.isOnLocationReceived = flag;
        return flag;
    }

*/




}
