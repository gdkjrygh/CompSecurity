// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ahx
    implements agJ
{

    public ahx()
    {
    }

    public final agN a(agC agc, String s)
    {
        s = agM.d(s);
        if (s.size() != 3)
        {
            throw new agK("Two string arguments and one integer argument are required.");
        }
        if (agM.a((String)s.get(0), agc.a).startsWith(agM.a((String)s.get(1), agc.a), ((Integer)s.get(2)).intValue()))
        {
            agc = "1.0";
        } else
        {
            agc = "0.0";
        }
        return new agN(agc, 0);
        agc;
        throw new agK(agc.getMessage(), agc);
        agc;
        throw new agK("Two string arguments and one integer argument are required.", agc);
    }

    public final String a()
    {
        return "startsWith";
    }
}
