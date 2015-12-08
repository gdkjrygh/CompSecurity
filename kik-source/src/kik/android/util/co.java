// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import kik.a.e.v;

// Referenced classes of package kik.android.util:
//            ck

final class co
    implements Runnable
{

    final ck.c a;
    final ck b;

    co(ck ck1, ck.c c)
    {
        b = ck1;
        a = c;
        super();
    }

    public final void run()
    {
        ck.c(b).a(a);
    }
}
