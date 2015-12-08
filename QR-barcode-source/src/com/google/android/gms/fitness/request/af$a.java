// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Subscription;

// Referenced classes of package com.google.android.gms.fitness.request:
//            af

public static class UT
{

    private Subscription US;
    private boolean UT;

    static Subscription a(UT ut)
    {
        return ut.US;
    }

    static boolean b(US us)
    {
        return us.UT;
    }

    public tion b(Subscription subscription)
    {
        US = subscription;
        return this;
    }

    public af jF()
    {
        boolean flag;
        if (US != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must call setSubscription()");
        return new af(this, null);
    }

    public tion()
    {
        UT = false;
    }
}
