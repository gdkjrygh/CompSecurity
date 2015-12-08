// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ahl
    implements agJ
{

    public ahl()
    {
    }

    public final agN a(agC agc, String s)
    {
        s = agM.c(s);
        if (s.size() != 2)
        {
            throw new agK("One string and one integer argument are required.");
        }
        try
        {
            agc = new String(new char[] {
                agM.a((String)s.get(0), agc.a).charAt(((Integer)s.get(1)).intValue())
            });
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("One string and one integer argument are required.", agc);
        }
        return new agN(agc, 1);
    }

    public final String a()
    {
        return "charAt";
    }
}
