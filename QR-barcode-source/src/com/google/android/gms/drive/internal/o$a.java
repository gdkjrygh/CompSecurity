// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            o

static class Ox
    implements com.google.android.gms.drive.eApi.ContentsResult
{

    private final Status CM;
    private final Contents Ox;

    public Contents getContents()
    {
        return Ox;
    }

    public Status getStatus()
    {
        return CM;
    }

    public entsResult(Status status, Contents contents)
    {
        CM = status;
        Ox = contents;
    }
}
