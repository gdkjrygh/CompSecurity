// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;


// Referenced classes of package com.ford.syncV4.i:
//            b, a

final class c
    implements Runnable
{

    final a a;
    final b b;

    c(b b1, a a1)
    {
        b = b1;
        a = a1;
        super();
    }

    public final void run()
    {
        do
        {
            if (com.ford.syncV4.i.b.a(b))
            {
                break;
            }
            com.ford.syncV4.i.b.b(b);
            try
            {
                Thread.sleep(15000L);
                continue;
            }
            catch (InterruptedException interruptedexception) { }
            break;
        } while (true);
    }
}
