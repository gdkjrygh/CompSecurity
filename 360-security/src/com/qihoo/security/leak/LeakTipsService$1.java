// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;


// Referenced classes of package com.qihoo.security.leak:
//            LeakTipsService

class a
    implements Runnable
{

    final LeakTipsService a;

    public void run()
    {
        a.stopSelf();
    }

    (LeakTipsService leaktipsservice)
    {
        a = leaktipsservice;
        super();
    }
}
