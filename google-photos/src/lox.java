// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;

final class lox extends loo
{

    private final loi a;
    private final ExecutorService b;

    public lox(loi loi1, ExecutorService executorservice)
    {
        a = loi1;
        b = executorservice;
    }

    static k a(lox lox1)
    {
        return lox1.a.e;
    }

    public final void a(String s, String s1, los los)
    {
        b.submit(new loz(this, s, s1, los));
    }

    public final void a(String s, List list, los los)
    {
        b.submit(new loy(this, list, s, los));
    }
}
