// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.HashSet;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

class val.id
    implements Runnable
{

    final val.id this$1;
    final IMediaBrowserServiceCompatCallbacks val$callbacks;
    final String val$id;

    public void run()
    {
        Object obj = val$callbacks.asBinder();
        obj = ()MediaBrowserServiceCompat.access$100(_fld0).get(obj);
        if (obj == null)
        {
            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription for callback that isn't registered id=").append(val$id).toString());
        } else
        if (!(() (obj)).subscriptions.remove(val$id))
        {
            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("removeSubscription called for ").append(val$id).append(" which is not subscribed").toString());
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$callbacks = imediabrowserservicecompatcallbacks;
        val$id = String.this;
        super();
    }
}
