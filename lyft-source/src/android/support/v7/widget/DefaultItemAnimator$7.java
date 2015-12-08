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
    final DefaultItemAnimator c;

    public void onAnimationEnd(View view)
    {
        b.a(null);
        ViewCompat.c(view, 1.0F);
        ViewCompat.a(view, 0.0F);
        ViewCompat.b(view, 0.0F);
        c.a(a.a, true);
        DefaultItemAnimator.h(c).remove(a.a);
        DefaultItemAnimator.e(c);
    }

    public void onAnimationStart(View view)
    {
        c.b(a.a, true);
    }

    at(DefaultItemAnimator defaultitemanimator, angeInfo angeinfo, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = defaultitemanimator;
        a = angeinfo;
        b = viewpropertyanimatorcompat;
        super(null);
    }
}
