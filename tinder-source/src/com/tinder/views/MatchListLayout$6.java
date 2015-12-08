// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.tinder.views:
//            MatchListLayout

class dapter extends AnimatorListenerAdapter
{

    final MatchListLayout this$0;

    public void onAnimationEnd(Animator animator)
    {
        MatchListLayout.access$602(MatchListLayout.this, false);
    }

    public void onAnimationStart(Animator animator)
    {
        MatchListLayout.access$602(MatchListLayout.this, true);
    }

    dapter()
    {
        this$0 = MatchListLayout.this;
        super();
    }
}
