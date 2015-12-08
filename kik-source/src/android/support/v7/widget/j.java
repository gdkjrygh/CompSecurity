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

final class j extends c.c
{

    final c.a a;
    final ViewPropertyAnimatorCompat b;
    final c c;

    j(c c1, c.a a1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = c1;
        a = a1;
        b = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        ViewCompat.setAlpha(view, 1.0F);
        ViewCompat.setTranslationX(view, 0.0F);
        ViewCompat.setTranslationY(view, 0.0F);
        c.g(a.a);
        android.support.v7.widget.c.h(c).remove(a.a);
        android.support.v7.widget.c.e(c);
    }

    public final void onAnimationStart(View view)
    {
    }
}
