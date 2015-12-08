// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.bl;

// Referenced classes of package com.kik.d.b:
//            a, f

public static final class f extends Enum
    implements bl
{

    public static final b a;
    public static final b b;
    private static com.c.b. c = new f();
    private static final nit> d[] = values();
    private static final values g[];
    private final int e;
    private final int f;

    public static f a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 300: 
            return a;

        case 301: 
            return b;
        }
    }

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kik/d/b/a$f, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    public final int a()
    {
        return f;
    }

    static 
    {
        a = new <init>("MESSAGE_SENT_CONFIRMED", 0, 0, 300);
        b = new <init>("PUSH_RECEIVED", 1, 1, 301);
        g = (new g[] {
            a, b
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        e = j;
        f = k;
    }
}
