// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package com.taplytics:
//            an

final class aq
    implements an
{

    private final GestureDetector a;

    public aq(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        a = new GestureDetector(context, ongesturelistener, null);
    }

    public final boolean a(MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }
}
