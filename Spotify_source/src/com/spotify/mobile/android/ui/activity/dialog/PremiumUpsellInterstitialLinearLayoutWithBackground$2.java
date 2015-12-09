// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dialog:
//            PremiumUpsellInterstitialLinearLayoutWithBackground

final class a
    implements android.graphics.drawable.outWithBackground._cls2
{

    private PremiumUpsellInterstitialLinearLayoutWithBackground a;

    public final void invalidateDrawable(Drawable drawable)
    {
        a.invalidate();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
    }

    i(PremiumUpsellInterstitialLinearLayoutWithBackground premiumupsellinterstitiallinearlayoutwithbackground)
    {
        a = premiumupsellinterstitiallinearlayoutwithbackground;
        super();
    }
}
