// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.rx.eventbus.EventBus;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            Uploader, UserCanceledException

private class recording
    implements com.soundcloud.android.api.essListener
{

    private long lastPublished;
    private final Recording recording;
    final Uploader this$0;

    public void update(long l, long l1)
        throws IOException
    {
        if (isCancelled())
        {
            throw new UserCanceledException();
        }
        if (System.currentTimeMillis() - lastPublished > 500L)
        {
            int i = (int)Math.min(100L, (100L * l) / l1);
            Uploader.access$200(Uploader.this).publish(EventQueue.UPLOAD, UploadEvent.transferProgress(recording, i));
            lastPublished = System.currentTimeMillis();
        }
    }

    public (Recording recording1)
    {
        this$0 = Uploader.this;
        super();
        recording = recording1;
    }
}
