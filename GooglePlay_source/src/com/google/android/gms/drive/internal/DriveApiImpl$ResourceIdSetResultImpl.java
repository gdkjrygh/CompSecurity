// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveApiImpl

private static final class <init>
    implements com.google.android.gms.drive.sultImpl
{

    private final Set mResourceIds;
    private final Status mStatus;

    public final Set getExistingResourceIds()
    {
        return mResourceIds;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    private (Status status, Set set)
    {
        mStatus = status;
        mResourceIds = set;
    }

    mResourceIds(Status status, Set set, byte byte0)
    {
        this(status, set);
    }
}
