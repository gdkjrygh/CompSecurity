// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.pandora.android.eureka.DisappearingMediaRouteButton;

// Referenced classes of package com.pandora.android.view:
//            TrackView

class ter extends AnimatorListenerAdapter
{

    final ViewPropertyAnimator a;
    final TrackView b;

    public void onAnimationEnd(Animator animator)
    {
        a.setListener(null);
        b.c.setVisibility(8);
        if (TrackView.k(b).getVisibility() != 0)
        {
            TrackView.k(b).setVisibility(0);
            TrackView.k(b).setAlpha(0.0F);
            TrackView.k(b).animate().alpha(1.0F);
        }
    }

    gMediaRouteButton(TrackView trackview, ViewPropertyAnimator viewpropertyanimator)
    {
        b = trackview;
        a = viewpropertyanimator;
        super();
    }
}
