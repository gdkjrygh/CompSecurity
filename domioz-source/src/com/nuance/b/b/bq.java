// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.n;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.audio.a;

// Referenced classes of package com.nuance.b.b:
//            bm, fr

public final class bq
    implements a
{

    private final bm a;

    public bq(bm bm1)
    {
        a = bm1;
    }

    public final void a()
    {
        fr.e(com.nuance.b.b.bm.a(a.n(), "AudioCollector onStartOfSpeech"));
        a.g();
        a.n().d(new ap(a.n().b()));
    }

    public final void b()
    {
        fr.e(com.nuance.b.b.bm.a(a.n(), "AudioCollector onEndOfSpeech"));
        a.n().d(new n(a.n().b()));
        a.d();
    }
}
