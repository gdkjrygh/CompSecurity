// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            ChatMedia

public static final class _cls9 extends Enum
{

    private static final VIDEO_NO_SOUND $VALUES[];
    public static final VIDEO_NO_SOUND IMAGE;
    public static final VIDEO_NO_SOUND VIDEO;
    public static final VIDEO_NO_SOUND VIDEO_NO_SOUND;

    public static _cls9 fromSnapMediaType(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Unsupported type.");

        case 0: // '\0'
            return IMAGE;

        case 1: // '\001'
            return VIDEO;

        case 2: // '\002'
            return VIDEO_NO_SOUND;
        }
    }

    public static VIDEO_NO_SOUND valueOf(String s)
    {
        return (VIDEO_NO_SOUND)Enum.valueOf(com/snapchat/android/model/chat/ChatMedia$MediaType, s);
    }

    public static VIDEO_NO_SOUND[] values()
    {
        return (VIDEO_NO_SOUND[])$VALUES.clone();
    }

    static 
    {
        IMAGE = new <init>("IMAGE", 0);
        VIDEO = new <init>("VIDEO", 1);
        VIDEO_NO_SOUND = new <init>("VIDEO_NO_SOUND", 2);
        $VALUES = (new .VALUES[] {
            IMAGE, VIDEO, VIDEO_NO_SOUND
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
