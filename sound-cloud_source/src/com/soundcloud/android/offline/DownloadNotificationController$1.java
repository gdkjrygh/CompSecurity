// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadState, DownloadNotificationController

class this._cls0
    implements Predicate
{

    final DownloadNotificationController this$0;

    public boolean apply(DownloadState downloadstate)
    {
        return downloadstate.isConnectionError() || downloadstate.isDownloadFailed() || downloadstate.isUnavailable();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((DownloadState)obj);
    }

    ()
    {
        this$0 = DownloadNotificationController.this;
        super();
    }
}
