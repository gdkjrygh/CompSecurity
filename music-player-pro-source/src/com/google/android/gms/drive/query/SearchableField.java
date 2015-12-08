// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;

public class SearchableField
{

    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableMetadataField STARRED;
    public static final SearchableOrderedMetadataField Sd;
    public static final SearchableMetadataField Se;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;

    public SearchableField()
    {
    }

    static 
    {
        TITLE = ln.RJ;
        MIME_TYPE = ln.RA;
        TRASHED = ln.RK;
        PARENTS = ln.RF;
        Sd = lp.RU;
        STARRED = ln.RH;
        MODIFIED_DATE = lp.RS;
        LAST_VIEWED_BY_ME = lp.RR;
        IS_PINNED = ln.Rv;
        Se = ln.Rl;
    }
}
