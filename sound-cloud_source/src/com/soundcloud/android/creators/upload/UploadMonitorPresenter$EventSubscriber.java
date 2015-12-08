// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorPresenter

private final class <init> extends DefaultSubscriber
{

    final UploadMonitorPresenter this$0;

    public final void onNext(UploadEvent uploadevent)
    {
        if (!UploadMonitorPresenter.access$100(UploadMonitorPresenter.this))
        {
            int i = uploadevent.getProgress();
            UploadMonitorPresenter.access$202(UploadMonitorPresenter.this, uploadevent.isUploading());
            UploadMonitorPresenter.access$300(UploadMonitorPresenter.this, uploadevent.getRecording());
            if (uploadevent.isStarted())
            {
                UploadMonitorPresenter.access$400(UploadMonitorPresenter.this);
                return;
            }
            if (uploadevent.isProcessing())
            {
                UploadMonitorPresenter.access$400(UploadMonitorPresenter.this);
                return;
            }
            if (uploadevent.isTransfer())
            {
                UploadMonitorPresenter.access$500(UploadMonitorPresenter.this, i);
                return;
            }
            if (uploadevent.isFinished())
            {
                UploadMonitorPresenter.access$600(UploadMonitorPresenter.this, uploadevent.isUploadSuccess());
                return;
            }
            if (uploadevent.isCancelled())
            {
                UploadMonitorPresenter.access$102(UploadMonitorPresenter.this, true);
                UploadMonitorPresenter.access$700(UploadMonitorPresenter.this);
                return;
            }
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((UploadEvent)obj);
    }

    private ()
    {
        this$0 = UploadMonitorPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
