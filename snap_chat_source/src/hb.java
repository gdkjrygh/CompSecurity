// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hb extends kl
{

    public String dsnapId;
    public String editionId;
    private final String eventName = "DISCOVER_SNAP_LONGFORM_VIEW";
    private hn exitEvent;
    public Double inlineVideoTimeViewed;
    public Long inlineVideoViewCount;
    public hJ longformType;
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public jQ source;
    public Double timeViewed;

    public hb()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_SNAP_LONGFORM_VIEW");
        if (dsnapId != null)
        {
            hashmap.put("dsnap_id", dsnapId);
        }
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
        }
        if (exitEvent != null)
        {
            hashmap.put("exit_event", exitEvent);
        }
        if (inlineVideoTimeViewed != null)
        {
            hashmap.put("inline_video_time_viewed", inlineVideoTimeViewed);
        }
        if (inlineVideoViewCount != null)
        {
            hashmap.put("inline_video_view_count", inlineVideoViewCount);
        }
        if (longformType != null)
        {
            hashmap.put("longform_type", longformType);
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
        if (source != null)
        {
            hashmap.put("source", source);
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
            obj = (hb)obj;
            if (dsnapId == null ? ((hb) (obj)).dsnapId != null : !dsnapId.equals(((hb) (obj)).dsnapId))
            {
                return false;
            }
            if (editionId == null ? ((hb) (obj)).editionId != null : !editionId.equals(((hb) (obj)).editionId))
            {
                return false;
            }
            if (exitEvent == null ? ((hb) (obj)).exitEvent != null : !exitEvent.equals(((hb) (obj)).exitEvent))
            {
                return false;
            }
            if (inlineVideoTimeViewed == null ? ((hb) (obj)).inlineVideoTimeViewed != null : !inlineVideoTimeViewed.equals(((hb) (obj)).inlineVideoTimeViewed))
            {
                return false;
            }
            if (inlineVideoViewCount == null ? ((hb) (obj)).inlineVideoViewCount != null : !inlineVideoViewCount.equals(((hb) (obj)).inlineVideoViewCount))
            {
                return false;
            }
            if (longformType == null ? ((hb) (obj)).longformType != null : !longformType.equals(((hb) (obj)).longformType))
            {
                return false;
            }
            if (publisherId == null ? ((hb) (obj)).publisherId != null : !publisherId.equals(((hb) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((hb) (obj)).snapIndexCount != null : !snapIndexCount.equals(((hb) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((hb) (obj)).snapIndexPos != null : !snapIndexPos.equals(((hb) (obj)).snapIndexPos))
            {
                return false;
            }
            if (source == null ? ((hb) (obj)).source != null : !source.equals(((hb) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((hb) (obj)).timeViewed != null : !timeViewed.equals(((hb) (obj)).timeViewed))
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
        if (exitEvent != null)
        {
            k = exitEvent.hashCode();
        } else
        {
            k = 0;
        }
        if (inlineVideoTimeViewed != null)
        {
            l = inlineVideoTimeViewed.hashCode();
        } else
        {
            l = 0;
        }
        if (inlineVideoViewCount != null)
        {
            i1 = inlineVideoViewCount.hashCode();
        } else
        {
            i1 = 0;
        }
        if (longformType != null)
        {
            j1 = longformType.hashCode();
        } else
        {
            j1 = 0;
        }
        if (publisherId != null)
        {
            k1 = publisherId.hashCode();
        } else
        {
            k1 = 0;
        }
        if (snapIndexCount != null)
        {
            l1 = snapIndexCount.hashCode();
        } else
        {
            l1 = 0;
        }
        if (snapIndexPos != null)
        {
            i2 = snapIndexPos.hashCode();
        } else
        {
            i2 = 0;
        }
        if (source != null)
        {
            j2 = source.hashCode();
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
