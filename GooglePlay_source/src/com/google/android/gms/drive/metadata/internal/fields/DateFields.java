// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.DateMetadataField;

public final class DateFields
{
    public static final class CreatedMetadataField extends DateMetadataField
        implements SortableMetadataField
    {

        public CreatedMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class LastViewedByMeMetadataField extends DateMetadataField
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public LastViewedByMeMetadataField(String s)
        {
            super(s, 0x419ce0);
        }
    }

    public static final class ModifiedByMeMetadataField extends DateMetadataField
        implements SortableMetadataField
    {

        public ModifiedByMeMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class ModifiedMetadataField extends DateMetadataField
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public ModifiedMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class RecencyMetadataField extends DateMetadataField
        implements SortableMetadataField
    {

        public RecencyMetadataField(String s)
        {
            super(s, 0x7a1200);
        }
    }

    public static final class SharedWithMeMetadataField extends DateMetadataField
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public SharedWithMeMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }


    public static final CreatedMetadataField CREATED = new CreatedMetadataField("created");
    public static final LastViewedByMeMetadataField LAST_VIEWED_BY_ME = new LastViewedByMeMetadataField("lastOpenedTime");
    public static final ModifiedMetadataField MODIFIED = new ModifiedMetadataField("modified");
    public static final ModifiedByMeMetadataField MODIFIED_BY_ME = new ModifiedByMeMetadataField("modifiedByMe");
    public static final RecencyMetadataField RECENCY = new RecencyMetadataField("recency");
    public static final SharedWithMeMetadataField SHARED_WITH_ME = new SharedWithMeMetadataField("sharedWithMe");

}
