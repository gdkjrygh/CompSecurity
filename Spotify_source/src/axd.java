// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.trace.enums.DetailLevel;
import com.ford.syncV4.trace.enums.Mod;

public final class axd
{

    private static DetailLevel a[];

    public static DetailLevel a(Mod mod)
    {
        return a[mod.ordinal()];
    }

    static 
    {
        a = new DetailLevel[Mod.values().length];
        DetailLevel detaillevel = DetailLevel.a;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = detaillevel;
        }

    }
}
