// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            o

static class Oz
    implements com.google.android.gms.drive.eApi.MetadataBufferResult
{

    private final Status CM;
    private final MetadataBuffer Oy;
    private final boolean Oz;

    public MetadataBuffer getMetadataBuffer()
    {
        return Oy;
    }

    public Status getStatus()
    {
        return CM;
    }

    public r(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        CM = status;
        Oy = metadatabuffer;
        Oz = flag;
    }
}
