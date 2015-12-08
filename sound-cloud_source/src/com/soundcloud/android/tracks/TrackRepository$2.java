// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackRepository

class val.trackUrn
    implements f
{

    final TrackRepository this$0;
    final Urn val$trackUrn;

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    public b call(PropertySet propertyset)
    {
        if (propertyset.isEmpty())
        {
            return TrackRepository.access$200(TrackRepository.this, val$trackUrn, TrackRepository.access$100(TrackRepository.this, val$trackUrn));
        } else
        {
            return b.just(propertyset);
        }
    }

    ()
    {
        this$0 = final_trackrepository;
        val$trackUrn = Urn.this;
        super();
    }
}
