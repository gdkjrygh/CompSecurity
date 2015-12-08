// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.translate.g;

// Referenced classes of package com.google.android.apps.translate.anim:
//            b

public final class AnimationScheme extends Enum
{

    public static final AnimationScheme BOTTOM;
    public static final AnimationScheme BOTTOM_FAST;
    public static final AnimationScheme FADE;
    public static final AnimationScheme FADE_FAST;
    public static final AnimationScheme SIDE;
    public static final AnimationScheme TOP;
    public static final AnimationScheme TOP_PARENT;
    private static final AnimationScheme a[];
    private final int mEnterAnimId;
    private final int mExitAnimId;

    private AnimationScheme(String s, int i, int j, int k)
    {
        super(s, i);
        mEnterAnimId = j;
        mExitAnimId = k;
    }

    public static AnimationScheme valueOf(String s)
    {
        return (AnimationScheme)Enum.valueOf(com/google/android/apps/translate/anim/AnimationScheme, s);
    }

    public static AnimationScheme[] values()
    {
        return (AnimationScheme[])a.clone();
    }

    public final void hideView(View view)
    {
        hideView(view, 0L, null);
    }

    public final void hideView(View view, long l, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (view.getAnimation() == null)
        {
            Animation animation = AnimationUtils.loadAnimation(view.getContext(), mExitAnimId);
            Object obj = animationlistener;
            if (animationlistener == null)
            {
                obj = new b(new View[] {
                    view
                });
            }
            animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (obj)));
            animation.setStartOffset(l);
            view.startAnimation(animation);
        }
    }

    public final transient void hideViews(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            hideView(aview[i]);
        }

    }

    public final Animation showView(View view)
    {
        return showView(view, 0L);
    }

    public final Animation showView(View view, long l)
    {
        view.setVisibility(0);
        Animation animation = AnimationUtils.loadAnimation(view.getContext(), mEnterAnimId);
        animation.setStartOffset(l);
        view.startAnimation(animation);
        return animation;
    }

    public final transient void showViews(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            showView(aview[i]);
        }

    }

    static 
    {
        FADE = new AnimationScheme("FADE", 0, 0x10a0000, 0x10a0001);
        FADE_FAST = new AnimationScheme("FADE_FAST", 1, g.fade_in_fast, g.fade_out_fast);
        BOTTOM = new AnimationScheme("BOTTOM", 2, g.slide_in_bottom, g.slide_out_bottom);
        BOTTOM_FAST = new AnimationScheme("BOTTOM_FAST", 3, g.slide_in_bottom_fast, g.slide_out_bottom_fast);
        TOP_PARENT = new AnimationScheme("TOP_PARENT", 4, g.slide_in_top_parent, g.slide_out_top_parent);
        TOP = new AnimationScheme("TOP", 5, g.slide_in_top, g.slide_out_top);
        SIDE = new AnimationScheme("SIDE", 6, 0x10a0002, 0x10a0003);
        a = (new AnimationScheme[] {
            FADE, FADE_FAST, BOTTOM, BOTTOM_FAST, TOP_PARENT, TOP, SIDE
        });
    }
}
