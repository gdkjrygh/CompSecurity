// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ao;
import com.nuance.b.b.a.w;
import com.nuance.b.c.b;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            fr, dy, gd

final class dz
    implements j
{

    final b a;
    final dy b;

    dz(dy dy1, b b1)
    {
        b = dy1;
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ao)obj;
        fr.f("SpeechInterpreter recorder was resolved (recording stopped)");
        a.d(obj);
        if (!b.c || b.k())
        {
            fr.f("SpeechInterpreter going to interpretRecordedAudio");
            b.g();
            return;
        } else
        {
            fr.f("SpeechInterpreter NOT going to interpretRecordedAudio, going to cancel instead");
            obj = gd.a(a.b());
            a.a(new w(a.b(), ((aq) (obj))));
            b.a(true);
            return;
        }
    }
}
