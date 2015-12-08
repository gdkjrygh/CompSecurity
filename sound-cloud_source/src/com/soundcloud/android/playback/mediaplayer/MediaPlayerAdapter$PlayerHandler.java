// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            MediaPlayerAdapter

static class  extends Handler
{

    static final int CLEAR_LAST_SEEK = 0;
    static final int SEND_PROGRESS = 1;
    private WeakReference mediaPlayerAdapterWeakReference;

    public void handleMessage(Message message)
    {
        MediaPlayerAdapter mediaplayeradapter = (MediaPlayerAdapter)mediaPlayerAdapterWeakReference.get();
        if (mediaplayeradapter == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            MediaPlayerAdapter.access$002(mediaplayeradapter, -1L);
            return;

        case 1: // '\001'
            MediaPlayerAdapter.access$100(mediaplayeradapter);
            break;
        }
        sendEmptyMessageDelayed(1, 500L);
    }

    void setMediaPlayerAdapter(MediaPlayerAdapter mediaplayeradapter)
    {
        mediaPlayerAdapterWeakReference = new WeakReference(mediaplayeradapter);
    }

    ()
    {
    }
}
