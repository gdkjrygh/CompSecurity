// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class l extends a
{

    public l(String s, int j)
    {
        super(s, j);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (String)obj);
    }

    protected void a(Bundle bundle, String s)
    {
        bundle.putString(getName(), s);
    }

    protected Object c(DataHolder dataholder, int j, int k)
    {
        return i(dataholder, j, k);
    }

    protected Object i(Bundle bundle)
    {
        return p(bundle);
    }

    protected String i(DataHolder dataholder, int j, int k)
    {
        return dataholder.c(getName(), j, k);
    }

    protected String p(Bundle bundle)
    {
        return bundle.getString(getName());
    }
}
