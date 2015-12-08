// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class f extends a
{

    public f(String s, int j)
    {
        super(s, j);
    }

    protected void a(Bundle bundle, Integer integer)
    {
        bundle.putInt(getName(), integer.intValue());
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Integer)obj);
    }

    protected Object b(DataHolder dataholder, int j, int k)
    {
        return f(dataholder, j, k);
    }

    protected Integer f(DataHolder dataholder, int j, int k)
    {
        return Integer.valueOf(dataholder.b(getName(), j, k));
    }

    protected Object f(Bundle bundle)
    {
        return i(bundle);
    }

    protected Integer i(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(getName()));
    }
}
