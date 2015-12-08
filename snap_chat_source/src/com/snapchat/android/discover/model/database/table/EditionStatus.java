// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;


public final class EditionStatus extends Enum
{

    private static final EditionStatus $VALUES[];
    public static final EditionStatus ACTIVE;
    public static final EditionStatus ARCHIVED;
    public static final EditionStatus INACTIVE;

    private EditionStatus(String s, int i)
    {
        super(s, i);
    }

    public static EditionStatus valueOf(String s)
    {
        return (EditionStatus)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionStatus, s);
    }

    public static EditionStatus[] values()
    {
        return (EditionStatus[])$VALUES.clone();
    }

    static 
    {
        ACTIVE = new EditionStatus("ACTIVE", 0);
        INACTIVE = new EditionStatus("INACTIVE", 1);
        ARCHIVED = new EditionStatus("ARCHIVED", 2);
        $VALUES = (new EditionStatus[] {
            ACTIVE, INACTIVE, ARCHIVED
        });
    }
}
