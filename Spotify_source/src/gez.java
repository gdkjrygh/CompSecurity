// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public class gez
{

    public gfa a;
    public gfa b;
    public gfa c;
    public int d;
    public gfa e;
    private final Runnable f;
    private final String g;

    public gez(String s, Runnable runnable)
    {
        g = s;
        f = runnable;
    }

    public final gey a()
    {
        dmz.a(gez, gfc);
        return gfc.a(g, new Handler(), f, a, b, c, d, e);
    }

    static 
    {
        dmz.a(gez, gfc, new gfc());
    }
}
