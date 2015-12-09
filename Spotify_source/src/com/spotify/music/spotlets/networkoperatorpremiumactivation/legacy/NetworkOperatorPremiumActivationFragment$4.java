// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import god;
import goh;

// Referenced classes of package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy:
//            NetworkOperatorPremiumActivationFragment

final class a
    implements god
{

    private NetworkOperatorPremiumActivationFragment a;

    public final void a(long l)
    {
        if (!a.o())
        {
            return;
        }
        NetworkOperatorPremiumActivationFragment.a(a, l);
        if (NetworkOperatorPremiumActivationFragment.c(a) == ate.g && NetworkOperatorPremiumActivationFragment.d(a) != null)
        {
            NetworkOperatorPremiumActivationFragment.d(a).b = l;
            return;
        } else
        {
            a.a(ate.g);
            return;
        }
    }

    ate(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        a = networkoperatorpremiumactivationfragment;
        super();
    }
}
