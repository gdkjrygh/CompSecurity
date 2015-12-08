// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.MediaRouteActionProvider;
import android.support.v7.app.MediaRouteButton;
import android.support.v7.app.MediaRouteDialogFactory;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.BaseCastConsumer;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.reconnection.ReconnectionService;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            CastMediaRouterCallback

public abstract class BaseCastManager
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, OnFailedListener
{
    private class UpdateUiVisibilityHandlerCallback
        implements android.os.Handler.Callback
    {

        final BaseCastManager this$0;

        public boolean handleMessage(Message message)
        {
            BaseCastManager basecastmanager = BaseCastManager.this;
            boolean flag;
            if (message.what == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            basecastmanager.onUiVisibilityChanged(flag);
            return true;
        }

        private UpdateUiVisibilityHandlerCallback()
        {
            this$0 = BaseCastManager.this;
            super();
        }

        UpdateUiVisibilityHandlerCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final int CLEAR_ALL = 0;
    public static final int CLEAR_MEDIA_END = 8;
    public static final int CLEAR_ROUTE = 1;
    public static final int CLEAR_SESSION = 4;
    public static final int CLEAR_WIFI = 2;
    public static final int FEATURE_CAPTIONS_PREFERENCE = 16;
    public static final int FEATURE_DEBUGGING = 1;
    public static final int FEATURE_LOCKSCREEN = 2;
    public static final int FEATURE_NOTIFICATION = 4;
    public static final int FEATURE_WIFI_RECONNECT = 8;
    public static final int NO_STATUS_CODE = -1;
    public static final String PREFS_KEY_APPLICATION_ID = "application-id";
    public static final String PREFS_KEY_CAST_ACTIVITY_NAME = "cast-activity-name";
    public static final String PREFS_KEY_CAST_CUSTOM_DATA_NAMESPACE = "cast-custom-data-namespace";
    public static final String PREFS_KEY_MEDIA_END = "media-end";
    public static final String PREFS_KEY_ROUTE_ID = "route-id";
    public static final String PREFS_KEY_SESSION_ID = "session-id";
    public static final String PREFS_KEY_SSID = "ssid";
    public static final int RECONNECTION_STATUS_FINALIZED = 3;
    public static final int RECONNECTION_STATUS_INACTIVE = 4;
    public static final int RECONNECTION_STATUS_IN_PROGRESS = 2;
    public static final int RECONNECTION_STATUS_STARTED = 1;
    private static final int SESSION_RECOVERY_TIMEOUT_S = 10;
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/BaseCastManager);
    private static final int UI_VISIBILITY_DELAY_MS = 300;
    private static final int WHAT_UI_HIDDEN = 1;
    private static final int WHAT_UI_VISIBLE = 0;
    private static String sCclVersion;
    protected GoogleApiClient mApiClient;
    protected String mApplicationId;
    private final Set mBaseCastConsumers;
    protected int mCapabilities;
    protected boolean mConnectionSuspended;
    protected Context mContext;
    private boolean mDestroyOnDisconnect;
    protected String mDeviceName;
    protected MediaRouteSelector mMediaRouteSelector;
    protected MediaRouter mMediaRouter;
    protected CastMediaRouterCallback mMediaRouterCallback;
    protected PreferenceAccessor mPreferenceAccessor;
    protected int mReconnectionStatus;
    protected AsyncTask mReconnectionTask;
    private android.support.v7.media.MediaRouter.RouteInfo mRouteInfo;
    protected CastDevice mSelectedCastDevice;
    protected String mSessionId;
    private Handler mUiVisibilityHandler;
    protected boolean mUiVisible;
    protected int mVisibilityCounter;

    protected BaseCastManager()
    {
        mBaseCastConsumers = new CopyOnWriteArraySet();
        mDestroyOnDisconnect = false;
        mReconnectionStatus = 4;
    }

    protected BaseCastManager(Context context, String s)
    {
        mBaseCastConsumers = new CopyOnWriteArraySet();
        mDestroyOnDisconnect = false;
        mReconnectionStatus = 4;
        sCclVersion = context.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_version);
        LogUtils.LOGD(TAG, (new StringBuilder("BaseCastManager is instantiated\nVersion: ")).append(sCclVersion).append("\nApplication ID: ").append(s).toString());
        mContext = context.getApplicationContext();
        mPreferenceAccessor = new PreferenceAccessor(mContext);
        mUiVisibilityHandler = new Handler(new UpdateUiVisibilityHandlerCallback(null));
        mApplicationId = s;
        mPreferenceAccessor.saveStringToPreference("application-id", s);
        mMediaRouter = MediaRouter.getInstance(mContext);
        context = new android.support.v7.media.MediaRouteSelector.Builder();
        s = mApplicationId;
        if (s == null)
        {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        StringBuilder stringbuilder = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        if (s != null)
        {
            String s1 = s.toUpperCase();
            if (!s1.matches("[A-F0-9]+"))
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid application ID: ")).append(s).toString());
            }
            stringbuilder.append("/").append(s1);
        }
        mMediaRouteSelector = context.addControlCategory(stringbuilder.toString()).build();
        mMediaRouterCallback = new CastMediaRouterCallback(this);
        mMediaRouter.addCallback(mMediaRouteSelector, mMediaRouterCallback, 4);
    }

    public static boolean checkGooglePlayServices(Activity activity)
    {
        return Utils.checkGooglePlayServices(activity);
    }

    public static final String getCclVersion()
    {
        return sCclVersion;
    }

    private static boolean isFlagSet(int i, int j)
    {
        return i == 0 || (i & j) == j;
    }

    private void launchApp()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "launchApp() is called");
        if (!isConnected())
        {
            if (mReconnectionStatus == 2)
            {
                setReconnectionStatus(4);
                return;
            }
            checkConnectivity();
        }
        if (mReconnectionStatus == 2)
        {
            LogUtils.LOGD(TAG, "Attempting to join a previously interrupted session...");
            String s = mPreferenceAccessor.getStringFromPreference("session-id");
            LogUtils.LOGD(TAG, "joinApplication() -> start");
            a.b.b(mApiClient, mApplicationId, s).setResultCallback(new _cls2());
            return;
        } else
        {
            LogUtils.LOGD(TAG, "Launching app");
            a.b.a(mApiClient, mApplicationId).setResultCallback(new _cls3());
            return;
        }
    }

    private void onReconnectionStatusChanged(int i)
    {
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onReconnectionStatusChanged(i)) { }
    }

    private void reconnectSessionIfPossibleInternal(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (!isConnected())
        {
            String s = mPreferenceAccessor.getStringFromPreference("session-id");
            String s1 = mPreferenceAccessor.getStringFromPreference("route-id");
            LogUtils.LOGD(TAG, (new StringBuilder("reconnectSessionIfPossible() Retrieved from preferences: sessionId=")).append(s).append(", routeId=").append(s1).toString());
            if (s != null && s1 != null)
            {
                setReconnectionStatus(2);
                routeinfo = CastDevice.a(routeinfo.getExtras());
                if (routeinfo != null)
                {
                    LogUtils.LOGD(TAG, (new StringBuilder("trying to acquire Cast Client for ")).append(routeinfo).toString());
                    onDeviceSelected(routeinfo);
                    return;
                }
            }
        }
    }

    private void setDevice(CastDevice castdevice)
    {
        mSelectedCastDevice = castdevice;
        mDeviceName = mSelectedCastDevice.d;
        if (mApiClient == null)
        {
            LogUtils.LOGD(TAG, (new StringBuilder("acquiring a connection to Google Play services for ")).append(mSelectedCastDevice).toString());
            castdevice = getCastOptionBuilder(mSelectedCastDevice);
            mApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(a.a, new com.google.android.gms.cast.a.c(castdevice, (byte)0)).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            mApiClient.connect();
        } else
        if (!mApiClient.isConnected() && !mApiClient.isConnecting())
        {
            mApiClient.connect();
            return;
        }
    }

    public final void addBaseCastConsumer(BaseCastConsumer basecastconsumer)
    {
        if (basecastconsumer != null && mBaseCastConsumers.add(basecastconsumer))
        {
            LogUtils.LOGD(TAG, (new StringBuilder("Successfully added the new BaseCastConsumer listener ")).append(basecastconsumer).toString());
        }
    }

    public final MenuItem addMediaRouterButton(Menu menu, int i)
    {
        menu = menu.findItem(i);
        MediaRouteActionProvider mediarouteactionprovider = (MediaRouteActionProvider)MenuItemCompat.getActionProvider(menu);
        mediarouteactionprovider.setRouteSelector(mMediaRouteSelector);
        if (getMediaRouteDialogFactory() != null)
        {
            mediarouteactionprovider.setDialogFactory(getMediaRouteDialogFactory());
        }
        return menu;
    }

    public final void addMediaRouterButton(MediaRouteButton mediaroutebutton)
    {
        mediaroutebutton.setRouteSelector(mMediaRouteSelector);
        if (getMediaRouteDialogFactory() != null)
        {
            mediaroutebutton.setDialogFactory(getMediaRouteDialogFactory());
        }
    }

    public final void adjustDeviceVolume(double d)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        double d1 = getDeviceVolume();
        if (d1 >= 0.0D)
        {
            setDeviceVolume(d1 + d);
        }
    }

    protected final boolean canConsiderSessionRecovery()
    {
        return canConsiderSessionRecovery(null);
    }

    public final boolean canConsiderSessionRecovery(String s)
    {
        String s1 = mPreferenceAccessor.getStringFromPreference("session-id");
        String s2 = mPreferenceAccessor.getStringFromPreference("route-id");
        for (String s3 = mPreferenceAccessor.getStringFromPreference("ssid"); s1 == null || s2 == null || s != null && (s3 == null || !s3.equals(s));)
        {
            return false;
        }

        LogUtils.LOGD(TAG, "Found session info in the preferences, so proceed with an attempt to reconnect if possible");
        return true;
    }

    public final void cancelReconnectionTask()
    {
        LogUtils.LOGD(TAG, "cancelling reconnection task");
        if (mReconnectionTask != null && !mReconnectionTask.isCancelled())
        {
            mReconnectionTask.cancel(true);
        }
    }

    public final void checkConnectivity()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        if (!isConnected())
        {
            if (mConnectionSuspended)
            {
                throw new TransientNetworkDisconnectionException();
            } else
            {
                throw new NoConnectionException();
            }
        } else
        {
            return;
        }
    }

    public final void clearPersistedConnectionInfo(int i)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("clearPersistedConnectionInfo(): Clearing persisted data for ")).append(i).toString());
        if (isFlagSet(i, 4))
        {
            mPreferenceAccessor.saveStringToPreference("session-id", null);
        }
        if (isFlagSet(i, 1))
        {
            mPreferenceAccessor.saveStringToPreference("route-id", null);
        }
        if (isFlagSet(i, 2))
        {
            mPreferenceAccessor.saveStringToPreference("ssid", null);
        }
        if (isFlagSet(i, 8))
        {
            mPreferenceAccessor.saveLongToPreference("media-end", null);
        }
    }

    public final void decrementUiCounter()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = mVisibilityCounter - 1;
        mVisibilityCounter = i;
        if (i != 0) goto _L2; else goto _L1
