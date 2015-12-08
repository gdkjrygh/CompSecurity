// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.ModelCollection;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations

class this._cls0
    implements f
{

    final PlaylistDiscoveryOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((ModelCollection)obj);
    }

    public List call(ModelCollection modelcollection)
    {
        return modelcollection.getCollection();
    }

    A()
    {
        this$0 = PlaylistDiscoveryOperations.this;
        super();
    }
}
