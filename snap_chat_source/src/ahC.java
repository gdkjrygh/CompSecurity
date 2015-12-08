// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahC
    implements agJ
{

    public ahC()
    {
    }

    public final agN a(agC agc, String s)
    {
        try
        {
            agc = agM.a(s, agc.a).trim();
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("One string argument is required.", agc);
        }
        return new agN(agc, 1);
    }

    public final String a()
    {
        return "trim";
    }
}
