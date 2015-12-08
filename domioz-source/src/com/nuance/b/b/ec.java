// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.a.a;
import com.nuance.dragon.toolkit.a.a.d;
import com.nuance.dragon.toolkit.a.a.g;

// Referenced classes of package com.nuance.b.b:
//            ft, as, fr, dy, 
//            ed

public final class ec
    implements d
{

    final dy a;
    private ft b;
    private final b c;

    public ec(b b1, dy dy1)
    {
        c = b1;
        b = new ft(b1, "Speech Interpretation", com.nuance.b.b.as.b);
        a = dy1;
    }

    public final void a(a a1)
    {
label0:
        {
            fr.c((new StringBuilder()).append("StartSpeechInterpretationRunnable CloudRecognizer.Listener.onResult").append(" -- type: ").append(a1.a()).append(" isFinal: ").append(a1.d()).toString());
            if (a1.d())
            {
                a.f();
                if (a.i())
                {
                    break label0;
                }
                fr.c((new StringBuilder("Aborting handling result of a speech interpretation (")).append(c.b()).append(") because the deferred was already resolved/rejected.").toString());
            }
            return;
        }
        a1 = a1.b();
        b.a(a1);
    }

    public final void a(g g1)
    {
        if (g1.a() == 0)
        {
            b.a(null, g1.b());
        } else
        {
            com.nuance.b.b.fr.a((new StringBuilder("Speech Interpretation onError: ")).append(g1.c()).toString());
            c.b(new x(c.b(), y.d, null, "Error interpreting speech"));
        }
        a.h();
        com.nuance.b.b.dy.a(new ed(a));
    }
}
