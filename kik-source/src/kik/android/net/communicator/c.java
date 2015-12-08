// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import com.kik.g.i;

// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class c extends i
{

    final CommunicatorService a;

    c(CommunicatorService communicatorservice)
    {
        a = communicatorservice;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Long)obj1;
        CommunicatorService.a(a, ((Long) (obj)).longValue());
        boolean flag;
        if (((Long) (obj)).longValue() > 20000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CommunicatorService.a(a, 1L, flag, "disconnection");
    }
}
