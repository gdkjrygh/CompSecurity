// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.request:
//            af

public static class Wp
{

    private Subscription Wo;
    private boolean Wp;

    static Subscription a(Wp wp)
    {
        return wp.Wo;
    }

    static boolean b(Wo wo)
    {
        return wo.Wp;
    }

    public tion b(Subscription subscription)
    {
        Wo = subscription;
        return this;
    }

    public af kp()
    {
        boolean flag;
        if (Wo != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must call setSubscription()");
        return new af(this, null);
    }

    public tion()
    {
        Wp = false;
    }
}
