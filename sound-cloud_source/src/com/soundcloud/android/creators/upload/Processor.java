// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.PlaybackStream;
import com.soundcloud.android.creators.record.jni.EncoderException;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService

public class Processor
    implements Runnable
{

    EventBus eventBus;
    private final Recording recording;

    public Processor(Recording recording1)
    {
        recording = recording1;
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public Processor(Recording recording1, EventBus eventbus)
    {
        recording = recording1;
        eventBus = eventbus;
    }

    public void run()
    {
        java.io.File file = recording.getEncodedFile();
        Object obj = recording.getProcessedFile();
        long l = recording.getPlaybackStream().getStartPos();
        long l1 = recording.getPlaybackStream().getEndPos();
        String s1 = UploadService.TAG;
        String.format("Processor.run(%s, start=%d, end=%d)", new Object[] {
            recording, Long.valueOf(l), Long.valueOf(l1)
        });
        if (l > 0L || l1 != -1L)
        {
            try
            {
                eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingStarted(recording));
                VorbisEncoder.extract(recording.getEncodedFile(), ((java.io.File) (obj)), (double)l / 1000D, (double)l1 / 1000D);
                eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingSuccess(recording));
                return;
            }
            catch (EncoderException encoderexception)
            {
                encoderexception = UploadService.TAG;
            }
            (new StringBuilder("error processing ")).append(file);
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
            return;
        } else
        {
            String s = UploadService.TAG;
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingSuccess(recording));
            return;
        }
    }
}
