// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class f extends a
{

    public f(String s, int i)
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

    protected Object c(DataHolder dataholder, int i, int k)
    {
        return g(dataholder, i, k);
    }

    protected Integer g(DataHolder dataholder, int i, int k)
    {
        return Integer.valueOf(dataholder.b(getName(), i, k));
    }

    protected Object g(Bundle bundle)
    {
        return j(bundle);
    }

    protected Integer j(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(getName()));
    }
}
