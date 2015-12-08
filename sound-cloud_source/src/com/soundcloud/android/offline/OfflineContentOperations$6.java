// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentOperations

class this._cls0
    implements b
{

    final OfflineContentOperations this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        OfflineContentOperations.access$200(OfflineContentOperations.this).publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.offlineContentRemoved(list));
    }

    ()
    {
        this$0 = OfflineContentOperations.this;
        super();
    }
}
