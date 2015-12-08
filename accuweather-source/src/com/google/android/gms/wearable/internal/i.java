// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class i
    implements DataItemAsset
{

    private final String JI;
    private final String xD;

    public i(DataItemAsset dataitemasset)
    {
        xD = dataitemasset.getId();
        JI = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return nl();
    }

    public String getDataItemKey()
    {
        return JI;
    }

    public String getId()
    {
        return xD;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset nl()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (xD == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(xD);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JI);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
