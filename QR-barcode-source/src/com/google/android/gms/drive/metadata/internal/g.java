// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class g extends a
{

    public g(String s, int i)
    {
        super(s, i);
    }

    protected void a(Bundle bundle, Long long1)
    {
        bundle.putLong(getName(), long1.longValue());
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Long)obj);
    }

    protected Object c(DataHolder dataholder, int i, int j)
    {
        return h(dataholder, i, j);
    }

    protected Object g(Bundle bundle)
    {
        return k(bundle);
    }

    protected Long h(DataHolder dataholder, int i, int j)
    {
        return Long.valueOf(dataholder.a(getName(), i, j));
    }

    protected Long k(Bundle bundle)
    {
        return Long.valueOf(bundle.getLong(getName()));
    }
}
