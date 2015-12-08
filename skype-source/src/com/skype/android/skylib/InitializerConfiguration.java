// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;


// Referenced classes of package com.skype.android.skylib:
//            GISetup, VideoHostInitializer

public class InitializerConfiguration
{

    private String a;
    private String b;
    private GISetup c;
    private VideoHostInitializer d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;

    public InitializerConfiguration()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(GISetup gisetup)
    {
        c = gisetup;
    }

    public final void a(VideoHostInitializer videohostinitializer)
    {
        d = videohostinitializer;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final GISetup c()
    {
        return c;
    }

    public final void c(String s)
    {
        g = s;
    }

    public final VideoHostInitializer d()
    {
        return d;
    }

    public final boolean e()
    {
        return e;
    }

    public final boolean f()
    {
        return f;
    }

    public final void g()
    {
        f = true;
    }

    public final String h()
    {
        return g;
    }

    public final void i()
    {
        h = false;
    }

    public final boolean j()
    {
        return h;
    }
}
