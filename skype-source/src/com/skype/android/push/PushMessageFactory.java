// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.push:
//            PushMessageParser, PushEventType, PushServiceType, PushMessage, 
//            ChatPushMessage, CallPushMessage, ConciergePushMessage, PushToMobileMessage

class PushMessageFactory
    implements PushMessageParser
{
    static abstract class a extends Enum
    {

        private static final a $VALUES[];
        public static final a C2C;
        public static final a CALL;
        public static final a CHAT;
        public static final a CONCIERGE;
        EnumSet supportedTypes;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/push/PushMessageFactory$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        boolean contains(PushEventType pusheventtype)
        {
            return supportedTypes.contains(pusheventtype);
        }

        abstract PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent);

        static 
        {
            CHAT = new a("CHAT", 0, EnumSet.of(PushEventType.INCOMING_GROUP_INSTANT_MESSAGE, new PushEventType[] {
                PushEventType.INCOMING_INSTANT_MESSAGE, PushEventType.MEDIA_MESSAGE_SHARING, PushEventType.ASYNC_VIDEO_MESSAGE, PushEventType.AUDIO_MEDIA, PushEventType.ASYNC_FILE_TRANSFER, PushEventType.VIDEO_SHARING, PushEventType.MOJI
            })) {

                final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
                {
                    return new ChatPushMessage(intent, pushservicetype, pusheventtype);
                }

            };
            CALL = new a("CALL", 1, EnumSet.of(PushEventType.INCOMING_ANONYMOUS_CALL, new PushEventType[] {
                PushEventType.INCOMING_CALL, PushEventType.INCOMING_GROUP_CALL, PushEventType.INCOMING_LYNC_CALL, PushEventType.INCOMING_NGC_CALL, PushEventType.INCOMING_NGC_LYNC_CALL, PushEventType.INCOMING_NGC_GROUP_VIDEO_CALL, PushEventType.INCOMING_P2P_CALL
            })) {

                final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
                {
                    return new CallPushMessage(pushservicetype, pusheventtype, intent);
                }

            };
            CONCIERGE = new a("CONCIERGE", 2, EnumSet.of(PushEventType.TPUM_CONCIERGE)) {

                final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
                {
                    return new ConciergePushMessage(pushservicetype, pusheventtype, intent);
                }

            };
            C2C = new a("C2C", 3, EnumSet.of(PushEventType.C2C)) {

                final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
                {
                    return new PushToMobileMessage(pushservicetype, pusheventtype, intent);
                }

            };
            $VALUES = (new a[] {
                CHAT, CALL, CONCIERGE, C2C
            });
        }

        private a(String s, int i, EnumSet enumset)
        {
            super(s, i);
            supportedTypes = enumset;
        }

    }


    PushMessageFactory()
    {
    }

    public PushMessage parse(PushServiceType pushservicetype, Intent intent)
    {
        Object obj = intent.getStringExtra("eventType");
        if (obj != null)
        {
            obj = PushEventType.from(Integer.parseInt(((String) (obj))));
            if (obj != null)
            {
                a aa[] = a.values();
                int j = aa.length;
                for (int i = 0; i < j; i++)
                {
                    a a1 = aa[i];
                    if (a1.contains(((PushEventType) (obj))))
                    {
                        return a1.createPushMessage(pushservicetype, ((PushEventType) (obj)), intent);
                    }
                }

            }
        }
        return null;
    }
}
