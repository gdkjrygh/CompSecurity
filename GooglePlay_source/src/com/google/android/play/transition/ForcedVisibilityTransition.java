// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Map;

public abstract class ForcedVisibilityTransition extends Transition
{

    private static final String sTransitionProperties[] = {
        "play:forcedVisibility:visibility"
    };
    private int mMode;

    public ForcedVisibilityTransition(int i)
    {
        mMode = i;
    }

    public void captureEndValues(TransitionValues transitionvalues)
    {
        Map map = transitionvalues.values;
        int i;
        if (mMode == 2)
        {
            i = 4;
        } else
        {
            i = transitionvalues.view.getVisibility();
        }
        map.put("play:forcedVisibility:visibility", Integer.valueOf(i));
    }

    public void captureStartValues(TransitionValues transitionvalues)
    {
        Map map = transitionvalues.values;
        int i;
        if (mMode == 1)
        {
            i = 4;
        } else
        {
            i = transitionvalues.view.getVisibility();
        }
        map.put("play:forcedVisibility:visibility", Integer.valueOf(i));
    }

    public String[] getTransitionProperties()
    {
        return sTransitionProperties;
    }

    protected final boolean isRevealing()
    {
        return (mMode & 1) != 0;
    }

}
