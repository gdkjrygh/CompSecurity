// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.ModelCollection;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistTagStorage

class this._cls0
    implements b
{

    final PlaylistDiscoveryOperations this$0;

    public void call(ModelCollection modelcollection)
    {
        PlaylistDiscoveryOperations.access$000(PlaylistDiscoveryOperations.this).cachePopularTags(modelcollection.getCollection());
    }

    public volatile void call(Object obj)
    {
        call((ModelCollection)obj);
    }

    A()
    {
        this$0 = PlaylistDiscoveryOperations.this;
        super();
    }
}
