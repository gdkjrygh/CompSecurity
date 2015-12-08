// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

public static class HD
    implements com.google.android.gms.drive.eApi.ContentsResult
{

    private final Contents HD;
    private final Status yw;

    public Contents getContents()
    {
        return HD;
    }

    public Status getStatus()
    {
        return yw;
    }

    public entsResult(Status status, Contents contents)
    {
        yw = status;
        HD = contents;
    }
}
