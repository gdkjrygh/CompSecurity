// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRepository;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.cast:
//            CastOperations

class this._cls0
    implements f
{

    final CastOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Urn)obj);
    }

    public b call(Urn urn)
    {
        return CastOperations.access$000(CastOperations.this).track(urn);
    }

    ()
    {
        this$0 = CastOperations.this;
        super();
    }
}
