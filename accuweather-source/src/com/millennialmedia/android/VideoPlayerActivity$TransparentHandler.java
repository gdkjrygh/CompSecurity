// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

private static class activityRef extends Handler
{

    private WeakReference activityRef;

    public void handleMessage(Message message)
    {
        VideoPlayerActivity videoplayeractivity = (VideoPlayerActivity)activityRef.get();
        if (videoplayeractivity != null)
        {
            videoplayeractivity.handleTransparentMessage(message);
        }
    }

    public (VideoPlayerActivity videoplayeractivity)
    {
        activityRef = new WeakReference(videoplayeractivity);
    }
}
