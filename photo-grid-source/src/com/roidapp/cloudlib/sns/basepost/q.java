// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            t, r, i

final class q extends t
{

    final r a;
    final ViewPropertyAnimatorCompat b;
    final View c;
    final i d;

    q(i j, r r1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        d = j;
        a = r1;
        b = viewpropertyanimatorcompat;
        c = view;
        super((byte)0);
    }

    public final void onAnimationCancel(View view)
    {
        ViewCompat.setTranslationX(view, 0.0F);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        ViewCompat.setAlpha(c, 1.0F);
        ViewCompat.setTranslationX(c, 0.0F);
        ViewCompat.setTranslationY(c, 0.0F);
        d.g(a.b);
        i.h(d).remove(a.b);
        i.e(d);
    }

    public final void onAnimationStart(View view)
    {
    }
}
