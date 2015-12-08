// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientImpl

private static final class mOwners
    implements com.google.android.gms.people.edResult
{

    private final OwnerBuffer mOwners;
    private final Status mStatus;

    public final OwnerBuffer getOwners()
    {
        return mOwners;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final void release()
    {
        if (mOwners != null)
        {
            mOwners.release();
        }
    }

    public (Status status, OwnerBuffer ownerbuffer)
    {
        mStatus = status;
        mOwners = ownerbuffer;
    }
}
