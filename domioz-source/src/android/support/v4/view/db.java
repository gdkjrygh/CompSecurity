// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            cz, dc, dj, cy, 
//            do

class db extends cz
{

    WeakHashMap b;

    db()
    {
        b = null;
    }

    public final void a(cy cy, View view)
    {
        view.animate().scaleY(1.0F);
    }

    public final void a(cy cy, View view, float f)
    {
        view.animate().alpha(f);
    }

    public void a(cy cy, View view, do do1)
    {
        view.setTag(0x7e000000, do1);
        cy = new dc(cy);
        view.animate().setListener(new dj(cy, view));
    }

    public final void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public final void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public final void b(cy cy, View view)
    {
        view.animate().cancel();
    }

    public final void b(cy cy, View view, float f)
    {
        view.animate().translationX(f);
    }

    public final void c(cy cy, View view)
    {
        view.animate().start();
    }

    public final void c(cy cy, View view, float f)
    {
        view.animate().translationY(f);
    }
}
