// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            fe

final class cr extends RelativeLayout
{

    fe a;

    public cr(Context context, String s)
    {
        super(context);
        a = new fe(context, s);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        fe fe1 = a;
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            fe1.a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        fe1.a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
        return false;
    }
}
