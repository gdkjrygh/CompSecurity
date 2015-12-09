// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;

public final class IntegerMetadataField extends BaseMetadataField
{

    public IntegerMetadataField(String s)
    {
        super(s, 0x419ce0);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(super.mFieldName));
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Integer)obj;
        bundle.putInt(super.mFieldName, ((Integer) (obj)).intValue());
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return Integer.valueOf(dataholder.getInteger(super.mFieldName, i, j));
    }
}
