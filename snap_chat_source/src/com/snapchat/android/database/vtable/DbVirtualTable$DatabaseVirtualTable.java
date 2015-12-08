// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.vtable;

import com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable;
import com.snapchat.android.discover.model.database.vtable.PublisherAndEditionVirtualTable;

// Referenced classes of package com.snapchat.android.database.vtable:
//            DbVirtualTable

public static final class a extends Enum
{

    private static final DSNAP_PAGE $VALUES[];
    public static final DSNAP_PAGE DSNAP_PAGE;
    public static final DSNAP_PAGE PUBLISHER_AND_EDITION;
    private DbVirtualTable a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/database/vtable/DbVirtualTable$DatabaseVirtualTable, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final DbVirtualTable getVirtualTable()
    {
        return a;
    }

    static 
    {
        PUBLISHER_AND_EDITION = new <init>("PUBLISHER_AND_EDITION", 0, PublisherAndEditionVirtualTable.d());
        DSNAP_PAGE = new <init>("DSNAP_PAGE", 1, DSnapPageVirtualTable.d());
        $VALUES = (new .VALUES[] {
            PUBLISHER_AND_EDITION, DSNAP_PAGE
        });
    }

    private (String s, int i, DbVirtualTable dbvirtualtable)
    {
        super(s, i);
        a = dbvirtualtable;
    }
}
