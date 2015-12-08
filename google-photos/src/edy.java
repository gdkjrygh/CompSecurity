// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

final class edy
    implements iwe
{

    private edx a;

    edy(edx edx1)
    {
        a = edx1;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        return edp.i(a.a).onTouch(edp.h(a.a), motionevent);
    }
}
