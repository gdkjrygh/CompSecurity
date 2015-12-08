// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.OrderedMetadataField;
import java.util.Date;

public class DateMetadataField extends OrderedMetadataField
{

    public DateMetadataField(String s, int i)
    {
        super(s, i);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return new Date(bundle.getLong(super.mFieldName));
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Date)obj;
        bundle.putLong(super.mFieldName, ((Date) (obj)).getTime());
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return new Date(dataholder.getLong(super.mFieldName, i, j));
    }
}
