// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.main.Screen;

class 
{

    static final int $SwitchMap$com$soundcloud$android$main$Screen[];

    static 
    {
        $SwitchMap$com$soundcloud$android$main$Screen = new int[Screen.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_EVERYTHING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_TRACKS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_PLAYLISTS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_USERS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_PLAYLIST_DISCO.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
