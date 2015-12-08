// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.snapchat.android.database.SharedPreferenceKey;

public class StoryExplorerTooltip extends RelativeLayout
{

    final SharedPreferences a;

    public StoryExplorerTooltip(Context context)
    {
        this(context, null);
    }

    public StoryExplorerTooltip(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, PreferenceManager.getDefaultSharedPreferences(context));
    }

    private StoryExplorerTooltip(Context context, AttributeSet attributeset, SharedPreferences sharedpreferences)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0400f5, this, true);
        setVisibility(8);
        setAlpha(0.0F);
        a = sharedpreferences;
    }

    public final boolean a()
    {
        boolean flag = false;
        if (a.getInt(SharedPreferenceKey.STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT.getKey(), 0) < 3)
        {
            flag = true;
        }
        return flag;
    }

    // Unreferenced inner class com/snapchat/android/stories/ui/StoryExplorerTooltip$1

/* anonymous class */
    final class _cls1
        implements android.animation.Animator.AnimatorListener
    {

        private ViewPropertyAnimator a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            a.setListener(null);
            a.alpha(0.0F).setDuration(1000L).setStartDelay(3000L).start();
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            
            {
                a = viewpropertyanimator;
                super();
            }
    }

}
