// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings

public static final class  extends Enum
{

    private static final Portraite $VALUES[];
    public static final Portraite Any;
    public static final Portraite Landscape;
    public static final Portraite Portraite;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$PreferredOrientation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Any = new <init>("Any", 0);
        Landscape = new <init>("Landscape", 1);
        Portraite = new <init>("Portraite", 2);
        $VALUES = (new .VALUES[] {
            Any, Landscape, Portraite
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
