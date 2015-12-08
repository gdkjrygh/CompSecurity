// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.widget.MediaController;
import com.skype.android.util.accessibility.AccessibilityUtil;

public class VideoMessageMediaController extends MediaController
{
    public static interface VideoMessageMediaControllerListener
    {

        public abstract void onHide(MediaController mediacontroller);

        public abstract void onShow(MediaController mediacontroller);
    }


    private AccessibilityUtil accessibility;
    private VideoMessageMediaControllerListener listener;

    public VideoMessageMediaController(Context context)
    {
        super(context);
        accessibility = new AccessibilityUtil(context);
    }

    public void hide()
    {
        if (accessibility.a())
        {
            show();
        } else
        {
            super.hide();
            if (listener != null)
            {
                listener.onHide(this);
                return;
            }
        }
    }

    public void setVideoMessageMediaControllerListener(VideoMessageMediaControllerListener videomessagemediacontrollerlistener)
    {
        listener = videomessagemediacontrollerlistener;
    }

    public void show(int i)
    {
        super.show(i);
        if (listener != null)
        {
            listener.onShow(this);
        }
    }
}
