// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import rx.b.g;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineState, TrackDownloadsStorage

class this._cls0
    implements g
{

    final TrackDownloadsStorage this$0;

    public OfflineState call(Boolean boolean1, Boolean boolean2)
    {
        if (boolean1.booleanValue())
        {
            return OfflineState.REQUESTED;
        }
        if (boolean2.booleanValue())
        {
            return OfflineState.DOWNLOADED;
        } else
        {
            return OfflineState.UNAVAILABLE;
        }
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Boolean)obj, (Boolean)obj1);
    }

    ()
    {
        this$0 = TrackDownloadsStorage.this;
        super();
    }
}
