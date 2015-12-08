// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;

final class bf
    implements android.view.View.OnTouchListener
{

    final int a[];
    final int b[];

    bf(int ai[], int ai1[])
    {
        a = ai;
        b = ai1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int ai[] = null;
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        ai = a;
_L4:
        if (ai != null)
        {
            motionevent = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, ai);
            motionevent.setCornerRadius(5F);
            motionevent.setGradientType(0);
            view.setBackgroundDrawable(motionevent);
        }
        return false;
_L2:
        if (motionevent.getAction() == 3)
        {
            ai = b;
        } else
        if (motionevent.getAction() == 1)
        {
            ai = b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
