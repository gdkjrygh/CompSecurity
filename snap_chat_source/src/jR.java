// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jR extends kl
{

    public Long adIndexPos;
    public String adUnitId;
    private final String eventName = "STORY_AD_OPPORTUNITY";
    public String geoFence;
    public String posterId;
    public ki storyType;
    public Long viewLocation;

    public jR()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "STORY_AD_OPPORTUNITY");
        if (adIndexPos != null)
        {
            hashmap.put("ad_index_pos", adIndexPos);
        }
        if (adUnitId != null)
        {
            hashmap.put("ad_unit_id", adUnitId);
        }
        if (geoFence != null)
        {
            hashmap.put("geo_fence", geoFence);
        }
        if (posterId != null)
        {
            hashmap.put("poster_id", posterId);
        }
        if (storyType != null)
        {
            hashmap.put("story_type", storyType);
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
            obj = (jR)obj;
            if (adIndexPos == null ? ((jR) (obj)).adIndexPos != null : !adIndexPos.equals(((jR) (obj)).adIndexPos))
            {
                return false;
            }
            if (adUnitId == null ? ((jR) (obj)).adUnitId != null : !adUnitId.equals(((jR) (obj)).adUnitId))
            {
                return false;
            }
            if (geoFence == null ? ((jR) (obj)).geoFence != null : !geoFence.equals(((jR) (obj)).geoFence))
            {
                return false;
            }
            if (posterId == null ? ((jR) (obj)).posterId != null : !posterId.equals(((jR) (obj)).posterId))
            {
                return false;
            }
            if (storyType == null ? ((jR) (obj)).storyType != null : !storyType.equals(((jR) (obj)).storyType))
            {
                return false;
            }
            if (viewLocation == null ? ((jR) (obj)).viewLocation != null : !viewLocation.equals(((jR) (obj)).viewLocation))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int k1 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (adIndexPos != null)
        {
            i = adIndexPos.hashCode();
        } else
        {
            i = 0;
        }
        if (adUnitId != null)
        {
            j = adUnitId.hashCode();
        } else
        {
            j = 0;
        }
        if (geoFence != null)
        {
            k = geoFence.hashCode();
        } else
        {
            k = 0;
        }
        if (posterId != null)
        {
            l = posterId.hashCode();
        } else
        {
            l = 0;
        }
        if (storyType != null)
        {
            i1 = storyType.hashCode();
        } else
        {
            i1 = 0;
        }
        if (viewLocation != null)
        {
            j1 = viewLocation.hashCode();
        }
        return (i1 + (l + (k + (j + (i + k1 * 31) * 31) * 31) * 31) * 31) * 31 + j1;
    }
}
