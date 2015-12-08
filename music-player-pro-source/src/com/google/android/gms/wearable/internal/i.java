// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class i
    implements DataItemAsset
{

    private final String CE;
    private final String KP;

    public i(DataItemAsset dataitemasset)
    {
        CE = dataitemasset.getId();
        KP = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return ro();
    }

    public String getDataItemKey()
    {
        return KP;
    }

    public String getId()
    {
        return CE;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset ro()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (CE == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(CE);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(KP);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
