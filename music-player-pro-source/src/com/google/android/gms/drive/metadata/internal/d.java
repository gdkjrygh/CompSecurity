// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class d extends com.google.android.gms.drive.metadata.d
{

    public d(String s, int j)
    {
        super(s, j);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Date)obj);
    }

    protected void a(Bundle bundle, Date date)
    {
        bundle.putLong(getName(), date.getTime());
    }

    protected Object c(DataHolder dataholder, int j, int l)
    {
        return f(dataholder, j, l);
    }

    protected Date f(DataHolder dataholder, int j, int l)
    {
        return new Date(dataholder.a(getName(), j, l));
    }

    protected Object i(Bundle bundle)
    {
        return k(bundle);
    }

    protected Date k(Bundle bundle)
    {
        return new Date(bundle.getLong(getName()));
    }
}
