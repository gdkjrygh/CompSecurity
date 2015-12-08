// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.content.Context;
import android.support.v7.app.MediaRouteDialogFactory;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.a;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.DataCastConsumer;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            BaseCastManager

public class DataCastManager extends BaseCastManager
    implements com.google.android.gms.cast.a.e
{
    class CastListener extends com.google.android.gms.cast.a.d
    {

        final DataCastManager this$0;

        public void onApplicationDisconnected(int i)
        {
            DataCastManager.this.onApplicationDisconnected(i);
        }

        public void onApplicationStatusChanged()
        {
            DataCastManager.this.onApplicationStatusChanged();
        }

        CastListener()
        {
            this$0 = DataCastManager.this;
            super();
        }
    }


    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/DataCastManager);
    private static DataCastManager sInstance;
    private final Set mDataConsumers;
    private final Set mNamespaceList;

    private DataCastManager()
    {
        mNamespaceList = new HashSet();
        mDataConsumers = new CopyOnWriteArraySet();
    }

    protected transient DataCastManager(Context context, String s, String as[])
    {
        super(context, s);
        mNamespaceList = new HashSet();
        mDataConsumers = new CopyOnWriteArraySet();
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                context = as[i];
                if (!TextUtils.isEmpty(context))
                {
                    mNamespaceList.add(context);
                } else
                {
                    LogUtils.LOGD(TAG, "A null or empty namespace was ignored.");
                }
                i++;
            }
        }
    }

    private void attachDataChannels()
        throws IllegalStateException, IOException
    {
        checkConnectivity();
        String s;
        for (Iterator iterator = mNamespaceList.iterator(); iterator.hasNext(); a.b.a(mApiClient, s, this))
        {
            s = (String)iterator.next();
        }

    }

    private void detachDataChannels()
    {
        if (mApiClient != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = mNamespaceList.iterator();
_L4:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        String s = (String)iterator.next();
        a.b.c(mApiClient, s);
          goto _L4
        Object obj;
        obj;
_L5:
        LogUtils.LOGE(TAG, (new StringBuilder("detachDataChannels() Failed to remove namespace: ")).append(s).toString(), ((Throwable) (obj)));
          goto _L4
          goto _L1
        obj;
          goto _L5
    }

    public static DataCastManager getInstance()
    {
        if (sInstance == null)
        {
            LogUtils.LOGE(TAG, "No DataCastManager instance was found, did you forget to initialize it?");
            throw new IllegalStateException("No DataCastManager instance was found, did you forget to initialize it?");
        } else
        {
            return sInstance;
        }
    }

    public static transient DataCastManager initialize(Context context, String s, String as[])
    {
        com/google/android/libraries/cast/companionlibrary/cast/DataCastManager;
        JVM INSTR monitorenter ;
        if (sInstance != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        LogUtils.LOGD(TAG, "New instance of DataCastManager is created");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            LogUtils.LOGE(TAG, "Couldn't find the appropriate version of Google Play Services");
            throw new RuntimeException("Couldn't find the appropriate version of Google Play Services");
        }
        break MISSING_BLOCK_LABEL_48;
        context;
        com/google/android/libraries/cast/companionlibrary/cast/DataCastManager;
        JVM INSTR monitorexit ;
        throw context;
        sInstance = new DataCastManager(context, s, as);
        context = sInstance;
        com/google/android/libraries/cast/companionlibrary/cast/DataCastManager;
        JVM INSTR monitorexit ;
        return context;
    }

    public void addDataCastConsumer(DataCastConsumer datacastconsumer)
    {
label0:
        {
            if (datacastconsumer != null)
            {
                addBaseCastConsumer(datacastconsumer);
                if (!mDataConsumers.add(datacastconsumer))
                {
                    break label0;
                }
                LogUtils.LOGD(TAG, (new StringBuilder("Successfully added the new DataCastConsumer listener ")).append(datacastconsumer).toString());
            }
            return;
        }
        LogUtils.LOGD(TAG, (new StringBuilder("Adding Listener ")).append(datacastconsumer).append(" was already registered, skipping this step").toString());
    }

    public boolean addNamespace(String s)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("namespace cannot be empty");
        }
        if (mNamespaceList.contains(s))
        {
            LogUtils.LOGD(TAG, "Ignoring to add a namespace that is already added.");
            return false;
        }
        a.b.a(mApiClient, s, this);
        mNamespaceList.add(s);
        return true;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, String.format("addNamespace(%s)", new Object[] {
            s
        }), ((Throwable) (obj)));
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected com.google.android.gms.cast.a.c.a getCastOptionBuilder(CastDevice castdevice)
    {
        castdevice = com.google.android.gms.cast.a.c.a(mSelectedCastDevice, new CastListener());
        if (isFeatureEnabled(1))
        {
            castdevice.a();
        }
        return castdevice;
    }

    protected MediaRouteDialogFactory getMediaRouteDialogFactory()
    {
        return null;
    }

    public void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onApplicationConnected() reached with sessionId: ")).append(s1).toString());
        mPreferenceAccessor.saveStringToPreference("session-id", s1);
        if (mReconnectionStatus != 2) goto _L2; else goto _L1
