// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            Mediabryo

public static final class  extends Enum
{

    private static final STORY_REPLY $VALUES[];
    public static final STORY_REPLY CHATMEDIA;
    public static final STORY_REPLY DISCOVER;
    public static final STORY_REPLY SNAP;
    public static final STORY_REPLY STORY_REPLY;
    public static final STORY_REPLY TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/Mediabryo$SnapType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SNAP = new <init>("SNAP", 0);
        CHATMEDIA = new <init>("CHATMEDIA", 1);
        DISCOVER = new <init>("DISCOVER", 2);
        TEXT = new <init>("TEXT", 3);
        STORY_REPLY = new <init>("STORY_REPLY", 4);
        $VALUES = (new .VALUES[] {
            SNAP, CHATMEDIA, DISCOVER, TEXT, STORY_REPLY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
