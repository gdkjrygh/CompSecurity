// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.challenges.ChallengeMessage;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils

public static class llengeMessage
    implements Comparator
{

    public int a(ChallengeMessage challengemessage, ChallengeMessage challengemessage1)
    {
        if (challengemessage1.c() == null && challengemessage.c() != null)
        {
            return 1;
        }
        if (challengemessage.c() == null && challengemessage1.c() != null)
        {
            return -1;
        } else
        {
            return challengemessage1.e().compareTo(challengemessage.e());
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ChallengeMessage)obj, (ChallengeMessage)obj1);
    }

    public llengeMessage()
    {
    }
}
