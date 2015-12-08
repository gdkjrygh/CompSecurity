// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.a;
import com.nuance.b.b.a.ao;
import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            fr, bm

final class fx
    implements Runnable
{

    private final bm a;
    private final b b;
    private final byte c[];

    public fx(bm bm1, b b1, byte abyte0[])
    {
        a = bm1;
        b = b1;
        c = abyte0;
    }

    public final void run()
    {
        fr.e("AudioCollector CompletionRunnable.run()");
        try
        {
            if (!a.h())
            {
                com.nuance.b.b.fr.b("Never received stopped event for audio recorder, despite apparent completion");
            }
        }
        catch (InterruptedException interruptedexception)
        {
            com.nuance.b.b.fr.b("Interrupted before receiving stopped event for audio recorder, despite apparent completion");
        }
        b.d(new ao(b.b()));
        b.a(new a(b.b(), c));
    }
}
