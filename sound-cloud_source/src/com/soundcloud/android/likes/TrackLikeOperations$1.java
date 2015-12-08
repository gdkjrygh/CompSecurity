// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikeOperations

class this._cls0
    implements b
{

    final TrackLikeOperations this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        if (TrackLikeOperations.access$000(TrackLikeOperations.this).isWifiConnected() && !list.isEmpty())
        {
            TrackLikeOperations.access$100(TrackLikeOperations.this).requestTracksSync(list);
        }
    }

    r()
    {
        this$0 = TrackLikeOperations.this;
        super();
    }
}
