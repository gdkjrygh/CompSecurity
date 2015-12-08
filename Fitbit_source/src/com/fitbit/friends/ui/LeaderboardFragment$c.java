// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.util.bj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment

private static class b extends bj
{

    private boolean a;
    private final Profile b;

    public b b()
    {
        RankedUser rankeduser;
        b b1;
        b1 = new <init>();
        a(b1, new ArrayList());
        b(b1, new ArrayList());
        a(b1, -1);
        List list = s.a(getContext()).a(b.F());
        rankeduser = null;
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            RankedUser rankeduser1 = (RankedUser)iterator.next();
            if (TextUtils.equals(rankeduser1.F(), b.F()))
            {
                rankeduser = rankeduser1;
            }
            if (rankeduser1.s())
            {
                c(b1).add(rankeduser1);
            } else
            {
                d(b1).add(rankeduser1);
            }
        }

        if (!c(b1).contains(rankeduser) || !b.c()) goto _L2; else goto _L1
_L1:
        c(b1).remove(rankeduser);
_L4:
        s.a(d(b1));
        return b1;
_L2:
        if (c(b1).contains(rankeduser))
        {
            a(b1, c(b1).indexOf(rankeduser));
        } else
        if (!b.c())
        {
            if (d(b1).contains(rankeduser))
            {
                d(b1).remove(rankeduser);
            }
            RankedUser rankeduser2 = rankeduser;
            if (rankeduser == null)
            {
                rankeduser2 = new RankedUser();
                rankeduser2.f(b.F());
                rankeduser2.g(b.G());
                rankeduser2.k(b.P());
            }
            c(b1).add(rankeduser2);
            a(b1, c(b1).size() - 1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Intent f()
    {
        return cw.a(getContext(), a);
    }

    public Object f_()
    {
        return b();
    }

    public (Context context, IntentFilter intentfilter, boolean flag, Profile profile)
    {
        super(context, intentfilter);
        a = false;
        a = flag;
        b = profile;
    }
}