_L1:
        LogUtils.LOGD(TAG, "UI is no longer visible");
        if (mUiVisible)
        {
            mUiVisible = false;
            mUiVisibilityHandler.removeMessages(0);
            mUiVisibilityHandler.sendEmptyMessageDelayed(1, 300L);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        LogUtils.LOGD(TAG, "UI is visible");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void disconnect()
    {
        if (isConnected() || isConnecting())
        {
            disconnectDevice(mDestroyOnDisconnect, true, true);
        }
    }

    public final void disconnectDevice(boolean flag, boolean flag1, boolean flag2)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("disconnectDevice(")).append(flag1).append(",").append(flag2).append(")").toString());
        if (mSelectedCastDevice == null)
        {
            return;
        }
        mSelectedCastDevice = null;
        mDeviceName = null;
        LogUtils.LOGD(TAG, (new StringBuilder("mConnectionSuspended: ")).append(mConnectionSuspended).toString());
        if (!mConnectionSuspended && flag1)
        {
            clearPersistedConnectionInfo(0);
            stopReconnectionService();
        }
        if (!isConnected() && !isConnecting() || !flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        LogUtils.LOGD(TAG, "Calling stopApplication");
        stopApplication();
_L2:
        onDisconnected(flag, flag1, flag2);
        onDeviceUnselected();
        if (mApiClient != null)
        {
            if (mApiClient.isConnected())
            {
                LogUtils.LOGD(TAG, "Trying to disconnect");
                mApiClient.disconnect();
            }
            if (mMediaRouter != null && flag2)
            {
                LogUtils.LOGD(TAG, "disconnectDevice(): Setting route to default");
                mMediaRouter.selectRoute(mMediaRouter.getDefaultRoute());
            }
            mApiClient = null;
        }
        mSessionId = null;
        return;
        Object obj;
        obj;
_L3:
        LogUtils.LOGE(TAG, "Failed to stop the application after disconnecting route", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
    }

    public final void enableFeatures(int i)
    {
        mCapabilities = i;
        onFeaturesUpdated(mCapabilities);
    }

    protected abstract com.google.android.gms.cast.a.c.a getCastOptionBuilder(CastDevice castdevice);

    public final String getDeviceName()
    {
        return mDeviceName;
    }

    public final double getDeviceVolume()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        double d;
        try
        {
            d = a.b.b(mApiClient);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new NoConnectionException("getDeviceVolume()", illegalstateexception);
        }
        return d;
    }

    protected abstract MediaRouteDialogFactory getMediaRouteDialogFactory();

    public final MediaRouteSelector getMediaRouteSelector()
    {
        return mMediaRouteSelector;
    }

    public PreferenceAccessor getPreferenceAccessor()
    {
        return mPreferenceAccessor;
    }

    public final int getReconnectionStatus()
    {
        return mReconnectionStatus;
    }

    public final android.support.v7.media.MediaRouter.RouteInfo getRouteInfo()
    {
        return mRouteInfo;
    }

    public final void incrementUiCounter()
    {
        this;
        JVM INSTR monitorenter ;
        mVisibilityCounter = mVisibilityCounter + 1;
        if (!mUiVisible)
        {
            mUiVisible = true;
            mUiVisibilityHandler.removeMessages(1);
            mUiVisibilityHandler.sendEmptyMessageDelayed(0, 300L);
        }
        if (mVisibilityCounter != 0) goto _L2; else goto _L1
_L1:
        LogUtils.LOGD(TAG, "UI is no longer visible");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        LogUtils.LOGD(TAG, "UI is visible");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isAnyRouteAvailable()
    {
        return mMediaRouterCallback.isRouteAvailable();
    }

    public final boolean isConnected()
    {
        return mApiClient != null && mApiClient.isConnected();
    }

    public final boolean isConnecting()
    {
        return mApiClient != null && mApiClient.isConnecting();
    }

    public final boolean isDeviceMute()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        boolean flag;
        try
        {
            flag = a.b.c(mApiClient);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new NoConnectionException("isDeviceMute()", illegalstateexception);
        }
        return flag;
    }

    public final boolean isDeviceOnLocalNetwork()
        throws CastException
    {
        if (mSelectedCastDevice == null)
        {
            throw new CastException("No cast device has yet been selected");
        }
        return !mSelectedCastDevice.b.startsWith("__cast_nearby__");
    }

    public final boolean isFeatureEnabled(int i)
    {
        return (mCapabilities & i) == i;
    }

    protected abstract void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag);

    protected abstract void onApplicationConnectionFailed(int i);

    protected abstract void onApplicationStopFailed(int i);

    public final void onCastAvailabilityChanged(boolean flag)
    {
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onCastAvailabilityChanged(flag)) { }
    }

    public final void onCastDeviceDetected(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onCastDeviceDetected(routeinfo)) { }
    }

    public final void onConnected(Bundle bundle)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onConnected() reached with prior suspension: ")).append(mConnectionSuspended).toString());
        if (!mConnectionSuspended) goto _L2; else goto _L1
