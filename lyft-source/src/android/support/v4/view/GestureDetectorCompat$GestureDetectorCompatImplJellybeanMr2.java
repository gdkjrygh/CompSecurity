// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

class a
    implements a
{

    private final GestureDetector a;

    public void a(android.view.llybeanMr2 llybeanmr2)
    {
        a.setOnDoubleTapListener(llybeanmr2);
    }

    public void a(boolean flag)
    {
        a.setIsLongpressEnabled(flag);
    }

    public boolean a(MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }

    public Y(Context context, android.view.llybeanMr2 llybeanmr2, Handler handler)
    {
        a = new GestureDetector(context, llybeanmr2, handler);
    }
}
