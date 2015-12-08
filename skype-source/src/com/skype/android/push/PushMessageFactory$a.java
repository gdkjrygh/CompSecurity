// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.push:
//            PushMessageFactory, PushEventType, PushServiceType, PushMessage, 
//            ChatPushMessage, CallPushMessage, ConciergePushMessage, PushToMobileMessage

static abstract class <init> extends Enum
{

    private static final C2C $VALUES[];
    public static final C2C C2C;
    public static final C2C CALL;
    public static final C2C CHAT;
    public static final C2C CONCIERGE;
    EnumSet supportedTypes;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/push/PushMessageFactory$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    boolean contains(PushEventType pusheventtype)
    {
        return supportedTypes.contains(pusheventtype);
    }

    abstract PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent);

    static 
    {
        CHAT = new PushMessageFactory.a("CHAT", 0, EnumSet.of(PushEventType.INCOMING_GROUP_INSTANT_MESSAGE, new PushEventType[] {
            PushEventType.INCOMING_INSTANT_MESSAGE, PushEventType.MEDIA_MESSAGE_SHARING, PushEventType.ASYNC_VIDEO_MESSAGE, PushEventType.AUDIO_MEDIA, PushEventType.ASYNC_FILE_TRANSFER, PushEventType.VIDEO_SHARING, PushEventType.MOJI
        })) {

            final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
            {
                return new ChatPushMessage(intent, pushservicetype, pusheventtype);
            }

        };
        CALL = new PushMessageFactory.a("CALL", 1, EnumSet.of(PushEventType.INCOMING_ANONYMOUS_CALL, new PushEventType[] {
            PushEventType.INCOMING_CALL, PushEventType.INCOMING_GROUP_CALL, PushEventType.INCOMING_LYNC_CALL, PushEventType.INCOMING_NGC_CALL, PushEventType.INCOMING_NGC_LYNC_CALL, PushEventType.INCOMING_NGC_GROUP_VIDEO_CALL, PushEventType.INCOMING_P2P_CALL
        })) {

            final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
            {
                return new CallPushMessage(pushservicetype, pusheventtype, intent);
            }

        };
        CONCIERGE = new PushMessageFactory.a("CONCIERGE", 2, EnumSet.of(PushEventType.TPUM_CONCIERGE)) {

            final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
            {
                return new ConciergePushMessage(pushservicetype, pusheventtype, intent);
            }

        };
        C2C = new PushMessageFactory.a("C2C", 3, EnumSet.of(PushEventType.C2C)) {

            final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
            {
                return new PushToMobileMessage(pushservicetype, pusheventtype, intent);
            }

        };
        $VALUES = (new .VALUES[] {
            CHAT, CALL, CONCIERGE, C2C
        });
    }

    private _cls4(String s, int i, EnumSet enumset)
    {
        super(s, i);
        supportedTypes = enumset;
    }

    supportedTypes(String s, int i, EnumSet enumset, supportedTypes supportedtypes)
    {
        this(s, i, enumset);
    }
}
