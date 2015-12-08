// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Conversation

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CAN_ADD;
    public static final value CAN_CHANGE_PICTURE;
    public static final value CAN_CHANGE_TOPIC;
    public static final value CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION;
    public static final ON CAN_CHECK_QUALITY;
    public static final ON CAN_DELETE_OTHERS_MESSAGES;
    public static final ON CAN_EDIT_MYSELF;
    public static final ON CAN_EDIT_OTHERS;
    public static final ON CAN_GO_LIVE;
    public static final ON CAN_HOLD_LIVE_SESSION;
    public static final ON CAN_KICK;
    public static final ON CAN_RETIRE;
    public static final ON CAN_RING;
    public static final ON CAN_RING_ALL;
    public static final ON CAN_RING_PSTN;
    public static final ON CAN_RING_TRANSLATED;
    public static final ON CAN_RING_VIDEO;
    public static final ON CAN_SEND_ANNOTATION;
    public static final ON CAN_SEND_CONTACTS;
    public static final ON CAN_SEND_FILE;
    public static final ON CAN_SEND_MEDIAMESSAGE;
    public static final ON CAN_SEND_SMS;
    public static final ON CAN_SEND_STATIC_LOCATION_MESSAGE;
    public static final ON CAN_SEND_TEXT;
    public static final ON CAN_SEND_TRANSLATED_TEXT;
    public static final ON CAN_SEND_VIDEOMESSAGE;
    public static final ON CAN_SEND_VOICEMAIL;
    public static final ON CAN_SHARE_SCREEN;
    public static final ON CAN_SPAWN;
    public static final ON CAPABILITY_COUNT;
    public static final ON WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$CAPABILITY, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        CAN_GO_LIVE = new <init>("CAN_GO_LIVE", 0, 0);
        CAN_RING = new <init>("CAN_RING", 1, 1);
        CAN_RING_ALL = new <init>("CAN_RING_ALL", 2, 2);
        CAN_RING_VIDEO = new <init>("CAN_RING_VIDEO", 3, 3);
        CAN_RING_PSTN = new <init>("CAN_RING_PSTN", 4, 4);
        CAN_SHARE_SCREEN = new <init>("CAN_SHARE_SCREEN", 5, 5);
        CAN_HOLD_LIVE_SESSION = new <init>("CAN_HOLD_LIVE_SESSION", 6, 6);
        CAN_CHECK_QUALITY = new <init>("CAN_CHECK_QUALITY", 7, 7);
        CAN_SEND_SMS = new <init>("CAN_SEND_SMS", 8, 8);
        CAN_SEND_TEXT = new <init>("CAN_SEND_TEXT", 9, 9);
        CAN_SEND_FILE = new <init>("CAN_SEND_FILE", 10, 10);
        CAN_SEND_VOICEMAIL = new <init>("CAN_SEND_VOICEMAIL", 11, 11);
        CAN_SEND_CONTACTS = new <init>("CAN_SEND_CONTACTS", 12, 12);
        CAN_EDIT_MYSELF = new <init>("CAN_EDIT_MYSELF", 13, 13);
        CAN_EDIT_OTHERS = new <init>("CAN_EDIT_OTHERS", 14, 14);
        CAN_CHANGE_TOPIC = new <init>("CAN_CHANGE_TOPIC", 15, 15);
        CAN_CHANGE_PICTURE = new <init>("CAN_CHANGE_PICTURE", 16, 16);
        CAN_ADD = new <init>("CAN_ADD", 17, 17);
        CAN_RETIRE = new <init>("CAN_RETIRE", 18, 18);
        CAN_KICK = new <init>("CAN_KICK", 19, 19);
        CAN_SPAWN = new <init>("CAN_SPAWN", 20, 20);
        CAN_SEND_VIDEOMESSAGE = new <init>("CAN_SEND_VIDEOMESSAGE", 21, 21);
        CAN_SEND_MEDIAMESSAGE = new <init>("CAN_SEND_MEDIAMESSAGE", 22, 22);
        CAN_SEND_STATIC_LOCATION_MESSAGE = new <init>("CAN_SEND_STATIC_LOCATION_MESSAGE", 23, 23);
        CAN_DELETE_OTHERS_MESSAGES = new <init>("CAN_DELETE_OTHERS_MESSAGES", 24, 24);
        CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION = new <init>("CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION", 25, 25);
        CAN_SEND_ANNOTATION = new <init>("CAN_SEND_ANNOTATION", 26, 26);
        CAN_RING_TRANSLATED = new <init>("CAN_RING_TRANSLATED", 27, 27);
        CAN_SEND_TRANSLATED_TEXT = new <init>("CAN_SEND_TRANSLATED_TEXT", 28, 28);
        CAPABILITY_COUNT = new <init>("CAPABILITY_COUNT", 29, 29);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 30, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CAN_GO_LIVE, CAN_RING, CAN_RING_ALL, CAN_RING_VIDEO, CAN_RING_PSTN, CAN_SHARE_SCREEN, CAN_HOLD_LIVE_SESSION, CAN_CHECK_QUALITY, CAN_SEND_SMS, CAN_SEND_TEXT, 
            CAN_SEND_FILE, CAN_SEND_VOICEMAIL, CAN_SEND_CONTACTS, CAN_EDIT_MYSELF, CAN_EDIT_OTHERS, CAN_CHANGE_TOPIC, CAN_CHANGE_PICTURE, CAN_ADD, CAN_RETIRE, CAN_KICK, 
            CAN_SPAWN, CAN_SEND_VIDEOMESSAGE, CAN_SEND_MEDIAMESSAGE, CAN_SEND_STATIC_LOCATION_MESSAGE, CAN_DELETE_OTHERS_MESSAGES, CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION, CAN_SEND_ANNOTATION, CAN_RING_TRANSLATED, CAN_SEND_TRANSLATED_TEXT, CAPABILITY_COUNT, 
            WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
