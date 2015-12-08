// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import android.os.Bundle;
import android.support.v4.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.ParcelableMetadataField;
import java.util.Arrays;
import java.util.Map;

public class CustomPropertiesField extends ParcelableMetadataField
{

    public static final com.google.android.gms.drive.metadata.internal.FieldRegistry.DataHolderCleaner CUSTOM_PROPERTIES_CLEANER = new com.google.android.gms.drive.metadata.internal.FieldRegistry.DataHolderCleaner() {

        public final void clean(DataHolder dataholder)
        {
            CustomPropertiesField.access$000(dataholder);
        }

        public final String getDataHolderKey()
        {
            return "customPropertiesExtraHolder";
        }

    };

    public CustomPropertiesField(int i)
    {
        super("customProperties", Arrays.asList(new String[] {
            "hasCustomProperties", "sqlId"
        }), Arrays.asList(new String[] {
            "customPropertiesExtra", "customPropertiesExtraHolder"
        }), 0x4c4b40);
    }

    private static AppVisibleCustomProperties doDataHolderRead$586153e6(DataHolder dataholder, int i)
    {
        Object obj;
        Object obj1;
        Bundle bundle;
        bundle = dataholder.mMetadata;
        obj = bundle.getSparseParcelableArray("customPropertiesExtra");
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (bundle.getParcelable("customPropertiesExtraHolder") == null) goto _L4; else goto _L3
_L3:
        dataholder;
        JVM INSTR monitorenter ;
        DataHolder dataholder1 = (DataHolder)dataholder.mMetadata.getParcelable("customPropertiesExtraHolder");
        if (dataholder1 != null) goto _L6; else goto _L5
_L5:
        dataholder;
        JVM INSTR monitorexit ;
_L9:
        obj = bundle.getSparseParcelableArray("customPropertiesExtra");
_L4:
        obj1 = obj;
        if (obj == null)
        {
            return AppVisibleCustomProperties.EMPTY_PROPERTIES;
        }
          goto _L2
_L6:
        LongSparseArray longsparsearray;
        String s;
        String s1;
        String s2;
        String s3;
        obj = dataholder1.mMetadata;
        s = ((Bundle) (obj)).getString("entryIdColumn");
        s1 = ((Bundle) (obj)).getString("keyColumn");
        s2 = ((Bundle) (obj)).getString("visibilityColumn");
        s3 = ((Bundle) (obj)).getString("valueColumn");
        longsparsearray = new LongSparseArray();
        int j = 0;
_L8:
        CustomProperty customproperty;
        long l1;
        if (j >= dataholder1.mRowCount)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = dataholder1.getWindowIndex(j);
        l1 = dataholder1.getLong(s, j, k);
        obj = dataholder1.getString(s1, j, k);
        int l = dataholder1.getInteger(s2, j, k);
        obj1 = dataholder1.getString(s3, j, k);
        customproperty = new CustomProperty(new CustomPropertyKey(((String) (obj)), l), ((String) (obj1)));
        obj1 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder)longsparsearray.get(l1);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        obj = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder();
        longsparsearray.put(l1, obj);
        Preconditions.checkNotNull(customproperty, "property");
        ((com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder) (obj)).mProperties.put(customproperty.mKey, customproperty);
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        obj = new SparseArray();
        j = 0;
_L10:
        if (j >= dataholder.mRowCount)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj1 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder)longsparsearray.get(dataholder.getLong("sqlId", j, dataholder.getWindowIndex(j)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        ((SparseArray) (obj)).append(j, ((com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder) (obj1)).build());
        break MISSING_BLOCK_LABEL_400;
        dataholder.mMetadata.putSparseParcelableArray("customPropertiesExtra", ((SparseArray) (obj)));
        dataholder1.close();
        dataholder.mMetadata.remove("customPropertiesExtraHolder");
        dataholder;
        JVM INSTR monitorexit ;
          goto _L9
        Exception exception;
        exception;
        dataholder;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        dataholder1.close();
        dataholder.mMetadata.remove("customPropertiesExtraHolder");
        throw exception;
_L2:
        return (AppVisibleCustomProperties)((SparseArray) (obj1)).get(i, AppVisibleCustomProperties.EMPTY_PROPERTIES);
        j++;
          goto _L10
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead$586153e6(dataholder, i);
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
        DataHolder dataholder1 = (DataHolder)bundle.getParcelable("customPropertiesExtraHolder");
        if (dataholder1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        dataholder1.close();
        bundle.remove("customPropertiesExtraHolder");
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
