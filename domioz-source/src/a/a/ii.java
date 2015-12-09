// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class ii extends Enum
{

    public static final ii a;
    public static final ii b;
    public static final ii c;
    private static final ii d[];

    private ii(String s, int i)
    {
        super(s, i);
    }

    public static ii valueOf(String s)
    {
        return (ii)Enum.valueOf(a/a/ii, s);
    }

    public static ii[] values()
    {
        return (ii[])d.clone();
    }

    static 
    {
        a = new ii("NETWORK", 0);
        b = new ii("DISC_CACHE", 1);
        c = new ii("MEMORY_CACHE", 2);
        d = (new ii[] {
            a, b, c
        });
    }
}
