// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

public abstract class SafeDataBufferRef extends DataBufferRef
{

    private final String TAG = "SafeDataBufferRef";

    public SafeDataBufferRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    protected final int getIntegerSafe$505cff29(String s)
    {
        if (hasColumn(s) && !hasNull(s))
        {
            return getInteger(s);
        } else
        {
            return 0;
        }
    }
}
