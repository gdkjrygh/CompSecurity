// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TrustDefenderMobile, EndNotifier, ProfilingResult, EndNotifierBase

final class b
    implements Runnable
{

    final ProfilingResult a;
    final EndNotifierBase b;
    final TrustDefenderMobile c;

    public void run()
    {
        if (b != null && (b instanceof EndNotifier))
        {
            ((EndNotifier)b).complete(a);
        }
    }

    (TrustDefenderMobile trustdefendermobile, ProfilingResult profilingresult, EndNotifierBase endnotifierbase)
    {
        c = trustdefendermobile;
        super();
        a = profilingresult;
        b = endnotifierbase;
    }
}
