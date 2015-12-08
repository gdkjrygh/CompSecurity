// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.soundcloud.android.utils.images.ImageUtils;

public class PlaceholderGenerator
{

    private static final int COLOR_COMBINATIONS[][] = {
        {
            0x7f0e00a7, 0x7f0e00a5
        }, {
            0x7f0e00a7, 0x7f0e00a6
        }, {
            0x7f0e00a7, 0x7f0e00a4
        }, {
            0x7f0e00a5, 0x7f0e00a7
        }, {
            0x7f0e00a5, 0x7f0e00a6
        }, {
            0x7f0e00a5, 0x7f0e00a4
        }, {
            0x7f0e00a6, 0x7f0e00a7
        }, {
            0x7f0e00a6, 0x7f0e00a5
        }, {
            0x7f0e00a6, 0x7f0e00a4
        }, {
            0x7f0e00a4, 0x7f0e00a7
        }, {
            0x7f0e00a4, 0x7f0e00a5
        }, {
            0x7f0e00a4, 0x7f0e00a6
        }
    };
    protected final Resources resources;

    PlaceholderGenerator(Resources resources1)
    {
        resources = resources1;
    }

    public GradientDrawable generateDrawable(String s)
    {
        s = COLOR_COMBINATIONS[pickCombination(s)];
        int i = resources.getColor(s[0]);
        int j = resources.getColor(s[1]);
        return new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, new int[] {
            i, j
        });
    }

    public TransitionDrawable generateTransitionDrawable(String s)
    {
        return ImageUtils.createTransitionDrawable(getLoadingDrawable(), generateDrawable(s));
    }

    protected Drawable getLoadingDrawable()
    {
        return resources.getDrawable(0x7f0e007d);
    }

    protected int pickCombination(String s)
    {
        return (s.hashCode() & 0x7fffffff) % COLOR_COMBINATIONS.length;
    }

}
