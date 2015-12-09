// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.ChallengeUser;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils, an

public static class llengeUser
    implements Comparator
{

    public int a(ChallengeUser challengeuser, ChallengeUser challengeuser1)
    {
        Profile profile = an.a().b();
        if (challengeuser.f() == null || !challengeuser.f().equals(profile.F())) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int i;
        if (challengeuser1.f() != null && challengeuser1.f().equals(profile.F()))
        {
            return 1;
        }
        i = challengeuser.g().P().compareToIgnoreCase(challengeuser1.g().P());
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (challengeuser.g().P().length() == 0)
        {
            return 1;
        }
        if (challengeuser1.g().P().length() == 0) goto _L1; else goto _L3
_L3:
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ChallengeUser)obj, (ChallengeUser)obj1);
    }

    public llengeUser()
    {
    }
}
