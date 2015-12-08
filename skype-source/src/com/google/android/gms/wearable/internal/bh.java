// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;

public final class bh
    implements d
{

    private int a;
    private f b;

    public bh(d d1)
    {
        a = d1.c();
        b = (f)d1.b().a();
    }

    public final Object a()
    {
        return this;
    }

    public final f b()
    {
        return b;
    }

    public final int c()
    {
        return a;
    }

    public final String toString()
    {
        String s;
        if (a == 1)
        {
            s = "changed";
        } else
        if (a == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder("DataEventEntity{ type=")).append(s).append(", dataitem=").append(b).append(" }").toString();
    }
}
