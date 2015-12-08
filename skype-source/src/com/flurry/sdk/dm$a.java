// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.TimerTask;

// Referenced classes of package com.flurry.sdk:
//            dm

class b extends TimerTask
{

    final dm a;
    private q b;

    public void run()
    {
        a.a();
        if (b != null)
        {
            b.q();
        }
    }

    (dm dm1,  )
    {
        a = dm1;
        super();
        b = ;
    }
}
