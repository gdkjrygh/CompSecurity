// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//            b

private static final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/bumptech/glide/request/b$a, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("PENDING", 0);
        b = new <init>("RUNNING", 1);
        c = new <init>("WAITING_FOR_SIZE", 2);
        d = new <init>("COMPLETE", 3);
        e = new <init>("FAILED", 4);
        f = new <init>("CANCELLED", 5);
        g = new <init>("CLEARED", 6);
        h = new <init>("PAUSED", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
