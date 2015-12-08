// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.DelegatingMetadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.FieldRegistry;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static final class mWindowIndex extends Metadata
{

    private final DataHolder mDataHolder;
    final int mRow;
    private final int mWindowIndex;

    public final volatile Object freeze()
    {
        MetadataBundle metadatabundle = MetadataBundle.create();
        Iterator iterator = FieldRegistry.getAllFields().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (metadatafield != BasicFields.THUMBNAIL)
            {
                metadatafield.copyToBundle(mDataHolder, metadatabundle, mRow, mWindowIndex);
            }
        } while (true);
        return new DelegatingMetadata(metadatabundle);
    }

    public final Object get(MetadataField metadatafield)
    {
        return metadatafield.getFromDataHolder(mDataHolder, mRow, mWindowIndex);
    }

    public final boolean isDataValid()
    {
        return !mDataHolder.isClosed();
    }

    public ds(DataHolder dataholder, int i)
    {
        mDataHolder = dataholder;
        mRow = i;
        mWindowIndex = dataholder.getWindowIndex(i);
    }
}
