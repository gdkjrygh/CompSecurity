// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController

private final class <init> extends DefaultSubscriber
{

    final AdsController this$0;

    public final void onNext(Object obj)
    {
        obj = AdsController.access$000(AdsController.this).getCurrentPlayQueueItem().getUrn();
        <init> <init>1 = new this._cls0(AdsController.this, AdsController.access$000(AdsController.this).getCurrentPosition(), ((com.soundcloud.android.model.Urn) (obj)));
        AdsController.access$1000(AdsController.this, ((com.soundcloud.android.model.Urn) (obj)), <init>1);
    }

    private ()
    {
        this$0 = AdsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
