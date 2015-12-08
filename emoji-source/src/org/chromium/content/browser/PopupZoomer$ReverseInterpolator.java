// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.animation.Interpolator;

// Referenced classes of package org.chromium.content.browser:
//            PopupZoomer

private static class mInterpolator
    implements Interpolator
{

    private final Interpolator mInterpolator;

    public float getInterpolation(float f)
    {
        f = 1.0F - f;
        if (mInterpolator == null)
        {
            return f;
        } else
        {
            return mInterpolator.getInterpolation(f);
        }
    }

    public (Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }
}
