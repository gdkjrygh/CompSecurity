// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            fr, dy

final class ea
    implements j
{

    final b a;
    final dy b;

    ea(dy dy, b b1)
    {
        b = dy;
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ak)obj;
        fr.f("SpeechInterpreter passing Recorder rejection to its own deferred");
        a.b(new x(a.b(), y.e, null, ((ak) (obj)).c));
    }
}
