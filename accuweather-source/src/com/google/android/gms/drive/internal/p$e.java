// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class IM
    implements com.google.android.gms.drive.eApi.MetadataBufferResult
{

    private final MetadataBuffer IL;
    private final boolean IM;
    private final Status yw;

    public MetadataBuffer getMetadataBuffer()
    {
        return IL;
    }

    public Status getStatus()
    {
        return yw;
    }

    public r(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        yw = status;
        IL = metadatabuffer;
        IM = flag;
    }
}
