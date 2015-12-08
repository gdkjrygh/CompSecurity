// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.challenges.Challenge;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils

public static class llenge
    implements Comparator
{

    public int a(Challenge challenge, Challenge challenge1)
    {
        com.fitbit.data.domain.challenges.eStatus estatus = challenge.i();
        com.fitbit.data.domain.challenges.eStatus estatus1 = challenge1.i();
        if (estatus != null || estatus1 == null)
        {
            if (estatus != null && estatus1 == null)
            {
                return -1;
            }
            if (estatus != null && estatus1 != null)
            {
                if (estatus == estatus1)
                {
                    switch (a[estatus.ordinal()])
                    {
                    default:
                        return 1;

                    case 1: // '\001'
                        return ChallengesUtils.a.a(challenge, challenge1);

                    case 2: // '\002'
                        return ChallengesUtils.b.a(challenge, challenge1);

                    case 3: // '\003'
                        return ChallengesUtils.c.a(challenge, challenge1);
                    }
                }
                if (com.fitbit.data.domain.challenges.eStatus.INVITED == estatus)
                {
                    return -1;
                }
                if (com.fitbit.data.domain.challenges.eStatus.INVITED != estatus1)
                {
                    if (com.fitbit.data.domain.challenges.eStatus.ACTIVE == estatus)
                    {
                        return -1;
                    }
                    if (com.fitbit.data.domain.challenges.eStatus.ACTIVE != estatus1 && com.fitbit.data.domain.challenges.eStatus.COMPLETE == estatus)
                    {
                        return -1;
                    }
                }
            } else
            {
                return 0;
            }
        }
        return 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Challenge)obj, (Challenge)obj1);
    }

    public llenge()
    {
    }
}
