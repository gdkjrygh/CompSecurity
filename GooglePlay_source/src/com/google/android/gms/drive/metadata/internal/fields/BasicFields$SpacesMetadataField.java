// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.ParcelableCollectionMetadataField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            BasicFields

public static final class > extends ParcelableCollectionMetadataField
{

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead(dataholder, i, j);
    }

    protected final Collection doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        if (dataholder.getBoolean("inDriveSpace", i, j))
        {
            arraylist.add(DriveSpace.DRIVE);
        }
        if (dataholder.getBoolean("isAppData", i, j))
        {
            arraylist.add(DriveSpace.APP_DATA_FOLDER);
        }
        if (dataholder.getBoolean("inGooglePhotosSpace", i, j))
        {
            arraylist.add(DriveSpace.PHOTOS);
        }
        return arraylist;
    }

    public ()
    {
        super("spaces", Arrays.asList(new String[] {
            "inDriveSpace", "isAppData", "inGooglePhotosSpace"
        }), Collections.emptySet(), 0x6acfc0);
    }
}
