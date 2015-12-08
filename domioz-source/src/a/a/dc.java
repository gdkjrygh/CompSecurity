// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class dc extends Enum
{

    public static final dc a;
    public static final dc b;
    private static final dc e[];
    final String c;
    final String d;

    private dc(String s, int i, String s1, String s2)
    {
        super(s, i);
        c = s1;
        d = s2;
    }

    public static dc valueOf(String s)
    {
        return (dc)Enum.valueOf(a/a/dc, s);
    }

    public static dc[] values()
    {
        return (dc[])e.clone();
    }

    static 
    {
        a = new dc("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
        b = new dc("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
        e = (new dc[] {
            a, b
        });
    }
}
