// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.widget.ImageButton;
import com.facebook.a.d;
import com.facebook.a.e;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a extends d
{

    final ValueAnimator a;
    final bd b;

    public final void onSpringAtRest(e e1)
    {
        a.start();
        bd.p(b);
        bd.t(b);
    }

    public final void onSpringUpdate(e e1)
    {
        float f = (float)e1.d.bd;
        bd.s(b).setRotation(-o.a(f, 0.0F, 0.0F, 1.0F, 360F));
    }

    ator(bd bd1, ValueAnimator valueanimator)
    {
        b = bd1;
        a = valueanimator;
        super();
    }
}
