// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;


// Referenced classes of package com.microsoft.onlineid.internal:
//            a

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private final String c;

    public static c a(String s)
    {
        c ac[] = values();
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            c c1 = ac[i];
            if (c1.c.equals(s))
            {
                return c1;
            }
        }

        return null;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/microsoft/onlineid/internal/a$a, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final String a()
    {
        return c;
    }

    static 
    {
        a = new <init>("Account", 0, "account");
        b = new <init>("Ticket", 1, "ticket");
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }
}
