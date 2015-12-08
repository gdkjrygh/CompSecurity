// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import com.kik.g.k;

// Referenced classes of package kik.a.h:
//            k

final class l
    implements Runnable
{

    final kik.a.h.k a;

    l(kik.a.h.k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        k.a(a);
        k.b(a).a(null);
    }
}
