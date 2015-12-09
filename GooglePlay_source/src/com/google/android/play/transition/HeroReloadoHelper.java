// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.content.Context;
import android.transition.ArcMotion;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.animation.PlayInterpolators;
import com.google.android.play.headerlist.PlayHeaderListLayout;

// Referenced classes of package com.google.android.play.transition:
//            Scale, CircularReveal, PlayTransitionUtil

public final class HeroReloadoHelper
{

    public static TransitionSet sharedElementTransition(Context context, View view, View view1, boolean flag, boolean flag1)
    {
        Scale scale = new Scale(flag1);
        scale.mMaintainAspectRatio = true;
        view = scale.addTarget(view);
        view.setPathMotion(new ArcMotion());
        int i;
        long l;
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        view = PlayTransitionUtil.aggregate(new Transition[] {
            view, (new CircularReveal(i)).addTarget(view1), (new ChangeBounds()).addTarget(view1)
        });
        if (flag1)
        {
            context = PlayInterpolators.fastOutSlowIn(context);
        } else
        {
            context = PlayInterpolators.fastOutLinearIn(context);
        }
        context = view.setInterpolator(context);
        if (flag1)
        {
            l = 450L;
        } else
        {
            l = 350L;
        }
        return context.setDuration(l);
    }

    public static TransitionSet windowTransition(Context context, Class aclass[], PlayHeaderListLayout playheaderlistlayout, boolean flag)
    {
        aclass = (ViewGroup)playheaderlistlayout.getActionBarView();
        aclass.setTransitionGroup(true);
        playheaderlistlayout = (ViewGroup)playheaderlistlayout.findViewById(0x7f0d031b);
        playheaderlistlayout.setTransitionGroup(true);
        aclass = (new Fade()).addTarget(aclass).addTarget(playheaderlistlayout);
        if (flag)
        {
            return PlayTransitionUtil.aggregate(new Transition[] {
                aclass
            }).setInterpolator(PlayInterpolators.fastOutSlowIn(context)).setDuration(450L);
        } else
        {
            return (new TransitionSet()).addTransition(aclass).setInterpolator(PlayInterpolators.fastOutLinearIn(context)).setDuration(300L);
        }
    }
}
