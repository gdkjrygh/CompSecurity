// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;


public class AnimationUtil
{

    public AnimationUtil()
    {
    }

    public static int quadraticOutEase(float f, float f1, float f2, float f3)
    {
        f /= f3;
        return (int)(-f2 * f * (f - 2.0F) + f1);
    }
}
