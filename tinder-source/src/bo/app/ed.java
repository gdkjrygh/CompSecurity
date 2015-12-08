// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ed extends Enum
{

    public static final ed a;
    public static final ed b;
    private static final ed e[];
    final String c;
    final String d;

    private ed(String s, int i, String s1, String s2)
    {
        super(s, i);
        c = s1;
        d = s2;
    }

    public static ed valueOf(String s)
    {
        return (ed)Enum.valueOf(bo/app/ed, s);
    }

    public static ed[] values()
    {
        return (ed[])e.clone();
    }

    static 
    {
        a = new ed("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
        b = new ed("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
        e = (new ed[] {
            a, b
        });
    }
}
