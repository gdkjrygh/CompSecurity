// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;


// Referenced classes of package com.fitbit.bluetooth:
//            j, r, u, h, 
//            p, v, q

public final class Manufacturer extends Enum
{

    public static final Manufacturer a;
    public static final Manufacturer b;
    public static final Manufacturer c;
    public static final Manufacturer d;
    public static final Manufacturer e;
    public static final Manufacturer f;
    private static final Manufacturer g[];
    private final Class adapterClass;
    private final q determinant;
    private final String internalName;

    private Manufacturer(String s, int i, String s1, Class class1, q q1)
    {
        super(s, i);
        internalName = s1;
        adapterClass = class1;
        determinant = q1;
    }

    public static Manufacturer valueOf(String s)
    {
        return (Manufacturer)Enum.valueOf(com/fitbit/bluetooth/Manufacturer, s);
    }

    public static Manufacturer[] values()
    {
        return (Manufacturer[])g.clone();
    }

    String a()
    {
        return internalName;
    }

    Class b()
    {
        return adapterClass;
    }

    public boolean c()
    {
        if (determinant != null)
        {
            return determinant.b();
        } else
        {
            return false;
        }
    }

    static 
    {
        a = new Manufacturer("DEFAULT", 0, "DEFAULT", com/fitbit/bluetooth/j, null);
        b = new Manufacturer("MOTOROLA", 1, "MOTOROLA", com/fitbit/bluetooth/r, new r.a());
        c = new Manufacturer("SAMSUNG", 2, "Samsung v1", com/fitbit/bluetooth/u, new u.a());
        d = new Manufacturer("BROADCOM", 3, "BROADCOM", com/fitbit/bluetooth/h, new h.a());
        e = new Manufacturer("GOOGLE", 4, "Google", com/fitbit/bluetooth/p, new p.a());
        f = new Manufacturer("SAMSUNG_V2", 5, "Samsung v2", com/fitbit/bluetooth/v, new v.a());
        g = (new Manufacturer[] {
            a, b, c, d, e, f
        });
    }
}
