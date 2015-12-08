// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView, MMLog, MMLayout

private static class inlineVideoViewRef
    implements Runnable
{

    WeakReference inlineVideoViewRef;
    Double lastTimeInSeconds;
    boolean reportingActive;

    public void run()
    {
        Object obj;
        InlineVideoView inlinevideoview;
        if (!reportingActive)
        {
            MMLog.d("InlineVideoView", (new StringBuilder()).append("Reporting disabled, shutting down seek reporting runnable <").append(this).append(">").toString());
            return;
        }
        inlinevideoview = (InlineVideoView)inlineVideoViewRef.get();
        if (inlinevideoview == null)
        {
            MMLog.e("InlineVideoView", (new StringBuilder()).append("Video view instance is null, shutting down seek reporting runnable <").append(this).append(">").toString());
            return;
        }
        obj = null;
        if (!inlinevideoview.isPlaying()) goto _L2; else goto _L1
_L1:
        double d = Math.floor((float)inlinevideoview.getCurrentPosition() / 1000F);
        obj = Double.valueOf(d);
_L4:
        if (obj == null)
        {
            MMLog.d("InlineVideoView", (new StringBuilder()).append("No valid seek time found, shutting down seek reporting runnable <").append(this).append(">").toString());
            return;
        }
        break MISSING_BLOCK_LABEL_208;
_L2:
        if (!inlinevideoview.isCompleted) goto _L4; else goto _L3
_L3:
        d = Math.ceil((float)inlinevideoview.duration / 1000F);
        obj = Double.valueOf(d);
          goto _L4
        obj;
        MMLog.e("InlineVideoView", (new StringBuilder()).append("Illegal exception encountered when trying to get play state, shutting down seek reporting runnable <").append(this).append(">").toString());
        return;
        if (!inlinevideoview.videoVisible)
        {
            if (InlineVideoView.access$300(inlinevideoview) && InlineVideoView.access$400(inlinevideoview))
            {
                InlineVideoView.access$500(inlinevideoview);
            } else
            if (!InlineVideoView.access$300(inlinevideoview))
            {
                InlineVideoView.access$500(inlinevideoview);
            }
        }
        if (lastTimeInSeconds == null || Double.compare(((Double) (obj)).doubleValue(), lastTimeInSeconds.doubleValue()) != 0)
        {
            MMLayout mmlayout = (MMLayout)InlineVideoView.access$600(inlinevideoview).get();
            if (mmlayout == null)
            {
                MMLog.e("InlineVideoView", (new StringBuilder()).append("Unable to send video seek time, no valid layout.  Shutting down seek reporting runnable <").append(this).append(">").toString());
                return;
            }
            mmlayout.loadUrl((new StringBuilder()).append("javascript:MMJS.inlineVideo.updateVideoSeekTime(").append(obj).append(");").toString());
            lastTimeInSeconds = ((Double) (obj));
        }
        InlineVideoView.access$700(inlinevideoview).postDelayed(this, 1000L);
        return;
    }

    (InlineVideoView inlinevideoview)
    {
        lastTimeInSeconds = null;
        reportingActive = true;
        if (inlinevideoview == null)
        {
            MMLog.e("InlineVideoView", "Created seek reporting runnable with a null video view instance");
        }
        inlineVideoViewRef = new WeakReference(inlinevideoview);
    }
}
