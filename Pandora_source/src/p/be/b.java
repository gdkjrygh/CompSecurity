// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.be;


// Referenced classes of package p.be:
//            a

public class b extends a
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

    public String b()
    {
        return a;
    }

    public Exception c()
    {
        return b;
    }
}
