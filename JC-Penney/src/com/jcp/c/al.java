// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.TextView;

public class al
{

    public al()
    {
    }

    public boolean a(TextView textview, MotionEvent motionevent)
    {
        Drawable drawable = textview.getCompoundDrawables()[2];
        return drawable != null && motionevent.getAction() == 1 && motionevent.getRawX() >= (float)(textview.getRight() - drawable.getBounds().width());
    }
}
