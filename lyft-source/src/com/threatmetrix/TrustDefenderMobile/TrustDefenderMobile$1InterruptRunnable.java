// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TrustDefenderMobile

final class a
    implements Runnable
{

    final Thread a;
    final TrustDefenderMobile b;

    public void run()
    {
        Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("sending interrupt to TID: ").append(a.getId()).toString());
        a.interrupt();
    }

    Q(TrustDefenderMobile trustdefendermobile, Thread thread)
    {
        b = trustdefendermobile;
        super();
        a = thread;
    }
}
