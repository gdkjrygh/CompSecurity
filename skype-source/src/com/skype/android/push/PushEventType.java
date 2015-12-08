// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


public final class PushEventType extends Enum
{

    private static final PushEventType $VALUES[];
    public static final PushEventType ASYNC_FILE_TRANSFER;
    public static final PushEventType ASYNC_VIDEO_MESSAGE;
    public static final PushEventType AUDIO_MEDIA;
    public static final PushEventType C2C;
    public static final PushEventType INCOMING_ANONYMOUS_CALL;
    public static final PushEventType INCOMING_CALL;
    public static final PushEventType INCOMING_GROUP_CALL;
    public static final PushEventType INCOMING_GROUP_INSTANT_MESSAGE;
    public static final PushEventType INCOMING_INSTANT_MESSAGE;
    public static final PushEventType INCOMING_LYNC_CALL;
    public static final PushEventType INCOMING_NGC_CALL;
    public static final PushEventType INCOMING_NGC_GROUP_VIDEO_CALL;
    public static final PushEventType INCOMING_NGC_LYNC_CALL;
    public static final PushEventType INCOMING_P2P_CALL;
    public static final PushEventType INCOMING_STOP_RINGER;
    public static final PushEventType MEDIA_MESSAGE_SHARING;
    public static final PushEventType MOJI;
    public static final PushEventType TPUM_CONCIERGE;
    public static final PushEventType UNKNOWN;
    public static final PushEventType VIDEO_SHARING;
    private int value;

    private PushEventType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static PushEventType from(int i)
    {
        PushEventType apusheventtype[] = values();
        int k = apusheventtype.length;
        for (int j = 0; j < k; j++)
        {
            PushEventType pusheventtype = apusheventtype[j];
            if (pusheventtype.value() == i)
            {
                return pusheventtype;
            }
        }

        return UNKNOWN;
    }

    public static PushEventType valueOf(String s)
    {
        return (PushEventType)Enum.valueOf(com/skype/android/push/PushEventType, s);
    }

    public static PushEventType[] values()
    {
        return (PushEventType[])$VALUES.clone();
    }

    public final com.skype.Message.TYPE getCorrespondingMessageType()
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$push$PushEventType[];

            static 
            {
                $SwitchMap$com$skype$android$push$PushEventType = new int[PushEventType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MEDIA_MESSAGE_SHARING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.VIDEO_SHARING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.AUDIO_MEDIA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.ASYNC_VIDEO_MESSAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.ASYNC_FILE_TRANSFER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.INCOMING_INSTANT_MESSAGE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.INCOMING_GROUP_INSTANT_MESSAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MOJI.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.push.PushEventType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE;

        case 2: // '\002'
            return com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE;

        case 3: // '\003'
            return com.skype.Message.TYPE.POSTED_AUDIO_MESSAGE;

        case 4: // '\004'
            return com.skype.Message.TYPE.POSTED_VIDEO;

        case 5: // '\005'
            return com.skype.Message.TYPE.POSTED_FILE_MESSAGE;

        case 6: // '\006'
        case 7: // '\007'
            return com.skype.Message.TYPE.POSTED_TEXT;

        case 8: // '\b'
            return com.skype.Message.TYPE.POSTED_FLIK_MESSAGE;
        }
    }

    public final int value()
    {
        return value;
    }

    static 
    {
        UNKNOWN = new PushEventType("UNKNOWN", 0, -1);
        INCOMING_CALL = new PushEventType("INCOMING_CALL", 1, 100);
        INCOMING_ANONYMOUS_CALL = new PushEventType("INCOMING_ANONYMOUS_CALL", 2, 101);
        INCOMING_GROUP_CALL = new PushEventType("INCOMING_GROUP_CALL", 3, 102);
        INCOMING_LYNC_CALL = new PushEventType("INCOMING_LYNC_CALL", 4, 103);
        INCOMING_STOP_RINGER = new PushEventType("INCOMING_STOP_RINGER", 5, 104);
        INCOMING_NGC_LYNC_CALL = new PushEventType("INCOMING_NGC_LYNC_CALL", 6, 105);
        INCOMING_NGC_CALL = new PushEventType("INCOMING_NGC_CALL", 7, 107);
        INCOMING_P2P_CALL = new PushEventType("INCOMING_P2P_CALL", 8, 108);
        INCOMING_NGC_GROUP_VIDEO_CALL = new PushEventType("INCOMING_NGC_GROUP_VIDEO_CALL", 9, 109);
        INCOMING_INSTANT_MESSAGE = new PushEventType("INCOMING_INSTANT_MESSAGE", 10, 200);
        INCOMING_GROUP_INSTANT_MESSAGE = new PushEventType("INCOMING_GROUP_INSTANT_MESSAGE", 11, 201);
        VIDEO_SHARING = new PushEventType("VIDEO_SHARING", 12, 301);
        MEDIA_MESSAGE_SHARING = new PushEventType("MEDIA_MESSAGE_SHARING", 13, 302);
        AUDIO_MEDIA = new PushEventType("AUDIO_MEDIA", 14, 303);
        MOJI = new PushEventType("MOJI", 15, 304);
        ASYNC_VIDEO_MESSAGE = new PushEventType("ASYNC_VIDEO_MESSAGE", 16, 305);
        ASYNC_FILE_TRANSFER = new PushEventType("ASYNC_FILE_TRANSFER", 17, 306);
        TPUM_CONCIERGE = new PushEventType("TPUM_CONCIERGE", 18, 401);
        C2C = new PushEventType("C2C", 19, 501);
        $VALUES = (new PushEventType[] {
            UNKNOWN, INCOMING_CALL, INCOMING_ANONYMOUS_CALL, INCOMING_GROUP_CALL, INCOMING_LYNC_CALL, INCOMING_STOP_RINGER, INCOMING_NGC_LYNC_CALL, INCOMING_NGC_CALL, INCOMING_P2P_CALL, INCOMING_NGC_GROUP_VIDEO_CALL, 
            INCOMING_INSTANT_MESSAGE, INCOMING_GROUP_INSTANT_MESSAGE, VIDEO_SHARING, MEDIA_MESSAGE_SHARING, AUDIO_MEDIA, MOJI, ASYNC_VIDEO_MESSAGE, ASYNC_FILE_TRANSFER, TPUM_CONCIERGE, C2C
        });
    }
}
