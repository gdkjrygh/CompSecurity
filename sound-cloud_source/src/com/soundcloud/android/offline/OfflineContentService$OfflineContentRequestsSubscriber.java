// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.MoreCollections;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService, OfflineStatePublisher, DownloadHandler, OfflineContentUpdates, 
//            DownloadQueue

private class <init> extends DefaultSubscriber
{

    final OfflineContentService this$0;

    public void onNext(OfflineContentUpdates offlinecontentupdates)
    {
        (new StringBuilder("Received OfflineContentRequests: ")).append(offlinecontentupdates);
        publisher.setUpdates(offlinecontentupdates);
        publisher.publishNotDownloadableStateChanges(queue, OfflineContentService.access$000(OfflineContentService.this).getCurrentTrack());
        queue.set(MoreCollections.filter(offlinecontentupdates.allDownloadRequests, OfflineContentService.access$200(OfflineContentService.this)));
        publisher.publishDownloadsRequested(queue.getRequests());
        OfflineContentService.access$300(OfflineContentService.this);
        if (OfflineContentService.access$400(OfflineContentService.this, offlinecontentupdates))
        {
            OfflineContentService.access$000(OfflineContentService.this).cancel();
            return;
        } else
        {
            OfflineContentService.access$500(OfflineContentService.this);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((OfflineContentUpdates)obj);
    }

    private ()
    {
        this$0 = OfflineContentService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
