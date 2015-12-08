// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.net.Uri;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity, MMActivity, OverlaySettings

static class creatorAdImplInternalId extends creatorAdImplInternalId
{

    WeakReference activityRef;

    public OverlaySettings getOverlaySettings()
    {
        Object obj = null;
        VideoPlayerActivity videoplayeractivity = (VideoPlayerActivity)activityRef.get();
        OverlaySettings overlaysettings = obj;
        if (videoplayeractivity != null)
        {
            overlaysettings = obj;
            if (videoplayeractivity.lastOverlayOrientation != null)
            {
                overlaysettings = new OverlaySettings();
                overlaysettings.orientation = videoplayeractivity.lastOverlayOrientation;
            }
        }
        return overlaysettings;
    }

    public boolean isHandlingMMVideo(Uri uri)
    {
        final VideoPlayerActivity activity = (VideoPlayerActivity)activityRef.get();
        if (activity != null)
        {
            activity.runOnUiThread(new Runnable() {

                final VideoPlayerActivity.VideoRedirectionListener this$0;
                final VideoPlayerActivity val$activity;

                public void run()
                {
                    activity.enableButtons();
                }

            
            {
                this$0 = VideoPlayerActivity.VideoRedirectionListener.this;
                activity = videoplayeractivity;
                super();
            }
            });
            if (uri != null && VideoPlayerActivity.access$000(activity, uri))
            {
                activity.processVideoPlayerUri(uri.getHost());
                return true;
            }
        }
        return false;
    }

    public _cls1.val.activity(VideoPlayerActivity videoplayeractivity)
    {
        if (videoplayeractivity != null)
        {
            activityRef = new WeakReference(videoplayeractivity);
            if (videoplayeractivity.activity != null)
            {
                creatorAdImplInternalId = videoplayeractivity.activity.creatorAdImplInternalId;
            }
        }
    }
}
