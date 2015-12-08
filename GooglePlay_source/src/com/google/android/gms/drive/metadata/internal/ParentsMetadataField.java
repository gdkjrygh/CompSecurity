// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            ParcelableCollectionMetadataField, ParentDriveIdSet, PartialDriveId

public final class ParentsMetadataField extends ParcelableCollectionMetadataField
    implements SearchableCollectionMetadataField
{

    public static final FieldRegistry.DataHolderCleaner PARENTS_CLEANER = new FieldRegistry.DataHolderCleaner() {

        public final void clean(DataHolder dataholder)
        {
            ParentsMetadataField.access$000(dataholder);
        }

        public final String getDataHolderKey()
        {
            return "parentsExtraHolder";
        }

    };

    public ParentsMetadataField()
    {
        super("parents", Collections.emptySet(), Arrays.asList(new String[] {
            "parentsExtra", "dbInstanceId", "parentsExtraHolder"
        }), 0x3e8fa0);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return doBundleRead(bundle);
    }

    protected final Collection doBundleRead(Bundle bundle)
    {
        bundle = super.doBundleRead(bundle);
        if (bundle == null)
        {
            return null;
        } else
        {
            return new HashSet(bundle);
        }
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead(dataholder, i, j);
    }

    protected final Collection doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        Object obj;
        Object obj1;
        Bundle bundle;
        bundle = dataholder.mMetadata;
        obj = bundle.getParcelableArrayList("parentsExtra");
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (bundle.getParcelable("parentsExtraHolder") == null) goto _L4; else goto _L3
_L3:
        dataholder;
        JVM INSTR monitorenter ;
        obj = (DataHolder)dataholder.mMetadata.getParcelable("parentsExtraHolder");
        if (obj != null) goto _L6; else goto _L5
_L5:
        dataholder;
        JVM INSTR monitorexit ;
_L11:
        obj = bundle.getParcelableArrayList("parentsExtra");
_L4:
        obj1 = obj;
        if (obj == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L6:
        HashMap hashmap;
        int k;
        k = dataholder.mRowCount;
        obj1 = new ArrayList(k);
        hashmap = new HashMap(k);
        j = 0;
_L8:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = dataholder.getWindowIndex(j);
        ParentDriveIdSet parentdriveidset = new ParentDriveIdSet();
        ((ArrayList) (obj1)).add(parentdriveidset);
        hashmap.put(Long.valueOf(dataholder.getLong("sqlId", j, l)), parentdriveidset);
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        String s;
        String s1;
        Object obj2;
        obj2 = ((DataHolder) (obj)).mMetadata;
        s = ((Bundle) (obj2)).getString("childSqlIdColumn");
        s1 = ((Bundle) (obj2)).getString("parentSqlIdColumn");
        obj2 = ((Bundle) (obj2)).getString("parentResIdColumn");
        k = ((DataHolder) (obj)).mRowCount;
        j = 0;
_L10:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = ((DataHolder) (obj)).getWindowIndex(j);
        ParentDriveIdSet parentdriveidset1 = (ParentDriveIdSet)hashmap.get(Long.valueOf(((DataHolder) (obj)).getLong(s, j, i1)));
        PartialDriveId partialdriveid = new PartialDriveId(((DataHolder) (obj)).getString(((String) (obj2)), j, i1), ((DataHolder) (obj)).getLong(s1, j, i1));
        parentdriveidset1.mPartialDriveIds.add(partialdriveid);
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        dataholder.mMetadata.putParcelableArrayList("parentsExtra", ((ArrayList) (obj1)));
        ((DataHolder) (obj)).close();
        dataholder.mMetadata.remove("parentsExtraHolder");
        dataholder;
        JVM INSTR monitorexit ;
        if (true) goto _L11; else goto _L2
        obj;
        dataholder;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        ((DataHolder) (obj)).close();
        dataholder.mMetadata.remove("parentsExtraHolder");
        throw obj1;
_L2:
        long l1 = bundle.getLong("dbInstanceId");
        return ((ParentDriveIdSet)((List) (obj1)).get(i)).toDriveIdSet(l1);
    }



/*
    static void access$000(DataHolder dataholder)
    {
        Bundle bundle;
        bundle = dataholder.mMetadata;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        dataholder;
        JVM INSTR monitorenter ;
        DataHolder dataholder1 = (DataHolder)bundle.getParcelable("parentsExtraHolder");
        if (dataholder1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        dataholder1.close();
        bundle.remove("parentsExtraHolder");
        dataholder;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        dataholder;
        JVM INSTR monitorexit ;
        throw exception;
        return;
    }

*/
}
