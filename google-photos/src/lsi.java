// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

abstract class lsi extends lqj
{

    public lsi(String s)
    {
        super(s);
    }

    protected final boolean a(ksp ksp, ksp ksp1, Map map)
    {
        ksp = ltw.b(ksp);
        ksp1 = ltw.b(ksp1);
        if (ksp == ltw.d() || ksp1 == ltw.d())
        {
            return false;
        } else
        {
            return a(((ltv) (ksp)), ((ltv) (ksp1)));
        }
    }

    protected abstract boolean a(ltv ltv, ltv ltv1);
}
