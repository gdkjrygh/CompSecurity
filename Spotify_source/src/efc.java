// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;

public final class efc extends android.view.GestureDetector.SimpleOnGestureListener
    implements android.view.View.OnTouchListener
{

    private View a;
    private ig b;
    private efd c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private final android.animation.Animator.AnimatorListener i = new android.animation.Animator.AnimatorListener() {

        private efc a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            efc.a(a).c();
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            
            {
                a = efc.this;
                super();
            }
    };

    public efc(View view, efd efd1)
    {
        a = view;
        h = (float)a.getContext().getResources().getDisplayMetrics().widthPixels / 3F;
        c = efd1;
        b = new ig(view.getContext(), this);
    }

    static efd a(efc efc1)
    {
        return efc1.c;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        float f6 = motionevent1.getRawX() - motionevent.getRawX();
        float f3 = motionevent1.getRawY() - motionevent.getRawY();
        float f4 = Math.max(Math.abs(f1), Math.abs(f2));
        float f7 = Math.max(Math.abs(f6), Math.abs(f3));
        if (f4 < 400F || f7 < 200F)
        {
            return false;
        } else
        {
            float f5 = a.getTranslationX();
            f1 = (f6 * Math.abs(f1)) / 100F;
            f6 = a.getTranslationY();
            f2 = (f3 * Math.abs(f2)) / 100F;
            a.animate().translationX(f1 + f5).translationY(f2 + f6).setDuration(300L).setListener(i).start();
            return true;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        c.d();
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (b.a(motionevent))
        {
            return true;
        }
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            c.a();
            d = motionevent.getRawX();
            e = motionevent.getRawY();
            return true;

        case 2: // '\002'
            f = motionevent.getRawX() - d;
            g = motionevent.getRawY() - e;
            a.setTranslationX(f);
            a.setTranslationY(g);
            a.setRotation(f / 30F);
            return true;

        case 1: // '\001'
            c.b();
            break;
        }
        if (Math.sqrt(f * f + g * g) > (double)h)
        {
            c.c();
        } else
        {
            a.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0F).translationY(0.0F).rotation(0.0F).setDuration(300L).start();
        }
        f = 0.0F;
        g = 0.0F;
        return true;
    }
}
