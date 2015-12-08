// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat, IMediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

static class mRootHints
{
    private class MediaServiceConnection
        implements ServiceConnection
    {

        final MediaBrowserCompat.MediaBrowserImplBase this$0;

        private boolean isCurrent(String s)
        {
            if (mServiceConnection != this)
            {
                if (mState != 0)
                {
                    Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(mServiceComponent).append(" with mServiceConnection=").append(mServiceConnection).append(" this=").append(this).toString());
                }
                return false;
            } else
            {
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (!isCurrent("onServiceConnected"))
            {
                return;
            }
            mServiceBinder = IMediaBrowserServiceCompat.Stub.asInterface(ibinder);
            mServiceCallbacks = getNewServiceCallbacks();
            mState = 1;
            try
            {
                mServiceBinder.connect(mContext.getPackageName(), mRootHints, mServiceCallbacks);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(mServiceComponent).toString());
            }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (!isCurrent("onServiceDisconnected"))
            {
                return;
            } else
            {
                mServiceBinder = null;
                mServiceCallbacks = null;
                mState = 3;
                mCallback.onConnectionSuspended();
                return;
            }
        }

        private MediaServiceConnection()
        {
            this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
            super();
        }

        MediaServiceConnection(MediaBrowserCompat._cls1 _pcls1)
        {
            this();
        }
    }

    private static class ServiceCallbacks extends IMediaBrowserServiceCompatCallbacks.Stub
    {

        private WeakReference mMediaBrowser;

        public void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
        {
            MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase = (MediaBrowserCompat.MediaBrowserImplBase)mMediaBrowser.get();
            if (mediabrowserimplbase != null)
            {
                mediabrowserimplbase.onServiceConnected(this, s, token, bundle);
            }
        }

        public void onConnectFailed()
        {
            MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase = (MediaBrowserCompat.MediaBrowserImplBase)mMediaBrowser.get();
            if (mediabrowserimplbase != null)
            {
                mediabrowserimplbase.onConnectionFailed(this);
            }
        }

        public void onLoadChildren(String s, List list)
        {
            MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase = (MediaBrowserCompat.MediaBrowserImplBase)mMediaBrowser.get();
            if (mediabrowserimplbase != null)
            {
                mediabrowserimplbase.onLoadChildren(this, s, list);
            }
        }

        public ServiceCallbacks(MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase)
        {
            mMediaBrowser = new WeakReference(mediabrowserimplbase);
        }
    }

    private static class Subscription
    {

        MediaBrowserCompat.SubscriptionCallback callback;
        final String id;

        Subscription(String s)
        {
            id = s;
        }
    }


    private static final int CONNECT_STATE_CONNECTED = 2;
    private static final int CONNECT_STATE_CONNECTING = 1;
    private static final int CONNECT_STATE_DISCONNECTED = 0;
    private static final int CONNECT_STATE_SUSPENDED = 3;
    private static final boolean DBG = false;
    private static final String TAG = "MediaBrowserCompat";
    private final mServiceCallbacks mCallback;
    private final Context mContext;
    private Bundle mExtras;
    private final Handler mHandler = new Handler();
    private android.support.v4.media.session.Callbacks mMediaSessionToken;
    private final Bundle mRootHints;
    private String mRootId;
    private IMediaBrowserServiceCompat mServiceBinder;
    private IMediaBrowserServiceCompatCallbacks mServiceCallbacks;
    private final ComponentName mServiceComponent;
    private MediaServiceConnection mServiceConnection;
    private int mState;
    private final ArrayMap mSubscriptions = new ArrayMap();

    private void forceCloseConnection()
    {
        if (mServiceConnection != null)
        {
            mContext.unbindService(mServiceConnection);
        }
        mState = 0;
        mServiceConnection = null;
        mServiceBinder = null;
        mServiceCallbacks = null;
        mRootId = null;
        mMediaSessionToken = null;
    }

    private ServiceCallbacks getNewServiceCallbacks()
    {
        return new ServiceCallbacks(this);
    }

    private static String getStateLabel(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder()).append("UNKNOWN/").append(i).toString();

        case 0: // '\0'
            return "CONNECT_STATE_DISCONNECTED";

        case 1: // '\001'
            return "CONNECT_STATE_CONNECTING";

        case 2: // '\002'
            return "CONNECT_STATE_CONNECTED";

        case 3: // '\003'
            return "CONNECT_STATE_SUSPENDED";
        }
    }

    private boolean isCurrent(IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks, String s)
    {
        if (mServiceCallbacks != imediabrowserservicecompatcallbacks)
        {
            if (mState != 0)
            {
                Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(mServiceComponent).append(" with mServiceConnection=").append(mServiceCallbacks).append(" this=").append(this).toString());
            }
            return false;
        } else
        {
            return true;
        }
    }

    private final void onConnectionFailed(final IMediaBrowserServiceCompatCallbacks callback)
    {
        mHandler.post(new Runnable() {

            final MediaBrowserCompat.MediaBrowserImplBase this$0;
            final IMediaBrowserServiceCompatCallbacks val$callback;

            public void run()
            {
                Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(mServiceComponent).toString());
                if (!isCurrent(callback, "onConnectFailed"))
                {
                    return;
                }
                if (mState != 1)
                {
                    Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(MediaBrowserCompat.MediaBrowserImplBase.getStateLabel(mState)).append("... ignoring").toString());
                    return;
                } else
                {
                    forceCloseConnection();
                    mCallback.onConnectionFailed();
                    return;
                }
            }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                callback = imediabrowserservicecompatcallbacks;
                super();
            }
        });
    }

    private final void onLoadChildren(final IMediaBrowserServiceCompatCallbacks callback, final String parentId, final List list)
    {
        mHandler.post(new Runnable() {

            final MediaBrowserCompat.MediaBrowserImplBase this$0;
            final IMediaBrowserServiceCompatCallbacks val$callback;
            final List val$list;
            final String val$parentId;

            public void run()
            {
                if (isCurrent(callback, "onLoadChildren"))
                {
                    List list1 = list;
                    if (list1 == null)
                    {
                        list1 = Collections.emptyList();
                    }
                    Subscription subscription = (Subscription)mSubscriptions.get(parentId);
                    if (subscription != null)
                    {
                        subscription.callback.onChildrenLoaded(parentId, list1);
                        return;
                    }
                }
            }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                callback = imediabrowserservicecompatcallbacks;
                list = list1;
                parentId = s;
                super();
            }
        });
    }

    private final void onServiceConnected(final IMediaBrowserServiceCompatCallbacks callback, final String root, final android.support.v4.media.session.rentId session, final Bundle extra)
    {
        mHandler.post(new Runnable() {

            final MediaBrowserCompat.MediaBrowserImplBase this$0;
            final IMediaBrowserServiceCompatCallbacks val$callback;
            final Bundle val$extra;
            final String val$root;
            final android.support.v4.media.session.MediaSessionCompat.Token val$session;

            public void run()
            {
                if (isCurrent(callback, "onConnect"))
                {
                    if (mState != 1)
                    {
                        Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(MediaBrowserCompat.MediaBrowserImplBase.getStateLabel(mState)).append("... ignoring").toString());
                        return;
                    }
                    mRootId = root;
                    mMediaSessionToken = session;
                    mExtras = extra;
                    mState = 2;
                    mCallback.onConnected();
                    Iterator iterator = mSubscriptions.keySet().iterator();
                    while (iterator.hasNext()) 
                    {
                        String s = (String)iterator.next();
                        try
                        {
                            mServiceBinder.addSubscription(s, mServiceCallbacks);
                        }
                        catch (RemoteException remoteexception)
                        {
                            Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
                        }
                    }
                }
            }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                callback = imediabrowserservicecompatcallbacks;
                root = s;
                session = token;
                extra = bundle;
                super();
            }
        });
    }

    public void connect()
    {
        final MediaServiceConnection thisConnection;
        Intent intent;
        boolean flag;
        if (mState != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("connect() called while not disconnected (state=").append(getStateLabel(mState)).append(")").toString());
        }
        if (mServiceBinder != null)
        {
            throw new RuntimeException((new StringBuilder()).append("mServiceBinder should be null. Instead it is ").append(mServiceBinder).toString());
        }
        if (mServiceCallbacks != null)
        {
            throw new RuntimeException((new StringBuilder()).append("mServiceCallbacks should be null. Instead it is ").append(mServiceCallbacks).toString());
        }
        mState = 1;
        intent = new Intent("android.media.browse.MediaBrowserServiceCompat");
        intent.setComponent(mServiceComponent);
        thisConnection = new MediaServiceConnection(null);
        mServiceConnection = thisConnection;
        flag = false;
        boolean flag1 = mContext.bindService(intent, mServiceConnection, 1);
        flag = flag1;
