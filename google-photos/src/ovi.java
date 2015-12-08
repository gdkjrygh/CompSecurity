// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ovi extends Enum
{

    public static final ovi a;
    public static final ovi b;
    public static final ovi c;
    private static final ovi d[];

    private ovi(String s, int i)
    {
        super(s, i);
    }

    public static ovi valueOf(String s)
    {
        return (ovi)Enum.valueOf(ovi, s);
    }

    public static ovi[] values()
    {
        return (ovi[])d.clone();
    }

    static 
    {
        a = new ovi("CREATED", 0);
        b = new ovi("EXTRACTED", 1);
        c = new ovi("DISPOSED", 2);
        d = (new ovi[] {
            a, b, c
        });
    }
}
