// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            l

static class Fg
    implements com.google.android.gms.drive.eApi.MetadataBufferResult
{

    private final MetadataBuffer Ff;
    private final boolean Fg;
    private final Status wJ;

    public MetadataBuffer getMetadataBuffer()
    {
        return Ff;
    }

    public Status getStatus()
    {
        return wJ;
    }

    public r(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        wJ = status;
        Ff = metadatabuffer;
        Fg = flag;
    }
}
