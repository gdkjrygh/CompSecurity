// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.a;


// Referenced classes of package com.ford.syncV4.e.a:
//            a

public final class b extends a
{

    private String a;
    private Exception b;

    public b()
    {
        super("OnProxyError");
    }

    public b(String s, Exception exception)
    {
        super("OnProxyError");
        a = s;
        b = exception;
    }

    public final String b()
    {
        return a;
    }

    public final Exception c()
    {
        return b;
    }
}
