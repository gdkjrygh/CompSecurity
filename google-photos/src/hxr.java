// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class hxr
    implements android.view.View.OnTouchListener
{

    hxr(hxo hxo)
    {
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        b.f(view);
        if (motionevent.getActionMasked() == 1)
        {
            view.performClick();
        }
        return false;
    }
}
