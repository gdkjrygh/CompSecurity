// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.view.MotionEvent;

// Referenced classes of package com.mobeta.android.dslv:
//            a, DragSortListView

final class b extends android.view.GestureDetector.SimpleOnGestureListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!com.mobeta.android.dslv.a.a(a) || !com.mobeta.android.dslv.a.b(a)) goto _L2; else goto _L1
_L1:
        int i = com.mobeta.android.dslv.a.c(a).getWidth() / 5;
        if (f <= com.mobeta.android.dslv.a.d(a)) goto _L4; else goto _L3
_L3:
        if (com.mobeta.android.dslv.a.e(a) > -i)
        {
            com.mobeta.android.dslv.a.c(a).a(f);
        }
_L6:
        com.mobeta.android.dslv.a.f(a);
_L2:
        return false;
_L4:
        if (f < -com.mobeta.android.dslv.a.d(a) && com.mobeta.android.dslv.a.e(a) < i)
        {
            com.mobeta.android.dslv.a.c(a).a(f);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
