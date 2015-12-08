// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hC extends kl
{

    private String adsnapPlacementId;
    public String encFilterGeofilterId;
    public String encFilterGeolensId;
    private final String eventName = "GEOFILTER_STORY_SNAP_SCREENSHOT";
    private String filterGeofilterId;
    private String filterGeolensId;
    public String geoFence;
    public hJ mediaType;
    public String posterId;
    public ki storyType;
    private Double viewTimeSec;

    public hC()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "GEOFILTER_STORY_SNAP_SCREENSHOT");
        if (adsnapPlacementId != null)
        {
            hashmap.put("adsnap_placement_id", adsnapPlacementId);
        }
        if (encFilterGeofilterId != null)
        {
            hashmap.put("enc_filter_geofilter_id", encFilterGeofilterId);
        }
        if (encFilterGeolensId != null)
        {
            hashmap.put("enc_filter_geolens_id", encFilterGeolensId);
        }
        if (filterGeofilterId != null)
        {
            hashmap.put("filter_geofilter_id", filterGeofilterId);
        }
        if (filterGeolensId != null)
        {
            hashmap.put("filter_geolens_id", filterGeolensId);
        }
        if (geoFence != null)
        {
            hashmap.put("geo_fence", geoFence);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (posterId != null)
        {
            hashmap.put("poster_id", posterId);
        }
        if (storyType != null)
        {
            hashmap.put("story_type", storyType);
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
            obj = (hC)obj;
            if (adsnapPlacementId == null ? ((hC) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((hC) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (encFilterGeofilterId == null ? ((hC) (obj)).encFilterGeofilterId != null : !encFilterGeofilterId.equals(((hC) (obj)).encFilterGeofilterId))
            {
                return false;
            }
            if (encFilterGeolensId == null ? ((hC) (obj)).encFilterGeolensId != null : !encFilterGeolensId.equals(((hC) (obj)).encFilterGeolensId))
            {
                return false;
            }
            if (filterGeofilterId == null ? ((hC) (obj)).filterGeofilterId != null : !filterGeofilterId.equals(((hC) (obj)).filterGeofilterId))
            {
                return false;
            }
            if (filterGeolensId == null ? ((hC) (obj)).filterGeolensId != null : !filterGeolensId.equals(((hC) (obj)).filterGeolensId))
            {
                return false;
            }
            if (geoFence == null ? ((hC) (obj)).geoFence != null : !geoFence.equals(((hC) (obj)).geoFence))
            {
                return false;
            }
            if (mediaType == null ? ((hC) (obj)).mediaType != null : !mediaType.equals(((hC) (obj)).mediaType))
            {
                return false;
            }
            if (posterId == null ? ((hC) (obj)).posterId != null : !posterId.equals(((hC) (obj)).posterId))
            {
                return false;
            }
            if (storyType == null ? ((hC) (obj)).storyType != null : !storyType.equals(((hC) (obj)).storyType))
            {
                return false;
            }
            if (viewTimeSec == null ? ((hC) (obj)).viewTimeSec != null : !viewTimeSec.equals(((hC) (obj)).viewTimeSec))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j2 = 0;
        int k2 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (adsnapPlacementId != null)
        {
            i = adsnapPlacementId.hashCode();
        } else
        {
            i = 0;
        }
        if (encFilterGeofilterId != null)
        {
            j = encFilterGeofilterId.hashCode();
        } else
        {
            j = 0;
        }
        if (encFilterGeolensId != null)
        {
            k = encFilterGeolensId.hashCode();
        } else
        {
            k = 0;
        }
        if (filterGeofilterId != null)
        {
            l = filterGeofilterId.hashCode();
        } else
        {
            l = 0;
        }
        if (filterGeolensId != null)
        {
            i1 = filterGeolensId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (geoFence != null)
        {
            j1 = geoFence.hashCode();
        } else
        {
            j1 = 0;
        }
        if (mediaType != null)
        {
            k1 = mediaType.hashCode();
        } else
        {
            k1 = 0;
        }
        if (posterId != null)
        {
            l1 = posterId.hashCode();
        } else
        {
            l1 = 0;
        }
        if (storyType != null)
        {
            i2 = storyType.hashCode();
        } else
        {
            i2 = 0;
        }
        if (viewTimeSec != null)
        {
            j2 = viewTimeSec.hashCode();
        }
        return (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + k2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2;
    }
}
