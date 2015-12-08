// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackType

class 
{

    static final int $SwitchMap$com$soundcloud$android$playback$PlaybackType[];

    static 
    {
        $SwitchMap$com$soundcloud$android$playback$PlaybackType = new int[PlaybackType.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.DEFAULT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.OFFLINE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.UNINTERRUPTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
