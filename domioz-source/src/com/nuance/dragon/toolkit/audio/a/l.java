// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.a;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.f;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.util.SpeexDecoder;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            e

public final class l extends com.nuance.dragon.toolkit.audio.a.e
{

    private final SpeexDecoder a = new SpeexDecoder();

    public l()
    {
    }

    public final e a()
    {
        Object obj = j();
        if (obj != null)
        {
            obj = ((b) (obj)).a();
            if (obj != null)
            {
                if (((e) (obj)).l == 8000)
                {
                    return e.f;
                } else
                {
                    return e.d;
                }
            }
        }
        return e.k;
    }

    protected final void a(e e1)
    {
        a.a(e1);
    }

    protected final h[] a(h h)
    {
        h = (g)h;
        (new StringBuilder("[LATCHK] convert() start raw:")).append(h);
        h = a.a(((g) (h)).b, ((g) (h)).b.length, ((g) (h)).g);
        if (a.a)
        {
            StringBuilder stringbuilder = new StringBuilder();
            int j = h.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append(h[i]);
                stringbuilder.append("; ");
            }

            (new StringBuilder("[LATCHK] convert() end chunk:")).append(stringbuilder);
        }
        return h;
    }

    protected final boolean b(e e1)
    {
        return e1.m == f.b;
    }
}
