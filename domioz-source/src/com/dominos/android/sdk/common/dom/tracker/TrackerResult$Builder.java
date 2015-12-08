// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import com.google.a.b.ar;

// Referenced classes of package com.dominos.android.sdk.common.dom.tracker:
//            TrackerResult

public class orderStatuses
{

    private ar orderStatuses;

    public TrackerResult build()
    {
        return new TrackerResult(orderStatuses, null);
    }

    public orderStatuses setOrderStatuses(ar ar1)
    {
        orderStatuses = ar1;
        return this;
    }

    public ()
    {
        orderStatuses = ar.d();
    }
}
