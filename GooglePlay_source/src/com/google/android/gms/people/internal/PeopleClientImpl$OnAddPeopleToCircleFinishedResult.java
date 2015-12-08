// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientImpl

private static final class mAddedPeople
    implements com.google.android.gms.people.edResult
{

    private final String mAddedPeople[];
    private final String mCircleId;
    private final String mCircleName;
    private final Status mStatus;

    public final Status getStatus()
    {
        return mStatus;
    }

    public (Status status, String s, String s1, String as[])
    {
        mStatus = status;
        mCircleId = s;
        mCircleName = s1;
        mAddedPeople = as;
    }
}
