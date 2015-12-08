// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.transition.BaseTransitionListener;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class val.heroContainerView extends BaseTransitionListener
{

    final GameDetailActivity this$0;
    final ViewGroup val$heroContainerView;

    public final void onTransitionEnd(Transition transition)
    {
        if (isFinishing() || isDestroyed())
        {
            return;
        }
        findViewById(0x7f0d0156).setBackgroundColor(GameDetailActivity.access$1200(GameDetailActivity.this));
        boolean _tmp = GameDetailActivity.access$1302$1b0751c8(GameDetailActivity.this);
        if (GameDetailActivity.access$1400(GameDetailActivity.this).mIsInstalled)
        {
            GameDetailActivity.access$1500(GameDetailActivity.this);
        }
        transition = new ArrayList();
        transition.add(Integer.valueOf(0x7f0d0159));
        transition.add(Integer.valueOf(0x7f0d015c));
        transition.add(Integer.valueOf(0x7f0d0161));
        transition.add(Integer.valueOf(0x7f0d0157));
        transition.add(Integer.valueOf(0x7f0d0027));
        if (!GameDetailActivity.access$1600(GameDetailActivity.this))
        {
            transition.add(Integer.valueOf(0x7f0d0029));
        }
        transition.add(Integer.valueOf(0x7f0d031d));
        GameDetailActivity.access$1700$1241a7bc(GameDetailActivity.this, GameDetailActivity.access$600(GameDetailActivity.this), transition);
        val$heroContainerView.setVisibility(0);
        GameDetailActivity.access$1800(GameDetailActivity.this);
    }

    meDetailStateManager()
    {
        this$0 = final_gamedetailactivity;
        val$heroContainerView = ViewGroup.this;
        super();
    }
}
