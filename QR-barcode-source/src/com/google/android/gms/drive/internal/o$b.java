// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p, o

static abstract class entsResult extends p
{

    public Result c(Status status)
    {
        return p(status);
    }

    public com.google.android.gms.drive.eApi.ContentsResult p(Status status)
    {
        return new <init>(status, null);
    }

    entsResult()
    {
    }
}
