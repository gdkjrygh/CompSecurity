// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class d extends a
{

    public d(String s, int i)
    {
        super(s, i);
    }

    protected void a(Bundle bundle, Integer integer)
    {
        bundle.putInt(getName(), integer.intValue());
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Integer)obj);
    }

    protected Object b(DataHolder dataholder, int i, int j)
    {
        return f(dataholder, i, j);
    }

    protected Object e(Bundle bundle)
    {
        return h(bundle);
    }

    protected Integer f(DataHolder dataholder, int i, int j)
    {
        return Integer.valueOf(dataholder.getInteger(getName(), i, j));
    }

    protected Integer h(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(getName()));
    }
}
