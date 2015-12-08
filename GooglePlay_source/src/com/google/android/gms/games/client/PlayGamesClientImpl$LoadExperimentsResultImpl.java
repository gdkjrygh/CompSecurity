// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.client:
//            PlayGamesClientImpl

private static final class mExperimentIds
    implements mExperimentIds
{

    private final Set mExperimentIds = new HashSet();
    private final Status mStatus;

    public final Set getExperimentIds()
    {
        return mExperimentIds;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    (int i, long al[])
    {
        mStatus = new Status(i);
        for (i = 0; i < al.length; i++)
        {
            mExperimentIds.add(Long.valueOf(al[i]));
        }

    }
}
