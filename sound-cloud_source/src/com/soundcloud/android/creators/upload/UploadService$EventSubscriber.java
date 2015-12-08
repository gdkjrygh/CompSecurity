// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService, UploadNotificationController

private final class <init> extends DefaultSubscriber
{

    final UploadService this$0;

    public final void onNext(UploadEvent uploadevent)
    {
        Recording recording = uploadevent.getRecording();
        if (uploadevent.isStarted())
        {
            UploadService.access$300(UploadService.this, recording);
        } else
        {
            if (uploadevent.isError() || uploadevent.isCancelled())
            {
                recording.setUploadFailed(uploadevent.isCancelled());
                UploadService.access$400(UploadService.this);
                UploadService.access$500(UploadService.this).remove(Long.valueOf(recording.getId()));
                UploadService.access$600(UploadService.this, recording);
                return;
            }
            if (uploadevent.isResizeStarted() || uploadevent.isProcessingStarted())
            {
                UploadService.access$700(UploadService.this);
                return;
            }
            if (uploadevent.isResizeSuccess() || uploadevent.isProcessingSuccess())
            {
                UploadService.access$800(UploadService.this);
                UploadService.access$300(UploadService.this, recording);
                return;
            }
            if (uploadevent.isTransferStarted())
            {
                notificationController.showTransferringNotification(recording, 0);
                UploadService.access$900(UploadService.this);
                return;
            }
            if (uploadevent.isTransferProgress())
            {
                notificationController.showTransferringNotification(recording, uploadevent.getProgress());
                return;
            }
            if (uploadevent.isTransferSuccess())
            {
                <init> <init>1 = (howTransferringNotification)UploadService.access$500(UploadService.this).get(Long.valueOf(recording.getId()));
                if (<init>1 != null)
                {
                    <init>1._fld0 = uploadevent.getTrack();
                    SoundRecorder.getInstance(getApplicationContext()).reset(true);
                    UploadService.access$400(UploadService.this);
                    UploadService.access$600(UploadService.this, recording);
                    eventBus.publish(EventQueue.UPLOAD, UploadEvent.success(recording));
                    return;
                }
            }
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((UploadEvent)obj);
    }

    private ()
    {
        this$0 = UploadService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
