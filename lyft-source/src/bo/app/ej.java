// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ej extends Enum
{

    public static final ej a;
    public static final ej b;
    private static final ej e[];
    final String c;
    final String d;

    private ej(String s, int i, String s1, String s2)
    {
        super(s, i);
        c = s1;
        d = s2;
    }

    public static ej valueOf(String s)
    {
        return (ej)Enum.valueOf(bo/app/ej, s);
    }

    public static ej[] values()
    {
        return (ej[])e.clone();
    }

    static 
    {
        a = new ej("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
        b = new ej("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
        e = (new ej[] {
            a, b
        });
    }
}
