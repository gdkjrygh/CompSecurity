// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public final class bhn extends RelativeLayout
{

    private cjt a;

    public bhn(Context context, String s)
    {
        super(context);
        a = new cjt(context, s);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }
}
