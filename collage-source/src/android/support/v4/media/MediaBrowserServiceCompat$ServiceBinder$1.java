// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

class val.uid
    implements Runnable
{

    final is._cls0 this$1;
    final IMediaBrowserServiceCompatCallbacks val$callbacks;
    final String val$pkg;
    final Bundle val$rootHints;
    final int val$uid;

    public void run()
    {
        Object obj;
         ;
        obj = val$callbacks.asBinder();
        MediaBrowserServiceCompat.access$100(_fld0).remove(obj);
         = new (_fld0, null);
        .pkg = val$pkg;
        .rootHints = val$rootHints;
        .callbacks = val$callbacks;
        .root = onGetRoot(val$pkg, val$uid, val$rootHints);
        if (.root != null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        Log.i("MediaBrowserServiceCompat", (new StringBuilder()).append("No root for client ").append(val$pkg).append(" from service ").append(getClass().getName()).toString());
        val$callbacks.onConnectFailed();
_L1:
        return;
        obj;
        Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(val$pkg).toString());
        return;
        try
        {
            MediaBrowserServiceCompat.access$100(_fld0).put(obj, );
            if (mSession != null)
            {
                val$callbacks.onConnect(.root.ootId(), mSession, .root.xtras());
                return;
            }
        }
        catch (RemoteException remoteexception)
        {
            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(val$pkg).toString());
            MediaBrowserServiceCompat.access$100(_fld0).remove(obj);
            return;
        }
          goto _L1
    }

    ()
    {
        this$1 = final_;
        val$callbacks = imediabrowserservicecompatcallbacks;
        val$pkg = s;
        val$rootHints = bundle;
        val$uid = I.this;
        super();
    }
}
