// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.a.d;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            q, t, v

class s
    implements Runnable
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public void run()
    {
        q.b(a).setVisibility(0);
        q.b(a).setBackgroundColor(q.c(a).b());
        q.b(a).setOnTouchListener(new t(this));
        ImageView imageview = (ImageView)q.b(a).findViewById(d.com_mixpanel_android_notification_image);
        float f = TypedValue.applyDimension(1, 75F, q.e(a).getResources().getDisplayMetrics());
        Object obj = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        q.b(a).startAnimation(((android.view.animation.Animation) (obj)));
        obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f / 2.0F, f / 2.0F);
        ((ScaleAnimation) (obj)).setInterpolator(new v(a));
        ((ScaleAnimation) (obj)).setDuration(400L);
        ((ScaleAnimation) (obj)).setStartOffset(200L);
        imageview.startAnimation(((android.view.animation.Animation) (obj)));
    }
}
