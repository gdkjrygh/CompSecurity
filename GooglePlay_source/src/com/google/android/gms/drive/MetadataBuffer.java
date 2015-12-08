// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.DelegatingMetadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.FieldRegistry;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata

public final class MetadataBuffer extends AbstractDataBuffer
{
    private static final class DataHolderMetadata extends Metadata
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

        public DataHolderMetadata(DataHolder dataholder, int i)
        {
            mDataHolder = dataholder;
            mRow = i;
            mWindowIndex = dataholder.getWindowIndex(i);
        }
    }


    private DataHolderMetadata mLastRowAccessed;

    public MetadataBuffer(DataHolder dataholder)
    {
        super(dataholder);
        dataholder.mMetadata.setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public final Metadata get(int i)
    {
        DataHolderMetadata dataholdermetadata;
label0:
        {
            DataHolderMetadata dataholdermetadata1 = mLastRowAccessed;
            if (dataholdermetadata1 != null)
            {
                dataholdermetadata = dataholdermetadata1;
                if (dataholdermetadata1.mRow == i)
                {
                    break label0;
                }
            }
            dataholdermetadata = new DataHolderMetadata(mDataHolder, i);
            mLastRowAccessed = dataholdermetadata;
        }
        return dataholdermetadata;
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final void release()
    {
        if (mDataHolder != null)
        {
            FieldRegistry.releaseFieldsInDataHolder(mDataHolder);
        }
        super.release();
    }
}