_L1:
        Object obj = mMediaRouter.getRoutes();
        if (obj == null) goto _L2; else goto _L3
_L3:
        String s2;
        s2 = mPreferenceAccessor.getStringFromPreference("route-id");
        obj = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
_L4:
        android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)((Iterator) (obj)).next();
        if (!s2.equals(routeinfo.getId())) goto _L7; else goto _L6
_L6:
        boolean flag1;
        LogUtils.LOGD(TAG, "Found the correct route during reconnection attempt");
        mReconnectionStatus = 3;
        mMediaRouter.selectRoute(routeinfo);
        flag1 = true;
_L13:
        if (flag1) goto _L2; else goto _L8
_L8:
        onDeviceSelected(null);
        mReconnectionStatus = 4;
_L10:
        return;
_L2:
        attachDataChannels();
        mSessionId = s1;
        Iterator iterator = mDataConsumers.iterator();
        while (iterator.hasNext()) 
        {
            ((DataCastConsumer)iterator.next()).onApplicationConnected(applicationmetadata, s, s1, flag);
        }
        if (true) goto _L10; else goto _L9
_L9:
        applicationmetadata;
_L11:
        LogUtils.LOGE(TAG, "Failed to attach namespaces", applicationmetadata);
        return;
        applicationmetadata;
        if (true) goto _L11; else goto _L5
_L5:
        flag1 = false;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void onApplicationConnectionFailed(int i)
    {
        onDeviceSelected(null);
        for (Iterator iterator = mDataConsumers.iterator(); iterator.hasNext(); ((DataCastConsumer)iterator.next()).onApplicationConnectionFailed(i)) { }
    }

    public void onApplicationDisconnected(int i)
    {
        for (Iterator iterator = mDataConsumers.iterator(); iterator.hasNext(); ((DataCastConsumer)iterator.next()).onApplicationDisconnected(i)) { }
        if (mMediaRouter != null)
        {
            mMediaRouter.selectRoute(mMediaRouter.getDefaultRoute());
        }
        onDeviceSelected(null);
    }

    public void onApplicationStatusChanged()
    {
        if (isConnected()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            String s = a.b.d(mApiClient);
            LogUtils.LOGD(TAG, (new StringBuilder("onApplicationStatusChanged() reached: ")).append(s).toString());
            Iterator iterator = mDataConsumers.iterator();
            while (iterator.hasNext()) 
            {
                ((DataCastConsumer)iterator.next()).onApplicationStatusChanged(s);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            LogUtils.LOGE(TAG, "onApplicationStatusChanged(): Failed", illegalstateexception);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onApplicationStopFailed(int i)
    {
        for (Iterator iterator = mDataConsumers.iterator(); iterator.hasNext(); ((DataCastConsumer)iterator.next()).onApplicationStopFailed(i)) { }
    }

    protected void onDeviceUnselected()
    {
        detachDataChannels();
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        for (Iterator iterator = mDataConsumers.iterator(); iterator.hasNext(); ((DataCastConsumer)iterator.next()).onMessageReceived(castdevice, s, s1)) { }
    }

    public void onMessageSendFailed(Status status)
    {
        for (Iterator iterator = mDataConsumers.iterator(); iterator.hasNext(); ((DataCastConsumer)iterator.next()).onMessageSendFailed(status)) { }
    }

    public void removeDataCastConsumer(DataCastConsumer datacastconsumer)
    {
        if (datacastconsumer != null)
        {
            removeBaseCastConsumer(datacastconsumer);
            mDataConsumers.remove(datacastconsumer);
        }
    }

    public boolean removeNamespace(String s)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("namespace cannot be empty");
        }
        if (!mNamespaceList.contains(s))
        {
            LogUtils.LOGD(TAG, "Ignoring to remove a namespace that is not registered.");
            return false;
        }
        a.b.c(mApiClient, s);
        mNamespaceList.remove(s);
        return true;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, String.format("removeNamespace(%s)", new Object[] {
            s
        }), ((Throwable) (obj)));
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void sendDataMessage(String s, String s1)
        throws IllegalArgumentException, IllegalStateException, IOException
    {
        checkConnectivity();
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("namespace cannot be empty");
        } else
        {
            a.b.a(mApiClient, s1, s).setResultCallback(new _cls1());
            return;
        }
    }


    private class _cls1
        implements ResultCallback
    {

        final DataCastManager this$0;

        public volatile void onResult(Result result)
        {
            onResult((Status)result);
        }

        public void onResult(Status status)
        {
            if (!status.isSuccess())
            {
                onMessageSendFailed(status);
            }
        }

        _cls1()
        {
            this$0 = DataCastManager.this;
            super();
        }
    }

}
