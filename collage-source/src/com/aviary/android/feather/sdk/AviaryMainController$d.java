// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;


// Referenced classes of package com.aviary.android.feather.sdk:
//            AviaryMainController

static final class  extends Enum
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
        return ()Enum.valueOf(com/aviary/android/feather/sdk/AviaryMainController$d, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("CLOSED_CANCEL", 0);
        b = new <init>("CLOSED_CONFIRMED", 1);
        c = new <init>("CLOSING", 2);
        d = new <init>("DISABLED", 3);
        e = new <init>("OPENED", 4);
        f = new <init>("OPENING", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
