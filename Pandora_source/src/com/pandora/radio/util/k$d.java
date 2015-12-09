// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$d, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("resume", 0);
        b = new <init>("pause", 1);
        c = new <init>("skip", 2);
        d = new <init>("thumb_up", 3);
        e = new <init>("thumb_down", 4);
        f = new <init>("foreground_app", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
