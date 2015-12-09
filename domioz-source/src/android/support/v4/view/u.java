// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            r

final class u
    implements r
{

    private final GestureDetector a;

    public u(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        a = new GestureDetector(context, ongesturelistener, null);
    }

    public final boolean a(MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }
}
