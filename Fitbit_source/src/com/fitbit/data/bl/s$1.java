// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.bl:
//            s

static final class 
    implements Comparator
{

    final Profile a;

    public int a(RankedUser rankeduser, RankedUser rankeduser1)
    {
        if (rankeduser.F() == null || !rankeduser.F().equals(a.F())) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int i;
        if (rankeduser1.F() != null && rankeduser1.F().equals(a.F()))
        {
            return 1;
        }
        i = rankeduser.P().compareToIgnoreCase(rankeduser1.P());
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (rankeduser.P().length() == 0)
        {
            return 1;
        }
        if (rankeduser1.P().length() == 0) goto _L1; else goto _L3
_L3:
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((RankedUser)obj, (RankedUser)obj1);
    }

    Profile(Profile profile)
    {
        a = profile;
        super();
    }
}
