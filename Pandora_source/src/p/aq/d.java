// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(p/aq/d, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    static 
    {
        a = new d("INACTIVE", 0);
        b = new d("APPLICATION", 1);
        c = new d("USER", 2);
        d = new d("ACTIVE_USER", 3);
        e = (new d[] {
            a, b, c, d
        });
    }
}
