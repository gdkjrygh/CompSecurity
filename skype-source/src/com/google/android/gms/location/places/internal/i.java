// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class i extends f
{

    private final String c = "SafeDataBufferRef";

    public i(DataHolder dataholder, int j)
    {
        super(dataholder, j);
    }

    protected final int f(String s)
    {
        if (a(s) && !e(s))
        {
            return b(s);
        } else
        {
            return 0;
        }
    }

    protected final String g(String s)
    {
        if (a(s) && !e(s))
        {
            return c(s);
        } else
        {
            return null;
        }
    }
}
