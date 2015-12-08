// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordActivity

class nit> extends DefaultSubscriber
{

    final RecordActivity this$0;

    public void onNext(UploadEvent uploadevent)
    {
        if (uploadevent.isUploading())
        {
            displayMonitor(uploadevent.getRecording());
            return;
        }
        if (!RecordActivity.access$000(RecordActivity.this, getIntent()))
        {
            displayRecord();
            return;
        } else
        {
            onRecordToMetadata(false);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((UploadEvent)obj);
    }

    ()
    {
        this$0 = RecordActivity.this;
        super();
    }
}
