// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lpl
    implements luo
{

    private lpk a;

    lpl(lpk lpk1)
    {
        a = lpk1;
        super();
    }

    public final Object a(String s, Map map)
    {
        s = a.c(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.x();
        }
    }
}
