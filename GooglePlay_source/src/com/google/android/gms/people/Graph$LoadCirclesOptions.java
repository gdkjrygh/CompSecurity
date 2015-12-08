// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.people.internal.PeopleCallLog;

// Referenced classes of package com.google.android.gms.people:
//            Graph

public static final class mFilterCircleType
{

    public static final mFilterCircleType DEFAULT = new <init>();
    public int mFilterCircleType;

    public final String toString()
    {
        return PeopleCallLog.toStringHelper(new Object[] {
            "mFilterCircleType", Integer.valueOf(mFilterCircleType), "mFilterCircleId", null, "mFilterCircleNamePrefix", null, "mGetVisibility", Boolean.valueOf(false)
        });
    }


    public ()
    {
        mFilterCircleType = -999;
    }
}
