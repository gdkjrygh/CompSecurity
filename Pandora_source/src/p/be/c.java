// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.be;

import p.bh.w;

// Referenced classes of package p.be:
//            a

public class c extends a
{

    private String a;
    private Exception b;
    private w c;

    public c()
    {
        super("OnProxyClosed");
    }

    public c(String s, Exception exception, w w)
    {
        super("OnProxyClosed");
        a = s;
        b = exception;
        c = w;
    }

    public String b()
    {
        return a;
    }

    public w c()
    {
        return c;
    }

    public Exception d()
    {
        return b;
    }
}
