// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.livechat;


public final class AdlHelper
{
    public static final class PresenceSource extends Enum
    {

        private static final PresenceSource $VALUES[];
        public static final PresenceSource ADDLIVE;
        public static final PresenceSource CHAT_GATEWAY;

        public static PresenceSource valueOf(String s)
        {
            return (PresenceSource)Enum.valueOf(com/snapchat/android/livechat/AdlHelper$PresenceSource, s);
        }

        public static PresenceSource[] values()
        {
            return (PresenceSource[])$VALUES.clone();
        }

        static 
        {
            ADDLIVE = new PresenceSource("ADDLIVE", 0);
            CHAT_GATEWAY = new PresenceSource("CHAT_GATEWAY", 1);
            $VALUES = (new PresenceSource[] {
                ADDLIVE, CHAT_GATEWAY
            });
        }

        private PresenceSource(String s, int i)
        {
            super(s, i);
        }
    }

}
