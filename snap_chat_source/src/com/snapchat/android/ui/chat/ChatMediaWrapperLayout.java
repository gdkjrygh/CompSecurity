// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class ChatMediaWrapperLayout extends RelativeLayout
{

    public boolean a;

    public ChatMediaWrapperLayout(Context context)
    {
        super(context);
        a = false;
    }

    public ChatMediaWrapperLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public ChatMediaWrapperLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            a = true;
        }
        return super.onTouchEvent(motionevent);
    }
}
