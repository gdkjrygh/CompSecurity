// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;


// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiDeletionHandler

public static final class  extends Enum
{

    private static final SHRINK $VALUES[];
    public static final SHRINK ENLARGE;
    public static final SHRINK SHRINK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/emojipicker/EmojiDeletionHandler$SizeChangeType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ENLARGE = new <init>("ENLARGE", 0);
        SHRINK = new <init>("SHRINK", 1);
        $VALUES = (new .VALUES[] {
            ENLARGE, SHRINK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
