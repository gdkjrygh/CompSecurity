// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.kit.application.Resources;

public class MainModalContainer extends LinearLayout
    implements android.view.View.OnTouchListener
{

    private TransitionDrawable _background;

    public MainModalContainer(Context context)
    {
        this(context, null);
    }

    public MainModalContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MainModalContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        _background = new TransitionDrawable(new Drawable[] {
            new ColorDrawable(0), new ColorDrawable(Resources.color(0x7f0e001d))
        });
        setBackgroundDrawable(_background);
        setGravity(17);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        _background.startTransition(400);
        setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (getChildCount() > 0)
        {
            if (motionevent.getAction() == 1)
            {
                ((Activity)getContext()).onBackPressed();
                setOnTouchListener(null);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void removeView(View view)
    {
        setOnTouchListener(null);
        _background.reverseTransition(300);
        super.removeView(view);
    }
}
