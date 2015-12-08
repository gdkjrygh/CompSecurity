// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;


// Referenced classes of package com.microsoft.onlineid:
//            f

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    private final String f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/microsoft/onlineid/f$a, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public final String toString()
    {
        return f;
    }

    static 
    {
        a = new <init>("None", 0, null);
        b = new <init>("Email", 1, "easi2");
        c = new <init>("Outlook", 2, "wld2");
        d = new <init>("Telephone", 3, "phone2");
        e = new <init>("TelephoneOnly", 4, "phone");
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }
}
