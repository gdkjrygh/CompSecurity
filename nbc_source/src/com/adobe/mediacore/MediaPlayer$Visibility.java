// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static final class  extends Enum
{

    private static final INVISIBLE $VALUES[];
    public static final INVISIBLE INVISIBLE;
    public static final INVISIBLE VISIBLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/MediaPlayer$Visibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VISIBLE = new <init>("VISIBLE", 0);
        INVISIBLE = new <init>("INVISIBLE", 1);
        $VALUES = (new .VALUES[] {
            VISIBLE, INVISIBLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
