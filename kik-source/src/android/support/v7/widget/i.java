// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            c

final class i extends c.c
{

    final RecyclerView.t a;
    final int b;
    final int c;
    final ViewPropertyAnimatorCompat d;
    final c e;

    i(c c1, RecyclerView.t t, int j, int k, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        e = c1;
        a = t;
        b = j;
        c = k;
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
        android.support.v7.widget.c.g(e).remove(a);
        android.support.v7.widget.c.e(e);
    }

    public final void onAnimationStart(View view)
    {
    }
}
