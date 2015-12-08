// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            cc, dr

private static final class nit> extends RelativeLayout
{

    private final dr kF;

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        kF.c(motionevent);
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        kF = new dr(context, s);
    }
}
