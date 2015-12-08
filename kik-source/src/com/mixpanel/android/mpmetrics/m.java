// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            k, n

final class m
    implements Runnable
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        k.b(a).setVisibility(0);
        k.b(a).setBackgroundColor(k.c(a).b());
        k.b(a).setOnTouchListener(new n(this));
        ImageView imageview = (ImageView)k.b(a).findViewById(com.mixpanel.android.a.c.i);
        float f = TypedValue.applyDimension(1, 75F, k.e(a).getResources().getDisplayMetrics());
        Object obj = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        k.b(a).startAnimation(((android.view.animation.Animation) (obj)));
        obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f / 2.0F, f / 2.0F);
        ((ScaleAnimation) (obj)).setInterpolator(new k.a(a));
        ((ScaleAnimation) (obj)).setDuration(400L);
        ((ScaleAnimation) (obj)).setStartOffset(200L);
        imageview.startAnimation(((android.view.animation.Animation) (obj)));
    }
}
