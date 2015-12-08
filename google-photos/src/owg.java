// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;
import java.util.Set;

public final class owg extends Enum
{

    public static final owg a;
    public static final owg b;
    public static final owg c;
    private static final owg e[];
    public Set d;

    private owg(String s, int i, Set set)
    {
        super(s, i);
        d = set;
    }

    public static owg valueOf(String s)
    {
        return (owg)Enum.valueOf(owg, s);
    }

    public static owg[] values()
    {
        return (owg[])e.clone();
    }

    static 
    {
        a = new owg("Begin", 0, EnumSet.of(oru.a));
        b = new owg("End", 1, EnumSet.of(oru.b));
        c = new owg("Both", 2, EnumSet.of(oru.a, oru.b));
        e = (new owg[] {
            a, b, c
        });
    }
}
