// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class VideoMusicSeekbar extends SeekBar
{

    private boolean a;

    public VideoMusicSeekbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public VideoMusicSeekbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
