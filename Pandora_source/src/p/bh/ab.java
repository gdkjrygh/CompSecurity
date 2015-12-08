// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class ab extends Enum
{

    public static final ab a;
    private static final ab b[];

    private ab(String s, int i)
    {
        super(s, i);
    }

    public static ab a(String s)
    {
        if (s.toUpperCase().equals(a.toString().toUpperCase()))
        {
            return a;
        } else
        {
            return null;
        }
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(p/bh/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])b.clone();
    }

    static 
    {
        a = new ab("Text", 0);
        b = (new ab[] {
            a
        });
    }
}
