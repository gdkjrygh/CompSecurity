// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.c.a.a.b.c;
import com.nuance.a.a.a.c.a.c.i;
import com.nuance.a.a.a.c.b.a.b.h;
import com.nuance.a.a.a.c.c.f;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            j

public final class n extends j
    implements i
{

    private h a;
    private f b;
    private int c;

    public n(String s, c c1, h h1, f f)
    {
        super(s, (byte)127);
        a = h1;
        b = f;
        c = c1.a();
        h1.b("audio_id", c);
    }

    protected final int c()
    {
        return c;
    }

    protected final byte[] d()
    {
        return a.i();
    }

    protected final f e()
    {
        return b;
    }
}
