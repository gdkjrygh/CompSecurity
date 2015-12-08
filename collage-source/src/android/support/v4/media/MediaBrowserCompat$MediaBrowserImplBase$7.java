// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.support.v4.util.ArrayMap;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat, IMediaBrowserServiceCompatCallbacks

class val.parentId
    implements Runnable
{

    final val.parentId this$0;
    final IMediaBrowserServiceCompatCallbacks val$callback;
    final List val$list;
    final String val$parentId;

    public void run()
    {
        if (cess._mth500(this._cls0.this, val$callback, "onLoadChildren"))
        {
            List list1 = val$list;
            if (list1 == null)
            {
                list1 = Collections.emptyList();
            }
            bscription bscription = (bscription)cess._mth1100(this._cls0.this).get(val$parentId);
            if (bscription != null)
            {
                bscription.callback.ChildrenLoaded(val$parentId, list1);
                return;
            }
        }
    }

    bscription()
    {
        this$0 = final_bscription;
        val$callback = imediabrowserservicecompatcallbacks;
        val$list = list1;
        val$parentId = String.this;
        super();
    }
}
