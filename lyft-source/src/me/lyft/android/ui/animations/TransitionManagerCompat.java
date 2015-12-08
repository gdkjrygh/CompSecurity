// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.animations;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import me.lyft.android.utils.VersionUtils;

public class TransitionManagerCompat
{

    public TransitionManagerCompat()
    {
    }

    public static void beginDelayedTransition(ViewGroup viewgroup)
    {
        beginDelayedTransition(viewgroup, null);
    }

    private static void beginDelayedTransition(ViewGroup viewgroup, Transition transition)
    {
        if (VersionUtils.hasKitKat())
        {
            TransitionManager.beginDelayedTransition(viewgroup, transition);
        }
    }
}
