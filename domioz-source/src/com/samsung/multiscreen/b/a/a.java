// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b.a;


// Referenced classes of package com.samsung.multiscreen.b.a:
//            e

public abstract class a
{

    private com.samsung.multiscreen.b.a a;
    private e b;

    protected a(com.samsung.multiscreen.b.a a1)
    {
        a = a1;
    }

    protected final e a()
    {
        return b;
    }

    public final void a(e e)
    {
        b = e;
    }

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    public String toString()
    {
        return (new StringBuilder()).append("[ChannelConnection]").append(" connected: ").append(b()).toString();
    }
}
