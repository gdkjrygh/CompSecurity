// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.BooleanMetadataField;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            BasicFields

public static final class  extends BooleanMetadataField
    implements SearchableMetadataField
{

    protected final Boolean doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        boolean flag;
        if (dataholder.getInteger(super.mFieldName, i, j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead(dataholder, i, j);
    }

    public (String s)
    {
        super(s, 0x3e8fa0);
    }
}
