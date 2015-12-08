// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.nio.charset.Charset;

// Referenced classes of package com.taplytics:
//            a, ax, c

public abstract class ih
    implements a
{

    final c a;

    public ih(c c1)
    {
        ax.a(c1, "Content type");
        a = c1;
    }

    public final String b()
    {
        return a.o;
    }

    public String c()
    {
        Charset charset = a.p;
        if (charset != null)
        {
            return charset.name();
        } else
        {
            return null;
        }
    }
}
