// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.a;
import java.util.Collection;

public abstract class h extends a
{

    public h(String s, int i)
    {
        super(s, i);
    }

    public h(String s, Collection collection, int i)
    {
        super(s, collection, i);
    }

    protected void a(Bundle bundle, Parcelable parcelable)
    {
        bundle.putParcelable(getName(), parcelable);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Parcelable)obj);
    }

    protected Object e(Bundle bundle)
    {
        return k(bundle);
    }

    protected Parcelable k(Bundle bundle)
    {
        return bundle.getParcelable(getName());
    }
}
