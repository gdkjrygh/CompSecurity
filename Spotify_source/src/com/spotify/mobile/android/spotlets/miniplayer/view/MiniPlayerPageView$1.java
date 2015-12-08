// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import eub;

// Referenced classes of package com.spotify.mobile.android.spotlets.miniplayer.view:
//            MiniPlayerPageView

public final class a
    implements android.view.eDrawListener
{

    private MiniPlayerPageView a;

    public final boolean onPreDraw()
    {
        MiniPlayerPageView.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
        Object obj = MiniPlayerPageView.a(a);
        Object obj1 = MiniPlayerPageView.c(a).b(MiniPlayerPageView.b(a));
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(150L);
        objectanimator.addListener(new r(((View) (obj)), ((String) (obj1))));
        obj = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[] {
            0.0F, 1.0F
        });
        ((ObjectAnimator) (obj)).setDuration(150L);
        obj1 = new AnimatorSet();
        ((AnimatorSet) (obj1)).playSequentially(new Animator[] {
            objectanimator, obj
        });
        ((Animator) (obj1)).start();
        return true;
    }

    (MiniPlayerPageView miniplayerpageview)
    {
        a = miniplayerpageview;
        super();
    }
}
