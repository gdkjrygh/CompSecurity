// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;


// Referenced classes of package com.nuance.b.e:
//            x, c

final class i
    implements Runnable
{

    final boolean a;
    final x b;
    final c c;

    i(c c1, boolean flag, x x1)
    {
        c = c1;
        a = flag;
        b = x1;
        super();
    }

    public final void run()
    {
        if (a)
        {
            b.onBusy();
            return;
        } else
        {
            b.onReady();
            return;
        }
    }
}
