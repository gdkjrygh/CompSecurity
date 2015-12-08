// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class IP
    implements com.google.android.gms.drive.eApi.MetadataBufferResult
{

    private final MetadataBuffer IO;
    private final boolean IP;
    private final Status yz;

    public MetadataBuffer getMetadataBuffer()
    {
        return IO;
    }

    public Status getStatus()
    {
        return yz;
    }

    public r(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        yz = status;
        IO = metadatabuffer;
        IP = flag;
    }
}