_L1:
        mConnectionSuspended = false;
        if (bundle == null || !bundle.getBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING")) goto _L4; else goto _L3
_L3:
        LogUtils.LOGD(TAG, "onConnected(): App no longer running, so disconnecting");
        disconnect();
_L6:
        return;
_L4:
        onConnectivityRecovered();
        return;
_L2:
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (mReconnectionStatus != 2) goto _L6; else goto _L5
_L5:
        setReconnectionStatus(4);
        return;
        if (isFeatureEnabled(8))
        {
            bundle = Utils.getWifiSsid(mContext);
            mPreferenceAccessor.saveStringToPreference("ssid", bundle);
        }
        a.b.a(mApiClient);
        launchApp();
        bundle = mBaseCastConsumers.iterator();
        while (bundle.hasNext()) 
        {
            ((BaseCastConsumer)bundle.next()).onConnected();
        }
          goto _L6
        bundle;
_L8:
        LogUtils.LOGE(TAG, "requestStatus()", bundle);
        return;
        bundle;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onConnectionFailed() reached, error code: ")).append(connectionresult.getErrorCode()).append(", reason: ").append(connectionresult.toString()).toString());
        disconnectDevice(mDestroyOnDisconnect, false, false);
        mConnectionSuspended = false;
        if (mMediaRouter != null)
        {
            mMediaRouter.selectRoute(mMediaRouter.getDefaultRoute());
        }
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onConnectionFailed(connectionresult)) { }
    }

    public void onConnectionSuspended(int i)
    {
        mConnectionSuspended = true;
        LogUtils.LOGD(TAG, (new StringBuilder("onConnectionSuspended() was called with cause: ")).append(i).toString());
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onConnectionSuspended(i)) { }
    }

    public void onConnectivityRecovered()
    {
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onConnectivityRecovered()) { }
    }

    public final void onDeviceSelected(CastDevice castdevice)
    {
        Iterator iterator;
        if (castdevice == null)
        {
            disconnectDevice(mDestroyOnDisconnect, true, false);
        } else
        {
            setDevice(castdevice);
        }
        for (iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onDeviceSelected(castdevice)) { }
    }

    protected void onDeviceUnselected()
    {
    }

    protected void onDisconnected(boolean flag, boolean flag1, boolean flag2)
    {
        LogUtils.LOGD(TAG, "onDisconnected() reached");
        mDeviceName = null;
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onDisconnected()) { }
    }

    public void onFailed(int i, int j)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onFailed() was called with statusCode: ")).append(j).toString());
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onFailed(i, j)) { }
    }

    protected void onFeaturesUpdated(int i)
    {
    }

    protected void onUiVisibilityChanged(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (mMediaRouter != null && mMediaRouterCallback != null)
        {
            LogUtils.LOGD(TAG, "onUiVisibilityChanged() addCallback called");
            startCastDiscovery();
        }
_L4:
        for (Iterator iterator = mBaseCastConsumers.iterator(); iterator.hasNext(); ((BaseCastConsumer)iterator.next()).onUiVisibilityChanged(flag)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (mMediaRouter != null)
        {
            LogUtils.LOGD(TAG, "onUiVisibilityChanged() removeCallback called");
            stopCastDiscovery();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void reconnectSessionIfPossible()
    {
        reconnectSessionIfPossible(10);
    }

    public final void reconnectSessionIfPossible(int i)
    {
        reconnectSessionIfPossible(i, null);
    }

    public void reconnectSessionIfPossible(final int timeoutInSeconds, String s)
    {
        LogUtils.LOGD(TAG, String.format("reconnectSessionIfPossible(%d, %s)", new Object[] {
            Integer.valueOf(timeoutInSeconds), s
        }));
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = mPreferenceAccessor.getStringFromPreference("route-id");
        if (!canConsiderSessionRecovery(s)) goto _L1; else goto _L3
_L3:
        s = mMediaRouter.getRoutes();
        if (s == null) goto _L5; else goto _L4
_L4:
        Iterator iterator = s.iterator();
_L8:
        if (!iterator.hasNext()) goto _L5; else goto _L6
_L6:
        s = (android.support.v7.media.MediaRouter.RouteInfo)iterator.next();
        if (!s.getId().equals(s1)) goto _L8; else goto _L7
_L7:
        if (s != null)
        {
            reconnectSessionIfPossibleInternal(s);
        } else
        {
            setReconnectionStatus(1);
        }
        if (mReconnectionTask != null && !mReconnectionTask.isCancelled())
        {
            mReconnectionTask.cancel(true);
        }
        mReconnectionTask = new _cls1();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mReconnectionTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            mReconnectionTask.execute(new Void[0]);
            return;
        }
_L5:
        s = null;
        if (true) goto _L7; else goto _L9
_L9:
    }

    public final void removeBaseCastConsumer(BaseCastConsumer basecastconsumer)
    {
        if (basecastconsumer != null && mBaseCastConsumers.remove(basecastconsumer))
        {
            LogUtils.LOGD(TAG, (new StringBuilder("Successfully removed the existing BaseCastConsumer listener ")).append(basecastconsumer).toString());
        }
    }

    public final void setDeviceMute(boolean flag)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        try
        {
            a.b.a(mApiClient, flag);
            return;
        }
        catch (IOException ioexception)
        {
            throw new CastException("setDeviceMute", ioexception);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new NoConnectionException("setDeviceMute()", illegalstateexception);
        }
    }

    public final void setDeviceVolume(double d)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        try
        {
            a.b.a(mApiClient, d);
            return;
        }
        catch (IOException ioexception)
        {
            throw new CastException("Failed to set volume", ioexception);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new NoConnectionException("setDeviceVolume()", illegalstateexception);
        }
    }

    public final void setReconnectionStatus(int i)
    {
        if (mReconnectionStatus != i)
        {
            mReconnectionStatus = i;
            onReconnectionStatusChanged(mReconnectionStatus);
        }
    }

    public final void setRouteInfo(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        mRouteInfo = routeinfo;
    }

    public final void setStopOnDisconnect(boolean flag)
    {
        mDestroyOnDisconnect = flag;
    }

    public final void startCastDiscovery()
    {
        mMediaRouter.addCallback(mMediaRouteSelector, mMediaRouterCallback, 4);
    }

    protected void startReconnectionService(long l)
    {
        if (!isFeatureEnabled(8))
        {
            return;
        } else
        {
            LogUtils.LOGD(TAG, (new StringBuilder("startReconnectionService() for media length lef = ")).append(l).toString());
            long l1 = SystemClock.elapsedRealtime();
            mPreferenceAccessor.saveLongToPreference("media-end", Long.valueOf(l1 + l));
            Context context = mContext.getApplicationContext();
            Intent intent = new Intent(context, com/google/android/libraries/cast/companionlibrary/cast/reconnection/ReconnectionService);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            return;
        }
    }

    public final void stopApplication()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        a.b.b(mApiClient, mSessionId).setResultCallback(new _cls4());
    }

    public final void stopCastDiscovery()
    {
        mMediaRouter.removeCallback(mMediaRouterCallback);
    }

    protected void stopReconnectionService()
    {
        if (!isFeatureEnabled(8))
        {
            return;
        } else
        {
            LogUtils.LOGD(TAG, "stopReconnectionService()");
            Context context = mContext.getApplicationContext();
            Intent intent = new Intent(context, com/google/android/libraries/cast/companionlibrary/cast/reconnection/ReconnectionService);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
            return;
        }
    }



    private class _cls2
        implements ResultCallback
    {

        final BaseCastManager this$0;

        public void onResult(com.google.android.gms.cast.a.a a1)
        {
            if (a1.getStatus().isSuccess())
            {
                LogUtils.LOGD(BaseCastManager.TAG, "joinApplication() -> success");
                onApplicationConnected(a1.a(), a1.b(), a1.c(), a1.d());
                return;
            } else
            {
                LogUtils.LOGD(BaseCastManager.TAG, "joinApplication() -> failure");
                clearPersistedConnectionInfo(12);
                onApplicationConnectionFailed(a1.getStatus().getStatusCode());
                return;
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.a.a)result);
        }

        _cls2()
        {
            this$0 = BaseCastManager.this;
            super();
        }
    }


    private class _cls3
        implements ResultCallback
    {

        final BaseCastManager this$0;

        public void onResult(com.google.android.gms.cast.a.a a1)
        {
            if (a1.getStatus().isSuccess())
            {
                LogUtils.LOGD(BaseCastManager.TAG, "launchApplication() -> success result");
                onApplicationConnected(a1.a(), a1.b(), a1.c(), a1.d());
                return;
            } else
            {
                LogUtils.LOGD(BaseCastManager.TAG, "launchApplication() -> failure result");
                onApplicationConnectionFailed(a1.getStatus().getStatusCode());
                return;
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.a.a)result);
        }

        _cls3()
        {
            this$0 = BaseCastManager.this;
            super();
        }
    }


    private class _cls1 extends AsyncTask
    {

        final BaseCastManager this$0;
        final int val$timeoutInSeconds;

        protected transient Boolean doInBackground(Void avoid[])
        {
            int i = 0;
            while (i < timeoutInSeconds) 
            {
                LogUtils.LOGD(BaseCastManager.TAG, (new StringBuilder("Reconnection: Attempt ")).append(i + 1).toString());
                if (isCancelled())
                {
                    return Boolean.valueOf(true);
                }
                try
                {
                    if (isConnected())
                    {
                        cancel(true);
                    }
                    Thread.sleep(1000L);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
                i++;
            }
            return Boolean.valueOf(false);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (boolean1 == null || !boolean1.booleanValue())
            {
                LogUtils.LOGD(BaseCastManager.TAG, "Couldn't reconnect, dropping connection");
                setReconnectionStatus(4);
                onDeviceSelected(null);
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        _cls1()
        {
            this$0 = BaseCastManager.this;
            timeoutInSeconds = i;
            super();
        }
    }


    private class _cls4
        implements ResultCallback
    {

        final BaseCastManager this$0;

        public volatile void onResult(Result result)
        {
            onResult((Status)result);
        }

        public void onResult(Status status)
        {
            if (!status.isSuccess())
            {
                LogUtils.LOGD(BaseCastManager.TAG, "stopApplication -> onResult: stopping application failed");
                onApplicationStopFailed(status.getStatusCode());
                return;
            } else
            {
                LogUtils.LOGD(BaseCastManager.TAG, "stopApplication -> onResult Stopped application successfully");
                return;
            }
        }

        _cls4()
        {
            this$0 = BaseCastManager.this;
            super();
        }
    }

}
