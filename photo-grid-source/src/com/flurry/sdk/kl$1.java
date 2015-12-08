// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.net.HttpURLConnection;

// Referenced classes of package com.flurry.sdk:
//            kl

class it> extends Thread
{

    final kl a;

    public void run()
    {
        try
        {
            if (kl.a(a) != null)
            {
                kl.a(a).disconnect();
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    ection(kl kl1)
    {
        a = kl1;
        super();
    }
}
