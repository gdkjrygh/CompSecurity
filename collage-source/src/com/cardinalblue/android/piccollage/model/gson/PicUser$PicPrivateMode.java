// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            PicUser

public static final class  extends Enum
{

    private static final MYSELF $VALUES[];
    public static final MYSELF EVERYONE;
    public static final MYSELF MYSELF;
    public static final MYSELF ONLY_ME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/PicUser$PicPrivateMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ONLY_ME = new <init>("ONLY_ME", 0);
        EVERYONE = new <init>("EVERYONE", 1);
        MYSELF = new <init>("MYSELF", 2);
        $VALUES = (new .VALUES[] {
            ONLY_ME, EVERYONE, MYSELF
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
