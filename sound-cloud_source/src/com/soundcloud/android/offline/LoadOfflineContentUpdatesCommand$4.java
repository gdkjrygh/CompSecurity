// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.functions.Predicate;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, LoadOfflineContentUpdatesCommand

class val.pendingRemovals
    implements Predicate
{

    final LoadOfflineContentUpdatesCommand this$0;
    final List val$pendingRemovals;

    public boolean apply(DownloadRequest downloadrequest)
    {
        return val$pendingRemovals.contains(downloadrequest.getTrack());
    }

    public volatile boolean apply(Object obj)
    {
        return apply((DownloadRequest)obj);
    }

    ()
    {
        this$0 = final_loadofflinecontentupdatescommand;
        val$pendingRemovals = List.this;
        super();
    }
}
