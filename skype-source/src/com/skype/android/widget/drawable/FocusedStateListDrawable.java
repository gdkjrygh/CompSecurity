// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class FocusedStateListDrawable extends StateListDrawable
    implements android.view.ViewTreeObserver.OnTouchModeChangeListener
{

    private final Drawable a;
    private boolean b;

    public FocusedStateListDrawable(Drawable drawable)
    {
        b = true;
        a = drawable;
    }

    public void draw(Canvas canvas)
    {
        if (b)
        {
            a.setBounds(getBounds());
            a.draw(canvas);
            return;
        } else
        {
            super.draw(canvas);
            return;
        }
    }

    public void onTouchModeChanged(boolean flag)
    {
        b = flag;
    }
}
