// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nwb
{

    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final Context h;
    private final nyg i;
    private final String j;

    public nwb(Context context, nyg nyg, String s)
    {
        h = context;
        i = nyg;
        j = s;
    }

    public final nwa a()
    {
        pos pos1 = new pos();
        pos1.f = Boolean.valueOf(a);
        pos1.d = Boolean.valueOf(b);
        pos1.e = Boolean.valueOf(c);
        pos1.a = Boolean.valueOf(d);
        pos1.b = Boolean.valueOf(e);
        pos1.c = Boolean.valueOf(f);
        pos1.g = Boolean.valueOf(g);
        return new nwa(h, i, j, pos1);
    }
}
