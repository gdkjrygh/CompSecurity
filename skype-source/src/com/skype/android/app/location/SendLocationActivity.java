// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.l;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.skype.Conversation;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.animation.SkypeMultiPropertyAnimatorSet;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.event.EventBus;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.location:
//            LocationUtil, SendLocationAnimator, MapFragmentTouchable, FineLocationSource

public class SendLocationActivity extends SkypeActivity
    implements h, com.google.android.gms.maps.c.a
{
    public static class AddressRetrieverResult
    {

        private final Address address;
        private final LatLng latLng;

        public Address getAddress()
        {
            return address;
        }

        public LatLng getLatLng()
        {
            return latLng;
        }

        public AddressRetrieverResult(LatLng latlng, Address address1)
        {
            latLng = latlng;
            address = address1;
        }
    }

    private static final class a extends AsyncTask
    {

        private final EventBus bus;
        private final Context context;

        protected final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((LatLng[])aobj);
        }

        protected final transient Void doInBackground(LatLng alatlng[])
        {
            LatLng latlng;
            Object obj;
            if (alatlng == null || alatlng.length == 0)
            {
                return null;
            }
            latlng = alatlng[0];
            obj = new Geocoder(context);
            alatlng = null;
            obj = ((Geocoder) (obj)).getFromLocation(latlng.a, latlng.b, 1);
            if (!((List) (obj)).isEmpty())
            {
                alatlng = (Address)((List) (obj)).get(0);
            }
            bus.a(new AddressRetrieverResult(latlng, alatlng));
            return null;
            alatlng;
            SendLocationActivity.log.warning((new StringBuilder("Cannot resolve address: ")).append(alatlng).toString());
            bus.a(new AddressRetrieverResult(latlng, null));
            return null;
            alatlng;
            bus.a(new AddressRetrieverResult(latlng, null));
            return null;
        }

        public a(Activity activity, EventBus eventbus)
        {
            context = activity;
            bus = eventbus;
        }
    }


    private static final String LEGACY_MESSAGE = "<a href=\"https://www.bing.com/maps/default.aspx?cp=%1$s~%2$s&amp;dir=0&amp;style=r&amp;lvl=15&amp;where1=%1$s,%2$s&amp;name=%3$s\">%4$s</a>";
    private static final int MESSAGE_PANNING_STOPPED = 1;
    private static final int REQUEST_CHECK_SETTINGS = 1;
    private static final String STATE_CENTERED_ON_LOCATION = "stateCenteredOnLocation";
    private static final int STOPPED_TIMER = 1000;
    private static final int ZOOM_LEVEL = 17;
    private static final Logger log = Logger.getLogger("SendLocationActivity");
    ActionBarCustomizer actionBarCustomizer;
    private AsyncTask addressRetriever;
    private TextView addressTextView;
    private ViewGroup addressView;
    Analytics analytics;
    private SendLocationAnimator animator;
    EventBus bus;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    private AddressRetrieverResult currentAddress;
    private Location currentLocation;
    private b googleMap;
    private Handler handler;
    private boolean isCenteredOnLocation;
    private boolean isPinUp;
    private ProgressCircleView loading;
    private FineLocationSource locationSource;
    private LocationUtil locationUtil;
    ObjectIdMap map;

    public SendLocationActivity()
    {
    }

    private void displayResolution(LocationSettingsResult locationsettingsresult)
    {
        locationsettingsresult = locationsettingsresult.getStatus();
        if (locationsettingsresult == null)
        {
            return;
        }
        try
        {
            locationsettingsresult.a(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationSettingsResult locationsettingsresult)
        {
            log.warning((new StringBuilder("Cannot display location settings resolver: ")).append(locationsettingsresult.getMessage()).toString());
        }
    }

    private String getAddress(AddressRetrieverResult addressretrieverresult, int i)
    {
        Object obj = addressretrieverresult.getAddress();
        if (obj == null)
        {
            addressretrieverresult = getResources().getString(0x7f080356);
        } else
        if (isCurrentLatLng(addressretrieverresult))
        {
            obj = locationUtil.getAddressString(((Address) (obj)), i);
            addressretrieverresult = ((AddressRetrieverResult) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return getResources().getString(0x7f080356);
            }
        } else
        {
            return null;
        }
        return addressretrieverresult;
    }

    private Conversation getConversation()
    {
        int i = getIntent().getIntExtra("com.skype.objId", -1);
        if (i == -1)
        {
            return null;
        } else
        {
            return (Conversation)map.a(i, com/skype/Conversation);
        }
    }

    private String getLegacyMessage(AddressRetrieverResult addressretrieverresult)
    {
        String s = getAddress(addressretrieverresult, 1);
        return String.format("<a href=\"https://www.bing.com/maps/default.aspx?cp=%1$s~%2$s&amp;dir=0&amp;style=r&amp;lvl=15&amp;where1=%1$s,%2$s&amp;name=%3$s\">%4$s</a>", new Object[] {
            Double.valueOf(addressretrieverresult.getLatLng().a), Double.valueOf(addressretrieverresult.getLatLng().b), URLEncoder.encode(s), s
        });
    }

    private boolean isCurrentLatLng(AddressRetrieverResult addressretrieverresult)
    {
        if (addressretrieverresult == null)
        {
            return false;
        } else
        {
            return googleMap.b().a.equals(addressretrieverresult.getLatLng());
        }
    }

    private boolean isResolutionRequired(LocationSettingsResult locationsettingsresult)
    {
        locationsettingsresult = locationsettingsresult.getStatus();
        return locationsettingsresult != null && locationsettingsresult.e() == 6;
    }

    private void setActionBartitle()
    {
        lifecycleSupport.addListener(actionBarCustomizer);
        String s = conversationUtil.m(conversation).toString();
        if (TextUtils.isEmpty(s))
        {
            actionBarCustomizer.setTitleWithRecents(getResources().getString(0x7f080359));
        } else
        {
            s = String.format(getResources().getString(0x7f080358), new Object[] {
                s
            });
            actionBarCustomizer.setTitleWithRecents(s);
        }
        getSupportActionBar().b(true);
    }

    private void setAddressView()
    {
        addressView = (ViewGroup)findViewById(0x7f1004dd);
        addressView.setOnClickListener(new android.view.View.OnClickListener() {

            final SendLocationActivity this$0;

            public final void onClick(View view)
            {
            }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
        });
        addressTextView = (TextView)findViewById(0x7f1004de);
    }

    private void setAnimations()
    {
        loading = (ProgressCircleView)findViewById(0x7f100510);
        animator = new SendLocationAnimator(findViewById(0x7f10050d), findViewById(0x7f10050c));
    }

    private void setSendButton()
    {
        ((SymbolView)findViewById(0x7f10050f)).setOnClickListener(new android.view.View.OnClickListener() {

            final SendLocationActivity this$0;

            public final void onClick(View view)
            {
                if (isCurrentLatLng(currentAddress))
                {
                    view = currentAddress.getLatLng();
                    float f = 0.0F;
                    if (isCenteredOnLocation)
                    {
                        f = googleMap.e().getAccuracy() * 10F;
                    }
                    conversation.postLocationMessage((int)(((LatLng) (view)).a * 1000000D), (int)(((LatLng) (view)).b * 1000000D), 0, (int)f, 0, 0, 0, (int)(System.currentTimeMillis() / 1000L), getAddress(currentAddress, 1), "", getLegacyMessage(currentAddress));
                    view = new SkypeTelemetryEvent(KpiEvent.b);
                    view.put(KpiAttributeName.l, KpiAttributeValue.d);
                    analytics.a(view);
                    finish();
                }
            }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
        });
    }

    private void setUpMap()
    {
        googleMap.a(locationSource);
        googleMap.d();
        googleMap.f().a();
        googleMap.a(new com.google.android.gms.maps.b.b() {

            final SendLocationActivity this$0;

            public final void onCameraChange(CameraPosition cameraposition)
            {
                if (loading.getVisibility() == 8)
                {
                    addressTextView.setText("");
                    loading.setVisibility(0);
                }
                isCenteredOnLocation = false;
                handler.removeMessages(1);
                handler.sendEmptyMessageDelayed(1, 1000L);
            }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
        });
        Location location = ((LocationManager)getSystemService("location")).getLastKnownLocation("network");
        if (location != null)
        {
            onLocationChanged(location);
        }
        animator.getPinFallingAnimator().a(1130L);
        animator.getShadowFallingAnimator().a(800L);
    }

    private void setUpMapIfNeeded()
    {
        if (googleMap == null)
        {
            MapFragmentTouchable mapfragmenttouchable = (MapFragmentTouchable)getSupportFragmentManager().a(0x7f1004dc);
            mapfragmenttouchable.addOnMapTouchListener(new MapFragmentTouchable.OnMapTouchListener() {

                final SendLocationActivity this$0;

                public final void onMapTouch(MotionEvent motionevent)
                {
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 1: default 28
                //                               0 29
                //                               1 81;
                       goto _L1 _L2 _L3
_L1:
                    return;
_L2:
                    if (!isPinUp)
                    {
                        isPinUp = true;
                        animator.getPinUpAnimator().a(630L);
                        animator.getShadowUpAnimator().a(630L);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    if (isPinUp)
                    {
                        isPinUp = false;
                        animator.getPinDownAnimator().a(630L);
                        animator.getShadowDownAnimator().a(300L);
                        return;
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
            });
            googleMap = mapfragmenttouchable.getMap();
            setSendButton();
            setAnimations();
            setAddressView();
            ((SymbolView)findViewById(0x7f10050e)).setOnClickListener(new android.view.View.OnClickListener() {

                final SendLocationActivity this$0;

                public final void onClick(View view)
                {
                    if (!isCenteredOnLocation && currentLocation != null)
                    {
                        isCenteredOnLocation = true;
                        onLocationChanged(currentLocation);
                    }
                }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
            });
            if (googleMap != null)
            {
                setUpMap();
            }
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j == -1)
        {
            isCenteredOnLocation = true;
            locationSource.activate(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        getComponent().inject(this);
        super.onCreate(bundle);
        setContentView(0x7f030102);
        conversation = getConversation();
        if (conversation == null)
        {
            log.warning("SendLocationActivity called without conversation");
            finish();
        }
        locationUtil = new LocationUtil();
        setActionBartitle();
        isCenteredOnLocation = true;
        if (bundle != null)
        {
            isCenteredOnLocation = bundle.getBoolean("stateCenteredOnLocation", true);
        }
        locationSource = new FineLocationSource(this, this);
        locationSource.activate(this);
        setUpMapIfNeeded();
    }

    public void onEvent(AddressRetrieverResult addressretrieverresult)
    {
        currentAddress = addressretrieverresult;
        addressretrieverresult = getAddress(addressretrieverresult, 2);
        if (!TextUtils.isEmpty(addressretrieverresult))
        {
            loading.setVisibility(8);
            addressTextView.setText(addressretrieverresult);
        }
    }

    public void onLocationChanged(Location location)
    {
        currentLocation = location;
        if (!isCenteredOnLocation)
        {
            return;
        } else
        {
            location = new LatLng(location.getLatitude(), location.getLongitude());
            location = (new com.google.android.gms.maps.model.CameraPosition.a()).a(location).a(17F).a();
            googleMap.a(CameraUpdateFactory.newCameraPosition(location));
            isCenteredOnLocation = true;
            return;
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

    public volatile void onResult(g g)
    {
        onResult((LocationSettingsResult)g);
    }

    public void onResult(LocationSettingsResult locationsettingsresult)
    {
        if (isResolutionRequired(locationsettingsresult))
        {
            displayResolution(locationsettingsresult);
        }
    }

    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("stateCenteredOnLocation", isCenteredOnLocation);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        handler = new Handler(new android.os.Handler.Callback() {

            final SendLocationActivity this$0;

            public final boolean handleMessage(Message message)
            {
                if (message.what == 1)
                {
                    if (addressRetriever != null)
                    {
                        addressRetriever.cancel(true);
                    }
                    addressRetriever = new a(SendLocationActivity.this, bus);
                    addressRetriever.execute(new LatLng[] {
                        googleMap.b().a
                    });
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = SendLocationActivity.this;
                super();
            }
        });
    }

    protected void onStop()
    {
        handler.removeCallbacksAndMessages(null);
        super.onStop();
    }




/*
    static AsyncTask access$002(SendLocationActivity sendlocationactivity, AsyncTask asynctask)
    {
        sendlocationactivity.addressRetriever = asynctask;
        return asynctask;
    }

*/









/*
    static boolean access$202(SendLocationActivity sendlocationactivity, boolean flag)
    {
        sendlocationactivity.isPinUp = flag;
        return flag;
    }

*/




/*
    static boolean access$402(SendLocationActivity sendlocationactivity, boolean flag)
    {
        sendlocationactivity.isCenteredOnLocation = flag;
        return flag;
    }

*/





}
