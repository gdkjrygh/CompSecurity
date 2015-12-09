// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.view;

import android.animation.ValueAnimator;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.view:
//            ModeTunerView

public final class a
    implements android.animation.imatorUpdateListener
{

    private ModeTunerView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        ModeTunerView modetunerview = a;
        modetunerview.f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        modetunerview.invalidate();
    }

    public (ModeTunerView modetunerview)
    {
        a = modetunerview;
        super();
    }
}
