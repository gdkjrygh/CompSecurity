// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;

// Referenced classes of package org.a.a.b.b.a:
//            b

public final class a extends b
{

    private final b a[];

    public transient a(b ab[])
    {
        a = (b[])org.a.a.b.a.a(ab);
    }

    public final int a(CharSequence charsequence, int i, Writer writer)
    {
        b ab[] = a;
        int k = ab.length;
        for (int j = 0; j < k; j++)
        {
            int l = ab[j].a(charsequence, i, writer);
            if (l != 0)
            {
                return l;
            }
        }

        return 0;
    }
}
