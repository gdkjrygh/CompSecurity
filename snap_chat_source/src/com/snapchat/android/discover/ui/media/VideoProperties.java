// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;


public final class VideoProperties
{
    public static final class Protocol extends Enum
    {

        private static final Protocol $VALUES[];
        public static final Protocol HLS;
        public static final Protocol MP4;

        public static Protocol valueOf(String s)
        {
            return (Protocol)Enum.valueOf(com/snapchat/android/discover/ui/media/VideoProperties$Protocol, s);
        }

        public static Protocol[] values()
        {
            return (Protocol[])$VALUES.clone();
        }

        static 
        {
            MP4 = new Protocol("MP4", 0);
            HLS = new Protocol("HLS", 1);
            $VALUES = (new Protocol[] {
                MP4, HLS
            });
        }

        private Protocol(String s, int i)
        {
            super(s, i);
        }
    }


    public final Protocol a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public VideoProperties(String s, Protocol protocol)
    {
        this(s, protocol, Integer.valueOf(-1), Integer.valueOf(-1));
    }

    public VideoProperties(String s, Protocol protocol, Integer integer, Integer integer1)
    {
        b = s;
        a = protocol;
        c = integer;
        d = integer1;
    }

    public final String toString()
    {
        return String.format("[%s %s]", new Object[] {
            a.name(), b
        });
    }
}
