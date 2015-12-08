// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.events.UrnEvent;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineServiceInitiator, OfflineContentOperations

class this._cls0
    implements f
{

    final OfflineServiceInitiator this$0;

    public volatile Object call(Object obj)
    {
        return call((UrnEvent)obj);
    }

    public b call(UrnEvent urnevent)
    {
        return OfflineServiceInitiator.access$000(OfflineServiceInitiator.this).isOfflineLikedTracksEnabled();
    }

    ()
    {
        this$0 = OfflineServiceInitiator.this;
        super();
    }
}
