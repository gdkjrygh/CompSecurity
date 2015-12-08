// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            m, l

abstract class nit> extends m
{

    final l Fc;

    public Result d(Status status)
    {
        return o(status);
    }

    public com.google.android.gms.drive.eApi.ContentsResult o(Status status)
    {
        return new <init>(status, null);
    }

    entsResult(l l1)
    {
        Fc = l1;
        super();
    }
}
