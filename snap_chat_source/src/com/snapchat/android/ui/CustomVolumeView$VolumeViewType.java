// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            CustomVolumeView

public static final class  extends Enum
{

    private static final HERE $VALUES[];
    public static final HERE HERE;
    public static final HERE MEDIA;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/CustomVolumeView$VolumeViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MEDIA = new <init>("MEDIA", 0);
        HERE = new <init>("HERE", 1);
        $VALUES = (new .VALUES[] {
            MEDIA, HERE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
