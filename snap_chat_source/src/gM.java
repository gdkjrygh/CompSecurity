// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gM extends kl
{

    public Long adIndexCount;
    public Long adIndexPos;
    public String adsnapId;
    private String adsnapLineItemId;
    private String adsnapPlacementId;
    public String editionId;
    private final String eventName = "DISCOVER_AD_SHARE_DENY";
    public hJ mediaType;
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public jQ source;
    public Double timeViewed;

    public gM()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_SHARE_DENY");
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
            obj = (gM)obj;
            if (adIndexCount == null ? ((gM) (obj)).adIndexCount != null : !adIndexCount.equals(((gM) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gM) (obj)).adIndexPos != null : !adIndexPos.equals(((gM) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((gM) (obj)).adsnapId != null : !adsnapId.equals(((gM) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((gM) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((gM) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((gM) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((gM) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (editionId == null ? ((gM) (obj)).editionId != null : !editionId.equals(((gM) (obj)).editionId))
            {
                return false;
            }
            if (mediaType == null ? ((gM) (obj)).mediaType != null : !mediaType.equals(((gM) (obj)).mediaType))
            {
                return false;
            }
            if (publisherId == null ? ((gM) (obj)).publisherId != null : !publisherId.equals(((gM) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gM) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gM) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gM) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gM) (obj)).snapIndexPos))
            {
                return false;
            }
            if (source == null ? ((gM) (obj)).source != null : !source.equals(((gM) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((gM) (obj)).timeViewed != null : !timeViewed.equals(((gM) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l2 = 0;
        int i3 = super.hashCode();
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
        if (mediaType != null)
        {
            k1 = mediaType.hashCode();
        } else
        {
            k1 = 0;
        }
        if (publisherId != null)
        {
            l1 = publisherId.hashCode();
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
        if (source != null)
        {
            k2 = source.hashCode();
        } else
        {
            k2 = 0;
        }
        if (timeViewed != null)
        {
            l2 = timeViewed.hashCode();
        }
        return (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + i3 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l2;
    }
}
