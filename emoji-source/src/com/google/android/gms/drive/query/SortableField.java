// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;

public class SortableField
{

    public static final SortableMetadataField CREATED_DATE;
    public static final SortableMetadataField LAST_VIEWED_BY_ME;
    public static final SortableMetadataField MODIFIED_BY_ME_DATE;
    public static final SortableMetadataField MODIFIED_DATE;
    public static final SortableMetadataField QUOTA_USED;
    public static final SortableMetadataField SHARED_WITH_ME_DATE;
    public static final SortableMetadataField TITLE;

    public SortableField()
    {
    }

    static 
    {
        TITLE = iq.Kr;
        CREATED_DATE = is.Kw;
        MODIFIED_DATE = is.Ky;
        MODIFIED_BY_ME_DATE = is.Kz;
        LAST_VIEWED_BY_ME = is.Kx;
        SHARED_WITH_ME_DATE = is.KA;
        QUOTA_USED = iq.Ko;
    }
}
