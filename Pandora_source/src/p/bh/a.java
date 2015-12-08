// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    private static final a l[];

    private a(String s, int i1)
    {
        super(s, i1);
    }

    public static a a(String s)
    {
        return valueOf(s);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(p/bh/a, s);
    }

    public static a[] values()
    {
        return (a[])l.clone();
    }

    static 
    {
        a = new a("USER_EXIT", 0);
        b = new a("IGNITION_OFF", 1);
        c = new a("BLUETOOTH_OFF", 2);
        d = new a("USB_DISCONNECTED", 3);
        e = new a("REQUEST_WHILE_IN_NONE_HMI_LEVEL", 4);
        f = new a("TOO_MANY_REQUESTS", 5);
        g = new a("DRIVER_DISTRACTION_VIOLATION", 6);
        h = new a("LANGUAGE_CHANGE", 7);
        i = new a("MASTER_RESET", 8);
        j = new a("FACTORY_DEFAULTS", 9);
        k = new a("APP_UNAUTHORIZED", 10);
        l = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
