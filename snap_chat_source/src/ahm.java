// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ahm
    implements agJ
{

    public ahm()
    {
    }

    public final agN a(agC agc, String s)
    {
        s = agM.b(s);
        if (s.size() != 2)
        {
            throw new agK("Two string arguments are required.");
        }
        try
        {
            agc = new Integer(agM.a((String)s.get(0), agc.a).compareTo(agM.a((String)s.get(1), agc.a)));
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("Two string arguments are required.", agc);
        }
        return new agN(agc.toString(), 0);
    }

    public final String a()
    {
        return "compareTo";
    }
}
