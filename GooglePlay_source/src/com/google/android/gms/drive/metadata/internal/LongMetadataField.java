// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;

public class LongMetadataField extends BaseMetadataField
{

    public LongMetadataField(String s, int i)
    {
        super(s, 0x419ce0);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return Long.valueOf(bundle.getLong(super.mFieldName));
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Long)obj;
        bundle.putLong(super.mFieldName, ((Long) (obj)).longValue());
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return Long.valueOf(dataholder.getLong(super.mFieldName, i, j));
    }
}
