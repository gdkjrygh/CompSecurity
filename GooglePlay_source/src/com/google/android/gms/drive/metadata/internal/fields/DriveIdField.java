// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.internal.ParcelableMetadataField;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            BasicFields

public final class DriveIdField extends ParcelableMetadataField
{

    public static final DriveIdField INSTANCE = new DriveIdField();

    private DriveIdField()
    {
        super("driveId", Arrays.asList(new String[] {
            "sqlId", "resourceId", "mimeType"
        }), Arrays.asList(new String[] {
            "dbInstanceId"
        }), 0x3e8fa0);
    }

    protected final boolean canReadFromDataHolder(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = super.mDataHolderFieldNames.iterator(); iterator.hasNext();)
        {
            if (!dataholder.hasColumn((String)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        long l = dataholder.mMetadata.getLong("dbInstanceId");
        String s;
        int k;
        long l1;
        if ("application/vnd.google-apps.folder".equals(dataholder.getString(((BaseMetadataField) (BasicFields.MIME_TYPE)).mFieldName, i, j)))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        s = dataholder.getString("resourceId", i, j);
        l1 = dataholder.getLong("sqlId", i, j);
        dataholder = s;
        if ("generated-android-null".equals(s))
        {
            dataholder = null;
        }
        return new DriveId(dataholder, Long.valueOf(l1).longValue(), l, k);
    }

}
