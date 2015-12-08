// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

// Referenced classes of package com.google.android.gms.internal:
//            v, dr

private static final class init> extends ViewSwitcher
{

    private final dr kF;

    static dr a(init> init>)
    {
        return init>.kF;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        kF.c(motionevent);
        return false;
    }

    public (Context context)
    {
        super(context);
        kF = new dr(context);
    }
}
