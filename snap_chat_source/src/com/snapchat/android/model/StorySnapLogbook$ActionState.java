// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            StorySnapLogbook

public static final class  extends Enum
{

    private static final DELETED $VALUES[];
    public static final DELETED DELETED;
    public static final DELETED DELETING;
    public static final DELETED READY;
    public static final DELETED SAVED;
    public static final DELETED SAVING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/StorySnapLogbook$ActionState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        READY = new <init>("READY", 0);
        SAVING = new <init>("SAVING", 1);
        DELETING = new <init>("DELETING", 2);
        SAVED = new <init>("SAVED", 3);
        DELETED = new <init>("DELETED", 4);
        $VALUES = (new .VALUES[] {
            READY, SAVING, DELETING, SAVED, DELETED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
