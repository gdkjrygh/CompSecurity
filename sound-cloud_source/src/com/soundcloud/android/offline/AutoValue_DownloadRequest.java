// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, OfflineTrackContext

final class AutoValue_DownloadRequest extends DownloadRequest
{

    private final long duration;
    private final boolean syncable;
    private final OfflineTrackContext trackContext;
    private final String waveformUrl;

    AutoValue_DownloadRequest(OfflineTrackContext offlinetrackcontext, long l, String s, boolean flag)
    {
        if (offlinetrackcontext == null)
        {
            throw new NullPointerException("Null trackContext");
        }
        trackContext = offlinetrackcontext;
        duration = l;
        if (s == null)
        {
            throw new NullPointerException("Null waveformUrl");
        } else
        {
            waveformUrl = s;
            syncable = flag;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof DownloadRequest)
            {
                if (!trackContext.equals(((DownloadRequest) (obj = (DownloadRequest)obj)).getTrackContext()) || duration != ((DownloadRequest) (obj)).getDuration() || !waveformUrl.equals(((DownloadRequest) (obj)).getWaveformUrl()) || syncable != ((DownloadRequest) (obj)).isSyncable())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final long getDuration()
    {
        return duration;
    }

    public final OfflineTrackContext getTrackContext()
    {
        return trackContext;
    }

    public final String getWaveformUrl()
    {
        return waveformUrl;
    }

    public final int hashCode()
    {
        int i = (int)((long)((trackContext.hashCode() ^ 0xf4243) * 0xf4243) ^ (duration >>> 32 ^ duration));
        int j = waveformUrl.hashCode();
        char c;
        if (syncable)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c ^ (i * 0xf4243 ^ j) * 0xf4243;
    }

    public final boolean isSyncable()
    {
        return syncable;
    }

    public final String toString()
    {
        return (new StringBuilder("DownloadRequest{trackContext=")).append(trackContext).append(", duration=").append(duration).append(", waveformUrl=").append(waveformUrl).append(", syncable=").append(syncable).append("}").toString();
    }
}
