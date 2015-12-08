// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.kit.utils:
//            GifDecoder

class Task extends BackgroundTask
{

    final GifDecoder this$0;
    final com.pinterest.ui.grid.pin.rawable.DownloadGifTask.Listener val$listener;

    public void onFinish()
    {
        if (position != 0)
        {
            return;
        } else
        {
            android.graphics.Bitmap bitmap = getBitmapFromMemoryMap(1);
            val$listener.onFirstFrameReady(bitmap);
            GifDecoder.access$102(GifDecoder.this, true);
            return;
        }
    }

    public void run()
    {
        if (isStatusComplete())
        {
            position = GifDecoder.access$000(GifDecoder.this);
        }
    }

    nloadGifTask.Listener()
    {
        this$0 = final_gifdecoder;
        val$listener = com.pinterest.ui.grid.pin.rawable.DownloadGifTask.Listener.this;
        super();
    }
}
