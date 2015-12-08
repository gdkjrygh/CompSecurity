// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jek extends Enum
{

    public static final jek a;
    public static final jek b;
    public static final jek c;
    private static final jek d[];

    private jek(String s, int i)
    {
        super(s, i);
    }

    public static jek valueOf(String s)
    {
        return (jek)Enum.valueOf(jek, s);
    }

    public static jek[] values()
    {
        return (jek[])d.clone();
    }

    static 
    {
        a = new jek("PLAY", 0);
        b = new jek("PAUSE", 1);
        c = new jek("NONE", 2);
        d = (new jek[] {
            a, b, c
        });
    }
}
