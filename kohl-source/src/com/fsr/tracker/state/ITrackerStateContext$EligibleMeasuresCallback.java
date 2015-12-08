// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import java.util.SortedSet;

// Referenced classes of package com.fsr.tracker.state:
//            ITrackerStateContext

public static interface I
{

    public abstract void onComplete(SortedSet sortedset);

    public abstract void onFailure(Throwable throwable);

    public abstract void onReturnedNoEligibleMeasures();
}
