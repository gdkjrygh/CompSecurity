// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveClientImpl

static final class mMoreEntriesMayExist
    implements com.google.android.gms.drive.query.pl
{

    private final boolean mMoreEntriesMayExist;
    private final Status mStatus;

    public final Status getStatus()
    {
        return mStatus;
    }

    public (Status status, boolean flag)
    {
        mStatus = status;
        mMoreEntriesMayExist = flag;
    }
}
