// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import com.google.android.gms.drive.metadata.internal.fields.CustomPropertiesField;
import com.google.android.gms.drive.metadata.internal.fields.DateFields;
import com.google.android.gms.drive.metadata.internal.fields.PinningFields;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            ParentsMetadataField

public final class FieldRegistry
{
    public static interface DataHolderCleaner
    {

        public abstract void clean(DataHolder dataholder);

        public abstract String getDataHolderKey();
    }


    private static final Map byName = new HashMap();
    private static final Map sDataHolderCleaners = new HashMap();

    public static Collection getAllFields()
    {
        return Collections.unmodifiableCollection(byName.values());
    }

    public static MetadataField getFieldByName(String s)
    {
        return (MetadataField)byName.get(s);
    }

    private static void registerDataHolderCleaner(DataHolderCleaner dataholdercleaner)
    {
        if (sDataHolderCleaners.put(dataholdercleaner.getDataHolderKey(), dataholdercleaner) != null)
        {
            throw new IllegalStateException((new StringBuilder("A cleaner for key ")).append(dataholdercleaner.getDataHolderKey()).append(" has already been registered").toString());
        } else
        {
            return;
        }
    }

    private static void registerField(MetadataField metadatafield)
    {
        if (byName.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate field name registered: ")).append(metadatafield.getName()).toString());
        } else
        {
            byName.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static void releaseFieldsInDataHolder(DataHolder dataholder)
    {
        for (Iterator iterator = sDataHolderCleaners.values().iterator(); iterator.hasNext(); ((DataHolderCleaner)iterator.next()).clean(dataholder)) { }
    }

    static 
    {
        registerField(BasicFields.DRIVE_ID);
        registerField(BasicFields.TITLE);
        registerField(BasicFields.MIME_TYPE);
        registerField(BasicFields.STARRED);
        registerField(BasicFields.TRASHED);
        registerField(BasicFields.IS_EXPLICITLY_TRASHED);
        registerField(BasicFields.IS_EDITABLE);
        registerField(BasicFields.IS_LOCAL_CONTENT_UP_TO_DATE);
        registerField(BasicFields.IS_PINNED);
        registerField(BasicFields.IS_OPENABLE);
        registerField(BasicFields.IS_APPDATA);
        registerField(BasicFields.IS_SHARED);
        registerField(BasicFields.IS_GOOGLE_PHOTOS);
        registerField(BasicFields.IS_GOOGLE_PHOTOS_ROOT_FOLDER);
        registerField(BasicFields.PARENTS);
        registerField(BasicFields.ALTERNATE_LINK);
        registerField(BasicFields.OWNER_NAMES);
        registerField(BasicFields.DESCRIPTION);
        registerField(BasicFields.IS_COPYABLE);
        registerField(BasicFields.EMBED_LINK);
        registerField(BasicFields.FILE_EXTENSION);
        registerField(BasicFields.FILE_SIZE);
        registerField(BasicFields.FOLDER_COLOR_RGB);
        registerField(BasicFields.IS_VIEWED);
        registerField(BasicFields.IS_RESTRICTED);
        registerField(BasicFields.ORIGINAL_FILENAME);
        registerField(BasicFields.LAST_MODIFYING_USER);
        registerField(BasicFields.SHARING_USER);
        registerField(BasicFields.QUOTA_BYTES_USED);
        registerField(BasicFields.WEB_CONTENT_LINK);
        registerField(BasicFields.WEB_VIEW_LINK);
        registerField(BasicFields.INDEXABLE_TEXT);
        registerField(BasicFields.HAS_THUMBNAIL);
        registerField(BasicFields.THUMBNAIL);
        registerField(BasicFields.IS_TRASHABLE);
        registerField(BasicFields.CUSTOM_FILE_PROPERTIES);
        registerField(BasicFields.UNIQUE_IDENTIFIER);
        registerField(BasicFields.WRITERS_CAN_SHARE);
        registerField(BasicFields.ROLE);
        registerField(BasicFields.MD5_CHECKSUM);
        registerField(BasicFields.SPACES);
        registerField(BasicFields.RECENCY_REASON);
        registerField(BasicFields.SUBSCRIBED);
        registerField(DateFields.CREATED);
        registerField(DateFields.MODIFIED);
        registerField(DateFields.MODIFIED_BY_ME);
        registerField(DateFields.SHARED_WITH_ME);
        registerField(DateFields.LAST_VIEWED_BY_ME);
        registerField(DateFields.RECENCY);
        registerField(PinningFields.CONTENT_AVAILABILITY);
        registerField(PinningFields.IS_PINNABLE);
        ParentsMetadataField parentsmetadatafield = BasicFields.PARENTS;
        registerDataHolderCleaner(ParentsMetadataField.PARENTS_CLEANER);
        registerDataHolderCleaner(CustomPropertiesField.CUSTOM_PROPERTIES_CLEANER);
    }
}
