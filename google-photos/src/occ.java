// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class occ extends Enum
{

    public static final occ a;
    public static final occ b;
    public static final occ c;
    public static final occ d;
    private static final occ e[];

    private occ(String s, int i)
    {
        super(s, i);
    }

    public static occ valueOf(String s)
    {
        return (occ)Enum.valueOf(occ, s);
    }

    public static occ[] values()
    {
        return (occ[])e.clone();
    }

    static 
    {
        a = new occ("MediaItemRemote", 0);
        b = new occ("MediaItemLocal", 1);
        c = new occ("Album", 2);
        d = new occ("Story", 3);
        e = (new occ[] {
            a, b, c, d
        });
    }
}