_L2:
        if (!flag)
        {
            mHandler.post(new Runnable() {

                final MediaBrowserCompat.MediaBrowserImplBase this$0;
                final ServiceConnection val$thisConnection;

                public void run()
                {
                    if (thisConnection == mServiceConnection)
                    {
                        forceCloseConnection();
                        mCallback.onConnectionFailed();
                    }
                }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                thisConnection = serviceconnection;
                super();
            }
            });
        }
        return;
        Exception exception;
        exception;
        Log.e("MediaBrowserCompat", (new StringBuilder()).append("Failed binding to service ").append(mServiceComponent).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void disconnect()
    {
        if (mServiceCallbacks != null)
        {
            try
            {
                mServiceBinder.disconnect(mServiceCallbacks);
            }
            catch (RemoteException remoteexception)
            {
                Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(mServiceComponent).toString());
            }
        }
        forceCloseConnection();
    }

    void dump()
    {
        Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceComponent=").append(mServiceComponent).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallback=").append(mCallback).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootHints=").append(mRootHints).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mState=").append(getStateLabel(mState)).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceConnection=").append(mServiceConnection).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceBinder=").append(mServiceBinder).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceCallbacks=").append(mServiceCallbacks).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootId=").append(mRootId).toString());
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mMediaSessionToken=").append(mMediaSessionToken).toString());
    }

    public Bundle getExtras()
    {
        if (!isConnected())
        {
            throw new IllegalStateException((new StringBuilder()).append("getExtras() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
        } else
        {
            return mExtras;
        }
    }

    public void getItem(final String mediaId, final mExtras cb)
    {
        if (TextUtils.isEmpty(mediaId))
        {
            throw new IllegalArgumentException("mediaId is empty.");
        }
        if (cb == null)
        {
            throw new IllegalArgumentException("cb is null.");
        }
        if (mState != 2)
        {
            Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
            mHandler.post(new Runnable() {

                final MediaBrowserCompat.MediaBrowserImplBase this$0;
                final MediaBrowserCompat.ItemCallback val$cb;
                final String val$mediaId;

                public void run()
                {
                    cb.onError(mediaId);
                }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                cb = itemcallback;
                mediaId = s;
                super();
            }
            });
            return;
        }
        ResultReceiver resultreceiver = new ResultReceiver(mediaId) {

            final MediaBrowserCompat.MediaBrowserImplBase this$0;
            final MediaBrowserCompat.ItemCallback val$cb;
            final String val$mediaId;

            protected void onReceiveResult(int i, Bundle bundle)
            {
                if (i != 0 || bundle == null || !bundle.containsKey("media_item"))
                {
                    cb.onError(mediaId);
                    return;
                }
                bundle = bundle.getParcelable("media_item");
                if (!(bundle instanceof MediaBrowserCompat.MediaItem))
                {
                    cb.onError(mediaId);
                    return;
                } else
                {
                    cb.onItemLoaded((MediaBrowserCompat.MediaItem)bundle);
                    return;
                }
            }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                cb = itemcallback;
                mediaId = s;
                super(final_handler);
            }
        };
        try
        {
            mServiceBinder.getMediaItem(mediaId, resultreceiver);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.i("MediaBrowserCompat", "Remote error getting media item.");
        }
        mHandler.post(new Runnable() {

            final MediaBrowserCompat.MediaBrowserImplBase this$0;
            final MediaBrowserCompat.ItemCallback val$cb;
            final String val$mediaId;

            public void run()
            {
                cb.onError(mediaId);
            }

            
            {
                this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
                cb = itemcallback;
                mediaId = s;
                super();
            }
        });
    }

    public String getRoot()
    {
        if (!isConnected())
        {
            throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(getStateLabel(mState)).append(")").toString());
        } else
        {
            return mRootId;
        }
    }

    public ComponentName getServiceComponent()
    {
        if (!isConnected())
        {
            throw new IllegalStateException((new StringBuilder()).append("getServiceComponent() called while not connected (state=").append(mState).append(")").toString());
        } else
        {
            return mServiceComponent;
        }
    }

    public android.support.v4.media.session.Component getSessionToken()
    {
        if (!isConnected())
        {
            throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(mState).append(")").toString());
        } else
        {
            return mMediaSessionToken;
        }
    }

    public boolean isConnected()
    {
        return mState == 2;
    }

    public void subscribe(String s, mState mstate)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("parentId is null");
        }
        if (mstate == null)
        {
            throw new IllegalArgumentException("callback is null");
        }
        Subscription subscription = (Subscription)mSubscriptions.get(s);
        boolean flag;
        if (subscription == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            subscription = new Subscription(s);
            mSubscriptions.put(s, subscription);
        }
        subscription.callback = mstate;
        if (mState != 2)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        mServiceBinder.addSubscription(s, mServiceCallbacks);
        return;
        mstate;
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
        return;
    }

    public void unsubscribe(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("parentId is empty.");
        }
        Subscription subscription = (Subscription)mSubscriptions.remove(s);
        if (mState != 2 || subscription == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        mServiceBinder.removeSubscription(s, mServiceCallbacks);
        return;
        RemoteException remoteexception;
        remoteexception;
        Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
        return;
    }


