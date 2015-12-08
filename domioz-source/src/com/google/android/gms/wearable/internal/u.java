// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.j;

public final class u
    implements j
{

    private final Status a;
    private final int b;

    public u(Status status, int i)
    {
        a = status;
        b = i;
    }

    public final Status b()
    {
        return a;
    }
}
