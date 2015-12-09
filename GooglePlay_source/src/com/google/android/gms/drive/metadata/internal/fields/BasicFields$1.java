// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.BooleanMetadataField;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            BasicFields

static final class <init> extends BooleanMetadataField
{

    protected final Boolean doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        boolean flag;
        if (dataholder.getInteger("trashed", i, j) == 2)
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

    I(String s, Collection collection, Collection collection1)
    {
        super(s, collection, collection1, 0x6acfc0);
    }
}
