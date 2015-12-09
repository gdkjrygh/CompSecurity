// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.PendingPlan;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface al
    extends ao
{

    public abstract PendingPlan getPendingPlan();

    public abstract void resetPendingPlan();

    public abstract void setPendingPlan(PendingPlan pendingplan);
}
