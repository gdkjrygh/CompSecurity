// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gD extends kl
{

    public Long adIndexCount;
    public Long adIndexPos;
    public String adsnapId;
    private String adsnapLineItemId;
    private String adsnapPlacementId;
    public Long caption;
    public Boolean drawing;
    public String editionId;
    private final String eventName = "DISCOVER_AD_LONGFORM_SAVE";
    public hs filterInfo;
    public hw filterVisual;
    public hJ longformType;
    public hJ mediaType;
    public String publisherId;
    public Long sizeByte;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public Double snapTimeSec;
    private jQ source;
    public Double timeViewed;

    public gD()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_LONGFORM_SAVE");
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
            obj = (gD)obj;
            if (adIndexCount == null ? ((gD) (obj)).adIndexCount != null : !adIndexCount.equals(((gD) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gD) (obj)).adIndexPos != null : !adIndexPos.equals(((gD) (obj)).adIndexPos))
            {
                return false;
            }
            if (adsnapId == null ? ((gD) (obj)).adsnapId != null : !adsnapId.equals(((gD) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((gD) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((gD) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((gD) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((gD) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (caption == null ? ((gD) (obj)).caption != null : !caption.equals(((gD) (obj)).caption))
            {
                return false;
            }
            if (drawing == null ? ((gD) (obj)).drawing != null : !drawing.equals(((gD) (obj)).drawing))
            {
                return false;
            }
            if (editionId == null ? ((gD) (obj)).editionId != null : !editionId.equals(((gD) (obj)).editionId))
            {
                return false;
            }
            if (filterInfo == null ? ((gD) (obj)).filterInfo != null : !filterInfo.equals(((gD) (obj)).filterInfo))
            {
                return false;
            }
            if (filterVisual == null ? ((gD) (obj)).filterVisual != null : !filterVisual.equals(((gD) (obj)).filterVisual))
            {
                return false;
            }
            if (longformType == null ? ((gD) (obj)).longformType != null : !longformType.equals(((gD) (obj)).longformType))
            {
                return false;
            }
            if (mediaType == null ? ((gD) (obj)).mediaType != null : !mediaType.equals(((gD) (obj)).mediaType))
            {
                return false;
            }
            if (publisherId == null ? ((gD) (obj)).publisherId != null : !publisherId.equals(((gD) (obj)).publisherId))
            {
                return false;
            }
            if (sizeByte == null ? ((gD) (obj)).sizeByte != null : !sizeByte.equals(((gD) (obj)).sizeByte))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gD) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gD) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gD) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gD) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTimeSec == null ? ((gD) (obj)).snapTimeSec != null : !snapTimeSec.equals(((gD) (obj)).snapTimeSec))
            {
                return false;
            }
            if (source == null ? ((gD) (obj)).source != null : !source.equals(((gD) (obj)).source))
            {
                return false;
            }
            if (timeViewed == null ? ((gD) (obj)).timeViewed != null : !timeViewed.equals(((gD) (obj)).timeViewed))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k4 = 0;
        int l4 = super.hashCode();
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
        if (longformType != null)
        {
            k2 = longformType.hashCode();
        } else
        {
            k2 = 0;
        }
        if (mediaType != null)
        {
            l2 = mediaType.hashCode();
        } else
        {
            l2 = 0;
        }
        if (publisherId != null)
        {
            i3 = publisherId.hashCode();
        } else
        {
            i3 = 0;
        }
        if (sizeByte != null)
        {
            j3 = sizeByte.hashCode();
        } else
        {
            j3 = 0;
        }
        if (snapIndexCount != null)
        {
            k3 = snapIndexCount.hashCode();
        } else
        {
            k3 = 0;
        }
        if (snapIndexPos != null)
        {
            l3 = snapIndexPos.hashCode();
        } else
        {
            l3 = 0;
        }
        if (snapTimeSec != null)
        {
            i4 = snapTimeSec.hashCode();
        } else
        {
            i4 = 0;
        }
        if (source != null)
        {
            j4 = source.hashCode();
        } else
        {
            j4 = 0;
        }
        if (timeViewed != null)
        {
            k4 = timeViewed.hashCode();
        }
        return (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l4 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k4;
    }
}
