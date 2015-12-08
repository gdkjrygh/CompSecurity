// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;


// Referenced classes of package com.pandora.android.daydream:
//            b

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
        return ()Enum.valueOf(com/pandora/android/daydream/b$d, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("PAUSED", 0);
        b = new <init>("TIME_OUT", 1);
        c = new <init>("NO_STATION_SELECTED", 2);
        d = new <init>("NOT_LOGGED_IN", 3);
        e = new <init>("NON_SUBSCRIBER", 4);
        f = new <init>("NONE", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
