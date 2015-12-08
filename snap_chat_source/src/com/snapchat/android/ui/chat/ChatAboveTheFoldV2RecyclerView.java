// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.snapchat.android.ui.AboveTheFoldV2RecyclerView;

public class ChatAboveTheFoldV2RecyclerView extends AboveTheFoldV2RecyclerView
{

    private Runnable s;

    public ChatAboveTheFoldV2RecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getY() > r && super.n == 1 && s != null)
        {
            s.run();
        }
        return super.onTouchEvent(motionevent);
    }

    public void setTouchBottomEdgeCallback(Runnable runnable)
    {
        s = runnable;
    }
}
