// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class agX
    implements agJ
{

    public agX()
    {
    }

    public final agN a(agC agc, String s)
    {
        agc = agM.a(s);
        if (agc.size() != 2)
        {
            throw new agK("Two numeric arguments are required.");
        }
        try
        {
            agc = new Double(Math.IEEEremainder(((Double)agc.get(0)).doubleValue(), ((Double)agc.get(1)).doubleValue()));
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("Two numeric arguments are required.", agc);
        }
        return new agN(agc.toString(), 0);
    }

    public final String a()
    {
        return "IEEEremainder";
    }
}
