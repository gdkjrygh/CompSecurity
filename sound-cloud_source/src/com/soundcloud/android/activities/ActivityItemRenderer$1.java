// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;


// Referenced classes of package com.soundcloud.android.activities:
//            ActivityKind

class 
{

    static final int $SwitchMap$com$soundcloud$android$activities$ActivityKind[];

    static 
    {
        $SwitchMap$com$soundcloud$android$activities$ActivityKind = new int[ActivityKind.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.USER_FOLLOW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_LIKE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.PLAYLIST_LIKE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_REPOST.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.PLAYLIST_REPOST.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_COMMENT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
