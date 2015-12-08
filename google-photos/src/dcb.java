// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;
import java.util.Set;

public final class dcb extends Enum
{

    public static final dcb a;
    public static final dcb b;
    public static final dcb c;
    private static final dcb e[];
    public Set d;

    private dcb(String s, int i, Set set)
    {
        super(s, i);
        d = set;
    }

    public static dcb valueOf(String s)
    {
        return (dcb)Enum.valueOf(dcb, s);
    }

    public static dcb[] values()
    {
        return (dcb[])e.clone();
    }

    static 
    {
        a = new dcb("Begin", 0, EnumSet.of(oru.a));
        b = new dcb("End", 1, EnumSet.of(oru.b));
        c = new dcb("Both", 2, EnumSet.of(oru.a, oru.b));
        e = (new dcb[] {
            a, b, c
        });
    }
}
