// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;
import com.google.android.gms.wearable.internal.bk;

public final class f extends h
    implements com.google.android.gms.common.api.f
{

    private final Status b;

    public f(DataHolder dataholder)
    {
        super(dataholder);
        b = new Status(dataholder.e);
    }

    public final Status a()
    {
        return b;
    }

    protected final Object a(int i, int j)
    {
        return new bk(a, i, j);
    }

    protected final String d()
    {
        return "path";
    }
}
