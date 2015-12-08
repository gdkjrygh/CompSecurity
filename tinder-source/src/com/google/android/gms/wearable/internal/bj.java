// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.g;

public final class bj
    implements e
{

    private int a;
    private g b;

    public bj(e e1)
    {
        a = e1.c();
        b = (g)e1.b().a();
    }

    public final Object a()
    {
        return this;
    }

    public final g b()
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
