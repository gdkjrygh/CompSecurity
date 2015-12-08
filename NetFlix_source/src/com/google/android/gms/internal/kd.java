// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.d;

public class kd
    implements d
{

    private final String Xy;
    private final String wp;

    public kd(d d1)
    {
        wp = d1.getId();
        Xy = d1.mc();
    }

    public Object freeze()
    {
        return mf();
    }

    public String getId()
    {
        return wp;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String mc()
    {
        return Xy;
    }

    public d mf()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (wp == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(wp);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(Xy);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
