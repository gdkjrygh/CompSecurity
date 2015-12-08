// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            m, o

private abstract class <init> extends m
{

    final o Fr;

    public Result d(Status status)
    {
        return o(status);
    }

    public com.google.android.gms.drive.eApi.ContentsResult o(Status status)
    {
        return new <init>(status, null);
    }

    private entsResult(o o1)
    {
        Fr = o1;
        super();
    }

    nit>(o o1, nit> nit>)
    {
        this(o1);
    }
}
