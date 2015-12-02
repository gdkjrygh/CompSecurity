// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;


// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/ui/main/BoosterFragment$e, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    public boolean a()
    {
        return equals(a) || equals(c) || equals(g);
    }

    static 
    {
        a = new <init>("IDLE", 0);
        b = new <init>("SCANNING", 1);
        c = new <init>("READY_BOOST", 2);
        d = new <init>("BOOSTING", 3);
        e = new <init>("BOOSTED", 4);
        f = new <init>("BOOSTED_BACK", 5);
        g = new <init>("FASTEST", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
