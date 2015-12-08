// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nod extends Enum
{

    public static final nod a;
    public static final nod b;
    private static final nod c[];

    private nod(String s, int i)
    {
        super(s, i);
    }

    public static nod valueOf(String s)
    {
        return (nod)Enum.valueOf(nod, s);
    }

    public static nod[] values()
    {
        return (nod[])c.clone();
    }

    static 
    {
        a = new nod("PHOTO", 0);
        b = new nod("VIDEO", 1);
        c = (new nod[] {
            a, b
        });
    }
}
