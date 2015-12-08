// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gV extends kl
{

    public String dsnapId;
    public String editionId;
    private final String eventName = "DISCOVER_INLINE_VIDEO_VIEW";
    public String inlineVideoId;
    public Double mediaDisplayTimeSec;
    public Double mediaTotalTimeSec;
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public Double timeViewed;

    public gV()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_INLINE_VIDEO_VIEW");
        if (dsnapId != null)
        {
            hashmap.put("dsnap_id", dsnapId);
        }
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
        }
        if (inlineVideoId != null)
        {
            hashmap.put("inline_video_id", inlineVideoId);
        }
        if (mediaDisplayTimeSec != null)
        {
            hashmap.put("media_display_time_sec", mediaDisplayTimeSec);
        }
        if (mediaTotalTimeSec != null)
        {
            hashmap.put("media_total_time_sec", mediaTotalTimeSec);
        }
        if (publisherId != null)
        {
            hashmap.put("publisher_id", publisherId);
        }
        if (snapIndexCount != null)
        {
            hashmap.put("snap_index_count", snapIndexCount);
        }
        if (snapIndexPos != null)
        {
            hashmap.put("snap_index_pos", snapIndexPos);
        }
        if (timeViewed != null)
        {
            hashmap.put("time_viewed", timeViewed);
        }
        hashmap.putAll(super.a());
        return hashmap;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (gV)obj;
            if (dsnapId == null ? ((gV) (obj)).dsnapId != null : !dsnapId.equals(((gV) (obj)).dsnapId))
            {
                return false;
            }
            if (editionId == null ? ((gV) (obj)).editionId != null : !editionId.equals(((gV) (obj)).editionId))
            {
                return false;
            }
            if (inlineVideoId == null ? ((gV) (obj)).inlineVideoId != null : !inlineVideoId.equals(((gV) (obj)).inlineVideoId))
            {
                return false;
            }
            if (mediaDisplayTimeSec == null ? ((gV) (obj)).mediaDisplayTimeSec != null : !mediaDisplayTimeSec.equals(((gV) (obj)).mediaDisplayTimeSec))
            {
                return false;
            }
            if (mediaTotalTimeSec == null ? ((gV) (obj)).mediaTotalTimeSec != null : !mediaTotalTimeSec.equals(((gV) (obj)).mediaTotalTimeSec))
            {
                return false;
            }
            if (publisherId == null ? ((gV) (obj)).publisherId != null : !publisherId.equals(((gV) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gV) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gV) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gV) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gV) (obj)).snapIndexPos))
            {
                return false;
            }
            if (timeViewed == null ? ((gV) (obj)).timeViewed != null : !timeViewed.equals(((gV) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i2 = 0;
        int j2 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (dsnapId != null)
        {
            i = dsnapId.hashCode();
        } else
        {
            i = 0;
        }
        if (editionId != null)
        {
            j = editionId.hashCode();
        } else
        {
            j = 0;
        }
        if (inlineVideoId != null)
        {
            k = inlineVideoId.hashCode();
        } else
        {
            k = 0;
        }
        if (mediaDisplayTimeSec != null)
        {
            l = mediaDisplayTimeSec.hashCode();
        } else
        {
            l = 0;
        }
        if (mediaTotalTimeSec != null)
        {
            i1 = mediaTotalTimeSec.hashCode();
        } else
        {
            i1 = 0;
        }
        if (publisherId != null)
        {
            j1 = publisherId.hashCode();
        } else
        {
            j1 = 0;
        }
        if (snapIndexCount != null)
        {
            k1 = snapIndexCount.hashCode();
        } else
        {
            k1 = 0;
        }
        if (snapIndexPos != null)
        {
            l1 = snapIndexPos.hashCode();
        } else
        {
            l1 = 0;
        }
        if (timeViewed != null)
        {
            i2 = timeViewed.hashCode();
        }
        return (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + j2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
    }
}
