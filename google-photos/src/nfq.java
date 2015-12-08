// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;

public final class nfq
    implements nfn
{

    private final PrintWriter a;
    private final String b;

    public nfq(PrintWriter printwriter, String s)
    {
        a = printwriter;
        b = s;
    }

    public final void a(String s)
    {
        a.print(b);
        a.println(s);
    }

    public final transient void a(String s, Object aobj[])
    {
        a(String.format(s, aobj));
    }
}
