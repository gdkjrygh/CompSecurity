// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            Encoder, UploadService

private final class <init> extends DefaultSubscriber
{

    final Encoder this$0;

    public final void onNext(UploadEvent uploadevent)
    {
        if (uploadevent.isCancelled() && Encoder.access$100(Encoder.this).getId() == uploadevent.getRecording().getId())
        {
            uploadevent = UploadService.TAG;
            (new StringBuilder("canceling encoding of ")).append(Encoder.access$100(Encoder.this));
            Encoder.access$200(Encoder.this);
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((UploadEvent)obj);
    }

    private ()
    {
        this$0 = Encoder.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
