// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

abstract class lqq extends lqj
{

    public lqq(String s)
    {
        super(s);
    }

    protected abstract boolean a(String s, String s1, Map map);

    protected final boolean a(ksp ksp, ksp ksp1, Map map)
    {
        ksp = ltw.a(ksp);
        ksp1 = ltw.a(ksp1);
        if (ksp == ltw.e() || ksp1 == ltw.e())
        {
            return false;
        } else
        {
            return a(((String) (ksp)), ((String) (ksp1)), map);
        }
    }
}
