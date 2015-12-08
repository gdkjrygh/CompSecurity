// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveShowHideController, BrightcoveControlBar

final class <init> extends AnimatorListenerAdapter
{

    private BrightcoveShowHideController a;

    public final void onAnimationEnd(Animator animator)
    {
        BrightcoveShowHideController.a(a).setVisibility(8);
    }

    private (BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        a = brightcoveshowhidecontroller;
        super();
    }

    a(BrightcoveShowHideController brightcoveshowhidecontroller, byte byte0)
    {
        this(brightcoveshowhidecontroller);
    }
}
