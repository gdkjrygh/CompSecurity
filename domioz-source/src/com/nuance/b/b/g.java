// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            bw, fr, v, e

final class g
    implements j
{

    final b a;
    final e b;

    g(e e1, b b1)
    {
        b = e1;
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        if (obj instanceof bw)
        {
            fr.e("Sending log command to server (timeout)");
            v.r().a(true);
            return;
        } else
        {
            fr.f(e.a(a, "Dictation passing Recorder update to its own deferred"));
            a.d(obj);
            return;
        }
    }
}
