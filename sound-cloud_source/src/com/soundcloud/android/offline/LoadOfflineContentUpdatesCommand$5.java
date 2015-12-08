// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.functions.Predicate;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, LoadOfflineContentUpdatesCommand

class val.tracksToRestore
    implements Predicate
{

    final LoadOfflineContentUpdatesCommand this$0;
    final List val$downloadedTracks;
    final List val$pendingDownloads;
    final Collection val$tracksToRestore;

    public boolean apply(DownloadRequest downloadrequest)
    {
        return !val$pendingDownloads.contains(downloadrequest.getTrack()) && !val$downloadedTracks.contains(downloadrequest.getTrack()) && !val$tracksToRestore.contains(downloadrequest);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((DownloadRequest)obj);
    }

    ()
    {
        this$0 = final_loadofflinecontentupdatescommand;
        val$pendingDownloads = list;
        val$downloadedTracks = list1;
        val$tracksToRestore = Collection.this;
        super();
    }
}
