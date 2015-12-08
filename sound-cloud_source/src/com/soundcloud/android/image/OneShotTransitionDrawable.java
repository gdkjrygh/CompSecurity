// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class OneShotTransitionDrawable extends TransitionDrawable
{

    private boolean hasStarted;

    public OneShotTransitionDrawable(Drawable adrawable[])
    {
        super(adrawable);
    }

    public void startTransition(int i)
    {
        if (!hasStarted)
        {
            hasStarted = true;
            super.startTransition(i);
        }
    }
}
