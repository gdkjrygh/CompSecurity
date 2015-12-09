// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.challenges.a.b;
import com.fitbit.data.domain.challenges.Challenge;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils

public static class llenge
    implements Comparator
{

    public int a(Challenge challenge, Challenge challenge1)
    {
        challenge = challenge.C();
        challenge1 = challenge1.C();
        return ChallengesUtils.d.a(challenge1, challenge);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Challenge)obj, (Challenge)obj1);
    }

    public llenge()
    {
    }
}
