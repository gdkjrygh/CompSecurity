// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            bv, e, fr, v, 
//            k, gd

final class j
    implements Runnable
{

    final e a;
    private final b b;

    j(e e1, b b1)
    {
        a = e1;
        b = b1;
    }

    public final void run()
    {
        if (!a.e())
        {
            fr.c((new StringBuilder("Aborting triggering audio capture for dictation (")).append(b.b()).append(") because the deferred was already resolved/rejected.").toString());
            return;
        }
        try
        {
            v.r().t();
            a.m();
            fr.e(e.a(b, "Prompts finished, will start dictation..."));
            e.a(new k(this));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            fr.a(e.a(b, "Interrupted waiting for prompts to finish while trying to start dictation."));
            a.g();
            b.b(new x(b.b(), y.f, interruptedexception, "Interrupted waiting for prompts to finish while trying to start dictation."));
            return;
        }
        catch (bv bv1)
        {
            fr.e(e.a(b, "No Capture while trying to start dictation. Mapping to empty string"));
        }
        aq aq = com.nuance.b.b.gd.b(b.b());
        b.a(new w(b.b(), aq));
        a.g();
    }
}
