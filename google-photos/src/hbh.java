// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hbh
{

    final Context a;
    public hap b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    hbh(Context context)
    {
        b = hap.b;
        c = -1;
        d = true;
        e = -1;
        f = true;
        g = false;
        i = true;
        a = context;
    }

    public final hbg a()
    {
        int j;
        if (c != -1)
        {
            j = c;
        } else
        {
            j = hbg.a(a, hbg.b(a));
        }
        c = j;
        return new hbg(this);
    }
}
