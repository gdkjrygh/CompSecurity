// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;


// Referenced classes of package org.c.e.b:
//            x, c, y, e

final class w
    implements x
{

    private final StringBuilder a;

    private w(String s)
    {
        a = new StringBuilder(s);
    }

    w(String s, byte byte0)
    {
        this(s);
    }

    public final e a()
    {
        return new c(a.toString());
    }

    public final x a(String s)
    {
        a.append(s);
        return this;
    }

    public final transient x a(String as[])
    {
        y y1 = new y(this, (byte)0);
        y1.a(as);
        return y1;
    }
}
