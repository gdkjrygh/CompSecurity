// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class PJ
    implements com.google.android.gms.drive.eApi.MetadataBufferResult
{

    private final Status Eb;
    private final MetadataBuffer PI;
    private final boolean PJ;

    public MetadataBuffer getMetadataBuffer()
    {
        return PI;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public r(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        Eb = status;
        PI = metadatabuffer;
        PJ = flag;
    }
}
