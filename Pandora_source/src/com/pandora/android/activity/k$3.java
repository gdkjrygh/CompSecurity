// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            k, o

class rAdapter extends AnimatorListenerAdapter
{

    final k a;

    public void onAnimationEnd(Animator animator)
    {
        k.i(a).setListener(null);
        k.a(a).setVisibility(4);
        k.a(a).setImageBitmap(null);
        k.a(a, false);
        s.a(k.b(a), 1.0F);
        if (k.j(a))
        {
            k.a(a, k.k(a).findViewWithTag("viewExcludedFromHistory"));
        } else
        {
            k.a(a, ((o)k.b(a).getAdapter()).e());
        }
        a.a(k.l(a));
    }

    public void onAnimationStart(Animator animator)
    {
        k.a(a, true);
    }

    (k k1)
    {
        a = k1;
        super();
    }
}
