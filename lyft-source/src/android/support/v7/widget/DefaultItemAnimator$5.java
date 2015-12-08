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

    final r a;
    final ViewPropertyAnimatorCompat b;
    final DefaultItemAnimator c;

    public void onAnimationCancel(View view)
    {
        ViewCompat.c(view, 1.0F);
    }

    public void onAnimationEnd(View view)
    {
        b.a(null);
        c.f(a);
        DefaultItemAnimator.f(c).remove(a);
        DefaultItemAnimator.e(c);
    }

    public void onAnimationStart(View view)
    {
        c.i(a);
    }

    at(DefaultItemAnimator defaultitemanimator, r r, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = defaultitemanimator;
        a = r;
        b = viewpropertyanimatorcompat;
        super(null);
    }
}
