// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;


// Referenced classes of package com.fitbit.pedometer:
//            HtcPedometerAdapter

class a
    implements Runnable
{

    final HtcPedometerAdapter a;

    public void run()
    {
        if (a.a != null)
        {
            a.a.a();
        }
    }

    (HtcPedometerAdapter htcpedometeradapter)
    {
        a = htcpedometeradapter;
        super();
    }
}
