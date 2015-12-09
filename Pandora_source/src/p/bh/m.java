// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class m extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    private static final m e[];

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m a(String s)
    {
        return valueOf(s);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(p/bh/m, s);
    }

    public static m[] values()
    {
        return (m[])e.clone();
    }

    static 
    {
        a = new m("KEYPRESS", 0);
        b = new m("ENTRY_SUBMITTED", 1);
        c = new m("ENTRY_CANCELLED", 2);
        d = new m("ENTRY_ABORTED", 3);
        e = (new m[] {
            a, b, c, d
        });
    }
}
