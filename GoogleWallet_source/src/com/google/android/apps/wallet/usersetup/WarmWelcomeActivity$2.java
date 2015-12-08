// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            WarmWelcomeActivity, WarmWelcomeScreens

final class nit> extends android.support.v4.view.ChangeListener
{

    final WarmWelcomeActivity this$0;

    public final void onPageScrolled(int i, float f, int j)
    {
        if (!WarmWelcomeActivity.access$100(WarmWelcomeActivity.this))
        {
            return;
        }
        if (f != 0.0F)
        {
            WarmWelcomeActivity.access$200(WarmWelcomeActivity.this, i, f);
            return;
        } else
        {
            WarmWelcomeActivity.access$300(WarmWelcomeActivity.this, i);
            return;
        }
    }

    public final void onPageSelected(int i)
    {
        analyticsUtil.sendScreen(WarmWelcomeScreens.screens[i], new AnalyticsCustomDimension[0]);
    }

    on()
    {
        this$0 = WarmWelcomeActivity.this;
        super();
    }
}
