// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.analytics.AnalyticsEvent;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvCheckingAccountFragment, MnvManager, MnvAnalytics

final class this._cls0
    implements Runnable
{

    final MnvCheckingAccountFragment this$0;

    public final void run()
    {
        MnvCheckingAccountFragment.access$000().info("Timing out on progress.");
        mnvManager.onTimeout();
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cP);
    }

    ()
    {
        this$0 = MnvCheckingAccountFragment.this;
        super();
    }
}
