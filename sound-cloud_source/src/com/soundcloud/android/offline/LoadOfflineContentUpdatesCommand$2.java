// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, LoadOfflineContentUpdatesCommand

class this._cls0
    implements Predicate
{

    final LoadOfflineContentUpdatesCommand this$0;

    public boolean apply(DownloadRequest downloadrequest)
    {
        return downloadrequest.isSyncable();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((DownloadRequest)obj);
    }

    ()
    {
        this$0 = LoadOfflineContentUpdatesCommand.this;
        super();
    }
}
