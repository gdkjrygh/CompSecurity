// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

public final class dfm
    implements dfk
{

    private final dfk a;
    private final dfg b;

    public dfm(dfk dfk1, dfg dfg1)
    {
        a = (dfk)b.a(dfk1, "factory", null);
        b = (dfg)b.a(dfg1, "janitor", null);
    }

    public final ExecutorService a(int i, Class class1, String s)
    {
        return b.a(a.a(i, class1, s));
    }

    public final ExecutorService a(Class class1, String s)
    {
        return b.a(a.a(class1, s));
    }

    public final ExecutorService b(Class class1, String s)
    {
        return b.a(a.b(class1, s));
    }
}
