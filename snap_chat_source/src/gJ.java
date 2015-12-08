// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gJ extends kl
{

    public Long adIndexCount;
    public Long adIndexPos;
    public String adsnapId;
    private String adsnapLineItemId;
    private String adsnapPlacementId;
    public Long caption;
    public Boolean drawing;
    public String editionId;
    private final String eventName = "DISCOVER_AD_SAVE";
    public hs filterInfo;
    public hw filterVisual;
    public hJ mediaType;
    public String publisherId;
    public Long sizeByte;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public Double snapTimeSec;
    private jQ source;
    public Double timeViewed;

    public gJ()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_SAVE");
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
        if (filterInfo != null)
        {
            hashmap.put("filter_info", filterInfo);
        }
        if (filterVisual != null)
        {
            hashmap.put("filter_visual", filterVisual);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (publisherId != null)
        {
            hashmap.put("publisher_id", publisherId);
        }
        if (sizeByte != null)
        {
            hashmap.put("size_byte", sizeByte);
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
            obj = (gJ)obj;
            if (adIndexCount == null ? ((gJ) (obj)).adIndexCount != null : !adIndexCount.equals(((gJ) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gJ) (obj)).adIndexPos != null : !adIndexPos.equals(((gJ) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((gJ) (obj)).adsnapId != null : !adsnapId.equals(((gJ) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((gJ) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((gJ) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((gJ) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((gJ) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (caption == null ? ((gJ) (obj)).caption != null : !caption.equals(((gJ) (obj)).caption))
            {
                return false;
            }
            if (drawing == null ? ((gJ) (obj)).drawing != null : !drawing.equals(((gJ) (obj)).drawing))
            {
                return false;
            }
            if (editionId == null ? ((gJ) (obj)).editionId != null : !editionId.equals(((gJ) (obj)).editionId))
            {
                return false;
            }
            if (filterInfo == null ? ((gJ) (obj)).filterInfo != null : !filterInfo.equals(((gJ) (obj)).filterInfo))
            {
                return false;
            }
            if (filterVisual == null ? ((gJ) (obj)).filterVisual != null : !filterVisual.equals(((gJ) (obj)).filterVisual))
            {
                return false;
            }
            if (mediaType == null ? ((gJ) (obj)).mediaType != null : !mediaType.equals(((gJ) (obj)).mediaType))
            {
                return false;
            }
            if (publisherId == null ? ((gJ) (obj)).publisherId != null : !publisherId.equals(((gJ) (obj)).publisherId))
            {
                return false;
            }
            if (sizeByte == null ? ((gJ) (obj)).sizeByte != null : !sizeByte.equals(((gJ) (obj)).sizeByte))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gJ) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gJ) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gJ) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gJ) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTimeSec == null ? ((gJ) (obj)).snapTimeSec != null : !snapTimeSec.equals(((gJ) (obj)).snapTimeSec))
            {
                return false;
            }
            if (source == null ? ((gJ) (obj)).source != null : !source.equals(((gJ) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((gJ) (obj)).timeViewed != null : !timeViewed.equals(((gJ) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j4 = 0;
        int k4 = super.hashCode();
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
        if (filterInfo != null)
        {
            i2 = filterInfo.hashCode();
        } else
        {
            i2 = 0;
        }
        if (filterVisual != null)
        {
            j2 = filterVisual.hashCode();
        } else
        {
            j2 = 0;
        }
        if (mediaType != null)
        {
            k2 = mediaType.hashCode();
        } else
        {
            k2 = 0;
        }
        if (publisherId != null)
        {
            l2 = publisherId.hashCode();
        } else
        {
            l2 = 0;
        }
        if (sizeByte != null)
        {
            i3 = sizeByte.hashCode();
        } else
        {
            i3 = 0;
        }
        if (snapIndexCount != null)
        {
            j3 = snapIndexCount.hashCode();
        } else
        {
            j3 = 0;
        }
        if (snapIndexPos != null)
        {
            k3 = snapIndexPos.hashCode();
        } else
        {
            k3 = 0;
        }
        if (snapTimeSec != null)
        {
            l3 = snapTimeSec.hashCode();
        } else
        {
            l3 = 0;
        }
        if (source != null)
        {
            i4 = source.hashCode();
        } else
        {
            i4 = 0;
        }
        if (timeViewed != null)
        {
            j4 = timeViewed.hashCode();
        }
        return (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + k4 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j4;
    }
}
