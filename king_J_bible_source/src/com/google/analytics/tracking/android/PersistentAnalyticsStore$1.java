// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            Clock, PersistentAnalyticsStore

class this._cls0
    implements Clock
{

    final PersistentAnalyticsStore this$0;

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    ()
    {
        this$0 = PersistentAnalyticsStore.this;
        super();
    }
}
