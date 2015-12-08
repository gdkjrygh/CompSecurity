// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahf
    implements agJ
{

    public ahf()
    {
    }

    public final agN a(agC agc, String s)
    {
        try
        {
            agc = new Double(s);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK("Invalid argument.", agc);
        }
        return new agN((new Long(Math.round(agc.doubleValue()))).toString(), 0);
    }

    public final String a()
    {
        return "round";
    }
}
