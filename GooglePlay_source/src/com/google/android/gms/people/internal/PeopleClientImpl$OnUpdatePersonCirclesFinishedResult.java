// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientImpl

private static final class mRemovedCircles
    implements com.google.android.gms.people.edResult
{

    private final List mAddedCircles;
    private final List mRemovedCircles;
    private final Status mStatus;

    public final Status getStatus()
    {
        return mStatus;
    }

    public a(Status status, List list, List list1)
    {
        mStatus = status;
        mAddedCircles = list;
        mRemovedCircles = list1;
    }
}
