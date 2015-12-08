// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class bkr
    implements nfn
{

    private List a;

    bkr(bkq bkq, List list)
    {
        a = list;
        super();
    }

    public final void a(String s)
    {
        a.add(s);
    }

    public final transient void a(String s, Object aobj[])
    {
        a.add(String.format(s, aobj));
    }
}
