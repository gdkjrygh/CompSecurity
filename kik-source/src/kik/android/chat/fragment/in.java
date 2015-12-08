// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;
import kik.android.widget.KikCodeBackgroundImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class in
    implements android.view.View.OnTouchListener
{

    final KikCodeFragment.c a;
    final KikCodeFragment b;

    in(KikCodeFragment kikcodefragment, KikCodeFragment.c c)
    {
        b = kikcodefragment;
        a = c;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        b._fakeCode.setOnTouchListener(null);
        KikCodeFragment.p(b);
        if (a != null)
        {
            a.a();
        }
        return false;
    }
}
