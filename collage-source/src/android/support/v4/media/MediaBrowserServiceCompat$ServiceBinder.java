// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

private class <init> extends <init>
{

    final MediaBrowserServiceCompat this$0;

    public void addSubscription(final String id, final IMediaBrowserServiceCompatCallbacks callbacks)
    {
        MediaBrowserServiceCompat.access$300(MediaBrowserServiceCompat.this).post(new Runnable() {

            final MediaBrowserServiceCompat.ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;
            final String val$id;

            public void run()
            {
                Object obj = callbacks.asBinder();
                obj = (MediaBrowserServiceCompat.ConnectionRecord)MediaBrowserServiceCompat.access$100(this$0).get(obj);
                if (obj == null)
                {
                    Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("addSubscription for callback that isn't registered id=").append(id).toString());
                    return;
                } else
                {
                    MediaBrowserServiceCompat.access$400(this$0, id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)));
                    return;
                }
            }

            
            {
                this$1 = MediaBrowserServiceCompat.ServiceBinder.this;
                callbacks = imediabrowserservicecompatcallbacks;
                id = s;
                super();
            }
        });
    }

    public void connect(final String pkg, final Bundle rootHints, final IMediaBrowserServiceCompatCallbacks callbacks)
    {
        final int uid = Binder.getCallingUid();
        if (!MediaBrowserServiceCompat.access$000(MediaBrowserServiceCompat.this, pkg, uid))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(uid).append(" package=").append(pkg).toString());
        } else
        {
            MediaBrowserServiceCompat.access$300(MediaBrowserServiceCompat.this).post(new Runnable() {

                final MediaBrowserServiceCompat.ServiceBinder this$1;
                final IMediaBrowserServiceCompatCallbacks val$callbacks;
                final String val$pkg;
                final Bundle val$rootHints;
                final int val$uid;

                public void run()
                {
                    Object obj;
                    MediaBrowserServiceCompat.ConnectionRecord connectionrecord;
                    obj = callbacks.asBinder();
                    MediaBrowserServiceCompat.access$100(this$0).remove(obj);
                    connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0, null);
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
                        MediaBrowserServiceCompat.access$100(this$0).put(obj, connectionrecord);
                        if (mSession != null)
                        {
                            callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
                            return;
                        }
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(pkg).toString());
                        MediaBrowserServiceCompat.access$100(this$0).remove(obj);
                        return;
                    }
                      goto _L1
                }

            
            {
                this$1 = MediaBrowserServiceCompat.ServiceBinder.this;
                callbacks = imediabrowserservicecompatcallbacks;
                pkg = s;
                rootHints = bundle;
                uid = i;
                super();
            }
            });
            return;
        }
    }

    public void disconnect(final IMediaBrowserServiceCompatCallbacks callbacks)
    {
        MediaBrowserServiceCompat.access$300(MediaBrowserServiceCompat.this).post(new Runnable() {

            final MediaBrowserServiceCompat.ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;

            public void run()
            {
                android.os.IBinder ibinder = callbacks.asBinder();
                if ((MediaBrowserServiceCompat.ConnectionRecord)MediaBrowserServiceCompat.access$100(this$0).remove(ibinder) == null);
            }

            
            {
                this$1 = MediaBrowserServiceCompat.ServiceBinder.this;
                callbacks = imediabrowserservicecompatcallbacks;
                super();
            }
        });
    }

    public void getMediaItem(final String mediaId, final ResultReceiver receiver)
    {
        if (TextUtils.isEmpty(mediaId) || receiver == null)
        {
            return;
        } else
        {
            MediaBrowserServiceCompat.access$300(MediaBrowserServiceCompat.this).post(new Runnable() {

                final MediaBrowserServiceCompat.ServiceBinder this$1;
                final String val$mediaId;
                final ResultReceiver val$receiver;

                public void run()
                {
                    MediaBrowserServiceCompat.access$500(this$0, mediaId, receiver);
                }

            
            {
                this$1 = MediaBrowserServiceCompat.ServiceBinder.this;
                mediaId = s;
                receiver = resultreceiver;
                super();
            }
            });
            return;
        }
    }

    public void removeSubscription(final String id, final IMediaBrowserServiceCompatCallbacks callbacks)
    {
        MediaBrowserServiceCompat.access$300(MediaBrowserServiceCompat.this).post(new Runnable() {

            final MediaBrowserServiceCompat.ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;
            final String val$id;

            public void run()
            {
                Object obj = callbacks.asBinder();
                obj = (MediaBrowserServiceCompat.ConnectionRecord)MediaBrowserServiceCompat.access$100(this$0).get(obj);
                if (obj == null)
                {
                    Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription for callback that isn't registered id=").append(id).toString());
                } else
                if (!((MediaBrowserServiceCompat.ConnectionRecord) (obj)).subscriptions.remove(id))
                {
                    Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription called for ").append(id).append(" which is not subscribed").toString());
                    return;
                }
            }

            
            {
                this$1 = MediaBrowserServiceCompat.ServiceBinder.this;
                callbacks = imediabrowserservicecompatcallbacks;
                id = s;
                super();
            }
        });
    }

    private _cls5.val.receiver()
    {
        this$0 = MediaBrowserServiceCompat.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
