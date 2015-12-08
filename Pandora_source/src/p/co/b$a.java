// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.co;


// Referenced classes of package p.co:
//            b

public static final class .String extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/co/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])g.clone();
    }

    static 
    {
        a = new <init>("EMAIL", 0);
        b = new <init>("PASSWORD", 1);
        c = new <init>("PASSWORD_CREATOR", 2);
        d = new <init>("ZIPCODE", 3);
        e = new <init>("BIRTH_YEAR", 4);
        f = new <init>("GENDER", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
