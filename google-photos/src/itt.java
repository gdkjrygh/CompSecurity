// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class itt
    implements android.view.View.OnTouchListener
{

    private itf a;

    itt(itf itf1)
    {
        a = itf1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        itf.f(a);
        return true;
    }
}
