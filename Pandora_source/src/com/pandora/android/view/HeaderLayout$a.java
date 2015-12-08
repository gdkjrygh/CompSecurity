// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;


// Referenced classes of package com.pandora.android.view:
//            HeaderLayout

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
        return ()Enum.valueOf(com/pandora/android/view/HeaderLayout$a, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("BACK", 1);
        c = new <init>("EDIT", 2);
        d = new <init>("FIND_PEOPLE", 3);
        e = new <init>("CLOSE", 4);
        f = new <init>("CUSTOM_TEXT", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
