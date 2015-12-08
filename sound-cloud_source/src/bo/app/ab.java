// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ab extends Enum
{

    public static final ab a;
    public static final ab b;
    private static final ab d[];
    public final String c;

    private ab(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(bo/app/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])d.clone();
    }

    static 
    {
        a = new ab("SHORT", 0, "yyyy-MM-dd");
        b = new ab("LONG", 1, "yyyy-MM-dd kk:mm:ss");
        d = (new ab[] {
            a, b
        });
    }
}
