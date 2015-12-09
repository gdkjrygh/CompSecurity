// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.crop;


// Referenced classes of package com.cardinalblue.android.piccollage.view.crop:
//            a

static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/view/crop/a$a, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("None", 0);
        b = new <init>("Move", 1);
        c = new <init>("Grow", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
