// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.ParcelableMetadataField;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            BasicFields

static final class ld extends ParcelableMetadataField
{

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        throw new IllegalStateException("Thumbnail field is write only");
    }

    ld(String s, Collection collection, Collection collection1)
    {
        super(s, collection, collection1, 0x432380);
    }
}
