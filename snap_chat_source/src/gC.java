// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gC extends kl
{

    public Long adIndexCount;
    public Long adIndexPos;
    public String adProductId;
    public String adsnapId;
    public String destinationUrl;
    public String editionId;
    private final String eventName = "DISCOVER_AD_LINK_TO_APP_STORE";
    public String publisherId;
    public Long snapIndexCount;
    public Long snapIndexPos;
    public jQ source;
    public String userAdId;

    public gC()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DISCOVER_AD_LINK_TO_APP_STORE");
        if (adIndexCount != null)
        {
            hashmap.put("ad_index_count", adIndexCount);
        }
        if (adIndexPos != null)
        {
            hashmap.put("ad_index_pos", adIndexPos);
        }
        if (adProductId != null)
        {
            hashmap.put("ad_product_id", adProductId);
        }
        if (adsnapId != null)
        {
            hashmap.put("adsnap_id", adsnapId);
        }
        if (destinationUrl != null)
        {
            hashmap.put("destination_url", destinationUrl);
        }
        if (editionId != null)
        {
            hashmap.put("edition_id", editionId);
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
            obj = (gC)obj;
            if (adIndexCount == null ? ((gC) (obj)).adIndexCount != null : !adIndexCount.equals(((gC) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((gC) (obj)).adIndexPos != null : !adIndexPos.equals(((gC) (obj)).adIndexPos))
            {
                return false;
            }
            if (adProductId == null ? ((gC) (obj)).adProductId != null : !adProductId.equals(((gC) (obj)).adProductId))
            {
                return false;
            }
            if (adsnapId == null ? ((gC) (obj)).adsnapId != null : !adsnapId.equals(((gC) (obj)).adsnapId))
            {
                return false;
            }
            if (destinationUrl == null ? ((gC) (obj)).destinationUrl != null : !destinationUrl.equals(((gC) (obj)).destinationUrl))
            {
                return false;
            }
            if (editionId == null ? ((gC) (obj)).editionId != null : !editionId.equals(((gC) (obj)).editionId))
            {
                return false;
            }
            if (publisherId == null ? ((gC) (obj)).publisherId != null : !publisherId.equals(((gC) (obj)).publisherId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((gC) (obj)).snapIndexCount != null : !snapIndexCount.equals(((gC) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((gC) (obj)).snapIndexPos != null : !snapIndexPos.equals(((gC) (obj)).snapIndexPos))
            {
                return false;
            }
            if (source == null ? ((gC) (obj)).source != null : !source.equals(((gC) (obj)).source))
            {
                return false;
            }
            if (userAdId == null ? ((gC) (obj)).userAdId != null : !userAdId.equals(((gC) (obj)).userAdId))
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
        if (adProductId != null)
        {
            k = adProductId.hashCode();
        } else
        {
            k = 0;
        }
        if (adsnapId != null)
        {
            l = adsnapId.hashCode();
        } else
        {
            l = 0;
        }
        if (destinationUrl != null)
        {
            i1 = destinationUrl.hashCode();
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
        if (userAdId != null)
        {
            k2 = userAdId.hashCode();
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }
}
