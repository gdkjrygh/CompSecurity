// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;
import kik.android.util.cs;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class id
    implements android.view.View.OnTouchListener
{

    final KikCodeFragment a;

    id(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a._drawArea != null && (Math.sqrt(Math.pow(motionevent.getX() - (float)(a._drawArea.getWidth() / 2), 2D) + Math.pow(motionevent.getY() - (float)(a._drawArea.getHeight() / 2), 2D)) < (double)a._drawArea.f() || KikCodeFragment.a(a)))
        {
            KikCodeFragment.b(a).onTouch(view, motionevent);
            if (motionevent.getAction() == 0)
            {
                KikCodeFragment.a(a, motionevent);
                KikCodeFragment.c(a);
                KikCodeFragment.d(a);
                return true;
            }
            if (motionevent.getAction() == 1 && !KikCodeFragment.e(a))
            {
                a.c();
                KikCodeFragment.f(a);
                a._drawArea.b();
                KikCodeFragment.a(a, a._drawArea.d());
                KikCodeFragment.g(a);
                return true;
            }
            if (motionevent.getAction() == 2)
            {
                KikCodeFragment.a(a, motionevent);
                return true;
            }
        }
        return true;
    }
}
