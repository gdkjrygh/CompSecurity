// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public class EmptyDSnapView extends View
{

    public EmptyDSnapView(Context context)
    {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}
