// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class i
    implements DataItemAsset
{

    private final String JL;
    private final String xG;

    public i(DataItemAsset dataitemasset)
    {
        xG = dataitemasset.getId();
        JL = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return nq();
    }

    public String getDataItemKey()
    {
        return JL;
    }

    public String getId()
    {
        return xG;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset nq()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (xG == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(xG);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JL);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
