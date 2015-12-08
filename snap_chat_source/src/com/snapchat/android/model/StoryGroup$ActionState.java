// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            StoryGroup

public static final class  extends Enum
{

    private static final SAVED $VALUES[];
    public static final SAVED CONFIRMING_SAVE;
    public static final SAVED READY;
    public static final SAVED SAVED;
    public static final SAVED SAVING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/StoryGroup$ActionState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        READY = new <init>("READY", 0);
        CONFIRMING_SAVE = new <init>("CONFIRMING_SAVE", 1);
        SAVING = new <init>("SAVING", 2);
        SAVED = new <init>("SAVED", 3);
        $VALUES = (new .VALUES[] {
            READY, CONFIRMING_SAVE, SAVING, SAVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
