// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

class val.callbacks
    implements Runnable
{

    final is._cls0 this$1;
    final IMediaBrowserServiceCompatCallbacks val$callbacks;

    public void run()
    {
        android.os.IBinder ibinder = val$callbacks.asBinder();
        if (()MediaBrowserServiceCompat.access$100(_fld0).remove(ibinder) == null);
    }

    ()
    {
        this$1 = final_;
        val$callbacks = IMediaBrowserServiceCompatCallbacks.this;
        super();
    }
}
