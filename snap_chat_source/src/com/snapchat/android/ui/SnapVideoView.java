// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

public class SnapVideoView extends TextureVideoView
{

    private int h;
    private int i;

    public SnapVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = 0;
        i = 0;
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        setMeasuredDimension(Math.max(1, h), Math.max(1, i));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void setVideoAspect(int j, int k)
    {
        h = Math.min(j, k);
        i = Math.max(j, k);
        requestLayout();
    }

    public void start()
    {
        super.start();
    }
}
