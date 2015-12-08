// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.List;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter, SoundRecorder

class it> extends DefaultSubscriber
{

    final RecordPresenter this$0;

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        if (!list.isEmpty())
        {
            list = (Recording)list.get(0);
            RecordPresenter.access$000(RecordPresenter.this).setRecording(list);
        }
        configureStateBasedOnRecorder();
    }

    ()
    {
        this$0 = RecordPresenter.this;
        super();
    }
}
