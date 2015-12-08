// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

public static class HG
    implements com.google.android.gms.drive.eApi.ContentsResult
{

    private final Contents HG;
    private final Status yz;

    public Contents getContents()
    {
        return HG;
    }

    public Status getStatus()
    {
        return yz;
    }

    public entsResult(Status status, Contents contents)
    {
        yz = status;
        HG = contents;
    }
}
