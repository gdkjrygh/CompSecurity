// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayPublisher

class this._cls0
    implements f
{

    final PlayPublisher this$0;

    public volatile Object call(Object obj)
    {
        return call((sition)obj);
    }

    public b call(sition sition)
    {
        sition = PlayPublisher.access$000(PlayPublisher.this, sition);
        sition = ApiRequest.post(ApiEndpoints.PLAY_PUBLISH.path()).forPublicApi().withContent(sition).build();
        return PlayPublisher.access$200(PlayPublisher.this).response(sition).subscribeOn(PlayPublisher.access$100(PlayPublisher.this));
    }

    sition()
    {
        this$0 = PlayPublisher.this;
        super();
    }
}
