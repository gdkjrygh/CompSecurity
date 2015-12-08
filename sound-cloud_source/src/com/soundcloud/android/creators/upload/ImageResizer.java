// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService

public class ImageResizer
    implements Runnable
{

    EventBus eventBus;
    private final Recording recording;

    public ImageResizer(Recording recording1)
    {
        recording = recording1;
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public ImageResizer(Recording recording1, EventBus eventbus)
    {
        recording = recording1;
        eventBus = eventbus;
    }

    private void resize()
    {
        if (Log.isLoggable(UploadService.TAG, 3))
        {
            String s = UploadService.TAG;
            (new StringBuilder("resizing ")).append(recording.artwork_path);
        }
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.resizeStarted(recording));
        File file = File.createTempFile((new StringBuilder("upload_tmp_")).append(recording.getId()).toString(), ".jpg");
        long l = System.currentTimeMillis();
        if (ImageUtils.resizeImageFile(recording.artwork_path, file, 2048, 2048))
        {
            recording.resized_artwork_path = file;
            if (Log.isLoggable(UploadService.TAG, 3))
            {
                String s1 = UploadService.TAG;
                String.format("resized %s => %s  in %d ms", new Object[] {
                    recording.artwork_path, recording.resized_artwork_path, Long.valueOf(System.currentTimeMillis() - l)
                });
            }
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.resizeSuccess(recording));
            return;
        }
        String s3;
        try
        {
            String s2 = UploadService.TAG;
            (new StringBuilder("did not resize image ")).append(recording.artwork_path);
            recording.resized_artwork_path = recording.artwork_path;
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.resizeSuccess(recording));
            return;
        }
        catch (IOException ioexception)
        {
            s3 = UploadService.TAG;
        }
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
        return;
    }

    public void run()
    {
        String s = UploadService.TAG;
        (new StringBuilder("ImageResizer.run(")).append(recording).append(")");
        if (!recording.hasArtwork())
        {
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
            return;
        } else
        {
            resize();
            return;
        }
    }
}
