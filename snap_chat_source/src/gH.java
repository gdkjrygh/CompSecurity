// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gH extends kl
{

    public Long adIndexCount;
    public Long adIndexPos;
    public String adsnapId;
    private String adsnapLineItemId;
    private String adsnapPlacementId;
    public Long caption;
    public Boolean drawing;
    public String editionId;
    private final String eventName = "DISCOVER_AD_LONGFORM_SHARE_SEND";
    private String filter;
    private String filterGeofence;
    public hs filterInfo;
    private String filterSponsor;
    private String filterType;
    public hw filterVisual;
    public hJ longformType;
    public hJ mediaType;
    public String publisherId;
    public Long recipientCount;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public Double snapTimeSec;
    public jQ source;
    public Double timeViewed;

    public gH()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_LONGFORM_SHARE_SEND");
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
        if (caption != null)
        {
            hashmap.put("caption", caption);
        }
        if (drawing != null)
        {
            hashmap.put("drawing", drawing);
        }
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
        }
        if (filter != null)
        {
            hashmap.put("filter", filter);
        }
        if (filterGeofence != null)
        {
            hashmap.put("filter_geofence", filterGeofence);
        }
        if (filterInfo != null)
        {
            hashmap.put("filter_info", filterInfo);
        }
        if (filterSponsor != null)
        {
            hashmap.put("filter_sponsor", filterSponsor);
        }
        if (filterType != null)
        {
            hashmap.put("filter_type", filterType);
        }
        if (filterVisual != null)
        {
            hashmap.put("filter_visual", filterVisual);
        }
        if (longformType != null)
        {
            hashmap.put("longform_type", longformType);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (publisherId != null)
        {
            hashmap.put("publisher_id", publisherId);
        }
        if (recipientCount != null)
        {
            hashmap.put("recipient_count", recipientCount);
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
            obj = (gH)obj;
            if (adIndexCount == null ? ((gH) (obj)).adIndexCount != null : !adIndexCount.equals(((gH) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gH) (obj)).adIndexPos != null : !adIndexPos.equals(((gH) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((gH) (obj)).adsnapId != null : !adsnapId.equals(((gH) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((gH) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((gH) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((gH) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((gH) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (caption == null ? ((gH) (obj)).caption != null : !caption.equals(((gH) (obj)).caption))
            {
                return false;
            }
            if (drawing == null ? ((gH) (obj)).drawing != null : !drawing.equals(((gH) (obj)).drawing))
            {
                return false;
            }
            if (editionId == null ? ((gH) (obj)).editionId != null : !editionId.equals(((gH) (obj)).editionId))
            {
                return false;
            }
            if (filter == null ? ((gH) (obj)).filter != null : !filter.equals(((gH) (obj)).filter))
            {
                return false;
            }
            if (filterGeofence == null ? ((gH) (obj)).filterGeofence != null : !filterGeofence.equals(((gH) (obj)).filterGeofence))
            {
                return false;
            }
            if (filterInfo == null ? ((gH) (obj)).filterInfo != null : !filterInfo.equals(((gH) (obj)).filterInfo))
            {
                return false;
            }
            if (filterSponsor == null ? ((gH) (obj)).filterSponsor != null : !filterSponsor.equals(((gH) (obj)).filterSponsor))
            {
                return false;
            }
            if (filterType == null ? ((gH) (obj)).filterType != null : !filterType.equals(((gH) (obj)).filterType))
            {
                return false;
            }
            if (filterVisual == null ? ((gH) (obj)).filterVisual != null : !filterVisual.equals(((gH) (obj)).filterVisual))
            {
                return false;
            }
            if (longformType == null ? ((gH) (obj)).longformType != null : !longformType.equals(((gH) (obj)).longformType))
            {
                return false;
            }
            if (mediaType == null ? ((gH) (obj)).mediaType != null : !mediaType.equals(((gH) (obj)).mediaType))
            {
                return false;
            }
            if (publisherId == null ? ((gH) (obj)).publisherId != null : !publisherId.equals(((gH) (obj)).publisherId))
            {
                return false;
            }
            if (recipientCount == null ? ((gH) (obj)).recipientCount != null : !recipientCount.equals(((gH) (obj)).recipientCount))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gH) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gH) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gH) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gH) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTimeSec == null ? ((gH) (obj)).snapTimeSec != null : !snapTimeSec.equals(((gH) (obj)).snapTimeSec))
            {
                return false;
            }
            if (source == null ? ((gH) (obj)).source != null : !source.equals(((gH) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((gH) (obj)).timeViewed != null : !timeViewed.equals(((gH) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k5 = 0;
        int l5 = super.hashCode();
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
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
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
        if (caption != null)
        {
            j1 = caption.hashCode();
        } else
        {
            j1 = 0;
        }
        if (drawing != null)
        {
            k1 = drawing.hashCode();
        } else
        {
            k1 = 0;
        }
        if (editionId != null)
        {
            l1 = editionId.hashCode();
        } else
        {
            l1 = 0;
        }
        if (filter != null)
        {
            i2 = filter.hashCode();
        } else
        {
            i2 = 0;
        }
        if (filterGeofence != null)
        {
            j2 = filterGeofence.hashCode();
        } else
        {
            j2 = 0;
        }
        if (filterInfo != null)
        {
            k2 = filterInfo.hashCode();
        } else
        {
            k2 = 0;
        }
        if (filterSponsor != null)
        {
            l2 = filterSponsor.hashCode();
        } else
        {
            l2 = 0;
        }
        if (filterType != null)
        {
            i3 = filterType.hashCode();
        } else
        {
            i3 = 0;
        }
        if (filterVisual != null)
        {
            j3 = filterVisual.hashCode();
        } else
        {
            j3 = 0;
        }
        if (longformType != null)
        {
            k3 = longformType.hashCode();
        } else
        {
            k3 = 0;
        }
        if (mediaType != null)
        {
            l3 = mediaType.hashCode();
        } else
        {
            l3 = 0;
        }
        if (publisherId != null)
        {
            i4 = publisherId.hashCode();
        } else
        {
            i4 = 0;
        }
        if (recipientCount != null)
        {
            j4 = recipientCount.hashCode();
        } else
        {
            j4 = 0;
        }
        if (snapIndexCount != null)
        {
            k4 = snapIndexCount.hashCode();
        } else
        {
            k4 = 0;
        }
        if (snapIndexPos != null)
        {
            l4 = snapIndexPos.hashCode();
        } else
        {
            l4 = 0;
        }
        if (snapTimeSec != null)
        {
            i5 = snapTimeSec.hashCode();
        } else
        {
            i5 = 0;
        }
        if (source != null)
        {
            j5 = source.hashCode();
        } else
        {
            j5 = 0;
        }
        if (timeViewed != null)
        {
            k5 = timeViewed.hashCode();
        }
        return (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l5 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k5;
    }
}
