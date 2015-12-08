// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsEngine, AnalyticsProvider

class this._cls0
    implements a
{

    final AnalyticsEngine this$0;

    public void call()
    {
        for (Iterator iterator = AnalyticsEngine.access$000(AnalyticsEngine.this).iterator(); iterator.hasNext(); ((AnalyticsProvider)iterator.next()).flush()) { }
        AnalyticsEngine.access$100(AnalyticsEngine.this).set(true);
    }

    ()
    {
        this$0 = AnalyticsEngine.this;
        super();
    }
}
