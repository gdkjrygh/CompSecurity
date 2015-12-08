// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;


// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment

private static final class  extends Enum
{

    private static final IDLE $VALUES[];
    public static final IDLE ANIMATING_DOWN;
    public static final IDLE ANIMATING_UP;
    public static final IDLE IDLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/picker/ExtensiblePickerDialogFragment$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ANIMATING_UP = new <init>("ANIMATING_UP", 0);
        ANIMATING_DOWN = new <init>("ANIMATING_DOWN", 1);
        IDLE = new <init>("IDLE", 2);
        $VALUES = (new .VALUES[] {
            ANIMATING_UP, ANIMATING_DOWN, IDLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
