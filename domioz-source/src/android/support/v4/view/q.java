// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            u, s, r

public final class q
{

    private final r a;

    public q(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, (byte)0);
    }

    private q(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, byte byte0)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            a = new u(context, ongesturelistener);
            return;
        } else
        {
            a = new s(context, ongesturelistener);
            return;
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }
}
