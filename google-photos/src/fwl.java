// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;

public final class fwl
    implements hzv
{

    private final mmr a;

    public fwl(mmr mmr1)
    {
        a = mmr1;
    }

    public final EnumSet a()
    {
        EnumSet enumset = EnumSet.of(hzz.a, hzz.e);
        if (a.e())
        {
            enumset.add(hzz.b);
        }
        return enumset;
    }
}
