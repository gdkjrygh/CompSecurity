// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.a;


// Referenced classes of package com.ford.syncV4.e.a:
//            a

public final class c extends a
{

    private String a;
    private Exception b;
    private int c;

    public c()
    {
        super("OnProxyClosed");
    }

    public c(String s, Exception exception, int i)
    {
        super("OnProxyClosed");
        a = s;
        b = exception;
        c = i;
    }

    public final String b()
    {
        return a;
    }

    public final int c()
    {
        return c;
    }

    public final Exception d()
    {
        return b;
    }
}
