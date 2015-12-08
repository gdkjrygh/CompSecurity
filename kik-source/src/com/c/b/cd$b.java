// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            cd, f

public static final class j extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i k[];
    private final Object j;

    public static ing valueOf(String s)
    {
        return (ing)Enum.valueOf(com/c/b/cd$b, s);
    }

    public static ing[] values()
    {
        return (ing[])k.clone();
    }

    static 
    {
        a = new <init>("INT", 0, Integer.valueOf(0));
        b = new <init>("LONG", 1, Long.valueOf(0L));
        c = new <init>("FLOAT", 2, Float.valueOf(0.0F));
        d = new <init>("DOUBLE", 3, Double.valueOf(0.0D));
        e = new <init>("BOOLEAN", 4, Boolean.valueOf(false));
        f = new <init>("STRING", 5, "");
        g = new <init>("BYTE_STRING", 6, f.a);
        h = new <init>("ENUM", 7, null);
        i = new <init>("MESSAGE", 8, null);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private ing(String s, int l, Object obj)
    {
        super(s, l);
        j = obj;
    }
}
