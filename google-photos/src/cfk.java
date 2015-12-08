// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cfk extends Enum
{

    public static final cfk a;
    public static final cfk b;
    private static final cfk c[];

    private cfk(String s, int i)
    {
        super(s, i);
    }

    public static cfk valueOf(String s)
    {
        return (cfk)Enum.valueOf(cfk, s);
    }

    public static cfk[] values()
    {
        return (cfk[])c.clone();
    }

    static 
    {
        a = new cfk("MOVIE", 0);
        b = new cfk("MUSIC", 1);
        c = (new cfk[] {
            a, b
        });
    }
}
