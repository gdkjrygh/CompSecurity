// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            bs, bm, fr, bw

public final class br extends bs
{

    public br(bm bm1)
    {
        super(bm1);
    }

    public final void a()
    {
        if (!a.f())
        {
            fr.e("AudioCollector no start of speech timeout");
            a.d();
            a.n().d(new bw());
        }
    }
}
