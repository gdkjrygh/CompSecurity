// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

public class b
    implements com.google.android.gms.wearable.DeleteDataItemsResult
{

    private final Status a;
    private final int b;

    public Status a()
    {
        return a;
    }

    public aItemsResult(Status status, int i)
    {
        a = status;
        b = i;
    }
}
