// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class d extends com.google.android.gms.drive.metadata.d
{

    public d(String s, int i)
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

    protected Date e(DataHolder dataholder, int i, int j)
    {
        return new Date(dataholder.a(getName(), i, j));
    }

    protected Object f(Bundle bundle)
    {
        return h(bundle);
    }

    protected Date h(Bundle bundle)
    {
        return new Date(bundle.getLong(getName()));
    }
}
