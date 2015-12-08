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

final class m extends r
{

    final bi a;
    final int b;
    final int c;
    final ViewPropertyAnimatorCompat d;
    final g e;

    m(g g1, bi bi, int i, int j, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        e = g1;
        a = bi;
        b = i;
        c = j;
        d = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationCancel(View view)
    {
        if (b != 0)
        {
            ViewCompat.setTranslationX(view, 0.0F);
        }
        if (c != 0)
        {
            ViewCompat.setTranslationY(view, 0.0F);
        }
    }

    public final void onAnimationEnd(View view)
    {
        d.setListener(null);
        e.e(a);
        g.g(e).remove(a);
        g.e(e);
    }

    public final void onAnimationStart(View view)
    {
    }
}
