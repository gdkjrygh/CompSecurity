// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations

class this._cls0
    implements f
{

    final AdsController this$0;

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    public b call(PropertySet propertyset)
    {
        return AdsController.access$100(AdsController.this).ads((Urn)propertyset.get(TrackProperty.URN));
    }

    ()
    {
        this$0 = AdsController.this;
        super();
    }
}
