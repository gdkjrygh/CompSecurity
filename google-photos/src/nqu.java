// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nqu extends Enum
{

    public static final nqu a;
    public static final nqu b;
    public static final nqu c;
    public static final nqu d;
    public static final nqu e;
    public static final nqu f;
    public static final nqu g;
    private static final nqu i[];
    public final int h;

    private nqu(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static nqu a(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;

        case 6: // '\006'
            return g;
        }
    }

    public static nqu valueOf(String s)
    {
        return (nqu)Enum.valueOf(nqu, s);
    }

    public static nqu[] values()
    {
        return (nqu[])i.clone();
    }

    static 
    {
        a = new nqu("UNREGISTERED", 0, 0);
        b = new nqu("FAILED_REGISTRATION", 1, 1);
        c = new nqu("FAILED_UNREGISTRATION", 2, 2);
        d = new nqu("PENDING_REGISTRATION", 3, 3);
        e = new nqu("PENDING_UNREGISTRATION", 4, 4);
        f = new nqu("REGISTERED", 5, 5);
        g = new nqu("UNKNOWN", 6, 6);
        i = (new nqu[] {
            a, b, c, d, e, f, g
        });
    }
}
