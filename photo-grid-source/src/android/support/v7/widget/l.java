// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            r, g, bi

final class l extends r
{

    final bi a;
    final ViewPropertyAnimatorCompat b;
    final g c;

    l(g g1, bi bi, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = g1;
        a = bi;
        b = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationCancel(View view)
    {
        ViewCompat.setAlpha(view, 1.0F);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        c.f(a);
        g.f(c).remove(a);
        g.e(c);
    }

    public final void onAnimationStart(View view)
    {
    }
}
