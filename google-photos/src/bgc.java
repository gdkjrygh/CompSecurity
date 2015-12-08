// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

final class bgc
    implements TimeInterpolator
{

    bgc()
    {
    }

    public final float getInterpolation(float f)
    {
        return (float)Math.sin((double)f * 3.1415926535897931D);
    }
}
