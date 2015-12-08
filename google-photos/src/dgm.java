// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class dgm
    implements android.view.View.OnTouchListener
{

    private dgk a;

    dgm(dgk dgk1)
    {
        a = dgk1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.a(dgw.c, true);
        return false;
    }
}
