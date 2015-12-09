// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

class oken
    implements Runnable
{

    final MediaBrowserServiceCompat this$0;
    final android.support.v4.media.session. val$token;

    public void run()
    {
        for (Iterator iterator = MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).keySet().iterator(); iterator.hasNext();)
        {
            IBinder ibinder = (IBinder)iterator.next();
            nnectionRecord nnectionrecord = (nnectionRecord)MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).get(ibinder);
            try
            {
                nnectionrecord.callbacks.onConnect(nnectionrecord.root.getRootId(), val$token, nnectionrecord.root.getExtras());
            }
            catch (RemoteException remoteexception)
            {
                Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Connection for ").append(nnectionrecord.pkg).append(" is no longer valid.").toString());
                MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).remove(ibinder);
            }
        }

    }

    oken()
    {
        this$0 = final_mediabrowserservicecompat;
        val$token = android.support.v4.media.session.n.this;
        super();
    }
}
