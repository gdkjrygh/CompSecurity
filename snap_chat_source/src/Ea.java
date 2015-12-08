// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class Ea extends DZ
{

    private final Bj a;

    public Ea(zD zd, Bj bj)
    {
        super(zd);
        a = bj;
    }

    public final List a()
    {
        List list = super.a();
        list.addAll(0, a.e());
        return list;
    }
}
