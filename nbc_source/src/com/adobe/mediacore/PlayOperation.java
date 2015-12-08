// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            PlayerOperation, VideoEngineAdapter

final class PlayOperation
    implements PlayerOperation
{

    private VideoEngineAdapter _videoEngineAdapter;

    PlayOperation()
    {
    }

    public void execute()
    {
        if (_videoEngineAdapter == null)
        {
            throw new IllegalArgumentException("Player operation does not a have a VideoEngineAdapter set");
        } else
        {
            _videoEngineAdapter.play();
            return;
        }
    }

    public void setVideoEngineAdapter(VideoEngineAdapter videoengineadapter)
    {
        _videoEngineAdapter = videoengineadapter;
    }
}
