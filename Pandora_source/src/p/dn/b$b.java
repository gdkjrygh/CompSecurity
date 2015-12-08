// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;


// Referenced classes of package p.dn:
//            b

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private final String e;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dn/b$b, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new <init>("KEY_VIN", 0, "vehicleConfig");
        b = new <init>("KEY_MAKE", 1, "vehicleMake");
        c = new <init>("KEY_MODEL", 2, "vehicleModel");
        d = new <init>("KEY_YEAR", 3, "vehicleYear");
        f = (new f[] {
            a, b, c, d
        });
    }

    private .String(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }
}
