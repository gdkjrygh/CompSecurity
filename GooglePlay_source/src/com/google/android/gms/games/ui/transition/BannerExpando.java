// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.ArcMotion;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.Visibility;
import android.view.View;
import com.google.android.play.animation.PlayInterpolators;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.transition.PlayTransitionUtil;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            Scale, SharedElementCircularCrunch, ReturnFade

public final class BannerExpando
{

    public static long DEFAULT_ENTER_DURATION_MS = 325L;
    public static long DEFAULT_RETURN_DURATION_MS = 375L;

    private static Transition actionBarTransition(PlayHeaderListLayout playheaderlistlayout, boolean flag)
    {
        View view = playheaderlistlayout.getActionBarView();
        if (flag)
        {
            playheaderlistlayout = new Fade();
        } else
        {
            playheaderlistlayout = new Slide(48);
        }
        return playheaderlistlayout.addTarget(view);
    }

    public static Transition enterTransition$4300a761(Activity activity, PlayHeaderListLayout playheaderlistlayout)
    {
        return PlayTransitionUtil.aggregate(new Transition[] {
            actionBarTransition(playheaderlistlayout, true)
        }).setInterpolator(PlayInterpolators.fastOutSlowIn(activity)).setDuration(DEFAULT_ENTER_DURATION_MS);
    }

    public static Transition returnTransition(Activity activity, View view, View view1, PlayHeaderListLayout playheaderlistlayout, View view2, View view3, View view4, View view5)
    {
        playheaderlistlayout = actionBarTransition(playheaderlistlayout, false);
        view = (new Slide(48)).addTarget(view);
        view4 = (new Slide(48)).addTarget(view4);
        view5 = (new Slide(48)).addTarget(view5);
        return PlayTransitionUtil.aggregate(new Transition[] {
            (new Fade()).addTarget(view2), (new Fade()).addTarget(view3), playheaderlistlayout, view4, (new Slide()).addTarget(view1), view, view5
        }).setInterpolator(PlayInterpolators.fastOutSlowIn(activity)).setDuration(DEFAULT_RETURN_DURATION_MS);
    }

    public static Transition sharedElementEnterTransition$7d835b49(Context context, View view)
    {
        Object obj = new Scale(new TimeInterpolator() {

            public final float getInterpolation(float f)
            {
                return (float)Math.pow(f, 0.25D);
            }

        }, new TimeInterpolator() {

            public final float getInterpolation(float f)
            {
                return (float)Math.pow(f, 0.5D);
            }

        });
        obj.mMaintainAspectRatio = false;
        obj = ((Scale) (obj)).addTarget(view);
        SharedElementCircularCrunch sharedelementcircularcrunch = new SharedElementCircularCrunch();
        sharedelementcircularcrunch.addTarget(view).setInterpolator(new TimeInterpolator() {

            public final float getInterpolation(float f)
            {
                return (float)Math.pow(f, 0.25D);
            }

        });
        view = PlayTransitionUtil.aggregate(new Transition[] {
            obj, sharedelementcircularcrunch
        });
        view.setInterpolator(PlayInterpolators.fastOutSlowIn(context));
        view.setDuration(DEFAULT_ENTER_DURATION_MS);
        view.setPathMotion(new ArcMotion());
        return view;
    }

    public static Transition sharedElementReturnTransition$4840fd25(View view, Drawable drawable)
    {
        view = (new ReturnFade(drawable)).addTarget(view);
        view.setDuration(DEFAULT_RETURN_DURATION_MS);
        return view;
    }

}
