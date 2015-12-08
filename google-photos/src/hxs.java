// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hxs extends mvc
{

    private final hsx l;
    private final int m;
    private final String n;
    private final int o;
    private final int p;

    public hxs(Context context, int i, String s, int j, int k)
    {
        super(context);
        m = j;
        l = (hsx)olm.a(context, hsx);
        o = i;
        n = s;
        p = k;
    }

    public final Object d()
    {
        return l.a(o, n, m, p);
    }

    protected final boolean q()
    {
        return true;
    }

    protected final boolean r()
    {
        return true;
    }
}
