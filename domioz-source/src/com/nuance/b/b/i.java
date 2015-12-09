// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.aa;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;

// Referenced classes of package com.nuance.b.b:
//            ft, as, e, l, 
//            fr

public final class i
    implements aa
{

    final e a;
    ft b;
    private final b c;

    public i(b b1, e e1)
    {
        c = b1;
        a = e1;
        b = new ft(b1, "Dictation", as.e);
    }

    public final void a(x x)
    {
    }

    public final void a(x x, an an)
    {
        b.a(x, an);
        a.i();
        e.a(new l(a));
    }

    public final void a(x x, ao ao1, boolean flag)
    {
label0:
        {
            fr.c(e.a(c, (new StringBuilder()).append("StartDictationRunnable CloudDictationListener.onTransactionResult").append(" -- type: ").append(ao1.b()).append(" isFinal: ").append(ao1.e()).toString()));
            if (ao1.e())
            {
                a.g();
                if (a.e())
                {
                    break label0;
                }
                fr.c(e.a(c, "Aborting handling result of dictation because the deferred was already resolved/rejected."));
            }
            return;
        }
        x = ao1.d();
        b.a(x);
    }
}
