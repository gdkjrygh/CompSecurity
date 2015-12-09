// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.TimeInterpolator;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            BannerExpando

static final class 
    implements TimeInterpolator
{

    public final float getInterpolation(float f)
    {
        return (float)Math.pow(f, 0.5D);
    }

    ()
    {
    }
}
