// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.cn;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd

static final class a extends RelativeLayout
{

    cn a;

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        cn cn1 = a;
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            cn1.a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        cn1.a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        a = new cn(context, s);
    }
}
