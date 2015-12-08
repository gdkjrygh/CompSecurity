// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            StreamSenseAnalytics

class this._cls0
    implements nHandler
{

    final StreamSenseAnalytics this$0;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Timber.d((new StringBuilder()).append("NotifyStreamThreadUncaught, Exception occured in notifyStream thread: ").append(throwable.toString()).toString(), new Object[0]);
    }

    ()
    {
        this$0 = StreamSenseAnalytics.this;
        super();
    }
}
