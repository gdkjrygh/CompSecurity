// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import com.fitbit.data.domain.Profile;
import java.util.List;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment

static class 
{

    private List a;
    private List b;
    private Profile c;

    static Profile a( , Profile profile)
    {
        .c = profile;
        return profile;
    }

    static List a(c c1)
    {
        return c1.b;
    }

    static List a(b b1, List list)
    {
        b1.b = list;
        return list;
    }

    private boolean a()
    {
        return (a == null || a.size() == 0) && (b == null || b.size() == 0);
    }

    static List b(b b1)
    {
        return b1.a;
    }

    static List b(a a1, List list)
    {
        a1.a = list;
        return list;
    }

    static Profile c(a a1)
    {
        return a1.c;
    }

    static boolean d(c c1)
    {
        return c1.a();
    }

    ()
    {
    }
}
