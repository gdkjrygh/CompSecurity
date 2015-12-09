// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//            IMediaBrowserServiceCompatCallbacks

public abstract class MediaBrowserServiceCompat extends Service
{
    public static final class BrowserRoot
    {

        private final Bundle mExtras;
        private final String mRootId;

        public Bundle getExtras()
        {
            return mExtras;
        }

        public String getRootId()
        {
            return mRootId;
        }

        public BrowserRoot(String s, Bundle bundle)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
            } else
            {
                mRootId = s;
                mExtras = bundle;
                return;
            }
        }
    }

    private class ConnectionRecord
    {

        IMediaBrowserServiceCompatCallbacks callbacks;
        String pkg;
        BrowserRoot root;
        Bundle rootHints;
        HashSet subscriptions;
        final MediaBrowserServiceCompat this$0;

        private ConnectionRecord()
        {
            this$0 = MediaBrowserServiceCompat.this;
            super();
            subscriptions = new HashSet();
        }

    }

    public class Result
    {

        private Object mDebug;
        private boolean mDetachCalled;
        private boolean mSendResultCalled;
        final MediaBrowserServiceCompat this$0;

        public void detach()
        {
            if (mDetachCalled)
            {
                throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
            }
            if (mSendResultCalled)
            {
                throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
            } else
            {
                mDetachCalled = true;
                return;
            }
        }

        boolean isDone()
        {
            return mDetachCalled || mSendResultCalled;
        }

        void onResultSent(Object obj)
        {
        }

        public void sendResult(Object obj)
        {
            if (mSendResultCalled)
            {
                throw new IllegalStateException((new StringBuilder()).append("sendResult() called twice for: ").append(mDebug).toString());
            } else
            {
                mSendResultCalled = true;
                onResultSent(obj);
                return;
            }
        }

        Result(Object obj)
        {
            this$0 = MediaBrowserServiceCompat.this;
            super();
            mDebug = obj;
        }
    }

    private class ServiceBinder extends IMediaBrowserServiceCompat.Stub
    {

        final MediaBrowserServiceCompat this$0;

        public void addSubscription(String s, final IMediaBrowserServiceCompatCallbacks callbacks)
        {
            mHandler.post(s. new Runnable() {

                final ServiceBinder this$1;
                final IMediaBrowserServiceCompatCallbacks val$callbacks;
                final String val$id;

                public void run()
                {
                    Object obj = callbacks.asBinder();
                    obj = (ConnectionRecord)mConnections.get(obj);
                    if (obj == null)
                    {
                        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("addSubscription for callback that isn't registered id=").append(id).toString());
                        return;
                    } else
                    {
                        addSubscription(id, ((ConnectionRecord) (obj)));
                        return;
                    }
                }

            
            {
                this$1 = final_servicebinder;
                callbacks = imediabrowserservicecompatcallbacks;
                id = String.this;
                super();
            }
            });
        }

        public void connect(final String pkg, final Bundle rootHints, final IMediaBrowserServiceCompatCallbacks callbacks)
        {
            int i = Binder.getCallingUid();
            if (!isValidPackage(pkg, i))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(i).append(" package=").append(pkg).toString());
            } else
            {
                mHandler.post(i. new Runnable() {

                    final ServiceBinder this$1;
                    final IMediaBrowserServiceCompatCallbacks val$callbacks;
                    final String val$pkg;
                    final Bundle val$rootHints;
                    final int val$uid;

                    public void run()
                    {
                        Object obj;
                        ConnectionRecord connectionrecord;
                        obj = callbacks.asBinder();
                        mConnections.remove(obj);
                        connectionrecord = new ConnectionRecord();
                        connectionrecord.pkg = pkg;
                        connectionrecord.rootHints = rootHints;
                        connectionrecord.callbacks = callbacks;
                        connectionrecord.root = onGetRoot(pkg, uid, rootHints);
                        if (connectionrecord.root != null)
                        {
                            break MISSING_BLOCK_LABEL_181;
                        }
                        Log.i("MediaBrowserServiceCompat", (new StringBuilder()).append("No root for client ").append(pkg).append(" from service ").append(getClass().getName()).toString());
                        callbacks.onConnectFailed();
_L1:
                        return;
                        obj;
                        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(pkg).toString());
                        return;
                        try
                        {
                            mConnections.put(obj, connectionrecord);
                            if (mSession != null)
                            {
                                callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
                                return;
                            }
                        }
                        catch (RemoteException remoteexception)
                        {
                            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(pkg).toString());
                            mConnections.remove(obj);
                            return;
                        }
                          goto _L1
                    }

            
            {
                this$1 = final_servicebinder;
                callbacks = imediabrowserservicecompatcallbacks;
                pkg = s;
                rootHints = bundle;
                uid = I.this;
                super();
            }
                });
                return;
            }
        }

        public void disconnect(IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
        {
            mHandler.post(imediabrowserservicecompatcallbacks. new Runnable() {

                final ServiceBinder this$1;
                final IMediaBrowserServiceCompatCallbacks val$callbacks;

                public void run()
                {
                    IBinder ibinder = callbacks.asBinder();
                    if ((ConnectionRecord)mConnections.remove(ibinder) == null);
                }

            
            {
                this$1 = final_servicebinder;
                callbacks = IMediaBrowserServiceCompatCallbacks.this;
                super();
            }
            });
        }

        public void getMediaItem(final String mediaId, ResultReceiver resultreceiver)
        {
            if (TextUtils.isEmpty(mediaId) || resultreceiver == null)
            {
                return;
            } else
            {
                mHandler.post(resultreceiver. new Runnable() {

                    final ServiceBinder this$1;
                    final String val$mediaId;
                    final ResultReceiver val$receiver;

                    public void run()
                    {
                        performLoadItem(mediaId, receiver);
                    }

            
            {
                this$1 = final_servicebinder;
                mediaId = s;
                receiver = ResultReceiver.this;
                super();
            }
                });
                return;
            }
        }

        public void removeSubscription(String s, final IMediaBrowserServiceCompatCallbacks callbacks)
        {
            mHandler.post(s. new Runnable() {

                final ServiceBinder this$1;
                final IMediaBrowserServiceCompatCallbacks val$callbacks;
                final String val$id;

                public void run()
                {
                    Object obj = callbacks.asBinder();
                    obj = (ConnectionRecord)mConnections.get(obj);
                    if (obj == null)
                    {
                        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription for callback that isn't registered id=").append(id).toString());
                    } else
                    if (!((ConnectionRecord) (obj)).subscriptions.remove(id))
                    {
                        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription called for ").append(id).append(" which is not subscribed").toString());
                        return;
                    }
                }

            
            {
                this$1 = final_servicebinder;
                callbacks = imediabrowserservicecompatcallbacks;
                id = String.this;
                super();
            }
            });
        }

        private ServiceBinder()
        {
            this$0 = MediaBrowserServiceCompat.this;
            super();
        }

    }


    private static final boolean DBG = false;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserServiceCompat";
    private static final String TAG = "MediaBrowserServiceCompat";
    private ServiceBinder mBinder;
    private final ArrayMap mConnections = new ArrayMap();
    private final Handler mHandler = new Handler();
    android.support.v4.media.session.MediaSessionCompat.Token mSession;

    public MediaBrowserServiceCompat()
    {
    }

    private void addSubscription(String s, ConnectionRecord connectionrecord)
    {
        connectionrecord.subscriptions.add(s);
        performLoadChildren(s, connectionrecord);
    }

    private boolean isValidPackage(String s, int i)
    {
        if (s != null)
        {
            String as[] = getPackageManager().getPackagesForUid(i);
            int j = as.length;
            i = 0;
            while (i < j) 
            {
                if (as[i].equals(s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private void performLoadChildren(final String final_obj, ConnectionRecord connectionrecord)
    {
        Result result = new Result(connectionrecord) {

            final MediaBrowserServiceCompat this$0;
            final ConnectionRecord val$connection;
            final String val$parentId;

            volatile void onResultSent(Object obj)
            {
                onResultSent((List)obj);
            }

            void onResultSent(List list)
            {
                if (list == null)
                {
                    throw new IllegalStateException((new StringBuilder()).append("onLoadChildren sent null list for id ").append(parentId).toString());
                }
                if (mConnections.get(connection.callbacks.asBinder()) != connection)
                {
                    return;
                }
                try
                {
                    connection.callbacks.onLoadChildren(parentId, list);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(parentId).append(" package=").append(connection.pkg).toString());
                }
            }

            
            {
                this$0 = MediaBrowserServiceCompat.this;
                parentId = s;
                connection = connectionrecord;
                super(final_obj);
            }
        };
        onLoadChildren(final_obj, result);
        if (!result.isDone())
        {
            throw new IllegalStateException((new StringBuilder()).append("onLoadChildren must call detach() or sendResult() before returning for package=").append(connectionrecord.pkg).append(" id=").append(final_obj).toString());
        } else
        {
            return;
        }
    }

    private void performLoadItem(final String final_obj, ResultReceiver resultreceiver)
    {
        resultreceiver = new Result(resultreceiver) {

            final MediaBrowserServiceCompat this$0;
            final ResultReceiver val$receiver;

            void onResultSent(MediaBrowserCompat.MediaItem mediaitem)
            {
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaitem);
                receiver.send(0, bundle);
            }

            volatile void onResultSent(Object obj)
            {
                onResultSent((MediaBrowserCompat.MediaItem)obj);
            }

            
            {
                this$0 = MediaBrowserServiceCompat.this;
                receiver = resultreceiver;
                super(final_obj);
            }
        };
        onLoadItem(final_obj, resultreceiver);
        if (!resultreceiver.isDone())
        {
            throw new IllegalStateException((new StringBuilder()).append("onLoadItem must call detach() or sendResult() before returning for id=").append(final_obj).toString());
        } else
        {
            return;
        }
    }

    public void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
    {
        return mSession;
    }

    public void notifyChildrenChanged(final String parentId)
    {
        if (parentId == null)
        {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else
        {
            mHandler.post(new Runnable() {

                final MediaBrowserServiceCompat this$0;
                final String val$parentId;

                public void run()
                {
                    Iterator iterator = mConnections.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        Object obj = (IBinder)iterator.next();
                        obj = (ConnectionRecord)mConnections.get(obj);
                        if (((ConnectionRecord) (obj)).subscriptions.contains(parentId))
                        {
                            performLoadChildren(parentId, ((ConnectionRecord) (obj)));
                        }
                    } while (true);
                }

            
            {
                this$0 = MediaBrowserServiceCompat.this;
                parentId = s;
                super();
            }
            });
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        if ("android.media.browse.MediaBrowserServiceCompat".equals(intent.getAction()))
        {
            return mBinder;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        mBinder = new ServiceBinder();
    }

    public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

    public abstract void onLoadChildren(String s, Result result);

    public void onLoadItem(String s, Result result)
    {
        result.sendResult(null);
    }

    public void setSessionToken(final android.support.v4.media.session.MediaSessionCompat.Token token)
    {
        if (token == null)
        {
            throw new IllegalArgumentException("Session token may not be null.");
        }
        if (mSession != null)
        {
            throw new IllegalStateException("The session token has already been set.");
        } else
        {
            mSession = token;
            mHandler.post(new Runnable() {

                final MediaBrowserServiceCompat this$0;
                final android.support.v4.media.session.MediaSessionCompat.Token val$token;

                public void run()
                {
                    for (Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext();)
                    {
                        IBinder ibinder = (IBinder)iterator.next();
                        ConnectionRecord connectionrecord = (ConnectionRecord)mConnections.get(ibinder);
                        try
                        {
                            connectionrecord.callbacks.onConnect(connectionrecord.root.getRootId(), token, connectionrecord.root.getExtras());
                        }
                        catch (RemoteException remoteexception)
                        {
                            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Connection for ").append(connectionrecord.pkg).append(" is no longer valid.").toString());
                            mConnections.remove(ibinder);
                        }
                    }

                }

            
            {
                this$0 = MediaBrowserServiceCompat.this;
                token = token1;
                super();
            }
            });
            return;
        }
    }






}
