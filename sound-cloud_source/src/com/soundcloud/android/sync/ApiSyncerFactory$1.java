// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.storage.provider.Content;

class 
{

    static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

    static 
    {
        $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUND_STREAM.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ACTIVITIES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_LIKES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_FOLLOWINGS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_PLAYLISTS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUNDS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
