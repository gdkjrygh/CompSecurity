// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

final class joy extends RelativeLayout
{

    private kxj a;

    public joy(Context context, String s)
    {
        super(context);
        a = new kxj(context, s);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        kxj kxj1 = a;
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            kxj1.a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        kxj1.a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
        return false;
    }
}
