// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import java.util.concurrent.BlockingQueue;
import kik.a.f.a.g;

// Referenced classes of package kik.android.net.communicator:
//            a

final class b
    implements Runnable
{

    final g a;
    final a.a b;

    b(a.a a1, g g)
    {
        b = a1;
        a = g;
        super();
    }

    public final void run()
    {
        kik.android.net.communicator.a.r(b.a).add(new a.e(b.a, 5, a));
    }
}
