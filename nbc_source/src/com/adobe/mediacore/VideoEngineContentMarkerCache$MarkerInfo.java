// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            VideoEngineContentMarkerCache

static class _duration
{

    private final int _contentId;
    private final long _duration;
    private boolean _eventDispatched;
    private final long _timestamp;

    public int getContentId()
    {
        return _contentId;
    }

    long getDuration()
    {
        return _duration;
    }

    public long getTimestamp()
    {
        return _timestamp;
    }

    public boolean isEventDispatched()
    {
        return _eventDispatched;
    }

    public void setEventDispatched(boolean flag)
    {
        _eventDispatched = flag;
    }

    public (int i, long l, long l1)
    {
        _timestamp = l;
        _contentId = i;
        _duration = l1;
    }
}