/*
    static Bundle access$1002(ServiceCallbacks servicecallbacks, Bundle bundle)
    {
        servicecallbacks.mExtras = bundle;
        return bundle;
    }

*/




/*
    static IMediaBrowserServiceCompatCallbacks access$1202(mExtras mextras, IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
    {
        mextras.mServiceCallbacks = imediabrowserservicecompatcallbacks;
        return imediabrowserservicecompatcallbacks;
    }

*/



/*
    static IMediaBrowserServiceCompat access$1302(mServiceCallbacks mservicecallbacks, IMediaBrowserServiceCompat imediabrowserservicecompat)
    {
        mservicecallbacks.mServiceBinder = imediabrowserservicecompat;
        return imediabrowserservicecompat;
    }

*/














/*
    static int access$602(MediaServiceConnection mediaserviceconnection, int i)
    {
        mediaserviceconnection.mState = i;
        return i;
    }

*/



/*
    static String access$802(mState mstate, String s)
    {
        mstate.mRootId = s;
        return s;
    }

*/


/*
    static android.support.v4.media.session.viceConnection access$902(mRootId mrootid, android.support.v4.media.session.viceConnection viceconnection)
    {
        mrootid.mMediaSessionToken = viceconnection;
        return viceconnection;
    }

*/

    public _cls7.val.parentId(Context context, ComponentName componentname, _cls7.val.parentId parentid, Bundle bundle)
    {
        mState = 0;
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (componentname == null)
        {
            throw new IllegalArgumentException("service component must not be null");
        }
        if (parentid == null)
        {
            throw new IllegalArgumentException("connection callback must not be null");
        } else
        {
            mContext = context;
            mServiceComponent = componentname;
            mCallback = parentid;
            mRootHints = bundle;
            return;
        }
    }
}
