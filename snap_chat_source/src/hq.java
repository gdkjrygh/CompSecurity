// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hq extends kl
{

    public hp actionName;
    public Long destinationLevel;
    private final String eventName = "EXPLORER_PAGE_NAVIGATE";
    private String geoFence;
    private Long level;
    private String poster_id;
    public Long sourceLevel;
    private String sponser;
    public String storyRootSnapId;
    public String storySnapId;
    private ki storyType;

    public hq()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "EXPLORER_PAGE_NAVIGATE");
        if (actionName != null)
        {
            hashmap.put("action_name", actionName);
        }
        if (destinationLevel != null)
        {
            hashmap.put("destination_level", destinationLevel);
        }
        if (geoFence != null)
        {
            hashmap.put("geo_fence", geoFence);
        }
        if (level != null)
        {
            hashmap.put("level", level);
        }
        if (poster_id != null)
        {
            hashmap.put("poster_id", poster_id);
        }
        if (sourceLevel != null)
        {
            hashmap.put("source_level", sourceLevel);
        }
        if (sponser != null)
        {
            hashmap.put("sponser", sponser);
        }
        if (storyRootSnapId != null)
        {
            hashmap.put("story_root_snap_id", storyRootSnapId);
        }
        if (storySnapId != null)
        {
            hashmap.put("story_snap_id", storySnapId);
        }
        if (storyType != null)
        {
            hashmap.put("story_type", storyType);
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
            obj = (hq)obj;
            if (actionName == null ? ((hq) (obj)).actionName != null : !actionName.equals(((hq) (obj)).actionName))
            {
                return false;
            }
            if (destinationLevel == null ? ((hq) (obj)).destinationLevel != null : !destinationLevel.equals(((hq) (obj)).destinationLevel))
            {
                return false;
            }
            if (geoFence == null ? ((hq) (obj)).geoFence != null : !geoFence.equals(((hq) (obj)).geoFence))
            {
                return false;
            }
            if (level == null ? ((hq) (obj)).level != null : !level.equals(((hq) (obj)).level))
            {
                return false;
            }
            if (poster_id == null ? ((hq) (obj)).poster_id != null : !poster_id.equals(((hq) (obj)).poster_id))
            {
                return false;
            }
            if (sourceLevel == null ? ((hq) (obj)).sourceLevel != null : !sourceLevel.equals(((hq) (obj)).sourceLevel))
            {
                return false;
            }
            if (sponser == null ? ((hq) (obj)).sponser != null : !sponser.equals(((hq) (obj)).sponser))
            {
                return false;
            }
            if (storyRootSnapId == null ? ((hq) (obj)).storyRootSnapId != null : !storyRootSnapId.equals(((hq) (obj)).storyRootSnapId))
            {
                return false;
            }
            if (storySnapId == null ? ((hq) (obj)).storySnapId != null : !storySnapId.equals(((hq) (obj)).storySnapId))
            {
                return false;
            }
            if (storyType == null ? ((hq) (obj)).storyType != null : !storyType.equals(((hq) (obj)).storyType))
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
        if (actionName != null)
        {
            i = actionName.hashCode();
        } else
        {
            i = 0;
        }
        if (destinationLevel != null)
        {
            j = destinationLevel.hashCode();
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
        if (level != null)
        {
            l = level.hashCode();
        } else
        {
            l = 0;
        }
        if (poster_id != null)
        {
            i1 = poster_id.hashCode();
        } else
        {
            i1 = 0;
        }
        if (sourceLevel != null)
        {
            j1 = sourceLevel.hashCode();
        } else
        {
            j1 = 0;
        }
        if (sponser != null)
        {
            k1 = sponser.hashCode();
        } else
        {
            k1 = 0;
        }
        if (storyRootSnapId != null)
        {
            l1 = storyRootSnapId.hashCode();
        } else
        {
            l1 = 0;
        }
        if (storySnapId != null)
        {
            i2 = storySnapId.hashCode();
        } else
        {
            i2 = 0;
        }
        if (storyType != null)
        {
            j2 = storyType.hashCode();
        }
        return (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + k2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2;
    }
}
