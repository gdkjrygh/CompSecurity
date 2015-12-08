// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            l

static class EA
    implements com.google.android.gms.drive.eApi.ContentsResult
{

    private final Contents EA;
    private final Status wJ;

    public Contents getContents()
    {
        return EA;
    }

    public Status getStatus()
    {
        return wJ;
    }

    public entsResult(Status status, Contents contents)
    {
        wJ = status;
        EA = contents;
    }
}
