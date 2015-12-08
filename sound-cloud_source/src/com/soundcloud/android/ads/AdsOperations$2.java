// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiAdsForTrack, AdsOperations

class val.sourceUrn
    implements b
{

    final AdsOperations this$0;
    final Urn val$sourceUrn;

    public void call(ApiAdsForTrack apiadsfortrack)
    {
        (new StringBuilder("Retrieved ads for ")).append(val$sourceUrn.toString()).append(": ").append(apiadsfortrack.contentString());
    }

    public volatile void call(Object obj)
    {
        call((ApiAdsForTrack)obj);
    }

    ()
    {
        this$0 = final_adsoperations;
        val$sourceUrn = Urn.this;
        super();
    }
}
