// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.m;
import com.tinder.e.n;

// Referenced classes of package com.tinder.managers:
//            d

final class b
    implements m
{

    final n a;
    final int b;
    final d c;

    public final void onTinderLoginFailure()
    {
        d.a(c, b - 1, a);
    }

    public final void onTinderLoginFailureAccessDenied()
    {
    }

    public final void onTinderLoginSuccess()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public final void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
    {
        (new StringBuilder("isBanned=")).append(flag).append(", isAgeVerificationNeeded=").append(flag1).append(", isGenderVerificationNeeded=").append(flag2);
    }

    (d d1, n n1, int i)
    {
        c = d1;
        a = n1;
        b = i;
        super();
    }
}
