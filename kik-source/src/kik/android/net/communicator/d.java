// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import android.os.SystemClock;
import com.kik.g.i;

// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class d extends i
{

    final CommunicatorService a;

    d(CommunicatorService communicatorservice)
    {
        a = communicatorservice;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        CommunicatorService.b(a, SystemClock.elapsedRealtime());
    }
}
