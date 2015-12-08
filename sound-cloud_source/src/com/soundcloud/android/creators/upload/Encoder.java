// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.PlaybackStream;
import com.soundcloud.android.creators.record.jni.EncoderOptions;
import com.soundcloud.android.creators.record.jni.ProgressListener;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import rx.Y;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UserCanceledException, UploadService

public class Encoder
    implements ProgressListener, Runnable
{
    private final class EventSubscriber extends DefaultSubscriber
    {

        final Encoder this$0;

        public final void onNext(UploadEvent uploadevent)
        {
            if (uploadevent.isCancelled() && recording.getId() == uploadevent.getRecording().getId())
            {
                uploadevent = UploadService.TAG;
                (new StringBuilder("canceling encoding of ")).append(recording);
                cancel();
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((UploadEvent)obj);
        }

        private EventSubscriber()
        {
            this$0 = Encoder.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private volatile boolean cancelled;
    private final EventBus eventBus;
    private long lastProgressSent;
    private final Recording recording;
    private final Y subscription;

    public Encoder(Recording recording1, EventBus eventbus)
    {
        recording = recording1;
        eventBus = eventbus;
        SoundCloudApplication.getObjectGraph().a(this);
        subscription = eventBus.subscribe(EventQueue.UPLOAD, new EventSubscriber(null));
    }

    private void cancel()
    {
        cancelled = true;
    }

    public void onProgress(long l, long l1)
        throws UserCanceledException
    {
        if (Log.isLoggable(UploadService.TAG, 3))
        {
            String s = UploadService.TAG;
            (new StringBuilder("Encoder#onProgress(")).append(l).append(", ").append(l1).append(")");
        }
        if (cancelled)
        {
            throw new UserCanceledException();
        }
        if (lastProgressSent == 0L || System.currentTimeMillis() - lastProgressSent > 1000L)
        {
            int i = (int)Math.min(100L, Math.round(100D * ((double)l / (double)l1)));
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingProgress(recording, i));
            lastProgressSent = System.currentTimeMillis();
        }
    }

    public void run()
    {
        Object obj;
        Object obj2;
        obj = UploadService.TAG;
        (new StringBuilder("Encoder.run(")).append(recording).append(")");
        obj2 = recording.getFile();
        obj = recording.getEncodedFile();
        Object obj1 = recording.getPlaybackStream();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        throw new IOException("No playbackstream available");
        obj;
        obj = null;
_L20:
        obj1 = UploadService.TAG;
        IOUtils.deleteFile(((File) (obj)));
        subscription.unsubscribe();
        return;
_L2:
        if (((File) (obj2)).exists()) goto _L4; else goto _L3
_L3:
        if (!((File) (obj)).exists()) goto _L6; else goto _L5
_L5:
        obj2 = obj;
_L4:
        if (!((PlaybackStream) (obj1)).isFiltered()) goto _L8; else goto _L7
_L7:
        File file = recording.getProcessedFile();
_L14:
        EncoderOptions encoderoptions;
        encoderoptions = new EncoderOptions(EncoderOptions.DEFAULT.quality, ((PlaybackStream) (obj1)).getStartPos(), ((PlaybackStream) (obj1)).getEndPos(), this, ((PlaybackStream) (obj1)).getPlaybackFilter());
        if (Log.isLoggable(UploadService.TAG, 3))
        {
            obj = UploadService.TAG;
            (new StringBuilder("encoding from source ")).append(((File) (obj2)).getAbsolutePath());
        }
        obj = File.createTempFile((new StringBuilder("encoder-")).append(recording.getId()).toString(), ".ogg", file.getParentFile());
        obj1 = obj;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingStarted(recording));
        obj1 = obj;
        long l = System.currentTimeMillis();
        obj1 = obj;
        VorbisEncoder.encodeFile(((File) (obj2)), ((File) (obj)), encoderoptions);
        obj1 = obj;
        if (!((File) (obj)).exists()) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        if (((File) (obj)).length() <= 0L) goto _L10; else goto _L11
_L11:
        obj1 = obj;
        obj2 = UploadService.TAG;
        obj1 = obj;
        (new StringBuilder("encoding finished in ")).append(System.currentTimeMillis() - l).append(" msecs");
        obj1 = obj;
        if (!((File) (obj)).renameTo(file)) goto _L13; else goto _L12
_L12:
        obj1 = obj;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.processingSuccess(recording));
_L15:
        IOUtils.deleteFile(((File) (obj)));
        subscription.unsubscribe();
        return;
_L6:
        throw new FileNotFoundException("No encoding file found");
        obj;
        obj = null;
_L16:
        obj1 = obj;
        obj2 = UploadService.TAG;
        obj1 = obj;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
        IOUtils.deleteFile(((File) (obj)));
        subscription.unsubscribe();
        return;
_L8:
        file = recording.getEncodedFile();
          goto _L14
_L13:
        obj1 = obj;
        obj2 = UploadService.TAG;
        obj1 = obj;
        (new StringBuilder("could not rename ")).append(obj).append(" to ").append(file);
        obj1 = obj;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
          goto _L15
_L10:
        obj1 = obj;
        obj2 = UploadService.TAG;
        obj1 = obj;
        (new StringBuilder("encoded file ")).append(obj).append(" does not exist or is empty");
        obj1 = obj;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
          goto _L15
        obj1;
          goto _L16
        obj;
        obj1 = null;
_L18:
        IOUtils.deleteFile(((File) (obj1)));
        subscription.unsubscribe();
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L18; else goto _L17
_L17:
        UserCanceledException usercanceledexception;
        usercanceledexception;
        if (true) goto _L20; else goto _L19
_L19:
    }


}
