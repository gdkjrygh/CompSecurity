// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations

class this._cls0
    implements Predicate
{

    final DownloadOperations this$0;

    public boolean apply(Urn urn)
    {
        return !DownloadOperations.access$000(DownloadOperations.this).isCurrentTrack(urn);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Urn)obj);
    }

    _cls9()
    {
        this$0 = DownloadOperations.this;
        super();
    }
}
