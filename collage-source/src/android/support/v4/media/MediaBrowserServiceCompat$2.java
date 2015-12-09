// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat

class val.parentId
    implements Runnable
{

    final MediaBrowserServiceCompat this$0;
    final String val$parentId;

    public void run()
    {
        Iterator iterator = MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (IBinder)iterator.next();
            obj = (nnectionRecord)MediaBrowserServiceCompat.access$100(MediaBrowserServiceCompat.this).get(obj);
            if (((nnectionRecord) (obj)).subscriptions.contains(val$parentId))
            {
                MediaBrowserServiceCompat.access$700(MediaBrowserServiceCompat.this, val$parentId, ((nnectionRecord) (obj)));
            }
        } while (true);
    }

    nnectionRecord()
    {
        this$0 = final_mediabrowserservicecompat;
        val$parentId = String.this;
        super();
    }
}
