// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            PlayerOperation, VideoEngineAdapter, MediaResource

final class LoadOperation
    implements PlayerOperation
{

    private final int _contentId;
    private final MediaResource _mediaResource;
    private VideoEngineAdapter _videoEngineAdapter;

    public LoadOperation(MediaResource mediaresource, int i)
    {
        _mediaResource = mediaresource;
        _contentId = i;
    }

    public void execute()
    {
        if (_videoEngineAdapter == null)
        {
            throw new IllegalArgumentException("Player operation does not a have a VideoEngineAdapter set");
        }
        if (_videoEngineAdapter.getBufferControlParameters() == null)
        {
            _videoEngineAdapter.setBufferControlParameters(VideoEngineAdapter.getDefaultBufferingParameters());
        }
        _videoEngineAdapter.load(_mediaResource, _contentId);
    }

    public void setVideoEngineAdapter(VideoEngineAdapter videoengineadapter)
    {
        _videoEngineAdapter = videoengineadapter;
    }
}
