// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.comscore;

import com.comscore.analytics.comScore;

// Referenced classes of package com.soundcloud.android.analytics.comscore:
//            ComScoreAnalyticsProvider

class this._cls0
    implements Runnable
{

    final ComScoreAnalyticsProvider this$0;

    public void run()
    {
        comScore.flushCache();
    }

    ()
    {
        this$0 = ComScoreAnalyticsProvider.this;
        super();
    }
}
