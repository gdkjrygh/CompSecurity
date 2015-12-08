// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.view.MotionEvent;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            h

public final class a extends h
{

    private MotionEvent a;

    public a(MotionEvent motionevent)
    {
        j.a(motionevent);
        a = motionevent;
    }

    private void h()
    {
        j.a(a, "Event has been recycled.");
    }

    public final float a(int i)
    {
        h();
        return a.getX(i);
    }

    public final long a()
    {
        h();
        return a.getEventTime();
    }

    public final float b(int i)
    {
        h();
        return a.getY(i);
    }

    public final int b()
    {
        h();
        return a.getPointerCount();
    }

    public final float c()
    {
        h();
        return w.f;
    }

    public final float d()
    {
        h();
        return w.g;
    }

    public final void e()
    {
        h();
        a.recycle();
        a = null;
    }
}
