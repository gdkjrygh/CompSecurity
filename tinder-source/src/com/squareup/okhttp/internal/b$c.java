// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal:
//            b, k

public final class <init>
    implements Closeable
{

    public final String a;
    public final long b;
    public final r c[];
    public final b d;
    private final long e[];

    public final void close()
    {
        r ar[] = c;
        int j = ar.length;
        for (int i = 0; i < j; i++)
        {
            k.a(ar[i]);
        }

    }

    private (b b1, String s, long l, r ar[], long al[])
    {
        d = b1;
        super();
        a = s;
        b = l;
        c = ar;
        e = al;
    }

    e(b b1, String s, long l, r ar[], long al[], byte byte0)
    {
        this(b1, s, l, ar, al);
    }
}
