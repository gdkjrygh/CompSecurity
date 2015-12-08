// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.n;
import java.util.List;

public final class y
    implements n
{

    private final Status a;
    private final List b;

    public y(Status status, List list)
    {
        a = status;
        b = list;
    }

    public final List a()
    {
        return b;
    }

    public final Status b()
    {
        return a;
    }
}
