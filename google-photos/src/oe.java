// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

class oe extends oc
{

    oe()
    {
    }

    public final long a(View view)
    {
        return view.animate().getDuration();
    }

    public final void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public final void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public final void a(ob ob, View view)
    {
        view.animate().cancel();
    }

    public final void a(ob ob, View view, float f)
    {
        view.animate().alpha(f);
    }

    public void a(ob ob, View view, oo oo)
    {
        view.setTag(0x7e000000, oo);
        ob = new of(ob);
        view.animate().setListener(new ol(ob, view));
    }

    public final void b(View view, long l)
    {
        view.animate().setStartDelay(l);
    }

    public final void b(ob ob, View view)
    {
        view.animate().start();
    }

    public final void b(ob ob, View view, float f)
    {
        view.animate().translationX(f);
    }

    public final void c(ob ob, View view, float f)
    {
        view.animate().translationY(f);
    }
}
