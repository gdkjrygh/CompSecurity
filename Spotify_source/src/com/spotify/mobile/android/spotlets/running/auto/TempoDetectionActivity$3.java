// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.auto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

// Referenced classes of package com.spotify.mobile.android.spotlets.running.auto:
//            TempoDetectionActivity

final class b extends AnimatorListenerAdapter
{

    private int a;
    private ObjectAnimator b;
    private TempoDetectionActivity c;

    public final void onAnimationEnd(Animator animator)
    {
        TempoDetectionActivity.b(c).setImageResource(a);
        b.start();
    }

    (TempoDetectionActivity tempodetectionactivity, int i, ObjectAnimator objectanimator)
    {
        c = tempodetectionactivity;
        a = i;
        b = objectanimator;
        super();
    }
}
