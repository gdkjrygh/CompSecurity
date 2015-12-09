// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

class sult extends sult
{

    final MediaBrowserServiceCompat this$0;
    final nnectionRecord val$connection;
    final String val$parentId;

    volatile void onResultSent(Object obj)
    {
        onResultSent((List)obj);
    }

    void onResultSent(List list)
    {
        if (list == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("onLoadChildren sent null list for id ").append(val$parentId).toString());
        }
        if (MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).get(val$connection.callbacks.asBinder()) != val$connection)
        {
            return;
        }
        try
        {
            val$connection.callbacks.onLoadChildren(val$parentId, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Log.w("MediaBrowserServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(val$parentId).append(" package=").append(val$connection.pkg).toString());
        }
    }

    nnectionRecord(nnectionRecord nnectionrecord)
    {
        this$0 = final_mediabrowserservicecompat;
        val$parentId = String.this;
        val$connection = nnectionrecord;
        super(final_mediabrowserservicecompat, final_obj);
    }
}
