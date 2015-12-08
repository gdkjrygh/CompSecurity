// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.i;
import com.google.android.gms.wearable.internal.ay;

public final class d extends i
    implements u
{

    private final Status b;

    public d(DataHolder dataholder)
    {
        super(dataholder);
        b = new Status(dataholder.e());
    }

    protected final Object a(int j, int k)
    {
        return new ay(a, j, k);
    }

    public final Status b()
    {
        return b;
    }

    protected final String d()
    {
        return "path";
    }
}
