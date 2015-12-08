// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;


public class fadeIn
{

    public int backgroundDrawable;
    public float cornerRadius;
    public boolean fadeIn;
    public  listener;
    public float pinImageSizeMultiplier;
    public boolean round;

    public fadeIn setBackgroundDrawable(int i)
    {
        backgroundDrawable = i;
        return this;
    }

    public backgroundDrawable setCornerRadius(float f)
    {
        cornerRadius = f;
        return this;
    }

    public cornerRadius setFadeIn(boolean flag)
    {
        fadeIn = flag;
        return this;
    }

    public  setListener( )
    {
        listener = ;
        return this;
    }

    public listener setPinImageSizeMultiplier(float f)
    {
        pinImageSizeMultiplier = f;
        return this;
    }

    public pinImageSizeMultiplier setRound(boolean flag)
    {
        round = flag;
        return this;
    }

    public ()
    {
        backgroundDrawable = 0x7f0201db;
        pinImageSizeMultiplier = 0.75F;
        round = true;
        fadeIn = false;
    }
}
