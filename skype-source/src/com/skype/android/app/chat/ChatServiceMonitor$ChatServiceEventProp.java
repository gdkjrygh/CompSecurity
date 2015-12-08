// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            ChatServiceMonitor

public static final class colorId extends Enum
{

    private static final UPDATING_CONVERSATIONS $VALUES[];
    public static final UPDATING_CONVERSATIONS CONNECTED;
    public static final UPDATING_CONVERSATIONS CONNECTING;
    public static final UPDATING_CONVERSATIONS DISCONNECTED;
    public static final UPDATING_CONVERSATIONS NO_INTERNET_CONNECTION;
    public static final UPDATING_CONVERSATIONS UPDATING_CONVERSATIONS;
    private int colorId;
    private int textId;

    public static colorId valueOf(String s)
    {
        return (colorId)Enum.valueOf(com/skype/android/app/chat/ChatServiceMonitor$ChatServiceEventProp, s);
    }

    public static colorId[] values()
    {
        return (colorId[])$VALUES.clone();
    }

    public final int getColorId()
    {
        return colorId;
    }

    public final int getTextId()
    {
        return textId;
    }

    static 
    {
        NO_INTERNET_CONNECTION = new <init>("NO_INTERNET_CONNECTION", 0, 0x7f080377, 0x7f0f0127);
        DISCONNECTED = new <init>("DISCONNECTED", 1, 0x7f0803f8, 0x7f0f0127);
        CONNECTING = new <init>("CONNECTING", 2, 0x7f0803f7, 0x7f0f00e8);
        CONNECTED = new <init>("CONNECTED", 3, 0x7f0803f6, 0x7f0f0101);
        UPDATING_CONVERSATIONS = new <init>("UPDATING_CONVERSATIONS", 4, 0x7f0803f9, 0x7f0f0127);
        $VALUES = (new .VALUES[] {
            NO_INTERNET_CONNECTION, DISCONNECTED, CONNECTING, CONNECTED, UPDATING_CONVERSATIONS
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        textId = j;
        colorId = k;
    }
}
