// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bb, zzk, dv

private final class d
    implements Runnable
{

    final bb a;
    private final zzk b;
    private final dv c;
    private final Runnable d;

    public final void run()
    {
        if (!b.j) goto _L2; else goto _L1
_L1:
        b.b("canceled-at-delivery");
_L5:
        return;
_L2:
        boolean flag;
        if (c.c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        b.a(c.a);
_L6:
        zzk zzk1;
        zzr zzr;
        if (c.d)
        {
            b.a("intermediate-response");
        } else
        {
            b.b("done");
        }
        if (d != null)
        {
            d.run();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        zzk1 = b;
        zzr = c.c;
        if (zzk1.f != null)
        {
            zzk1.f.a(zzr);
        }
          goto _L6
    }

    public (bb bb1, zzk zzk1, dv dv1, Runnable runnable)
    {
        a = bb1;
        super();
        b = zzk1;
        c = dv1;
        d = runnable;
    }
}
