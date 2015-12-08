// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahv
    implements agJ
{

    public ahv()
    {
    }

    public final agN a(agC agc, String s)
    {
        try
        {
            agc = new Integer(agM.a(s, agc.a).length());
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
        return new agN(agc.toString(), 0);
    }

    public final String a()
    {
        return "length";
    }
}
