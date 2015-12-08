// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dr, du, eb, dq, 
//            eg

class dt extends dr
{

    WeakHashMap b;

    dt()
    {
        b = null;
    }

    public final long a(View view)
    {
        return view.animate().getDuration();
    }

    public final void a(dq dq, View view)
    {
        view.animate().scaleX(1.0F);
    }

    public final void a(dq dq, View view, float f)
    {
        view.animate().alpha(f);
    }

    public void a(dq dq, View view, eg eg)
    {
        view.setTag(0x7e000000, eg);
        dq = new du(dq);
        view.animate().setListener(new eb(dq, view));
    }

    public final void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public final void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public final void b(dq dq, View view)
    {
        view.animate().scaleY(1.0F);
    }

    public final void b(dq dq, View view, float f)
    {
        view.animate().translationY(f);
    }

    public final void b(View view, long l)
    {
        view.animate().setStartDelay(l);
    }

    public final void c(dq dq, View view)
    {
        view.animate().cancel();
    }

    public final void d(dq dq, View view)
    {
        view.animate().start();
    }
}
