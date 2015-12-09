// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ao;
import com.nuance.b.b.a.w;
import com.nuance.b.c.b;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            e, fr, gd

final class h
    implements j
{

    final b a;
    final e b;

    h(e e1, b b1)
    {
        b = e1;
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ao)obj;
        fr.f(e.a(a, "Dictation recorder was resolved (recording stopped)"));
        a.d(obj);
        if (!com.nuance.b.b.e.b(b) || b.k())
        {
            fr.f(e.a(a, "Dictation going to interpretCapturedAudio."));
            b.h();
            return;
        } else
        {
            obj = com.nuance.b.b.gd.b(a.b());
            fr.f(e.a(a, "Dictation NOT going to interpretCapturedAudio, going to cancel instead."));
            a.a(new w(a.b(), ((aq) (obj))));
            b.a(true);
            return;
        }
    }
}
