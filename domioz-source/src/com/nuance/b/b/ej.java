// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.a.f;

// Referenced classes of package com.nuance.b.b:
//            ax, bv, dy, fr, 
//            v, fc, ek, gd, 
//            ec

final class ej
    implements Runnable
{

    final dy a;
    final ec b;
    private ax c;
    private final b d;

    ej(dy dy1, b b1, ec ec)
    {
        c = new ax();
        a = dy1;
        d = b1;
        b = ec;
    }

    static b a(ej ej1)
    {
        return ej1.d;
    }

    public final void run()
    {
        if (!a.i())
        {
            fr.c((new StringBuilder("Aborting triggering audio capture for a speech interpretation (")).append(d.b()).append(") because the deferred was already resolved/rejected.").toString());
            return;
        }
        v.r().t();
        Object obj;
        com.nuance.dragon.toolkit.b.e e;
        try
        {
            a.l();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                new gd();
                obj = gd.a(d.b());
                d.a(new w(d.b(), ((aq) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                fr.a("Interrupted waiting for prompts to finish while trying to start a speech recognition.");
                a.f();
                d.b(new x(d.b(), y.f, ((Exception) (obj)), "Interrupted waiting for prompts to finish while trying to start a speech recognition."));
                return;
            }
        }
        fr.e("Prompts finished, will start recognition...");
        if (!v.r().p().d())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        fr.e("Recognition will use MREC command");
        obj = ax.a("NINA_ASR_MREC_CMD", com.nuance.b.b.ax.b(d.b()), "AUDIO_INFO");
        e = com.nuance.b.b.ax.b();
        ax.a(e);
_L1:
        ((f) (obj)).a(com.nuance.b.b.ax.b(e));
        dy.a(new ek(this, ((f) (obj))));
        return;
        fr.e("Recognition will use NR command");
        obj = ax.a("NINA_ASR_NR_CMD", ax.a(d.b()), "BODY");
        e = ax.a();
          goto _L1
    }
}
