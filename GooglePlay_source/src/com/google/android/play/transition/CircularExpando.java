// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.app.Activity;
import android.transition.ArcMotion;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.animation.PlayInterpolators;
import com.google.android.play.headerlist.PlayHeaderListLayout;

// Referenced classes of package com.google.android.play.transition:
//            PlayTransitionUtil, CircularReveal

public final class CircularExpando
{

    public static Transition windowTransition(Activity activity, View view, ViewGroup viewgroup, PlayHeaderListLayout playheaderlistlayout, boolean flag)
    {
        Object obj = ((ViewGroup)playheaderlistlayout.findViewById(0x7f0d0317)).getChildAt(0);
        View view1;
        if (obj != null)
        {
            if (flag)
            {
                PlayTransitionUtil.viewBounds(view);
                view = (new CircularReveal()).addTarget(((View) (obj)));
                view.setPathMotion(new ArcMotion());
            } else
            {
                view = (new Slide(48)).addTarget(((View) (obj)));
            }
        } else
        {
            view = null;
        }
        view1 = playheaderlistlayout.getActionBarView();
        if (flag)
        {
            obj = new Fade();
        } else
        {
            obj = new Slide(48);
        }
        obj = ((Visibility) (obj)).addTarget(view1);
        playheaderlistlayout = playheaderlistlayout.findViewById(0x7f0d031b);
        return PlayTransitionUtil.aggregate(new Transition[] {
            view, obj, (new Fade()).addTarget(playheaderlistlayout), (new Slide()).addTarget(viewgroup)
        }).setInterpolator(PlayInterpolators.fastOutSlowIn(activity)).setDuration(450L);
    }
}
