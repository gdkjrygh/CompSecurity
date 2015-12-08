// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jS extends kl
{

    private Long adIndexCount;
    private Long adIndexPos;
    public String adsnapId;
    private String adsnapLineItemId;
    private String adsnapPlacementId;
    private final String eventName = "STORY_AD_SCREENSHOT";
    private Boolean fullView;
    public String geoFence;
    public String posterId;
    private Long snapIndexCount;
    private Long snapIndexPos;
    public Double snapTime;
    private String sponsor;
    private String storySnapId;
    public ki storyType;
    private Double timeViewed;
    private Long viewLocation;

    public jS()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "STORY_AD_SCREENSHOT");
        if (adIndexCount != null)
        {
            hashmap.put("ad_index_count", adIndexCount);
        }
        if (adIndexPos != null)
        {
            hashmap.put("ad_index_pos", adIndexPos);
        }
        if (adsnapId != null)
        {
            hashmap.put("adsnap_id", adsnapId);
        }
        if (adsnapLineItemId != null)
        {
            hashmap.put("adsnap_line_item_id", adsnapLineItemId);
        }
        if (adsnapPlacementId != null)
        {
            hashmap.put("adsnap_placement_id", adsnapPlacementId);
        }
        if (fullView != null)
        {
            hashmap.put("full_view", fullView);
        }
        if (geoFence != null)
        {
            hashmap.put("geo_fence", geoFence);
        }
        if (posterId != null)
        {
            hashmap.put("poster_id", posterId);
        }
        if (snapIndexCount != null)
        {
            hashmap.put("snap_index_count", snapIndexCount);
        }
        if (snapIndexPos != null)
        {
            hashmap.put("snap_index_pos", snapIndexPos);
        }
        if (snapTime != null)
        {
            hashmap.put("snap_time", snapTime);
        }
        if (sponsor != null)
        {
            hashmap.put("sponsor", sponsor);
        }
        if (storySnapId != null)
        {
            hashmap.put("story_snap_id", storySnapId);
        }
        if (storyType != null)
        {
            hashmap.put("story_type", storyType);
        }
        if (timeViewed != null)
        {
            hashmap.put("time_viewed", timeViewed);
        }
        if (viewLocation != null)
        {
            hashmap.put("view_location", viewLocation);
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
            obj = (jS)obj;
            if (adIndexCount == null ? ((jS) (obj)).adIndexCount != null : !adIndexCount.equals(((jS) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((jS) (obj)).adIndexPos != null : !adIndexPos.equals(((jS) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((jS) (obj)).adsnapId != null : !adsnapId.equals(((jS) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((jS) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((jS) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((jS) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((jS) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (fullView == null ? ((jS) (obj)).fullView != null : !fullView.equals(((jS) (obj)).fullView))
            {
                return false;
            }
            if (geoFence == null ? ((jS) (obj)).geoFence != null : !geoFence.equals(((jS) (obj)).geoFence))
            {
                return false;
            }
            if (posterId == null ? ((jS) (obj)).posterId != null : !posterId.equals(((jS) (obj)).posterId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((jS) (obj)).snapIndexCount != null : !snapIndexCount.equals(((jS) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((jS) (obj)).snapIndexPos != null : !snapIndexPos.equals(((jS) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTime == null ? ((jS) (obj)).snapTime != null : !snapTime.equals(((jS) (obj)).snapTime))
            {
                return false;
            }
            if (sponsor == null ? ((jS) (obj)).sponsor != null : !sponsor.equals(((jS) (obj)).sponsor))
            {
                return false;
            }
            if (storySnapId == null ? ((jS) (obj)).storySnapId != null : !storySnapId.equals(((jS) (obj)).storySnapId))
            {
                return false;
            }
            if (storyType == null ? ((jS) (obj)).storyType != null : !storyType.equals(((jS) (obj)).storyType))
            {
                return false;
            }
            if (timeViewed == null ? ((jS) (obj)).timeViewed != null : !timeViewed.equals(((jS) (obj)).timeViewed))
            {
                return false;
            }
            if (viewLocation == null ? ((jS) (obj)).viewLocation != null : !viewLocation.equals(((jS) (obj)).viewLocation))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l3 = 0;
        int i4 = super.hashCode();
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
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (adIndexCount != null)
        {
            i = adIndexCount.hashCode();
        } else
        {
            i = 0;
        }
        if (adIndexPos != null)
        {
            j = adIndexPos.hashCode();
        } else
        {
            j = 0;
        }
        if (adsnapId != null)
        {
            k = adsnapId.hashCode();
        } else
        {
            k = 0;
        }
        if (adsnapLineItemId != null)
        {
            l = adsnapLineItemId.hashCode();
        } else
        {
            l = 0;
        }
        if (adsnapPlacementId != null)
        {
            i1 = adsnapPlacementId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (fullView != null)
        {
            j1 = fullView.hashCode();
        } else
        {
            j1 = 0;
        }
        if (geoFence != null)
        {
            k1 = geoFence.hashCode();
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
        if (snapIndexCount != null)
        {
            i2 = snapIndexCount.hashCode();
        } else
        {
            i2 = 0;
        }
        if (snapIndexPos != null)
        {
            j2 = snapIndexPos.hashCode();
        } else
        {
            j2 = 0;
        }
        if (snapTime != null)
        {
            k2 = snapTime.hashCode();
        } else
        {
            k2 = 0;
        }
        if (sponsor != null)
        {
            l2 = sponsor.hashCode();
        } else
        {
            l2 = 0;
        }
        if (storySnapId != null)
        {
            i3 = storySnapId.hashCode();
        } else
        {
            i3 = 0;
        }
        if (storyType != null)
        {
            j3 = storyType.hashCode();
        } else
        {
            j3 = 0;
        }
        if (timeViewed != null)
        {
            k3 = timeViewed.hashCode();
        } else
        {
            k3 = 0;
        }
        if (viewLocation != null)
        {
            l3 = viewLocation.hashCode();
        }
        return (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + i4 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l3;
    }
}
