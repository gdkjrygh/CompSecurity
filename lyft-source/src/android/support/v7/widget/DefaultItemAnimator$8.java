// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class aListenerAdapter extends aListenerAdapter
{

    final angeInfo a;
    final ViewPropertyAnimatorCompat b;
    final View c;
    final DefaultItemAnimator d;

    public void onAnimationEnd(View view)
    {
        b.a(null);
        ViewCompat.c(c, 1.0F);
        ViewCompat.a(c, 0.0F);
        ViewCompat.b(c, 0.0F);
        d.a(a.b, false);
        DefaultItemAnimator.h(d).remove(a.b);
        DefaultItemAnimator.e(d);
    }

    public void onAnimationStart(View view)
    {
        d.b(a.b, false);
    }

    at(DefaultItemAnimator defaultitemanimator, angeInfo angeinfo, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        d = defaultitemanimator;
        a = angeinfo;
        b = viewpropertyanimatorcompat;
        c = view;
        super(null);
    }
}
