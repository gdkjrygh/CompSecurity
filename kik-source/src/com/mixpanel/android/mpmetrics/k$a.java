// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.view.animation.Interpolator;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            k

private final class a
    implements Interpolator
{

    final k a;

    public final float getInterpolation(float f)
    {
        return (float)(-(Math.pow(2.7182818284590451D, -8F * f) * Math.cos(12F * f))) + 1.0F;
    }

    public (k k1)
    {
        a = k1;
        super();
    }
}
