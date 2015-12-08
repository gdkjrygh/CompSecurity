// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.microsoft.advertising.android:
//            by

public static abstract class er
    implements android.view.reDetector.OnGestureListener, android.view.OnTouchListener
{

    private GestureDetector a;

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }

    public er(Context context)
    {
        a = null;
        a = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
    }
}
