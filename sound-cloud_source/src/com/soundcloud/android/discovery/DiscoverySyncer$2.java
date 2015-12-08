// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.sync.SyncResult;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoverySyncer

class this._cls0
    implements b
{

    final DiscoverySyncer this$0;

    public void call(SyncResult syncresult)
    {
        if (syncresult.wasSuccess())
        {
            DiscoverySyncer.access$000(DiscoverySyncer.this);
        }
    }

    public volatile void call(Object obj)
    {
        call((SyncResult)obj);
    }

    ()
    {
        this$0 = DiscoverySyncer.this;
        super();
    }
}
