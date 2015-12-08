// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

final class hiy
    implements android.view.View.OnAttachStateChangeListener
{

    private final afn a;
    private final TextView b;
    private final TimeInterpolator c;
    private final Context d;
    private int e;
    private final nug f = new hiz(this);
    private final nug g = new hja(this);
    private final ValueAnimator h = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]).setDuration(250L);

    hiy(afn afn1, TextView textview)
    {
        a = afn1;
        b = textview;
        d = a.a.getContext();
        c = b.d(d);
        h.setInterpolator(c);
        h.addUpdateListener(new hjb(this, afn1));
        afn1.a.addOnAttachStateChangeListener(this);
    }

    static TextView a(hiy hiy1)
    {
        return hiy1.b;
    }

    static void a(hiy hiy1, boolean flag)
    {
        hiy1.e = hjc.a;
        hiy1.a(flag, false);
    }

    private void a(boolean flag, boolean flag1)
    {
        ValueAnimator valueanimator = h;
        long l;
        if (flag1)
        {
            l = 0L;
        } else
        {
            l = 250L;
        }
        valueanimator.setDuration(l);
        if (flag)
        {
            h.setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat("animation_position", new float[] {
                    0.0F, 1.0F
                })
            });
        } else
        {
            h.setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat("animation_position", new float[] {
                    1.0F, 0.0F
                })
            });
        }
        h.start();
    }

    static afn b(hiy hiy1)
    {
        return hiy1.a;
    }

    static void b(hiy hiy1, boolean flag)
    {
        hiy1.e = hjc.b;
        hiy1.a(flag, false);
    }

    static int c(hiy hiy1)
    {
        return hiy1.e;
    }

    public final void onViewAttachedToWindow(View view)
    {
        view = (hkl)olm.b(d, hkl);
        if (view != null)
        {
            ((hkl) (view)).a.a(f, false);
            e = hjc.a;
            a(((hkl) (view)).b, true);
        }
        view = (enu)olm.b(d, enu);
        if (view != null)
        {
            ((enu) (view)).a.a(g, false);
        }
    }

    public final void onViewDetachedFromWindow(View view)
    {
        view = (hkl)olm.b(d, hkl);
        if (view != null)
        {
            ((hkl) (view)).a.a(f);
            if (((hkl) (view)).b)
            {
                e = hjc.a;
                a(true, true);
            }
        }
        view = (enu)olm.b(d, enu);
        if (view != null)
        {
            ((enu) (view)).a.a(g);
        }
    }
}
