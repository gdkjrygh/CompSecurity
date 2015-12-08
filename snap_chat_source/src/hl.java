// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hl extends kl
{

    public String editionId;
    private final String eventName = "DISCOVER_SPLASH_VIEW";
    public Boolean fullView;
    public Double mediaDisplayTimeSec;
    public hJ mediaType;
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public Double snapTimeSec;
    public jQ source;
    public String splashId;
    public Double timeViewed;

    public hl()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_SPLASH_VIEW");
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
        }
        if (fullView != null)
        {
            hashmap.put("full_view", fullView);
        }
        if (mediaDisplayTimeSec != null)
        {
            hashmap.put("media_display_time_sec", mediaDisplayTimeSec);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
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
        if (snapTimeSec != null)
        {
            hashmap.put("snap_time_sec", snapTimeSec);
        }
        if (source != null)
        {
            hashmap.put("source", source);
        }
        if (splashId != null)
        {
            hashmap.put("splash_id", splashId);
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
            obj = (hl)obj;
            if (editionId == null ? ((hl) (obj)).editionId != null : !editionId.equals(((hl) (obj)).editionId))
            {
                return false;
            }
            if (fullView == null ? ((hl) (obj)).fullView != null : !fullView.equals(((hl) (obj)).fullView))
            {
                return false;
            }
            if (mediaDisplayTimeSec == null ? ((hl) (obj)).mediaDisplayTimeSec != null : !mediaDisplayTimeSec.equals(((hl) (obj)).mediaDisplayTimeSec))
            {
                return false;
            }
            if (mediaType == null ? ((hl) (obj)).mediaType != null : !mediaType.equals(((hl) (obj)).mediaType))
            {
                return false;
            }
            if (publisherId == null ? ((hl) (obj)).publisherId != null : !publisherId.equals(((hl) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((hl) (obj)).snapIndexCount != null : !snapIndexCount.equals(((hl) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((hl) (obj)).snapIndexPos != null : !snapIndexPos.equals(((hl) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTimeSec == null ? ((hl) (obj)).snapTimeSec != null : !snapTimeSec.equals(((hl) (obj)).snapTimeSec))
            {
                return false;
            }
            if (source == null ? ((hl) (obj)).source != null : !source.equals(((hl) (obj)).source))
            {
                return false;
            }
            if (splashId == null ? ((hl) (obj)).splashId != null : !splashId.equals(((hl) (obj)).splashId))
            {
                return false;
            }
            if (timeViewed == null ? ((hl) (obj)).timeViewed != null : !timeViewed.equals(((hl) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k2 = 0;
        int l2 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (editionId != null)
        {
            i = editionId.hashCode();
        } else
        {
            i = 0;
        }
        if (fullView != null)
        {
            j = fullView.hashCode();
        } else
        {
            j = 0;
        }
        if (mediaDisplayTimeSec != null)
        {
            k = mediaDisplayTimeSec.hashCode();
        } else
        {
            k = 0;
        }
        if (mediaType != null)
        {
            l = mediaType.hashCode();
        } else
        {
            l = 0;
        }
        if (publisherId != null)
        {
            i1 = publisherId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (snapIndexCount != null)
        {
            j1 = snapIndexCount.hashCode();
        } else
        {
            j1 = 0;
        }
        if (snapIndexPos != null)
        {
            k1 = snapIndexPos.hashCode();
        } else
        {
            k1 = 0;
        }
        if (snapTimeSec != null)
        {
            l1 = snapTimeSec.hashCode();
        } else
        {
            l1 = 0;
        }
        if (source != null)
        {
            i2 = source.hashCode();
        } else
        {
            i2 = 0;
        }
        if (splashId != null)
        {
            j2 = splashId.hashCode();
        } else
        {
            j2 = 0;
        }
        if (timeViewed != null)
        {
            k2 = timeViewed.hashCode();
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }
}
