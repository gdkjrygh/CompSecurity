// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingRecord, TrackingStorage

class this._cls0
    implements Function
{

    final TrackingStorage this$0;

    public volatile Object apply(Object obj)
    {
        return apply((TrackingRecord)obj);
    }

    public String apply(TrackingRecord trackingrecord)
    {
        return Long.toString(trackingrecord.getId());
    }

    ()
    {
        this$0 = TrackingStorage.this;
        super();
    }
}
