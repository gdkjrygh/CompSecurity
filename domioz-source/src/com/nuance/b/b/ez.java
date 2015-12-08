// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ai;
import com.nuance.b.b.a.aj;
import com.nuance.b.b.a.p;
import com.nuance.b.b.a.q;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.audio.b.m;
import com.nuance.dragon.toolkit.audio.k;

// Referenced classes of package com.nuance.b.b:
//            fr, fq, es

final class ez
    implements m, k
{

    fq a;
    es b;
    boolean c;

    public ez(fq fq1, es es1)
    {
        a = fq1;
        b = es1;
        c = false;
    }

    public final void a()
    {
        fr.e("NMT Prompt onStarted");
        a.b.d(new ai(a.b.b()));
        c = true;
    }

    public final void a(float f)
    {
        if (!c)
        {
            return;
        } else
        {
            a.b.d(new p(a.b.b(), q.b, f));
            return;
        }
    }

    public final void b()
    {
        fr.e("NMT Prompt onStopped");
        boolean flag = b.a();
        a.b.a(new aj(a.b.b(), flag));
        c = false;
    }
}
