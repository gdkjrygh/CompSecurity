// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class j extends a
{

    public j(String s, int i)
    {
        super(s, i);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (String)obj);
    }

    protected void a(Bundle bundle, String s)
    {
        bundle.putString(getName(), s);
    }

    protected Object b(DataHolder dataholder, int i, int k)
    {
        return h(dataholder, i, k);
    }

    protected Object e(Bundle bundle)
    {
        return l(bundle);
    }

    protected String h(DataHolder dataholder, int i, int k)
    {
        return dataholder.getString(getName(), i, k);
    }

    protected String l(Bundle bundle)
    {
        return bundle.getString(getName());
    }
}
