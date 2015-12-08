// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hy extends kl
{

    private String adsnapPlacementId;
    private final String eventName = "GEOFILTER_GEOFILTER_SWIPE";
    public Long filterCount;
    public String filterGeofilterId;
    public Long filterIndexCount;
    public Long filterIndexPos;
    public hJ mediaType;
    public Double viewTimeSec;

    public hy()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "GEOFILTER_GEOFILTER_SWIPE");
        if (adsnapPlacementId != null)
        {
            hashmap.put("adsnap_placement_id", adsnapPlacementId);
        }
        if (filterCount != null)
        {
            hashmap.put("filter_count", filterCount);
        }
        if (filterGeofilterId != null)
        {
            hashmap.put("filter_geofilter_id", filterGeofilterId);
        }
        if (filterIndexCount != null)
        {
            hashmap.put("filter_index_count", filterIndexCount);
        }
        if (filterIndexPos != null)
        {
            hashmap.put("filter_index_pos", filterIndexPos);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (viewTimeSec != null)
        {
            hashmap.put("view_time_sec", viewTimeSec);
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
            obj = (hy)obj;
            if (adsnapPlacementId == null ? ((hy) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((hy) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (filterCount == null ? ((hy) (obj)).filterCount != null : !filterCount.equals(((hy) (obj)).filterCount))
            {
                return false;
            }
            if (filterGeofilterId == null ? ((hy) (obj)).filterGeofilterId != null : !filterGeofilterId.equals(((hy) (obj)).filterGeofilterId))
            {
                return false;
            }
            if (filterIndexCount == null ? ((hy) (obj)).filterIndexCount != null : !filterIndexCount.equals(((hy) (obj)).filterIndexCount))
            {
                return false;
            }
            if (filterIndexPos == null ? ((hy) (obj)).filterIndexPos != null : !filterIndexPos.equals(((hy) (obj)).filterIndexPos))
            {
                return false;
            }
            if (mediaType == null ? ((hy) (obj)).mediaType != null : !mediaType.equals(((hy) (obj)).mediaType))
            {
                return false;
            }
            if (viewTimeSec == null ? ((hy) (obj)).viewTimeSec != null : !viewTimeSec.equals(((hy) (obj)).viewTimeSec))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int l1 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (adsnapPlacementId != null)
        {
            i = adsnapPlacementId.hashCode();
        } else
        {
            i = 0;
        }
        if (filterCount != null)
        {
            j = filterCount.hashCode();
        } else
        {
            j = 0;
        }
        if (filterGeofilterId != null)
        {
            k = filterGeofilterId.hashCode();
        } else
        {
            k = 0;
        }
        if (filterIndexCount != null)
        {
            l = filterIndexCount.hashCode();
        } else
        {
            l = 0;
        }
        if (filterIndexPos != null)
        {
            i1 = filterIndexPos.hashCode();
        } else
        {
            i1 = 0;
        }
        if (mediaType != null)
        {
            j1 = mediaType.hashCode();
        } else
        {
            j1 = 0;
        }
        if (viewTimeSec != null)
        {
            k1 = viewTimeSec.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + (i + l1 * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }
}
