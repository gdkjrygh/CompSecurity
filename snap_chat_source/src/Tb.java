// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Tb extends Enum
{

    private static final Tb $VALUES[];
    public static final Tb FILTER;
    public static final Tb LENS;
    public static final Tb UNRECOGNIZED_VALUE;
    public final String value;

    private Tb(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Tb valueOf(String s)
    {
        return (Tb)Enum.valueOf(Tb, s);
    }

    public static Tb[] values()
    {
        return (Tb[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        FILTER = new Tb("FILTER", 0, "FILTER");
        LENS = new Tb("LENS", 1, "LENS");
        UNRECOGNIZED_VALUE = new Tb("UNRECOGNIZED_VALUE", 2, "UNRECOGNIZED_VALUE");
        $VALUES = (new Tb[] {
            FILTER, LENS, UNRECOGNIZED_VALUE
        });
    }
}
