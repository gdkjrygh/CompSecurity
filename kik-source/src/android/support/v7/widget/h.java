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

final class h extends c.c
{

    final RecyclerView.t a;
    final ViewPropertyAnimatorCompat b;
    final c c;

    h(c c1, RecyclerView.t t, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = c1;
        a = t;
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
        android.support.v7.widget.c.f(c).remove(a);
        android.support.v7.widget.c.e(c);
    }

    public final void onAnimationStart(View view)
    {
    }
}
