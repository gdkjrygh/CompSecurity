// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            UrlPreviewTextMessageViewHolder

public static final class embedded extends Enum
{

    private static final COMBINED_MESSAGE $VALUES[];
    public static final COMBINED_MESSAGE COMBINED_MESSAGE;
    public static final COMBINED_MESSAGE GENERIC_URL;
    public static final COMBINED_MESSAGE GENERIC_URL_EMBEDDED;
    public static final COMBINED_MESSAGE GIF_URL;
    public static final COMBINED_MESSAGE GIF_URL_EMBEDDED;
    public static final COMBINED_MESSAGE SIMPLE_MESSAGE;
    public static final COMBINED_MESSAGE TWITTER_MESSAGE;
    public static final COMBINED_MESSAGE TWITTER_MESSAGE_EMBEDDED;
    private final boolean embedded;

    public static embedded valueOf(String s)
    {
        return (embedded)Enum.valueOf(com/skype/android/app/chat/UrlPreviewTextMessageViewHolder$MessageSubType, s);
    }

    public static embedded[] values()
    {
        return (embedded[])$VALUES.clone();
    }

    public final boolean isEmbedded()
    {
        return embedded;
    }

    static 
    {
        SIMPLE_MESSAGE = new <init>("SIMPLE_MESSAGE", 0, false);
        TWITTER_MESSAGE = new <init>("TWITTER_MESSAGE", 1, false);
        GENERIC_URL = new <init>("GENERIC_URL", 2, false);
        GIF_URL = new <init>("GIF_URL", 3, false);
        GIF_URL_EMBEDDED = new <init>("GIF_URL_EMBEDDED", 4, true);
        TWITTER_MESSAGE_EMBEDDED = new <init>("TWITTER_MESSAGE_EMBEDDED", 5, true);
        GENERIC_URL_EMBEDDED = new <init>("GENERIC_URL_EMBEDDED", 6, true);
        COMBINED_MESSAGE = new <init>("COMBINED_MESSAGE", 7, false);
        $VALUES = (new .VALUES[] {
            SIMPLE_MESSAGE, TWITTER_MESSAGE, GENERIC_URL, GIF_URL, GIF_URL_EMBEDDED, TWITTER_MESSAGE_EMBEDDED, GENERIC_URL_EMBEDDED, COMBINED_MESSAGE
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        embedded = flag;
    }
}
