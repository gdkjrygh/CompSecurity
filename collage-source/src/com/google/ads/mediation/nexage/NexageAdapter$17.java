// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.nexage;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation.nexage:
//            NexageAdapter

class a
    implements Runnable
{

    final NexageAdapter a;

    public void run()
    {
        NexageAdapter.b(a).onAdFailedToLoad(a, 2);
    }

    erstitialListener(NexageAdapter nexageadapter)
    {
        a = nexageadapter;
        super();
    }
}
