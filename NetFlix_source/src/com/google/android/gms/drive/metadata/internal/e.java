// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class e extends a
{

    public e(String s, int j)
    {
        super(s, j);
    }

    protected void a(Bundle bundle, Long long1)
    {
        bundle.putLong(getName(), long1.longValue());
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Long)obj);
    }

    protected Object b(DataHolder dataholder, int j, int k)
    {
        return g(dataholder, j, k);
    }

    protected Object e(Bundle bundle)
    {
        return i(bundle);
    }

    protected Long g(DataHolder dataholder, int j, int k)
    {
        return Long.valueOf(dataholder.getLong(getName(), j, k));
    }

    protected Long i(Bundle bundle)
    {
        return Long.valueOf(bundle.getLong(getName()));
    }
}
