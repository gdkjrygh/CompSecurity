// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import com.google.android.gms.drive.metadata.internal.fields.DateFields;

public final class SearchableField
{

    public static final SearchableMetadataField CUSTOM_FILE_PROPERTIES;
    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableOrderedMetadataField SHARED_WITH_ME_DATE;
    public static final SearchableMetadataField STARRED;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;

    static 
    {
        TITLE = BasicFields.TITLE;
        MIME_TYPE = BasicFields.MIME_TYPE;
        TRASHED = BasicFields.TRASHED;
        PARENTS = BasicFields.PARENTS;
        SHARED_WITH_ME_DATE = DateFields.SHARED_WITH_ME;
        STARRED = BasicFields.STARRED;
        MODIFIED_DATE = DateFields.MODIFIED;
        LAST_VIEWED_BY_ME = DateFields.LAST_VIEWED_BY_ME;
        IS_PINNED = BasicFields.IS_PINNED;
        CUSTOM_FILE_PROPERTIES = BasicFields.CUSTOM_FILE_PROPERTIES;
    }
}
