// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import java.util.Collection;

public class BooleanMetadataField extends BaseMetadataField
{

    public BooleanMetadataField(String s, int i)
    {
        super(s, i);
    }

    public BooleanMetadataField(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, 0x6acfc0);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return Boolean.valueOf(bundle.getBoolean(super.mFieldName));
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Boolean)obj;
        bundle.putBoolean(super.mFieldName, ((Boolean) (obj)).booleanValue());
    }

    public Boolean doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return Boolean.valueOf(dataholder.getBoolean(super.mFieldName, i, j));
    }

    public volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead(dataholder, i, j);
    }
}
