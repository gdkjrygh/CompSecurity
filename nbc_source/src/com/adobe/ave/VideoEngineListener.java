// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;

import com.adobe.ave.drm.DRMError;

// Referenced classes of package com.adobe.ave:
//            VideoEngine, MediaErrorCode, DataType, Dictionary, 
//            PlayState, StreamMetadata, SwitchInfo, UpdateType

public class VideoEngineListener
{

    public VideoEngineListener()
    {
    }

    public void onBackgroundManifestError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
    }

    public void onBackgroundManifestWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
    }

    public void onDRMError(VideoEngine videoengine, DRMError drmerror)
    {
    }

    public void onDRMMetadata(VideoEngine videoengine, byte abyte0[], int i, long l)
    {
    }

    public void onData(VideoEngine videoengine, long l, DataType datatype, byte abyte0[], int i)
    {
    }

    public void onDictionaryData(VideoEngine videoengine, Dictionary dictionary, long l)
    {
    }

    public void onError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
    }

    public void onLoadInfo(VideoEngine videoengine, String s)
    {
    }

    public void onManifestLoad(VideoEngine videoengine, MediaErrorCode mediaerrorcode, int i, int j, long l)
    {
    }

    public void onPlayState(VideoEngine videoengine, PlayState playstate)
    {
    }

    public void onSeekComplete(VideoEngine videoengine, MediaErrorCode mediaerrorcode)
    {
    }

    public void onStreamMetadata(VideoEngine videoengine, StreamMetadata streammetadata)
    {
    }

    public void onStreamSwitch(VideoEngine videoengine, long l, SwitchInfo switchinfo, int i, int j)
    {
    }

    public void onTimeline(VideoEngine videoengine, UpdateType updatetype)
    {
    }

    public void onTrickPlayEnded(VideoEngine videoengine, MediaErrorCode mediaerrorcode)
    {
    }

    public void onWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
    }
}
