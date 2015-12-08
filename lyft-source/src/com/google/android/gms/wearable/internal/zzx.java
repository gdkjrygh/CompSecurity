// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzx
    implements DataItemAsset
{

    private final String a;
    private final String b;

    public zzx(DataItemAsset dataitemasset)
    {
        a = dataitemasset.b();
        b = dataitemasset.c();
    }

    public Object a()
    {
        return d();
    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public DataItemAsset d()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (a == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(a);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(b);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
