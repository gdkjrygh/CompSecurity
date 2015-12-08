// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gI extends kl
{

    private Long adIndexCount;
    private Long adIndexPos;
    public String adsnapId;
    public String adsnapLineItemId;
    public String adsnapPlacementId;
    public String editionId;
    private final String eventName = "DISCOVER_AD_LONGFORM_VIEW";
    private hn exitEvent;
    private Boolean fullView;
    public hJ longformType;
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public jQ source;
    public Double timeViewed;
    public String userAdId;

    public gI()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_LONGFORM_VIEW");
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
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
        }
        if (exitEvent != null)
        {
            hashmap.put("exit_event", exitEvent);
        }
        if (fullView != null)
        {
            hashmap.put("full_view", fullView);
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
        if (userAdId != null)
        {
            hashmap.put("user_ad_id", userAdId);
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
            obj = (gI)obj;
            if (adIndexCount == null ? ((gI) (obj)).adIndexCount != null : !adIndexCount.equals(((gI) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gI) (obj)).adIndexPos != null : !adIndexPos.equals(((gI) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((gI) (obj)).adsnapId != null : !adsnapId.equals(((gI) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((gI) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((gI) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((gI) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((gI) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (editionId == null ? ((gI) (obj)).editionId != null : !editionId.equals(((gI) (obj)).editionId))
            {
                return false;
            }
            if (exitEvent == null ? ((gI) (obj)).exitEvent != null : !exitEvent.equals(((gI) (obj)).exitEvent))
            {
                return false;
            }
            if (fullView == null ? ((gI) (obj)).fullView != null : !fullView.equals(((gI) (obj)).fullView))
            {
                return false;
            }
            if (longformType == null ? ((gI) (obj)).longformType != null : !longformType.equals(((gI) (obj)).longformType))
            {
                return false;
            }
            if (publisherId == null ? ((gI) (obj)).publisherId != null : !publisherId.equals(((gI) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gI) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gI) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gI) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gI) (obj)).snapIndexPos))
            {
                return false;
            }
            if (source == null ? ((gI) (obj)).source != null : !source.equals(((gI) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((gI) (obj)).timeViewed != null : !timeViewed.equals(((gI) (obj)).timeViewed))
            {
                return false;
            }
            if (userAdId == null ? ((gI) (obj)).userAdId != null : !userAdId.equals(((gI) (obj)).userAdId))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k3 = 0;
        int l3 = super.hashCode();
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
        if (editionId != null)
        {
            j1 = editionId.hashCode();
        } else
        {
            j1 = 0;
        }
        if (exitEvent != null)
        {
            k1 = exitEvent.hashCode();
        } else
        {
            k1 = 0;
        }
        if (fullView != null)
        {
            l1 = fullView.hashCode();
        } else
        {
            l1 = 0;
        }
        if (longformType != null)
        {
            i2 = longformType.hashCode();
        } else
        {
            i2 = 0;
        }
        if (publisherId != null)
        {
            j2 = publisherId.hashCode();
        } else
        {
            j2 = 0;
        }
        if (snapIndexCount != null)
        {
            k2 = snapIndexCount.hashCode();
        } else
        {
            k2 = 0;
        }
        if (snapIndexPos != null)
        {
            l2 = snapIndexPos.hashCode();
        } else
        {
            l2 = 0;
        }
        if (source != null)
        {
            i3 = source.hashCode();
        } else
        {
            i3 = 0;
        }
        if (timeViewed != null)
        {
            j3 = timeViewed.hashCode();
        } else
        {
            j3 = 0;
        }
        if (userAdId != null)
        {
            k3 = userAdId.hashCode();
        }
        return (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l3 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k3;
    }
}
