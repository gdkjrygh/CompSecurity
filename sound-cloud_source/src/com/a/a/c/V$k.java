// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            V, f

private static final class a extends a
{

    private final b a[];

    public final int b()
    {
        int i = 0;
        a aa[] = a;
        int l = aa.length;
        int j = 0;
        for (; i < l; i++)
        {
            j += aa[i].b();
        }

        return j;
    }

    public final void b(f f)
        throws IOException
    {
        b ab[] = a;
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            ab[i].b(f);
        }

    }

    public transient ption(ption aption[])
    {
        super(0, new <init>[0]);
        a = aption;
    }
}
