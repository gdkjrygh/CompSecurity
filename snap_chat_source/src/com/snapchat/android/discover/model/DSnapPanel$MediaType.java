// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import java.util.Locale;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPanel, MediaState

public static final class a extends Enum
{

    private static final REMOTE_VIDEO $VALUES[];
    public static final REMOTE_VIDEO IMAGE;
    public static final REMOTE_VIDEO LOCAL_WEBPAGE;
    public static final REMOTE_VIDEO OVERLAY_ITEM;
    public static final REMOTE_VIDEO REMOTE_VIDEO;
    public static final REMOTE_VIDEO VIDEO;
    private final MediaState a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$MediaType, s);
    }

    public static a valueOfIgnoreCase(String s)
    {
        return valueOf(s.toUpperCase(Locale.ENGLISH));
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final MediaState getDefaultMetadataLoadingState()
    {
        return a;
    }

    static 
    {
        IMAGE = new <init>("IMAGE", 0, MediaState.SUCCESS);
        VIDEO = new <init>("VIDEO", 1, MediaState.SUCCESS);
        OVERLAY_ITEM = new <init>("OVERLAY_ITEM", 2, MediaState.SUCCESS);
        LOCAL_WEBPAGE = new <init>("LOCAL_WEBPAGE", 3, MediaState.SUCCESS);
        REMOTE_VIDEO = new <init>("REMOTE_VIDEO", 4, MediaState.NOT_STARTED);
        $VALUES = (new .VALUES[] {
            IMAGE, VIDEO, OVERLAY_ITEM, LOCAL_WEBPAGE, REMOTE_VIDEO
        });
    }

    private (String s, int i, MediaState mediastate)
    {
        super(s, i);
        a = mediastate;
    }
}
