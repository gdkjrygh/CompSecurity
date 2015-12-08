// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class i
    implements DataItemAsset
{

    private final String BL;
    private final String JO;

    public i(DataItemAsset dataitemasset)
    {
        BL = dataitemasset.getId();
        JO = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return pX();
    }

    public String getDataItemKey()
    {
        return JO;
    }

    public String getId()
    {
        return BL;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset pX()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (BL == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(BL);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JO);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
