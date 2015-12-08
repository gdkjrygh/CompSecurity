// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.tinder.views:
//            MatchListLayout

class dapter extends AnimatorListenerAdapter
{

    final MatchListLayout this$0;

    public void onAnimationEnd(Animator animator)
    {
        MatchListLayout.access$400(MatchListLayout.this).setVisibility(8);
    }

    public void onAnimationStart(Animator animator)
    {
        MatchListLayout.access$300(MatchListLayout.this).setVisibility(0);
        MatchListLayout.access$502(MatchListLayout.this, true);
    }

    iew()
    {
        this$0 = MatchListLayout.this;
        super();
    }
}
