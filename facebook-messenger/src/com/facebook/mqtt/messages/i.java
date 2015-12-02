// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.messages;


// Referenced classes of package com.facebook.mqtt.messages:
//            h, k

public class i
{

    private k a;
    private boolean b;
    private int c;
    private boolean d;
    private int e;

    public i()
    {
        e = -1;
    }

    public i a(int j)
    {
        c = j;
        return this;
    }

    public i a(k k)
    {
        a = k;
        return this;
    }

    public i a(boolean flag)
    {
        b = flag;
        return this;
    }

    public k a()
    {
        return a;
    }

    public i b(int j)
    {
        e = j;
        return this;
    }

    public i b(boolean flag)
    {
        d = flag;
        return this;
    }

    public boolean b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public h f()
    {
        return new h(this);
    }
}
