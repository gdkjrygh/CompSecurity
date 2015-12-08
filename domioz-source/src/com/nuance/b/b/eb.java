// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            bw, fr, v, dy

final class eb
    implements j
{

    final b a;
    final dy b;

    eb(dy dy, b b1)
    {
        b = dy;
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        if (obj instanceof bw)
        {
            fr.e("Sending log command to server (timeout)");
            v.r().a(false);
            return;
        } else
        {
            fr.f("SpeechInterpreter passing Recorder update to its own deferred");
            a.d(obj);
            return;
        }
    }
}
