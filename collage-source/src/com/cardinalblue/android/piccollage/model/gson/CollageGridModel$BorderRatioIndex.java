// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageGridModel

public static final class  extends Enum
{

    private static final Y $VALUES[];
    public static final Y X;
    public static final Y Y;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/CollageGridModel$BorderRatioIndex, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        X = new <init>("X", 0);
        Y = new <init>("Y", 1);
        $VALUES = (new .VALUES[] {
            X, Y
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
