// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class jp extends Enum
{

    public static final jp a;
    public static final jp b;
    public static final jp c;
    private static final jp d[];

    private jp(String s, int i)
    {
        super(s, i);
    }

    public static jp valueOf(String s)
    {
        return (jp)Enum.valueOf(bo/app/jp, s);
    }

    public static jp[] values()
    {
        return (jp[])d.clone();
    }

    static 
    {
        a = new jp("NETWORK", 0);
        b = new jp("DISC_CACHE", 1);
        c = new jp("MEMORY_CACHE", 2);
        d = (new jp[] {
            a, b, c
        });
    }
}
