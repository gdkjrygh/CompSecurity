// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AdManifestLoadEvent extends MediaPlayerEvent
{

    private static final int INVALID_DURATION = 0;
    private static final int INVALID_HANDLE = -1;
    private final int _contentId;
    private final long _duration;
    private final int _handle;

    private AdManifestLoadEvent(MediaPlayerEvent.Type type, int i, int j, long l)
    {
        super(type);
        _contentId = i;
        _handle = j;
        _duration = l;
    }

    public static AdManifestLoadEvent createAdManifestLoadCompletedEvent(int i, int j, long l)
    {
        return new AdManifestLoadEvent(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_COMPLETE, i, j, l);
    }

    public static AdManifestLoadEvent createAdManifestLoadFailedEvent(int i)
    {
        return new AdManifestLoadEvent(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_FAILED, i, -1, 0L);
    }

    public int getContentId()
    {
        return _contentId;
    }

    public long getDuration()
    {
        return _duration;
    }

    public int getHandle()
    {
        return _handle;
    }
}
