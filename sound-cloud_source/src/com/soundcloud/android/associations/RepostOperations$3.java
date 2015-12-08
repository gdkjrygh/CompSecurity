// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.java.collections.PropertySet;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostOperations

class this._cls0
    implements f
{

    final RepostOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    public b call(PropertySet propertyset)
    {
        Urn urn = (Urn)propertyset.get(PlayableProperty.URN);
        return RepostOperations.access$400(RepostOperations.this, urn).map(RxUtils.returning(propertyset)).onErrorResumeNext(RepostOperations.access$300(RepostOperations.this, urn));
    }

    ()
    {
        this$0 = RepostOperations.this;
        super();
    }
}
