// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class VideoMessageVideoView extends VideoView
{
    public static interface VideoMessagePlaybackListener
    {

        public abstract void onPlaybackPause(VideoMessageVideoView videomessagevideoview);

        public abstract void onPlaybackStart(VideoMessageVideoView videomessagevideoview);
    }


    private VideoMessagePlaybackListener listener;

    public VideoMessageVideoView(Context context)
    {
        this(context, null);
    }

    public VideoMessageVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void pause()
    {
        super.pause();
        if (listener != null)
        {
            listener.onPlaybackPause(this);
        }
    }

    public void setVideoMessagePlaybackListener(VideoMessagePlaybackListener videomessageplaybacklistener)
    {
        listener = videomessageplaybacklistener;
    }

    public void start()
    {
        super.start();
        if (listener != null)
        {
            listener.onPlaybackStart(this);
        }
    }
}
