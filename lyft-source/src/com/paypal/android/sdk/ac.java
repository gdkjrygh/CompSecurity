// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.paypal.android.sdk:
//            aa, ao

final class ac extends TimerTask
{

    private aa a;

    ac(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void run()
    {
        aa.d(a);
        if (aa.e(a))
        {
            aa.f(a).cancel();
            return;
        }
        try
        {
            aa.g(a);
            return;
        }
        catch (Exception exception)
        {
            ao.a("RiskComponent", "Error in logRiskMetadataTask: ", exception);
        }
    }
}
