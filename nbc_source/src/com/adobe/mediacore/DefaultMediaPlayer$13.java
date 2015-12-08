// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.MediaErrorCode;

// Referenced classes of package com.adobe.mediacore:
//            DefaultMediaPlayer, MediaPlayerState

static class 
{

    static final int $SwitchMap$com$adobe$ave$MediaErrorCode[];
    static final int $SwitchMap$com$adobe$mediacore$MediaPlayerState[];

    static 
    {
        $SwitchMap$com$adobe$mediacore$MediaPlayerState = new int[MediaPlayerState.values().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.PAUSE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.PLAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.COMPLETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.SUSPENDED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$adobe$ave$MediaErrorCode = new int[MediaErrorCode.values().length];
        try
        {
            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.PARSE_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.FRAGMENT_READ_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.ASYNC_OPERATION_IN_PROGRESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.FILE_NOT_FOUND.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
