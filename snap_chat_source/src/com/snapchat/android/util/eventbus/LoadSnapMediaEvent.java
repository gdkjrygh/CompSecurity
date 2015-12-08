// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class LoadSnapMediaEvent
{
    public static final class LoadSnapMediaEventType extends Enum
    {

        private static final LoadSnapMediaEventType $VALUES[];
        public static final LoadSnapMediaEventType ENDED;
        public static final LoadSnapMediaEventType INITIATED;

        public static LoadSnapMediaEventType valueOf(String s)
        {
            return (LoadSnapMediaEventType)Enum.valueOf(com/snapchat/android/util/eventbus/LoadSnapMediaEvent$LoadSnapMediaEventType, s);
        }

        public static LoadSnapMediaEventType[] values()
        {
            return (LoadSnapMediaEventType[])$VALUES.clone();
        }

        static 
        {
            INITIATED = new LoadSnapMediaEventType("INITIATED", 0);
            ENDED = new LoadSnapMediaEventType("ENDED", 1);
            $VALUES = (new LoadSnapMediaEventType[] {
                INITIATED, ENDED
            });
        }

        private LoadSnapMediaEventType(String s, int i)
        {
            super(s, i);
        }
    }


    public LoadSnapMediaEventType mType;

    public LoadSnapMediaEvent(LoadSnapMediaEventType loadsnapmediaeventtype)
    {
        mType = loadsnapmediaeventtype;
    }
}
