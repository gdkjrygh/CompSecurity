// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.view.animation.Interpolator;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            q

class v
    implements Interpolator
{

    final q a;

    public v(q q)
    {
        a = q;
        super();
    }

    public float getInterpolation(float f)
    {
        return (float)(-(Math.pow(2.7182818284590451D, -8F * f) * Math.cos(12F * f))) + 1.0F;
    }
}
