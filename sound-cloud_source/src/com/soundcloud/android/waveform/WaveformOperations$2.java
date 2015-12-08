// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformOperations, WaveformStorage, WaveformData

class val.trackUrn
    implements b
{

    final WaveformOperations this$0;
    final Urn val$trackUrn;

    public void call(WaveformData waveformdata)
    {
        DefaultSubscriber.fireAndForget(WaveformOperations.access$200(WaveformOperations.this).store(val$trackUrn, waveformdata));
    }

    public volatile void call(Object obj)
    {
        call((WaveformData)obj);
    }

    ()
    {
        this$0 = final_waveformoperations;
        val$trackUrn = Urn.this;
        super();
    }
}
