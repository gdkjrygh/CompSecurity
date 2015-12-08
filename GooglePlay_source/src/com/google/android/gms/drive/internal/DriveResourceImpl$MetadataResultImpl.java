// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Metadata;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveResourceImpl

private static final class mMetadata
    implements com.google.android.gms.drive.sultImpl
{

    private final Metadata mMetadata;
    private final Status mStatus;

    public final Metadata getMetadata()
    {
        return mMetadata;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public (Status status, Metadata metadata)
    {
        mStatus = status;
        mMetadata = metadata;
    }
}
