// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import com.kik.g.i;

// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class e extends i
{

    final CommunicatorService a;

    e(CommunicatorService communicatorservice)
    {
        a = communicatorservice;
        super();
    }

    public final volatile void a(Object obj, Object obj1)
    {
        CommunicatorService.a(a, true);
        CommunicatorService.a(a, 1L, true, "requested retry reset");
    }
}
