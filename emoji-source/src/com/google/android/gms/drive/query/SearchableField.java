// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;

public class SearchableField
{

    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField KI;
    public static final SearchableMetadataField KJ;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableMetadataField STARRED;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;

    public SearchableField()
    {
    }

    static 
    {
        TITLE = iq.Kr;
        MIME_TYPE = iq.Kk;
        TRASHED = iq.Ks;
        PARENTS = iq.Kn;
        KI = is.KA;
        STARRED = iq.Kp;
        MODIFIED_DATE = is.Ky;
        LAST_VIEWED_BY_ME = is.Kx;
        IS_PINNED = iq.Kf;
        KJ = iq.JV;
    }
}
