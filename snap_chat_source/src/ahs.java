// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahs
    implements agJ
{

    public ahs()
    {
    }

    public final agN a(agC agc, String s)
    {
        int i = 0;
        try
        {
            agc = agc.a(s, false);
        }
        // Misplaced declaration of an exception variable
        catch (agC agc)
        {
            throw new agK(agc.getMessage(), agc);
        }
        try
        {
            Double.parseDouble(agc);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            i = 1;
        }
        return new agN(agc, i);
    }

    public final String a()
    {
        return "eval";
    }
}
