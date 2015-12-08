// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ero extends Enum
{

    public static final ero a;
    public static final ero b;
    public static final ero c;
    private static final ero e[];
    private final String d;

    private ero(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    static String a(ero ero1)
    {
        return ero1.d;
    }

    public static ero valueOf(String s)
    {
        return (ero)Enum.valueOf(ero, s);
    }

    public static ero[] values()
    {
        return (ero[])e.clone();
    }

    static 
    {
        a = new ero("GREATER", 0, ">");
        b = new ero("LESS_THAN", 1, "<");
        c = new ero("LESS_THAN_OR_EQUAL", 2, "<=");
        e = (new ero[] {
            a, b, c
        });
    }
}
