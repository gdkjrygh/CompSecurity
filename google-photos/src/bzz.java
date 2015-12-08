// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class bzz
    implements Runnable
{

    private bzv a;

    bzz(bzv bzv1)
    {
        a = bzv1;
        super();
    }

    public final void run()
    {
        Object obj = bzv.d(a).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            caa caa1 = (caa)((Iterator) (obj)).next();
            if (caa1 != null)
            {
                caa1.a();
            }
        } while (true);
        bzv.e(a).j(true);
        bzv.f(a).i(false);
        bzv.g(a).b(bzv.h());
        obj = bzv.i(a);
        byte byte0;
        if (bzv.h(a).b.P)
        {
            byte0 = 21;
        } else
        {
            byte0 = 26;
        }
        ((noq) (obj)).a(byte0, null, false);
    }
}
