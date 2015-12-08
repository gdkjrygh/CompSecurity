// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;


// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            ResolutionMatcher

private static class b
{

    private final float a;
    private final float b;

    public float getCrop()
    {
        return b;
    }

    public float getZoom()
    {
        return a;
    }

    public boolean isValid()
    {
        return a < 3.402823E+38F && b < 3.402823E+38F;
    }

    public String toString()
    {
        if (isValid())
        {
            return (new StringBuilder("zoom=")).append((int)(a * 100F)).append("%, crop=").append((int)(b * 100F)).append("%").toString();
        } else
        {
            return "invalid";
        }
    }

    public ()
    {
        a = -1F;
        b = -1F;
    }

    public b(float f, float f1)
    {
        if (f < 0.0F || f1 < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("zoom=")).append(f).append(", crop=").append(f1).append(" must not have negative values").toString());
        } else
        {
            a = f;
            b = f1;
            return;
        }
    }
}
