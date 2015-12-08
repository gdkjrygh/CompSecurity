// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.c;
import java.util.Date;

public class b extends c
{

    public b(String s, int i)
    {
        super(s, i);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Date)obj);
    }

    protected void a(Bundle bundle, Date date)
    {
        bundle.putLong(getName(), date.getTime());
    }

    protected Object b(DataHolder dataholder, int i, int j)
    {
        return e(dataholder, i, j);
    }

    protected Object e(Bundle bundle)
    {
        return g(bundle);
    }

    protected Date e(DataHolder dataholder, int i, int j)
    {
        return new Date(dataholder.getLong(getName(), i, j));
    }

    protected Date g(Bundle bundle)
    {
        return new Date(bundle.getLong(getName()));
    }
}
