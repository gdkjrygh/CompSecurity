// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.headerlist.PlayHeaderListLayout;

public final class PlayTransitionUtil
{

    public static transient TransitionSet aggregate(Transition atransition[])
    {
        TransitionSet transitionset = new TransitionSet();
        int j = atransition.length;
        for (int i = 0; i < j; i++)
        {
            transitionset.addTransition(atransition[i]);
        }

        return transitionset;
    }

    public static void setHeaderListLayoutClipChildren$72cb25e2(PlayHeaderListLayout playheaderlistlayout)
    {
        playheaderlistlayout.setClipChildren(false);
        for (int i = 0; i < 4; i++)
        {
            ((ViewGroup)playheaderlistlayout.findViewById((new int[] {
                0x7f0d031a, 0x7f0d0319, 0x7f0d0317, 0x7f0d0318
            })[i])).setClipChildren(false);
        }

    }

    public static Rect viewBounds(View view)
    {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
