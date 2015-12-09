// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.b;
import com.google.android.gms.wearable.e;

public final class ax
    implements b
{

    private final Status a;
    private final e b;

    public ax(Status status, e e)
    {
        a = status;
        b = e;
    }

    public final Status b()
    {
        return a;
    }
}
