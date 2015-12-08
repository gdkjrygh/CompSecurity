// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            PlayerOperation, VideoEngineAdapter

final class SeekOperation
    implements PlayerOperation
{

    private final VideoEngineTimeline.TimeMapping _desiredTimeMappingPosition;
    private VideoEngineAdapter _videoEngineAdapter;

    protected SeekOperation(VideoEngineTimeline.TimeMapping timemapping)
    {
        _desiredTimeMappingPosition = timemapping;
    }

    public void execute()
    {
        if (_videoEngineAdapter == null)
        {
            throw new IllegalArgumentException("Player operation does not a have a VideoEngineAdapter set");
        } else
        {
            _videoEngineAdapter.seek(_desiredTimeMappingPosition);
            return;
        }
    }

    public void setVideoEngineAdapter(VideoEngineAdapter videoengineadapter)
    {
        _videoEngineAdapter = videoengineadapter;
    }
}
