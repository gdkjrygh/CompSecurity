// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.format;


public final class MatchStrength extends Enum
{

    public static final MatchStrength a;
    public static final MatchStrength b;
    public static final MatchStrength c;
    public static final MatchStrength d;
    public static final MatchStrength e;
    private static final MatchStrength f[];

    private MatchStrength(String s, int i)
    {
        super(s, i);
    }

    public static MatchStrength valueOf(String s)
    {
        return (MatchStrength)Enum.valueOf(com/fasterxml/jackson/core/format/MatchStrength, s);
    }

    public static MatchStrength[] values()
    {
        return (MatchStrength[])f.clone();
    }

    static 
    {
        a = new MatchStrength("NO_MATCH", 0);
        b = new MatchStrength("INCONCLUSIVE", 1);
        c = new MatchStrength("WEAK_MATCH", 2);
        d = new MatchStrength("SOLID_MATCH", 3);
        e = new MatchStrength("FULL_MATCH", 4);
        f = (new MatchStrength[] {
            a, b, c, d, e
        });
    }
}
