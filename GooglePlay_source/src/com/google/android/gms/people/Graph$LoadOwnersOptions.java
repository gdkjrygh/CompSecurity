// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.people.internal.PeopleCallLog;

// Referenced classes of package com.google.android.gms.people:
//            Graph

public static final class mSortOrder
{

    public static final oStringHelper DEFAULT = new <init>();
    public boolean mIncludePlusPages;
    private int mSortOrder;

    public final String toString()
    {
        return PeopleCallLog.toStringHelper(new Object[] {
            "mIncludePlusPages", Boolean.valueOf(false), "mSortOrder", Integer.valueOf(0)
        });
    }


    public ()
    {
        mSortOrder = 0;
    }
}
