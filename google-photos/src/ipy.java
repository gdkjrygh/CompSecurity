// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class ipy
    implements android.view.View.OnTouchListener
{

    private ipu a;

    ipy(ipu ipu1)
    {
        a = ipu1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (ipu.c(a) != null && !ipu.a(a))
        {
            ipu.a(a, true);
            ipu.c(a).startAnimation(ipu.b(a));
            return true;
        } else
        {
            return false;
        }
    }
}
