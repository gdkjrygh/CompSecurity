// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveShowHideController, BrightcoveControlBar, q

class r extends AnimatorListenerAdapter
{

    final BrightcoveShowHideController a;

    private r(BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        a = brightcoveshowhidecontroller;
        super();
    }

    r(BrightcoveShowHideController brightcoveshowhidecontroller, q q)
    {
        this(brightcoveshowhidecontroller);
    }

    public void onAnimationEnd(Animator animator)
    {
        BrightcoveShowHideController.a(a).setVisibility(8);
    }
}
