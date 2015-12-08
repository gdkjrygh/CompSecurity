// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.controller;

import jQ;

public final class MediaOpenOrigin extends Enum
{

    private static final MediaOpenOrigin $VALUES[];
    public static final MediaOpenOrigin CAMERA_QR_SCAN;
    public static final MediaOpenOrigin CHAT;
    public static final MediaOpenOrigin DISCOVER;
    public static final MediaOpenOrigin EXPLORER;
    public static final MediaOpenOrigin EXTERNAL;
    public static final MediaOpenOrigin PREVIEW_QR_SCAN;
    public static final MediaOpenOrigin PROFILE_ROLL_QR_SCAN;
    public static final MediaOpenOrigin STORIES;

    private MediaOpenOrigin(String s, int i)
    {
        super(s, i);
    }

    public static MediaOpenOrigin valueOf(String s)
    {
        return (MediaOpenOrigin)Enum.valueOf(com/snapchat/android/controller/MediaOpenOrigin, s);
    }

    public static MediaOpenOrigin[] values()
    {
        return (MediaOpenOrigin[])$VALUES.clone();
    }

    public final jQ getSourceType()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MediaOpenOrigin.values().length];
                try
                {
                    a[MediaOpenOrigin.STORIES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[MediaOpenOrigin.EXPLORER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[MediaOpenOrigin.CHAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[MediaOpenOrigin.EXTERNAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[MediaOpenOrigin.PROFILE_ROLL_QR_SCAN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MediaOpenOrigin.CAMERA_QR_SCAN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MediaOpenOrigin.PREVIEW_QR_SCAN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MediaOpenOrigin.DISCOVER.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return jQ.DISCOVER;

        case 1: // '\001'
        case 2: // '\002'
            return jQ.STORY;

        case 3: // '\003'
            return jQ.CHAT;

        case 4: // '\004'
            return jQ.EXTERNAL;

        case 5: // '\005'
            return jQ.PROFILE_ROLL_QR_SCAN;

        case 6: // '\006'
        case 7: // '\007'
            return jQ.CAMERA_QR_SCAN;
        }
    }

    static 
    {
        DISCOVER = new MediaOpenOrigin("DISCOVER", 0);
        STORIES = new MediaOpenOrigin("STORIES", 1);
        CHAT = new MediaOpenOrigin("CHAT", 2);
        PREVIEW_QR_SCAN = new MediaOpenOrigin("PREVIEW_QR_SCAN", 3);
        CAMERA_QR_SCAN = new MediaOpenOrigin("CAMERA_QR_SCAN", 4);
        PROFILE_ROLL_QR_SCAN = new MediaOpenOrigin("PROFILE_ROLL_QR_SCAN", 5);
        EXTERNAL = new MediaOpenOrigin("EXTERNAL", 6);
        EXPLORER = new MediaOpenOrigin("EXPLORER", 7);
        $VALUES = (new MediaOpenOrigin[] {
            DISCOVER, STORIES, CHAT, PREVIEW_QR_SCAN, CAMERA_QR_SCAN, PROFILE_ROLL_QR_SCAN, EXTERNAL, EXPLORER
        });
    }
}
