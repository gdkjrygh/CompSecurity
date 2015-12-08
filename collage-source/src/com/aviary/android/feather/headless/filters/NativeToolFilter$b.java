// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;


// Referenced classes of package com.aviary.android.feather.headless.filters:
//            NativeToolFilter

public static final class  extends Enum
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
        return ()Enum.valueOf(com/aviary/android/feather/headless/filters/NativeToolFilter$b, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("ColorSplash", 0);
        b = new <init>("TiltShift", 1);
        c = new <init>("Blemish", 2);
        d = new <init>("RedEye", 3);
        e = new <init>("Whiten", 4);
        f = new <init>("Blur", 5);
        g = new <init>("None", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
