// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            r, p, g

final class o extends r
{

    final p a;
    final ViewPropertyAnimatorCompat b;
    final View c;
    final g d;

    o(g g1, p p1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        d = g1;
        a = p1;
        b = viewpropertyanimatorcompat;
        c = view;
        super((byte)0);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        ViewCompat.setAlpha(c, 1.0F);
        ViewCompat.setTranslationX(c, 0.0F);
        ViewCompat.setTranslationY(c, 0.0F);
        d.g(a.b);
        g.h(d).remove(a.b);
        g.e(d);
    }

    public final void onAnimationStart(View view)
    {
    }
}
