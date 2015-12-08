// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class cv extends Enum
{

    public static final cv a;
    public static final cv b;
    public static final cv c;
    public static final cv d;
    public static final cv e;
    private static final cv f[];

    private cv(String s, int i)
    {
        super(s, i);
    }

    public static cv valueOf(String s)
    {
        return (cv)Enum.valueOf(b/a/cv, s);
    }

    public static cv[] values()
    {
        return (cv[])f.clone();
    }

    static 
    {
        a = new cv("INTERNET_UP", 0);
        b = new cv("INTERNET_DOWN", 1);
        c = new cv("CONN_TYPE_GAINED", 2);
        d = new cv("CONN_TYPE_LOST", 3);
        e = new cv("CONN_TYPE_SWITCHED", 4);
        f = (new cv[] {
            a, b, c, d, e
        });
    }
}
