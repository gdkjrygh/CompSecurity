// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            cf, ep

private static final class nit> extends RelativeLayout
{

    private final ep kI;

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        kI.c(motionevent);
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        kI = new ep(context, s);
    }
}
