// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hsh
{

    public String a;
    public long b;
    public int c;
    private final int d;
    private final int e;
    private final Context f;

    public hsh(Context context, int i, int j)
    {
        b = -1L;
        c = 0;
        d = j;
        e = i;
        f = context;
    }

    public final hsg a()
    {
        return new hsg(f, e, d, a, b, c);
    }
}
