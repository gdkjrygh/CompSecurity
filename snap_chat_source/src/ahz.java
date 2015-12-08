// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ahz
    implements agJ
{

    public ahz()
    {
    }

    public final agN a(agC agc, String s)
    {
        s = agM.e(s);
        if (s.size() != 3)
        {
            throw new agK("One string argument and two integer arguments are required.");
        }
        try
        {
            agc = agM.a((String)s.get(0), agc.a).substring(((Integer)s.get(1)).intValue(), ((Integer)s.get(2)).intValue());
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("One string argument and two integer arguments are required.", agc);
        }
        return new agN(agc, 1);
    }

    public final String a()
    {
        return "substring";
    }
}
