// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class djd
{

    private final Context a;
    private djj b;

    djd(Context context, int i)
    {
        a = context;
        b = new djj();
        b.a = i;
    }

    public final djc a()
    {
        b.b = 0;
        return new djc(a, b);
    }

    public final djc a(int i)
    {
        b.b = i;
        return new djc(a, b);
    }

    public final djc b()
    {
        b.b = 1;
        return new djc(a, b);
    }
}
