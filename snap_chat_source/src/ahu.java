// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ahu
    implements agJ
{

    public ahu()
    {
    }

    public final agN a(agC agc, String s)
    {
        s = agM.d(s);
        if (s.size() != 3)
        {
            throw new agK("Two string arguments and one integer argument are required.");
        }
        try
        {
            agc = new Integer(agM.a((String)s.get(0), agc.a).lastIndexOf(agM.a((String)s.get(1), agc.a), ((Integer)s.get(2)).intValue()));
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("Two string arguments and one integer argument are required.", agc);
        }
        return new agN(agc.toString(), 0);
    }

    public final String a()
    {
        return "lastIndexOf";
    }
}
