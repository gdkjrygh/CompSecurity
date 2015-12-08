// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService, DownloadOperations

class this._cls0
    implements f
{

    final OfflineContentService this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        return downloadOperations.removeOfflineTracks(list);
    }

    ()
    {
        this$0 = OfflineContentService.this;
        super();
    }
}
