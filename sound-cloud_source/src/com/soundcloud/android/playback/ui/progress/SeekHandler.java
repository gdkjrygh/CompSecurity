// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ScrubController

class SeekHandler extends Handler
{
    static class Factory
    {

        SeekHandler create(ScrubController scrubcontroller)
        {
            return new SeekHandler(scrubcontroller);
        }

        Factory()
        {
        }
    }


    private final WeakReference scrubControllerRef;

    SeekHandler(ScrubController scrubcontroller)
    {
        scrubControllerRef = new WeakReference(scrubcontroller);
    }

    public void handleMessage(Message message)
    {
        ScrubController scrubcontroller;
label0:
        {
            scrubcontroller = (ScrubController)scrubControllerRef.get();
            if (scrubcontroller != null)
            {
                if (!scrubcontroller.isDragging())
                {
                    break label0;
                }
                scrubcontroller.setPendingSeek((Float)message.obj);
            }
            return;
        }
        scrubcontroller.finishSeek((Float)message.obj);
    }
}
