// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;

public class StringMetadataField extends BaseMetadataField
{

    public StringMetadataField(String s, int i)
    {
        super(s, i);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return bundle.getString(super.mFieldName);
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (String)obj;
        bundle.putString(super.mFieldName, ((String) (obj)));
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return dataholder.getString(super.mFieldName, i, j);
    }
}
