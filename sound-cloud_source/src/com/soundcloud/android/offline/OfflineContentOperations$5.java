// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentOperations, TrackDownloadsStorage, OfflineState

class this._cls0
    implements f
{

    final OfflineContentOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            return OfflineContentOperations.access$100(OfflineContentOperations.this).getLikesOfflineState();
        } else
        {
            return b.just(OfflineState.NO_OFFLINE);
        }
    }

    ()
    {
        this$0 = OfflineContentOperations.this;
        super();
    }
}
