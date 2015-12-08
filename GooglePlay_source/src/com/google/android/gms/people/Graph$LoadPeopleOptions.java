// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.people.internal.PeopleCallLog;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.people:
//            Graph

public static final class mSortOrder
{

    public static final mSearchFields DEFAULT = new <init>();
    public int mProjection;
    public Collection mQualifiedIds;
    public int mSearchFields;
    private int mSortOrder;

    public final String toString()
    {
        return PeopleCallLog.toStringHelper(new Object[] {
            "mCircleId", null, "mQualifiedIds", mQualifiedIds, "mProjection", Integer.valueOf(mProjection), "mPeopleOnly", Boolean.valueOf(false), "mChangedSince", Long.valueOf(0L), 
            "mQuery", null, "mSearchFields", Integer.valueOf(mSearchFields), "mSortOrder", Integer.valueOf(0), "mExtraColumns", Integer.valueOf(0)
        });
    }


    public ()
    {
        mProjection = 0x1fffff;
        mSearchFields = 7;
        mSortOrder = 0;
    }
}
