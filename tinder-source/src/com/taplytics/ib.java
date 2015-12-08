// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.taplytics:
//            hw, hx, hy, id

final class ib extends hw
{

    private final List d;

    public ib(String s, Charset charset, String s1, List list)
    {
        super(s, charset, s1);
        d = list;
    }

    public final List a()
    {
        return d;
    }

    protected final void a(hx hx1, OutputStream outputstream)
        throws IOException
    {
        for (hx1 = hx1.a.iterator(); hx1.hasNext(); hw.a(hw.b, outputstream))
        {
            id id1 = (id)hx1.next();
            hw.a(id1.a, outputstream);
            hw.a(hw.a, outputstream);
            hw.a(id1.b, outputstream);
        }

    }
}
