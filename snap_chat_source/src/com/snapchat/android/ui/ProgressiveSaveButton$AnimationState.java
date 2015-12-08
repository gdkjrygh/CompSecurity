// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            ProgressiveSaveButton

public static final class  extends Enum
{

    private static final SAVED $VALUES[];
    public static final SAVED READY;
    public static final SAVED SAVED;
    public static final SAVED SAVING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/ProgressiveSaveButton$AnimationState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        READY = new <init>("READY", 0);
        SAVING = new <init>("SAVING", 1);
        SAVED = new <init>("SAVED", 2);
        $VALUES = (new .VALUES[] {
            READY, SAVING, SAVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
