// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistTagStorage

class this._cls0
    implements f
{

    final PlaylistDiscoveryOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        if ((list.isEmpty() || PlaylistDiscoveryOperations.access$000(PlaylistDiscoveryOperations.this).isTagsCacheExpired()) && PlaylistDiscoveryOperations.access$100(PlaylistDiscoveryOperations.this).isNetworkConnected())
        {
            return PlaylistDiscoveryOperations.access$200(PlaylistDiscoveryOperations.this);
        } else
        {
            return b.just(list);
        }
    }

    A()
    {
        this$0 = PlaylistDiscoveryOperations.this;
        super();
    }
}
